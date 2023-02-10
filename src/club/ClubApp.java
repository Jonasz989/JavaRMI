package club;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Club {

    public static void main(String[] args) throws NotBoundException, RemoteException {
        ClubImpl club = new ClubImpl();

        club.startClub();

        Scanner scanner = new Scanner(System.in);

        String read = "";
        while (true) {
            System.out.println("Input:");
            String line = scanner.nextLine();
            if (line.equals("exit")) break;

        }
    }
}
}
