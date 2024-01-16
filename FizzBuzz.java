public class FizzBuzz
{
    public static void main(String[] args)
    {
        int Fizz = 0;
        int Buzz = 0;
        
        for (int i = 1; i <= 100; i++) { 
            Fizz++;
            Buzz++;
            if (Fizz == 3 && Buzz == 5) {
                System.out.println("FizzBuzz");
                Fizz = 0;
                Buzz = 0;
            } else if (Fizz == 3) {
                System.out.println("Fizz");
                Fizz = 0;
            } else if (Buzz == 5) {
                System.out.println("Buzz");
                Buzz = 0;
            } else {
                System.out.println(i);
            }
        }
    }
}
