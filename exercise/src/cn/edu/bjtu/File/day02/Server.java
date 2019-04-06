package cn.edu.bjtu.File.day02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bs = new byte[1024];
        int len = is.read(bs);
        System.out.println(new String(bs,0,len));
        OutputStream os = socket.getOutputStream();
        os.write("萨德".getBytes());
        socket.close();
        server.close();
    }
}
