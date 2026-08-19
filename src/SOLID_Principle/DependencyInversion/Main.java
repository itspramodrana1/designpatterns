package SOLID_Principle.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        UserService u1 = new UserService(new MongoDBDatabase());
        u1.saveUser("Pramod Rana");

        UserService u2 = new UserService(new MySQLDatabase());
        u2.saveUser("Pramod Rana");
    }
}
