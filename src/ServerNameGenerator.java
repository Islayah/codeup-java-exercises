import java.util.Random;

public class ServerNameGenerator {

    public static String[] adjectives = {"ashamed", "bloody", "cloudy", "defeated", "elegant", "fragile", "glorious", "homely", "ill", "jittery"};
    public static String[] nouns = {"army", "belgium", "caravan", "dinner", "easter", "forest", "gold", "hamburger", "iron", "juice"};

    public static void main(String[] args) {
        System.out.println("Server Name: ");
        System.out.println(getRandoWord(adjectives) + "-" + getRandoWord(nouns));
    }


//    Custom Method to return rando ele from arrays
    public static String getRandoWord(String[] wordArr) {
        Random random = new Random();
        int randomIndex = random.nextInt(wordArr.length);
        return wordArr[randomIndex];
    }
}
