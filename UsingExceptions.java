public class UsingExceptions{
    public static void main(String[] args) {
        try{
            throwException();
        }catch(Exception e){
            System.err.println("Exception handled in main");
        }
        doesNotThrowException();
    }

    public static void throwException() throws Exception{
        try{
            System.out.println("Method throwException");
            throw new Exception();  // generate exception
        }catch(Exception e){
            System.err.println("Exception handled in method throwException");
            throw e;  // rethrow for further processing
        }finally{
            System.err.println("finally executed in throwException");
        }
        // code here would not be reached; would cause compilation errors
    }

    public static void doesNotThrowException(){
        try{
            System.out.println("Method doesNotThrowException");
        }catch(Exception e){
            System.err.println(e);
        }finally{
            System.err.println("Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
}
