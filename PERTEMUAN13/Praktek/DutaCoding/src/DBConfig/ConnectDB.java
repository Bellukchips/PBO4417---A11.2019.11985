/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConfig;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author nothing
 */
public class ConnectDB {
    static Connection connect;
    public static Connection connect(){
        if(connect == null){
            MysqlDataSource db = new MysqlDataSource();
            db.setDatabaseName("duta_coding");
            db.setUser("root");
            db.setPassword("");
             try {
                connect = db.getConnection();
            } catch (SQLException e) {
                System.out.println("Error Connection : "+e.getMessage());
            }
        }
        return connect;
    }
}
