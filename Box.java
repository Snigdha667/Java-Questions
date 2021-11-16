//Question 3: Create a class Box that uses a parameterized constructor to initialize the dimensions of the box......
public class Box {
    int width;
    int height;
    int depth;
    Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }
    public void vol(){
        int volume = width*height*depth;
        System.out.println(volume);
    }

    public static void main(String[] args) {
        Box obj = new Box(5,2,10);
        obj.vol();
    }
}
