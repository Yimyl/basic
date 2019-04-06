package cn.edu.bjtu.File.BS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        while(true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String s = br.readLine();
                        System.out.println(s);
                        String filename = s.split(" ")[1].substring(1);
                        OutputStream os = socket.getOutputStream();
                        File f = new File(filename);
                        System.out.println();
                        if(f.exists()){
                            byte[] b = new byte[1024];
                            FileInputStream fi = new FileInputStream(f);
                            os.write("HTTP/1.1 200 OK\r\n".getBytes());
                            os.write("Content-Type:text/html\r\n".getBytes());
                            os.write("\r\n".getBytes());
                            int len = 0;
                            while((len = fi.read(b)) != -1){
                                os.write(b, 0, len);
                            }
                            socket.shutdownOutput();
                            fi.close();
                        }
                        br.close();
                        os.close();
                        socket.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }
    }
}
