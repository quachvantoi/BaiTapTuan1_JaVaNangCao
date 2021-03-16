package baitap;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai15 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int d, m, y, s, i;
        System.out.println("Nhap ngay thang nam: ");
        d = scanner.nextInt();
        m = scanner.nextInt();
        y = scanner.nextInt();
        s = d;
        for (i = 1; i < m; i++)
        {
            switch (i)
            {
                case 4: case 6: case 9: case 11: 
                    s += 30; 
                    break;
                case 2: 
                    // một năm nhuận là chia hêt cho 4 nhưng không chia hết cho 100, trừ khi nó cũng chia hết cho 400
                    s += (y % 4 == 0 && y % 100 != 0 || y % 4 == 0 && y % 100 == 0 && y % 400 == 0) ? 29 : 28; 
                    break;
                default:
                    s += 31;
                    break;
            }
        }
        System.out.println("Ngay thu: " + s);
    }
}
