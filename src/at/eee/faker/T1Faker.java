package at.eee.faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class T1Faker {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("DE-AT"));

        try {
            FileWriter myWriter = new FileWriter("insertdaten.txt");

            for (int i = 0; i < 100; i++) {
                String name = faker.name().fullName();
                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();
                String streetAddress = faker.address().streetAddress();

                String dataRecord = "('"+ firstName + "','" + lastName + "','" + streetAddress + "'),";

                // Write to file
                myWriter.write(dataRecord + "\n");
            }

            for (int i = 0; i < 100; i++) {
                String champion = faker.leagueOfLegends().champion();
                String location = faker.leagueOfLegends().location();
                String quote = faker.leagueOfLegends().quote();

                String dataRecord = "('"+ champion + "','" + location + "','" + quote + "'),";

                // Write to file
                myWriter.write(dataRecord + "\n");
            }

            for (int i = 0; i < 100; i++) {
                String name = faker.team().name();
                String sport = faker.team().sport();
                String state = faker.team().state();

                String dataRecord = "('"+ name + "','" + sport + "','" + state + "'),";

                // Write to file
                myWriter.write(dataRecord + "\n");
            }

            for (int i = 0; i < 100; i++) {
                String location = faker.pokemon().location();
                String name = faker.pokemon().name();

                String dataRecord = "('"+ name + "','" + location + "'),";

                // Write to file
                myWriter.write(dataRecord + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
