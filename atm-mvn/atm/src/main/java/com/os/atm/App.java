package com.os.atm;

import com.os.atm.atmFrontend.welcomPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    @Autowired
    private ApplicationContext context;

    public static void main( String[] args )
    {
       new SpringApplicationBuilder(App.class).headless(false).run(args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("starting the JFrame");
        welcomPage wp = context.getBean(welcomPage.class);
        wp.createAndShow();
    }
}

