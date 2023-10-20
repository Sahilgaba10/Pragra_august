package practice_class;

public class for_loop {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){

            for (int j =0; j<=i; j++)
            System.out.print("*");
            System.out.println();
        }
        for (int x=0; x<=5; x++){
            for (int y=5; y>=x; y--){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
