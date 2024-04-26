package com.example.gatekeepr;

import com.example.gatekeepr.Classes.Admin;
import com.example.gatekeepr.Controllers.SchemaInitializer;
import com.example.gatekeepr.Database.DBOperationsAdmins;
import com.example.gatekeepr.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        SchemaInitializer.initializeDatabase();
        Model.getInstance().getViewFactory().showLoginWindow();

    }
}
