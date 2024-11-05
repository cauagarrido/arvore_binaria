package ABB;

import java.lang.RuntimeException;
public class EmptyTreeException extends RuntimeException {
    public EmptyTreeException() {
        super ("Tree is Empty");
    }
}
