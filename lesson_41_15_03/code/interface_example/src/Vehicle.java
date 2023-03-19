    // класс Vehicle «реализует» интерфейс Move (class Vehicle "implements" the Move interface)
    class Vehicle implements Move {
        public void moveFast() {
// Тело moveFast() приведено здесь (The body of moveFast() is provided here)
            System.out.println("Fast speed... - вжик и нету");
        }
        public void moveSlow() {
// Тело moveSlow() приведено здесь (The body of moveSlow() is provided here)
            System.out.println("Slow speed... - ползем, как черепаха");
        }
    }
