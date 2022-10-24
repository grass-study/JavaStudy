package grass;

public class VariableScopeExam4 {

        public int plus(int x, int y) {
            return x+y;
        }
        public int plus(int x, int y, int z) {
            return x + y + z;
        }

        //타입 문자열에 주의
        public String plus(String x, String y) {
            return x + y;
        }


//        //위 plus와 동일한 이름 에러 발생
//        public int plus(int a, int b) {
//            return a+b;
//        }

        public static void main(String[] args) {

            VariableScopeExam4 V = new VariableScopeExam4();

            System.out.println(V.plus(1,2));
            System.out.println(V.plus(1,2,3));
            System.out.println(V.plus("Po","wer"));


        }
}
