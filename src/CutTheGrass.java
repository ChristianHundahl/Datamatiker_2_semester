public class CutTheGrass {
    public static void main(String[] args) {
        cutTheGrass(3,6);
    }

    public static void cutTheGrass(double lengthOfGrass, double maxLengthOfGrass){
        int count = 0;
        for (double i = lengthOfGrass; i < maxLengthOfGrass; i += 0.8){
            count++;
        }
        if (count == 0){
            System.out.println("Cut the grass today");
        }
        else
            System.out.println("Cut the grass in " + count + " days");
    }
}