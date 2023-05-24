package academy.devdojo.maratonajava.javacore.E_initializationBlocks.domain;

public class Anime {
    private String name;
    private int[] episodes;

//    Order of compiling
//      1- Allocate memory space for  object
//      2- Each class attribute is created and initialized with default or set values
//      3- Initialization block is executed
//      4- Constructor is executed

//     Instance Block Initialization
    {
        System.out.println("Within the constructor");
        episodes = new int [100];
        for(int i=0; i<episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime() {
        for (int episode:this.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
