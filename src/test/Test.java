package test;

import java.rmi.RemoteException;

import helloService.HelloService;
import helloService.HelloServiceProxy;
import oneKeyService.OneKeyService;
import oneKeyService.OneKeyServiceProxy;
import oneKeyService.UserInfo;

public class Test {
    public static void main(String[] args) throws RemoteException {  
//        HelloServiceProxy helloPxy = new HelloServiceProxy();  
//        HelloService service = helloPxy.getHelloService();  
//        String res = service.say("yyf");  
//        System.out.println(res);  
        
        OneKeyServiceProxy oneKeyPxy = new OneKeyServiceProxy();
        UserInfo uinfo = oneKeyPxy.getUserByMacAddr("DC37141C5D76");
        String uid = uinfo.getUserId();
        String upd = uinfo.getPassword();
        System.out.println("uid is:"+uid+", upd is:"+upd);
    }  
}
