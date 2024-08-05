import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Room[] room = new Room[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println();
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int nRoom = sc.nextInt();

            room[nRoom] = new Room(name, email, nRoom);           
        }

        
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null) {
                System.out.println(room[i]);
            } 
        }

        sc.close(); 
    }
}
