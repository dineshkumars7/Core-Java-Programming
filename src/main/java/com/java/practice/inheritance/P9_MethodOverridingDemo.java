package com.java.practice.inheritance;
//Method overriding in inheritance
class Bank {
    double getInterestRate() {
        return 4.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class P9_MethodOverridingDemo {
	public static void main(String[] args) {
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();

        System.out.println("SBI Interest Rate  : " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate : " + hdfc.getInterestRate() + "%");
    }
}
