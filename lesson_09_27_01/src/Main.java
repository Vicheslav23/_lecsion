public class Main {
    public static void main(String[] args) {

        /*String str1 = "Hello";
        String str2 = "World";
        String res = str1.toUpperCase() + str2.toUpperCase();
        System.out.println(res);
        String res1 = res;
        System.out.println(res1.substring(0,4) + res1.substring(5,9)); */

        // Homework 27.01:

        //  1) есть строка  в которой нужно поменять местами две заданные буквы.
        // Известно, что эти буквы в строке есть.
        //пример: String str = "asDfghjklRre";  поменять D и R

        /*String str = "asDfghjklRre";
        int a = str.indexOf('D');
        int b = str.indexOf('R');
        char ch = 'R';
        char ch1 = 'D';
        str = str.substring(0, a) + ch + str.substring(a+1,b) + ch1 + str.substring(b+1);

        System.out.println(str);*/

        //--------------------------------------------------------------------------------

        //  2) есть строка четной длины и нужно вывести на экран эту строку но при этом первая половина
        // букв будет в нижнем регистре а вторая в верхнем
        // Helloh -> helLOH
        /*String str1 ="Helloh";
        String a = str1.substring(0,1);
        String b = str1.substring(1,4);
        String c = str1.substring(4,6);

        System.out.println(a.toLowerCase() + b.toLowerCase() + c.toUpperCase());

        //------------------------------------------------------------------------
        String str1 ="Helloh";
        int mid = str1.length() / 2;
        String a = str1.substring(0,mid);
        String b = str1.substring(mid);

        System.out.println(a.toLowerCase() + b.toUpperCase());*/
        //--------------------------------------------------------------------------

        // 3) Имеется строка. Нужно вывести на экран эту строку без символа, находящегося по индексу index
        // int index =3
        // String str = "Hello"
        // -> Helo

        String str = "Hello";
        int a = str.indexOf('l');

        String b = str.substring(0,a);
        String c = str.substring(a +1);

        System.out.println(b + c);
















        //System.out.println("Hello world!");
    }
}