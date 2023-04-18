public class Main {
    public static void main(String[] args) {



                String input = "aaaabbccccd";
                String result = count(input);
                System.out.println(result);
            }
            public static String count(String input) {
                StringBuilder result = new StringBuilder();
                int count = 1; // счетчик для количества повторений буквы
                for (int i = 1; i < input.length(); i++) { // начинаем с 1, так как сравниваем со значением на предыдущей позиции
                    if (input.charAt(i) == input.charAt(i - 1)) { // если текущая буква совпадает с предыдущей
                        count++; // увеличиваем счетчик повторений
                    } else { // если текущая буква не совпадает с предыдущей
                        result.append(count).append(input.charAt(i - 1)); // добавляем количество повторений и предыдущую букву в объект StringBuilder
                        count = 1; // сбрасываем счетчик повторений
                    }
                }
                // добавляем последний набор букв в объект StringBuilder
                result.append(count).append(input.charAt(input.length() - 1));
                return result.toString();
            }

        }