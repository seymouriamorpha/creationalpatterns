package by.seymouriamorpha.creationalpatterns;

import by.seymouriamorpha.creationalpatterns.enums.Price;
import by.seymouriamorpha.creationalpatterns.factory.ComputerAbstractFactory;
import by.seymouriamorpha.creationalpatterns.factory.ComputerAbstractFactoryService;
import by.seymouriamorpha.creationalpatterns.factory.ComputerFactoryMethodService;
import by.seymouriamorpha.creationalpatterns.factory.ComputerService;
import by.seymouriamorpha.creationalpatterns.ifaces.Computer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Eugene Kortelyov on 3/1/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        printFactoryInformation();
        while (true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            switch (input){
                case "1":
                    processFactoryMethod(printPriceInformation());
                    break;
                case "2":
                    processAbstractFactory(printPriceInformation());
                    break;
                default:
                    System.out.println("Dear, please select valid factory's version.");
                    printFactoryInformation();
                    continue;
            }
            break;
        }

    }

    private static Price printPriceInformation() throws IOException {
        while (true) {
            System.out.print("Please, select what computer you want:\n1) CHIP\n2) EXPENSIVE\n");
            System.out.print(": ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            switch (input) {
                case "1":
                    return Price.CHIP;
                case "2":
                    return Price.EXPENSIVE;
                default:
                    printPriceInformation();
            }
        }
    }

    private static void processFactoryMethod(Price price){
        ComputerService service = new ComputerFactoryMethodService(price);
        Computer computer = service.process();
        System.out.println(computer);
    }

    private static void processAbstractFactory(Price price){
        ComputerService service = new ComputerAbstractFactoryService(price);
        Computer computer = service.process();
        System.out.println(computer);
    }

    private static void printFactoryInformation(){
        System.out.print("Please, select a factory: \n1) Factory method\n2) Abstract factory\n");
        System.out.print(": ");
    }

}
