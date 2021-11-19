package cz.educanet.lights.out.domain.interfaces;

public class Game implements ILightsOut {
    private boolean field[][] = new boolean[5][5];

    @Override
    public int getMoveCount() {
        return 0;
    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public boolean[][] getGrid() {
        field[4][0] = true;
        return field;
    }

    @Override
    public void makeMove(int x, int y) {
    }
}
