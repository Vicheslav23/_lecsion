public class Main {
    public static void main(String[] args) {

        SomeTest<Integer> isFactor = (a, b) -> (a % b) == 0;
        System.out.println(isFactor.test(10, 2)); // true

        SomeTest<Double> isFactorD = (a, b) -> (a % b) == 0;
        System.out.println(isFactorD.test(200.0, 4.0));

        SomeTest<String> isPart = (s1, s2) -> s1.contains(s2);
        System.out.println(isPart.test("abcd", "bc"));

        int[] ints = {1, 50, 80, 10, 3, 9};
        Checkable moreTHan10 = n -> n > 10;
        System.out.println("sum of elements more than 10 = " + sum(ints, moreTHan10));
    }

    public static int sum (int[] ints, Checkable checkable) {
        int sum = 0;
        for (int num : ints) {
            if (checkable.check(num));
            sum = num;
        }
        return sum;
    }
//    Method reference (ссылки на метод)


}