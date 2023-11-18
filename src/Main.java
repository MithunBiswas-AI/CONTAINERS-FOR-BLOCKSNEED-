// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int amountOfBricks = chooseOddNumber(50, 100);
        System.out.println("Number of Lego bricks: " + amountOfBricks);


        int containerCapacity = chooseEvenNumber(5, 10);
        System.out.println("Container capacity: " + containerCapacity);


        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Number of full containers: " + fullContainers);

        int totalContainers = (amountOfBricks + containerCapacity - 1) / containerCapacity;
        System.out.println("Total number of containers: " + totalContainers);

        int remainingBlocks = amountOfBricks % containerCapacity;
        System.out.println("Blocks in the not completely full container: " + remainingBlocks);
    }
    private static int chooseOddNumber(int min, int max) {
        int number = (int) (Math.random() * ((max - min) / 2 + 1) * 2) + min;
        return (number % 2 == 0) ? number - 1 : number;
    }
    private static int chooseEvenNumber(int min, int max) {
        int number = (int) (Math.random() * ((max - min) / 2 + 1) * 2) + min;
        return (number % 2 != 0) ? number + 1 : number;

    }
}