package SOLID_Principle.DependencyInversion;

public class MongoDBDatabase implements DataBase{

    @Override
    public void save(String user) {
        System.out.println("Saving data in MongoDBDatabase"+ user);
    }
}
