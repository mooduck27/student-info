package homework;

public class Student {
    int id = 0;
    String First_name = "";
    String Last_name = "";
    byte year = 0;
    double a_r_math = 0;
    double a_r_economic = 0;
    double a_r_eng = 0;

}

class StudentTest {
    public static void main(String[] args) {

        double a_r_A, a_r_B, a_r_C;


        Student A_Class = new Student();
        A_Class.id = 1;
        A_Class.First_name = "Maxim";
        A_Class.Last_name = "Gadzhikerimov";
        A_Class.year = 3;
        A_Class.a_r_math = 5;
        A_Class.a_r_economic = 4;
        A_Class.a_r_eng = 5;

        a_r_A = (A_Class.a_r_economic + A_Class.a_r_eng + A_Class.a_r_math)/3;
        System.out.println("Average rating of student " + A_Class.First_name + " " + A_Class.Last_name + " is equal: " + a_r_A);


        Student B_Class = new Student();
        B_Class.id = 2;
        B_Class.First_name = "Igor";
        B_Class.Last_name = "Kamnev";
        B_Class.year = 3;
        B_Class.a_r_math = 4;
        B_Class.a_r_economic = 5;
        B_Class.a_r_eng = 3;

        a_r_B = (B_Class.a_r_economic + B_Class.a_r_eng + B_Class.a_r_math)/3;
        System.out.println("Average rating of student " + B_Class.First_name + " " + B_Class.Last_name + " is equal: " + a_r_B);


        Student C_Class = new Student();
        C_Class.id = 3;
        C_Class.First_name = "Serazh";
        C_Class.Last_name = "Katuev";
        C_Class.year = 3;
        C_Class.a_r_math = 3;
        C_Class.a_r_economic = 4;
        C_Class.a_r_eng = 5;

        a_r_C = (C_Class.a_r_economic + C_Class.a_r_eng + C_Class.a_r_math)/3;
        System.out.println("Average rating of student " + C_Class.First_name + " " + C_Class.Last_name + " is equal: " + a_r_C);

    }

}