/*
Name : JAKAREA BIN ANWAR CHY
ID : 2012020095
Sec :  B
Email: cse_2012020095@lus.ac.bd
Date : 16-07-2021

*/
package JAKAREA;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String section = inp.nextLine();

        Info detail = new Info ();
        hobby hby = new hobby();
        System.out.println("Section:" + section);
        System.out.println("Name:" + detail.name);
        System.out.println("Id: "+detail.Id);
        System.out.println("Hobby:"+hby.hobbyName);
    }

    private static class Info {
        public String name;
        public String Id;
    }

    private static class hobby {
        public String hobbyName;
    }
}

/*
Name : JAKAREA BIN ANWAR CHY
ID : 2012020095
Sec :  B
Email: cse_2012020095@lus.ac.bd
Date : 16-07-2021

 */


class Info<JAKAREA> {
    String name = "JAKAREA";
    int Id = 95;

    public Info() {
    }
}

/*
Name : JAKAREA BIN ANWAR CHY
        ID : 2012020095
        Sec :  B
        Email: cse_2012020095@lus.ac.bd
Date : 16-07-2021
*/



class hobby {
    String hobbyName = "PLAYING FOOTBALL";

    public hobby() {
    }
}
