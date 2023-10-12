package generalization;

public class Summation {
    private int sum;

    <T extends Number> Summation(T ob){
        sum = 0;

        for(int i = 0; i < ob.intValue(); i++){
            sum += i;
        }
    }
    int getSum(){
        return sum;
    }
}
class GenConsDemo {
    public static void main(String[] args) {
        Summation ob = new Summation(5.0);

        System.out.println("The sum of integers from 0 to 5.0 is " + ob.getSum());
    }
}
