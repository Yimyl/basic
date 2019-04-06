package cn.edu.bjtu.day10;

import java.security.Key;
import java.util.ArrayList;

public class Laptop {
    private Usb device1;
    private Usb device2;

    public void useDevice1() {
        if(device1 instanceof Mouse){
            ((Mouse) device1).click();
        }else if(device1 instanceof Keyboard){
           ((Keyboard) device1).stick();
        }else {
            System.out.println("null");
        }
    }

    public Usb getDevice1() {
        return device1;
    }

    public void setDevice1(Usb device1) {
        this.device1 = device1;
        if(this.device1!=null){
            this.device1.open();
        }else{
            System.out.println("null");
        }

    }
    public void useDevice2() {
        if(device2 instanceof Mouse){
            ((Mouse) device2).click();
        }else if(device2 instanceof Keyboard){
            ((Keyboard) device2).stick();
        }else {
            System.out.println("null");
        }
    }
    public Usb getDevice2() {
        return device2;

    }

    public void setDevice2(Usb device2) {
        this.device2 = device2;
        if(this.device2 != null){
            this.device2.open();
        }else{
            System.out.println("null");
        }

    }

    public void start(){
        System.out.println("laptop start");
    }

    public void shutdown(){
        setDevice1(null);
        setDevice2(null);
        System.out.println("laptop shutdown");
    }
}
