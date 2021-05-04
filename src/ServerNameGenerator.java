public class ServerNameGenerator {
    public static void main(String [] args){

        String[] nouns = {"house", "car", "boat", "sandwich", "Tv", "Horse", "Pokemon", "Dog", "Cat" };
        String[] adjectives = {"nice", "pretty", "low", "hangry", "happy", "Large", "Shiny", "Good" };

        System.out.println(randomElement(nouns));
        System.out.println(randomElement(adjectives));

        System.out.println("This is a " + randomElement(adjectives) + " " + randomElement(nouns));
    }

    public static String randomElement(String[] word) {
        return word[(int)Math.floor(Math.random()*(word.length-1))];
    }
}
