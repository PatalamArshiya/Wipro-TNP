package OOPS.ClassesAndObjects;

public class Box {
    int width,height,depth;
    Box(int width,int height,int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    int getVolume() {
        return width*height*depth;
    }
    public static void main(String[] args){
        Box box = new Box(10, 20, 30);
        System.out.println("Width : " + box.width);
        System.out.println("Height : " + box.height);
        System.out.println("Depth : " + box.depth);
        System.out.println("Volume : " + box.getVolume());

    }
    
}
