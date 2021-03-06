package com.zy.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @create 2020-01-20
 * @author zhouyu
 * @desc 验证postgres的连接。
 *
 */
public class PostgreSqlJdbcConn {
    public static void main(String args[]) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:6432/postgres",
                            "lx", "123");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
