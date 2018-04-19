package example;

import com.vincent.client.HelloWorldServiceLocator;
import com.vincent.client.HelloWorld_PortType;

public class HelloWorldClient {
    public static void main(String[] argv) {
        try {
            HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
            HelloWorld_PortType service = locator.getHelloWorld();
            String str = service.sayHelloWorldFrom("vincent");
            System.out.println(str);
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
