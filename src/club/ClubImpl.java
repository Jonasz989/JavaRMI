package club;

import interfaces.IClub;
import interfaces.IOffice;
import interfaces.ISeeker;
import model.Report;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ClubImp extends UnicastRemoteObject implements IClub {

    private IOffice office;


    public void startClub() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1234);
        office = (IOffice) registry.lookup("Office");
    }


    protected ClubImp() throws RemoteException {
        super();
    }

    @Override
    public boolean register(ISeeker ic) throws RemoteException {
        return false;
    }

    @Override
    public boolean unregister(String seekerName) throws RemoteException {
        return false;
    }

    @Override
    public String getName() throws RemoteException {
        return null;
    }

    @Override
    public boolean report(Report report, String seekerName) throws RemoteException {
        return false;
    }
}
