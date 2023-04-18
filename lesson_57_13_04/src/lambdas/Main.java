package lambdas;

public class Main {
    public static void main(String[] args) {
        MyValue myValue = () -> 56.3;

 /* или MyValue myValue;
        myValue = () -> 56.3;*/

        System.out.println(myValue.getValue());

        MyValueParam myValueParam = n -> 1.0 / n;
        System.out.println(myValueParam.getValue(4.0));

        // лямбда выражение должно быть совместимо с абстрактным методом интерфейса.
        // и по типу и по количеству параметров. Т.е. если например метод принимает
        // 2 целых числа в качестве параметров, то и и лямбда выражение должно делать также

        //эта лямбда определяет  делится ли одно число на другое без остатка
        TestNumbers isFactor = (a, b) -> (a % b) == 0;
        System.out.println(isFactor.test(10, 2));//true
        System.out.println(isFactor.test(10, 3));//false

        //это лямбда выражение проверяет больше ли одно число другого
        TestNumbers lessThan = (a, b) -> (a < b);
        System.out.println(lessThan.test(10, 15));
        System.out.println(lessThan.test(15, 10));

        // эта лямбда определяет равенство абсолютных значений
        TestNumbers absEqual = (a, b) -> (a < 0 ? -a : a) == (b < 0 ? -b : b);
        System.out.println(absEqual.test(10, -10));

        isFactor = (a, b) -> (a > b);
        isFactor.test(21, 5);

        StringTest isPart = (a, b) -> a.indexOf(b) != -1;

        System.out.println(isPart.test("Hello world", "world"));
        System.out.println(isPart.test("Hello world", "abc"));

        Calculate square = n -> {
            int res = n * n;

            return res;
        };
    }
 }
