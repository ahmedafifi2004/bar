package foobar;

/**
 * Hello world!
 *
 */

import org.flywaydb.core.Flyway;
public class App 
{
    public static void main( String[] args )
    {


        System.out.println("Test Check in");

        Flyway flyway = Flyway.configure().dataSource("jdbc:h2:file:./target/foobar", "sa", null).load();

        // Start the migration
        flyway.migrate();



        System.out.println( "Hello World!" );
    }
}
