package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {

        switch (monthNumber) {
            case 1, 2, 11, 12 -> System.out.println("Winter");
            case 3, 4 -> System.out.println("Spring");
            case 5, 6, 7, 8 -> System.out.println("Summer");
            case 9, 10 -> System.out.println("Autumn");
            default -> System.out.println("Wrong month number");
        }
    }
}

