package practice_class;

public class Student {

   public static String setName(){
        return "hello";
    }
    public static void main(String[] args){Student.setName();

        String result = setName();
        System.out.println(result);

    }

}
