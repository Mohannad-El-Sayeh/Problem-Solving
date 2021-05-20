// Link for the problem : https://edabit.com/challenge/Abq8d76QDQC2ocfX7

public class DoesTheBrickFit {
    public static boolean doesBrickFit(int brickHeight, int brickWidth, int brickDepth,  int holeWidth, int holeHeight) {
        int brickArea1 = calculateArea(brickHeight, brickWidth);
        int brickArea2 = calculateArea(brickHeight, brickDepth);
        int brickArea3 = calculateArea(brickWidth, brickDepth);
        int holeArea = calculateArea(holeHeight, holeWidth);
        return brickArea1 <= holeArea || brickArea2 <= holeArea || brickArea3 <= holeArea;
    }

    private static int calculateArea(int a, int b) {
        return a*b;
    }
}
