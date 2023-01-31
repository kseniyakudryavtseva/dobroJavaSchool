package lesson08;

public class Main {
    public static void main(String[] args) {
        MyLoginService myLoginService = new MyLoginService(3);
        myLoginService.register("testovy_klient1", "12345678900_@", "12345678900_@");
        myLoginService.register("testovyklient2", "12345678900", "12345678900");
        myLoginService.register("testovyklient3", "12345678900", "12345678900");
        //myLoginService.register("testovyklient4", "12345678900", "12345678900");
        //myLoginService.login("testovyklient9", "12345678900");
    }
}
