public class Voter {
    public static void main(String[] args) //throws InvalidAgeException
     {
         try {
             validate(12);
         } catch (InvalidAgeException ex) {
             System.out.println("Exception occured: " + ex );
         }

    }
    static  void  validate (int age) throws InvalidAgeException{
        if (age < 18){

            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println(" ");
        }
    }
}
