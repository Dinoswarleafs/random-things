public class Square {

    private int xCor = 0;
    private int yCor = 0;
    private boolean state = false;

    public Square(int x, int y, boolean status) {
        xCor = x;
        yCor = y;
        state = status;
    }

    public int getX() {
        return xCor;
    }

    public int getY() {
        return yCor;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean status) {
        state = status;
    }
}