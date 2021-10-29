
import service.handler.Cron.CronJob;
import helpers.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Properties;

/*
Create table with users table. Table should include information about user: name, birthday, last login, age...,
registration date
Based on info from table,
cron should be started every X hours (time should be configured) - takes data from table and saved statistics in file:
names of users that logged in in system last  5 hours, count of users more than I years,
users that registered today
 */
public class Runner {
    public static void main(String[] args) {
        try {
            CronJob cronJob = new CronJob();
            cronJob.writeStatistics();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
