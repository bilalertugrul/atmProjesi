import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        int select, right=3, balance=3000, money;

        Scanner input = new Scanner(System.in);

        while(right>0){

            System.out.print("Kullanıcı Adı: ");
            userName = input.nextLine();
            System.out.print("Şifre: ");
            password = input.nextLine();

            if(userName.equals("ertugrul") && password.equals("1234")){
                System.out.println("1-Para Yatırma " + "2-Para Çekme " + "3-Bakiye Sorgula " + "4-Çıkış Yap ");
                System.out.print("Seçiniz: ");
                select = input.nextInt();

                if(select==1){
                    System.out.print("Yatırılacak Miktar Giriniz: ");
                    money = input.nextInt();
                    balance += money;
                }else if(select==2){
                    if(balance>0) {
                        System.out.print("Çekilecek Miktar Giriniz: ");
                        money = input.nextInt();
                        balance -= money;
                    }else{
                        System.out.println("Bakiye yetersiz..");
                    }
                }else if(select==3){
                    System.out.println("Bakiye: " + balance);
                } else if (select==4) {
                    System.out.print("Güle Güle...");
                    break;
                }
            }else{
                    right--;
                    if(right==0){
                        System.out.println("Hakkınız Bitti");
                        break;
                    }else {
                        System.out.println("Yanlış giriş " + right + " hakkınız kaldı");
                    }
            }

        }

    }
}