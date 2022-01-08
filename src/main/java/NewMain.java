class InstanceClass {
    private static InstanceClass instance = null;
    
    private InstanceClass(String name, String id) {
        User user = new User(name, id);
    }
    
    public static InstanceClass getInstanceClass(String name, String id) {
        if(instance == null) {
            instance = new InstanceClass(name, id);
        }
        return instance;
    }
}

class User {
    String name;
    String id;
    
    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }
}


public class Main {
    public static void main(String[] args) {
        String name = "Tanim Kabir";
       String id = "011172101";
       
       InstanceClass student = InstanceClass.getInstanceClass(name, id);
    }
}