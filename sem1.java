
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class sem1 {
    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int i = 0;
        while(n>=m) {
            i+=m++;
        }
        System.out.println("result="+i);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int result =1;
        for(int i = m; i<=n; i++) {
            result *=i;
        }
        System.out.println("result="+result);
    }

    public static void main(String[] args) {
        int n = 1000;
        nextPrime:
        for (int i = 2; i <= n; i++) { // Для всех i...
            for (int j = 2; j < i; j++) { // проверить, делится ли число..
                if (i % j == 0) continue nextPrime; // не подходит, берём следующее
            } 
        System.out.print(i + "; ");
        }    
    }*/
    public static void main(String[] args) throws SecurityException, IOException {
        Scanner input = new Scanner(System.in);
        int a;
        int b;   
        String operation;

        System.out.println("please enter the first number");
        a = input.nextInt();
        System.out.println("please enter the second number");
        b = input.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("please enter operation");
        operation = op.next();

        if (operation.equals("+")) {
            System.out.println("your answer is" + (a+b));
        }
        if (operation.equals("-")) {
            System.out.println("your answer is" + (a-b));
        }
        if (operation.equals("/")) {
            System.out.println("your answer is" + (a/b));    
        }
        if (operation.equals("*"))
            System.out.println("your answer is" + (a*b));  
             input.close();
             op.close();
        
        Logger logger = Logger.getLogger(sem1.class.getName());
        FileHandler fh = new FileHandler("log_calculator.txt");
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat); 
        logger.info("calculator");
        }
    }
  