package grass.test8;

public class Student {
    String name;
    String number;
    int birthyear;

    //코드 -> 정의 생성으로 equals, hashCode 통일화
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (birthyear != student.birthyear) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return number != null ? number.equals(student.number) : student.number == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + birthyear;
        return result;
    }

    public static void main(String[] args){

        Student s1 = new Student();
        s1.name = "홍";
        s1.number = "1234";
        s1.birthyear = 1991;

        Student s2 = new Student();
        s2.name = "홍";
        s2.number = "1234";
        s2.birthyear = 1991;

//        s1과 s2 값이 다르게나옴, equal와 hashcode 메서드는 오브젝트가 구현하고 있는 메서드를 사용하기 때문.
//        오버라이딩 작업으로 통일 시켜야함

        if(s1.equals(s2))
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());




    }
}



