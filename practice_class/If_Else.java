package practice_class;

public class If_Else {
    public static void main(String[] args) {
            int marks = 60;
            if (marks>0 && marks<40){
                System.out.println("fail");
            }else if ( marks>40 && marks<60){
                System.out.println("B grade");
            }else if (marks>60 && marks<80){
                System.out.println("B+Grade");
            } else if (marks>80 && marks<90){
                System.out.println("A grade");
            } else if (marks>90 && marks<99){
                System.out.println("A+");
            }
    }
}
