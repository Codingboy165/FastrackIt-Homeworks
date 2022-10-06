public class Extramiles {

    public int countChar(String something, char someChar) {
        int count = 0;
        for (int i = 0; i < something.length(); i++) {
            if (something.charAt(i) == someChar) {
                count++;
            }
        }
        return count;
    }

    public static String redact(String something){
     return something.replaceAll(".","*");
    }

    public static boolean contains (String[] something,String theWanted){
        for(int i=0;i< something.length;i++){
            if(something[i]==theWanted){
                return true;
            }
        }return false;
    }

    public static String[] words(String something){
        return something.split(" +");
    }
     public static String confidential(String something, String[] sensitiveWords){
        String [] words = words(something);
        for(int i = 0; i < words.length; i++){
            if (contains(sensitiveWords,words[i])){
               words[i] = redact(words[i]);
            }
        }
        return String.join(" ",words);
     }
}

