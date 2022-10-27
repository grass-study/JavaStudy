package grass.test3;

public class VariableScopeExam3 {

    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";

    public static void main(String[] args) {
        String gender1;
        gender1 = VariableScopeExam3.MALE;
        gender1 = VariableScopeExam3.FEMALE;
        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;


        //enum 설정으로 인해 MALE FEMALE만 gender2 입력가능
//        gender2 = "boy";  하면 에러남



    }

enum Gender{
        MALE, FEMALE;

    }

}
