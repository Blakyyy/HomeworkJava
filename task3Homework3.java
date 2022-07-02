
// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class task3Homework3 {
    public static void main(String[] args) {
        int Disks = 5;
        String Solution = towerOfHanoi(Disks, 1, 3);
        for (String step : Solution.split(";")) {
            System.out.println(step);
        }
    }
    public static String towerOfHanoi(int Disks, int fromPeg, int toPeg) {
        if(Disks == 1) {
            return fromPeg + " ----> " + toPeg + ";";
        }
        else {
            String sol1, sol2, sol3;
            int helpPeg = 6 - fromPeg - toPeg;
            sol1 = towerOfHanoi(Disks - 1, fromPeg, helpPeg);
            sol2 = fromPeg  + " ----> " + toPeg + ";";
            sol3 = towerOfHanoi(Disks - 1, helpPeg, toPeg);
            
            return sol1 + sol2 + sol3;
        }
    }
}

