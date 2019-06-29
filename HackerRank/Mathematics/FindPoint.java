package HackerRank.Mathematics;

public class FindPoint {
    public static void main(String[] args) {
        int px=0 ,py=0 ,qx=1 ,qy=1;
        int rx= (2*qx)+px;
        int ry= (2*qy)+py;
        int [] ref= {rx,ry};
        System.out.println(rx+" "+ry);
    }
}

/*
 //distance between 2 points
        int dx=Math.abs(px-qx);
        int dy= Math.abs(py-qy);
        //adding the distance on q
        int rx= qx+dx;
        int ry= qy+dy;
        int [] ref= {rx,ry};
        System.out.println(rx+" "+ry);
 */