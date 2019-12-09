package Polymorphism;

class MoviePolymorphism {
    private String name;

    public String getName() {
        return name;
    }

    public MoviePolymorphism(String name) {
        this.name = name;
    }
    public  String plot() {
        return "No plot here";
    }
}

class Jaws extends MoviePolymorphism {
    public Jaws() {
        super("jaws");
    }


    public String plot() {
        return "A shark eat people";
    }


}
class IndependenceDay extends MoviePolymorphism{
    public IndependenceDay() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "the day independence was gained";
    }

}

class GeminiMan extends MoviePolymorphism{
    public GeminiMan() {
        super("Gemini man");
    }

    @Override
    public String plot() {
        return "A movie of will smith, his clones and the gemini organization";
    }
}

class MordernFamily extends MoviePolymorphism {
    private int episodes;

    public MordernFamily( int episodes) {
        super("Mordern Family");
        this.episodes = episodes;
    }

    public MordernFamily() {
        super("Mordern Family");
    }

    public String plot() {
        return "One of the best movies i've seen";
    }

    private int episodes() {
        return this.episodes;
    }
}
class Main{
public static void main(String[]args){
    for(int i= 1; i< 9; i++) {
        MoviePolymorphism movie = randomMovie();
        System.out.println("Movie " + i + " " + movie.getName() + "\n" + "plot: "
        + movie.plot()+ "\n");
    }

    }
    public static MoviePolymorphism randomMovie() {
        int randomNumberr = (int) (Math.random() * 4) + 1;
        System.out.println("random number " + randomNumberr + " generated");

        switch (randomNumberr) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new GeminiMan();
            case 4:
                return new MordernFamily();
            default:
                return null;
        }


    }

}