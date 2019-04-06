package cn.edu.bjtu.File.day02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Sock {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bs = new byte[1024];
        int len = is.read(bs);
        System.out.println(new String(bs,0,len));
        socket.close();
    }
}
