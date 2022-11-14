package com.example.vacationmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
@SpringBootApplication
public class VacationManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VacationManagerApplication.class, args);
    }

}
