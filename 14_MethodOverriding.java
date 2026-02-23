class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("Interest Rate: " + b.getInterestRate());
    }
}
