import javax.lang.model.type.MirroredTypeException;

/**
 * cusException
 */
public class cusException {
    void show(int x)throws MyException{
        if (x>40)
        throw new MyException("value is >20");
        else
    System.out.println(x*x);
}
public static void main(String[] args) {
    cusException ce =new cusException();
    
}


    
}