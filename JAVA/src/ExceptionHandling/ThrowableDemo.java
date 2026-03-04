package ExceptionHandling;

public class ThrowableDemo
{
    static void function() throws Throwable{
        throw new Throwable("Something went wrong");
    }

    static void main() {
        try{
            function();
        }catch(Throwable t)
        {
            System.out.println(t.getMessage());
        }
    }
}

/*
What and all are allowed inside throwable class?
throw new Exception("Message")
throw new RuntimeException("Message")
throw new Throwable("Message")

What are not allowed?
throw new String
throw new Integer
 */