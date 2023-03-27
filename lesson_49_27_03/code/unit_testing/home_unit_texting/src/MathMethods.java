public class MathMethods {
//    методы проверки делимости на 3, 5.
    public boolean IsThreeNumber(int number) {

            if (number % 3 == 0) {
                return true;
            } else
                return false;
        }
    public boolean IsFiveNumber(int number) {

        if (number % 5 == 0) {
            return true;
        } else
            return false;
    }
}
