import java.util.*;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int age;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Age of the father cannot be negative");
        }
        this.age = age;
        System.out.println("The age of the Father is " + this.age);
    }
}

class Son extends Father {
    int sage;

    public Son(int age, int sage) throws WrongAge {
        super(age);
        if (sage >= age) {
            throw new WrongAge("Son cannot be older than the father");
        }
        this.sage = sage;
        System.out.println("The son's age is " + this.sage);
    }
}

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the age of the Father: ");
            int a = sc.nextInt();
            Father f = new Father(a);
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Enter the father's age: ");
            int b = sc.nextInt();
            System.out.println("Enter the son's age: ");
            int c = sc.nextInt();
            Son s = new Son(b, c);
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}
