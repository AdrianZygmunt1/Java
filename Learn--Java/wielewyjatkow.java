public class wielewyjatkow {
    static int div(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("erroe");
        }else{
            return a/b;
        }
    }
    public static void main(String[] args) {
        System.out.println(div(42, 0));
    }
}


/* try {
  //some code
} catch (ExceptionType1 e1) {
  //Catch block
} catch (ExceptionType2 e2) {
  //Catch block
} catch (ExceptionType3 e3) {
  //Catch block
} 
Wiele catch w jednym try
*/