import java.math.BigDecimal;
        import java.text.DecimalFormat;
        import java.util.InputMismatchException;
        import java.util.Scanner;

public class Round_decimal_number {
    public static void main(String[] args) {
        System.out.println(" Enter a value: ");
        try{
            Scanner scan = new Scanner(System.in);

            BigDecimal bg1 = scan.nextBigDecimal();

            DecimalFormat df = new DecimalFormat("#.00");
            df.format(bg1);

            System.out.println("New value: " + df.format(bg1) );

        }catch (InputMismatchException ex) {

            System.out.println("You have entered wrong data. Did you use numbers and '.' ?");

        }
    }
}

