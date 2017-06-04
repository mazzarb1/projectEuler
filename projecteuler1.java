/**
 * Created by brandonmazzarella on 6/4/17.
 */
public class projecteuler1 {

    public static void main(String[] args){

        int sum1 = 0;

        for(int i = 1; i <= 999; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                sum1 = sum1 + i;
            }


        }
            System.out.println(sum1);

    }

}
