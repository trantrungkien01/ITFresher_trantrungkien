import java.util.Scanner;

public class ITFresher_TranTrungKien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int mang = 0;
        int sum = 0;
        do {
            System.out.println("************Menu*************");
            System.out.println("1. Nhập giá trị n phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3.Tính trung bình các phần tử dương (>0) trong mảng");
            System.out.println("4.In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong\n" +
                    "mảng (k nhập từ bàn phím)");
            System.out.println("5.Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6.Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7.Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng\n" +
                    "dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần,\n" +
                    "các phần tử còn lại ở giữa mảng theo thứ tự tăng dần");
            System.out.println("8.Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm\n" +
                    "dần) đúng vị trí");
            System.out.println("9. Thoát");
            System.out.println("Chọn chức năng 1-9: ");
            int luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    System.out.println("Nhập giá trị n phần tử của mạng");
                    mang = Integer.parseInt(sc.nextLine());
                    number = new int[mang];
                    for (int i = 0; i < number.length; i++) {
                        System.out.println("In ra các phần tử của mạng");
                        number[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    for (int j = 0; j < number.length; j++) {
                        System.out.printf("%d\t", number[j]);
                    }
                    break;
                case 3:
                        break;
//                        case 4:
//                            break;
//                        case 5:
//                           break;
//                        case 6:
//                            break;
//                        case 7:
//                           break;
//                        case 8:
//                            break;
                        case 9:
                            System.exit(0);
                            break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    }
                 } while (true) ;
        }
    }