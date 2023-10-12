package generalization;

class NumericFns<T extends Number>{
    T num;

    public NumericFns(T num) {
        this.num = num;
    }
    double reciprocal(){
        return 1 / num.doubleValue();
    }
    double fraction(){
        return num.doubleValue() - num.intValue();
    }
    boolean absEqual(NumericFns<?> ob){ // NumericFns<?> == NumericFns<T extends Number>
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())){
            return true;
        } else {
            return false;
        }
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Number> nOb = new NumericFns<>(2);

        NumericFns<Integer> iOb = new NumericFns<>(5);
        System.out.println(iOb.reciprocal());
        System.out.println(iOb.fraction());

        System.out.println();

        NumericFns<Double> dOb = new NumericFns<>(5.25);
        System.out.println(dOb.reciprocal());
        System.out.println(dOb.fraction());

        System.out.println();

        NumericFns<Long> lob = new NumericFns<>(5L);
        System.out.println(lob.absEqual(nOb));
        System.out.println(lob.absEqual(dOb));

    }
}
