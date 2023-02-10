package office;

import interfaces.IOffice;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Office {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        IOffice office = new OfficeImpl(); //creating office instance, something like server
        Registry registry = LocateRegistry.createRegistry(1234); //creating registry
        registry.bind("Office", office); //putting office into registry
        System.out.println("Office started!");
    }
}
