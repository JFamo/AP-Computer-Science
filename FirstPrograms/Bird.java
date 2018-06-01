public class Bird{
    public void act(){
        System.out.print("fly ");
        makeNoise();
    }
    public void makeNoise(){
        System.out.print("chirp ");
    }
    public static void main(){
        Bird pigeon = new Bird();
        pigeon.act();
    }
}