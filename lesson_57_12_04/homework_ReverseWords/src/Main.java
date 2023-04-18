public class Main {
    public static void main(String[] args) {



                String sentence = "The weather today is great";
                String reversedSentence = reverse(sentence);
                System.out.println(reversedSentence);
            }
            public static String reverse(String sentence) {
                String[] words = sentence.split(" "); // разбиваем строку на слова
                StringBuilder reversed = new StringBuilder();
                for (int i = words.length - 1; i >= 0; i--) { // обходим слова в обратном порядке
                    reversed.append(words[i]).append(" "); // добавляем каждое слово в объект StringBuilder с пробелом в конце
                }
                return reversed.toString().trim(); // возвращаем обратную строку без последнего пробела
            }
        }