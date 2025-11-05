import java.util.*;

    public class Calculator
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            double a, b, c = 0.0;

            System.out.println("Enter first number: ");
            a = sc.nextDouble();
            System.out.println("Enter second number: ");
            b = sc.nextDouble();
            System.out.println("Choose the operation: " +
                    "\n1.Сложение" +
                    "\n2.Вычитание" +
                    "\n3.Умножение" +
                    "\n4.Деление" +
                    "\n#Пожелуйста, введите номер операции");
            double numOperation = sc.nextDouble();
            List<Integer> list = List.of(1, 2 ,3 ,4);
            if (numOperation == list.get(0))
            {
                c = a + b;
                System.out.println(a +" + " + b +" = "+ c );
            }
            else if (numOperation == list.get(1))
            {
                c = a - b;
                System.out.println(a + " - " + b +" = "+ c);
            }
            else if (numOperation == list.get(2))
            {
                c = a * b;
                System.out.println(a + " * "+ b + " = " + c);
            }
            else if (numOperation == list.get(3))
            {
                c = a / b;
                System.out.println(a + " / " + b + " = " + c);
            }
        }

    }