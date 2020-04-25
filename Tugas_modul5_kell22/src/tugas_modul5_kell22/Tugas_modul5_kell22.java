package tugas_modul5_kell22;
import java.util.Scanner;

public class Tugas_modul5_kell22 {
   // main function
    public static void main(String[] args) {
        // deklarasi variabel
        String username, password;
        // membuat object baru dengan nama input dan membentuk Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Username : ");
        // membaca input user dan disimpan dalam variabel email
        username = input.nextLine();
        System.out.print("Password : ");
        // membaca input user dan disimpan dalam variabel password
        password = input.nextLine();

        userService user = new userService( username, password );
        // memanggil function login
        user.login();
    }
}
