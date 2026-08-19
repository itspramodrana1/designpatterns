package SOLID_Principle.DependencyInversion;

public class MySQLDatabase implements DataBase {

    @Override
    public void save(String user) {
        System.out.println("Saving data in MySQL"+ user);
    }
}
