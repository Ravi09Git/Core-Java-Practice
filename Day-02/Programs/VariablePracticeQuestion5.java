
public class VariablePracticeQuestion5 {
    public static void main(String[] args) {
        float rating1 = 10.5f;
        float rating2 = 12.5f;
        float rating3 = 12.15f;

        //using explicit type casting for integet result
        float average = (rating1 + rating2 + rating3)/3 ;
        int result = (int)(average); 
        System.out.println(result);

    }
}
