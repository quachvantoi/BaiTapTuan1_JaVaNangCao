package baitap;
public class bai31 {
    public static void main(String[] args){
        int i,j;
        System.out.println("Bang cuu chuong:");
        for (i = 2; i < 10; ++i )//bang cuu chuong
        {
            for (j = 1; j < 10; ++j)
            {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("---------------------");
        }
    }
}
