public class number_tricks_pattern_01 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++)
        {
            int number =1;
            for(int j=1; j<i+1; j++)
            {
                System.out.print(number+" ");
                number = number *(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
