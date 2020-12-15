import java.util.Scanner;

public class quiz {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int Rätt = 0;

        System.out.println("Vilken dag har vi nationellaproven på?");
        System.out.println("a. onsdag");
        System.out.println("b. torsdag");
        System.out.println("c. fredag");

        String svar = reader.nextLine();
        if (svar.equals("a"))
        {
            System.out.println("Rätt svar!");
            Rätt += 1;
        }
        else
        {
            System.out.println("Tyvärr, det var fel");
        }




        System.out.println("vad är x om x+6=10?");
        System.out.println("a. 5");
        System.out.println("b. 43656");
        System.out.println("c. 4");

        svar = reader.nextLine();
        if (svar.equals("c"))
        {
            System.out.println("Rätt svar!");
            Rätt += 1;
        }
        else
        {
            System.out.println("Tyvärr, det var fel");
        }



        System.out.println("vad är f'(x), om f(x)=25x+x^3 ?");
        System.out.println("a. 25x + 3x");
        System.out.println("b. 25 + 3x^2");
        System.out.println("c. x + 3x^2");

        svar = reader.nextLine();
        if (svar.equals("b"))
        {
            System.out.println("Rätt svar!");
            Rätt += 1;
        }
        else
        {
            System.out.println("Tyvärr, det var fel");
        }



        System.out.println("På en rätvinklig triangel så har den en vinkel som är 32°, hur många grader är den tredje vinkeln?");
        System.out.println("a. 97°");
        System.out.println("b. 58°");
        System.out.println("c. 130°");

        svar = reader.nextLine();
        if (svar.equals("b"))
        {
            System.out.println("Rätt svar!");
            Rätt += 1;
        }
        else
        {
            System.out.println("Tyvärr, det var fel");
        }


        int frågor = 4;
        double poäng =(100.0*Rätt) / frågor;

        System.out.println("du fick " + poäng + "%" + " rätt");

    }
}