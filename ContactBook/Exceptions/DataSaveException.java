package ContactBook.Exceptions;

import java.io.IOException;

public class DataSaveException extends IOException{
    public DataSaveException() {
        System.out.println("Can't save the contact!");
    }
}
