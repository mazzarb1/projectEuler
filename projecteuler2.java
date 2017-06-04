/**
 * Created by brandonmazzarella on 6/4/17.
 */
public class projecteuler2 {

    public static void main(String[] args){
        int num1 = 1;
        int num2 = 2;
        int sum = 0;
        int total = 0;

        while(num2 <= 4000000)
        {
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
            if(sum % 2 == 0) {
                total = total + sum;
            }
        }
        System.out.println(total);

    }
}
