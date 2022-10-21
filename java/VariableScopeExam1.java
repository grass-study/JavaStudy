package java;

public class VariableScopeExam1 {
    int globalScope = 10;          // 인스턴스 변수
    static int staticVal = 7;      // 클래스 변수

    public int scopeTest(int value) {
        int localScope = value;        //지역변수 (괄호 value 매개변수)
        return localScope;
    }


    public static void main(String[] args) {
        System.out.println(staticVal);     // 클래스 변수는 인스턴스화 하지 않고도 사용가능
//        System.out.println(globalScope);   // 오류


        VariableScopeExam1 v1 = new VariableScopeExam1();
        VariableScopeExam1 v2 = new VariableScopeExam1();
        v1.globalScope = 20;
        v2.globalScope = 30;

        System.out.println(v1.globalScope);  //20 이 출력된다.
        System.out.println(v2.globalScope);  //30이 출력된다.

        v1.staticVal = 10;
        v2.staticVal = 20;

        System.out.println(v1.staticVal);  //20 이 출력된다.
        System.out.println(v2.staticVal);  //20 이 출력된다.

        System.out.println(v1.scopeTest(111));
    }
}
