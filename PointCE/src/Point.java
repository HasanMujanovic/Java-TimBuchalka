public class Point {
    private int x;
    private int y;
public Point(){

}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
    double rez = Math.sqrt((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));
    return rez;
    }
    public double distance(Point point){
        double rez = Math.sqrt((point.getX()-this.x)*(point.getX()-this.x)
                +(point.getY()-this.y)*(point.getY()-this.y));
        return rez;
    }
    public double distance(int x, int y){
        double rez = Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
        return rez;
    }
}
