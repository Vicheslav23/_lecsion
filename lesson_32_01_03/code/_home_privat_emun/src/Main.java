public class Main {
    public static void main(String[] args) {

        System.out.println("План занятий на текущую неделю");
        enum Lessons {
            LESSON30,
            LESSON31,
            LESSON32,
            LESSON33,
            LESSON34,
        }
        Lessons weekLessons = Lessons.LESSON33;
        switch(weekLessons) {

            case LESSON30:
                System.out.println("Лекция 30. Numeral Systems");
                break;
            case LESSON31:
                System.out.println("Лекция 31. Files I/O");
                break;
            case LESSON32:
                System.out.println("Лекция 32. Enum");
                break;
            case LESSON33:
                System.out.println("Лекция 33. Classes, constructions, getter, setter, encapsulation");
                break;
           case LESSON34:
                System.out.println("Лекция 34. повторение пройденного за неделю, практика");
                break;
        }

    }
}