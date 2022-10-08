package RegexHomework;

public class Regex {
    public static void main(String[] args) {
        String regexExperiment = "marea neagră are un restaurant mijlocie. Are trei ferestre mijlocie despre care oameni vorbesc cu mandrie. mie mie sete deci merg pana la mere.";
        String doubleExperiment = "1zc2adf3.5vzx6afsa.dacs32zamw....";

        replaceMAndEWords(regexExperiment);
        doubleConverter(doubleExperiment);
    }

    public static void replaceMAndEWords(String regex) {
        if (regex != null) {
            System.out.println(regex.replaceAll("m\\w*e\\W", " * ").replaceAll("m\\w*e\\W.", " * ").replaceAll("m\\w*e$", "*"));
        } else {
            System.out.println("Textul este un null");
        }
    }

    public static void doubleConverter(String text) {

        double myDouble = 0;
        if (text != null) {
            if (text.matches("\\d+\\.?\\d*")) {
                System.out.println(Double.parseDouble(text));
            } else {

                int firstIndex = text.indexOf(".");
                firstIndex++;

                String firstPart = text.substring(0, firstIndex);
                String secondPart = text.substring(firstIndex);
                String s = firstPart.replaceAll("[^\\d]", "") + "." + secondPart.replace(".", "").replaceAll("[^\\d]", "");

                myDouble = Double.parseDouble(s);

            }
            System.out.println(myDouble);
        } else {
            System.out.println("Stringul e un null");
        }
    }
}

