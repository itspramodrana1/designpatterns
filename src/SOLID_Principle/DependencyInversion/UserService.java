package SOLID_Principle.DependencyInversion;

public class UserService {

//    private MySQLDatabase database1 = new MySQLDatabase();
//    private MongoDBDatabase database2 = new MongoDBDatabase();

//    public void saveDataInMySQL(String user){
//        database1.saveData(user);
//    }
//    public void saveDataInMongoDB(String user){
//        database2.saveData(user);
//    }

    private DataBase dataBase;

    public UserService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void saveUser(String user){
        dataBase.save(user);
    }

}
