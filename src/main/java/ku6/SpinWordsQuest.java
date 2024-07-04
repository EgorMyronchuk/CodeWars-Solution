package ku6;

public class SpinWordsQuest {
    public static String spinWords(String sentence) {
        StringBuilder spinWords = new StringBuilder();
        spinWords.append(sentence);
        int lengOfWord = 0 ;
        int index = 0 ;
      while (index < spinWords.length()){
            if (spinWords.charAt(index) == ' ' || index == spinWords.length()-1){
                if (lengOfWord >= 5){

                    String temp = spinWords.substring(index-lengOfWord, index+1);
                    spinWords.replace(index-lengOfWord, index+1 , temp).reverse();

                }
                lengOfWord = 0;
            }
          lengOfWord++;
          index++;
      }
      return spinWords.toString();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("emocleW"));
    }
}
