public class Fraction {
    double nummerator, denominator;
    Fraction(double nummerator, double denominator) {
        this.denominator = denominator;
        this.nummerator = nummerator;
    }
    public void reduceFraction() {
        int[] listNum = {2,3,4,5,6,7,8,9};
        for (int i = 0; i < listNum.length; i++) {
            if (denominator % listNum[i] == 0 && nummerator % listNum[i] ==0) {
                denominator/=listNum[i];
                nummerator/=listNum[i];
                i=-1;
            }
            // else {
            //     System.out.println("Phan so toi gian nhat thu duoc la:"+nummerator+"/"+denominator);
            // }
        }
        System.out.println("Phan so toi gian nhat thu duoc la:"+nummerator+"/"+denominator);
    }
    public void addFraction(Fraction ob) {
        nummerator = nummerator*ob.denominator + ob.nummerator*denominator;
        denominator = denominator * ob.denominator;
        reduceFraction();
    }
    public void minusFraction(Fraction ob) {
        nummerator = nummerator*ob.denominator - ob.nummerator*denominator;
        denominator = denominator * ob.denominator;
        reduceFraction();
    }
    public void multyFraction(Fraction ob) {
        nummerator = nummerator*ob.nummerator;
        denominator = denominator * ob.denominator;
        reduceFraction();
    }
    public void divideFraction(Fraction ob) {
        nummerator = nummerator*ob.denominator;
        denominator = denominator * ob.nummerator;
        reduceFraction();
    }
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(5, 4);

        // fraction1.reduceFraction();
        // fraction1.addFraction(fraction2);
        // fraction1.minusFraction(fraction2);
        USLN(2, 4);
    }
    static void USLN(int a, int b) {
        int[] listNum = {2,3,4,5,6,7,8,9};
        for (int i = 0; i < listNum.length; i++) {
            if (b % listNum[i] == 0 && a % listNum[i] ==0) {
                b/=listNum[i];
                a/=listNum[i];
                i=-1;
            }
            // else {
            //     System.out.println("Phan so toi gian nhat thu duoc la:"+a+"/"+b);
            // }
        }
        System.out.println("Phan so toi gian nhat thu duoc la:"+a+"/"+b);
    }
}
