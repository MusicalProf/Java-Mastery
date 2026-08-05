package structure;// Packages are a structure to group our classes.

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Account account1 = new Account();
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
    }
}
