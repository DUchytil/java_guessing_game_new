public class ClassExample {

    String objectName;
    int objectID;


    public void newMethod(){
        System.out.println("This will do the thing");
    }

    //"Static" here means that this method can be called without being associated with a ClassExample object. Otherwise,
    //it would need be called in association with an object associated with this class (if "static" was omitted).
    public static void classMethod() {
        System.out.println("This is the classMethod called (:");
    }




}
