import java.util.Scanner;
import java.io.*;
public class Airline_Reservation {
    static String name;
    static String passportNo;
    static int age;
    static String gender;
    static String flight;
    static String time_and_charges;
    static String tra_date;


    public static void mainManu()throws IOException{
        System.out.println("--------------------------------------------------       Main Menu       --------------------------------------------------");
        System.out.println("                           |                                                                 |");
        System.out.println("                           |                * Press 1 to add the Customer Details.           |");
        System.out.println("                           |                * Press 2 for flight reservation.                |");
        System.out.println("                           |                * Press 3 for Ticket and Charges.                |");
        System.out.println("                           |                * Press 4 Exit.                                  |");
        System.out.println("                           |                                                                 |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                         --> Enter your choice:");
        choice();

    }
    public static void ticketAndCharges()throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------------------------------       CANVAS AIRLINES       ------------------------------------\n");
        System.out.println("----------------------------------       TICKET AND CHARGES       ----------------------------------\n");
        System.out.println(" ");
        System.out.println("Your ticket is ready \n Press 1 to Print your ticket:");
        int print_ticket=Integer.parseInt(buf.readLine());
        if(print_ticket==1) {
            System.out.println("\tPassport ID: " + passportNo + " / Name: " + name + " / age: " + age + " / Gender: " + gender);
            System.out.println("\tFlight: " + flight + " / " + tra_date + " / " + time_and_charges);
            System.out.println("\nImportant Information:\n" +
                    "All passengers have to carry a negative RT-PCR test report along with a sample taken within 72 hours post arrival." +
                    "RT-PCR Test timeline begins from the report allocation time. Passengers travelling will not be permitted to board" +
                    "the flights if they are not carrying a valid test report. Fully vaccinated passengers don't have to carry a negative" +
                    "report if they are travelling. They can travel with a final COVID vaccination certificate.\n" +
                    "\n" +
                    "Passengers who have completed their vaccination (both the doses) can enter after completing 15 days from receipt of" +
                    "the 2nd dose of vaccination. No negative RT-PCR test is required for fully vaccinated passengers.");
            System.out.println("\n\npress any key to go back to main menu.");
            String backMenu = buf.readLine();
            mainManu();
        }else {
            System.out.println("INVALID INPUT !");
            System.out.println("press any key to go back to main menu.");
            String backMenu = buf.readLine();
            mainManu();
        }

    }
    public static void fillCustomerDetails()throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------------------------------       FILL CUSTOMER DETAILS       ------------------------------------");
        System.out.println("          * Enter your Name:");
        name=buf.readLine();
        System.out.println("          * Enter your age:");
        age=Integer.parseInt(buf.readLine());

        System.out.println("          * Enter your gender:");
        System.out.println("          -> * press 1 for Male.");
        System.out.println("          -> * press 2 for Female.");
        System.out.println("          -> * press 3 for Other.");
        int genderNo=Integer.parseInt(buf.readLine());
        if(genderNo== 1){
            gender="MALE";
            System.out.println("Male");
        }else if(genderNo== 2){
            gender="FEMALE";
            System.out.println("Female");
        }else if(genderNo==3){
            gender="OTHER";
            System.out.println("Other");
        }else{
            System.out.println("Invalid input !");
        }
        System.out.println("          * Enter your Occupation:");
        String occupation=buf.readLine();
        System.out.println("          * Enter your Country:");
        String country=buf.readLine();
        System.out.println("          * Enter your State:");
        String state=buf.readLine();
        System.out.println("          * Enter your Address:");
        String address=buf.readLine();
        System.out.println("          * Enter your Mobile Number:");
        long mobileNumber=Long.parseLong(buf.readLine());
        System.out.println("          * Enter your Adhar card number:");
        long adhar=Long.parseLong(buf.readLine());
        System.out.println("          * Enter your purpose of visit:");
        String purpose=buf.readLine();
        System.out.println("          * Enter your passport number:");
        passportNo=buf.readLine();
        System.out.println("Your details are saved with us.");
        System.out.println("Press any key to go back to main menu");
        String backMenu=buf.readLine();
        mainManu();
    }
    public static void  flightReservation()throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------------------------------       FLIGHT RESERVATION       ------------------------------------");
        System.out.println("\t\t* Enter your Passport Number:");
        String passport_number= buf.readLine();
        System.out.println("\t\tYour Passport Number is: "+passport_number);
        System.out.println("\t\t* Enter which country's Visa you have: ");
        String visa = buf.readLine();
        System.out.println("\t\t* Mention Approval Date of Visa: ");
        String appro_visa = buf.readLine();
        System.out.println("\t\t* Mention Expiration Date of Visa: ");
        String exp_visa = buf.readLine();
        System.out.println("\t\t* Mention your Visa Type(Employment/Study/Tourist/Business/Project/Research/Transit/Conference/Medical): ");
        String visa_type = buf.readLine();
        System.out.println("\t\t* Visa Details filled by you: "+visa+"/"+appro_visa+"/"+exp_visa+"/"+visa_type);
        System.out.println(" ");
        System.out.println("\t\tEnter 1 for Domestic Service and 2 for International Service");
        int service=Integer.parseInt(buf.readLine());
        String curr_date;
        if(service==1){
            System.out.println("\t\tWelcome to Domestic Services");
            System.out.println("\t\t*Domestic Service is available for both current and future flights*");
            System.out.println("\t\tEnter current date");
            curr_date=buf.readLine();
            System.out.println("\t\tCurrent Date is: "+curr_date);
            System.out.println("\t\tEnter your travelling date");
            tra_date=buf.readLine();
            System.out.println("\t\tTravelling Date is: "+tra_date);
            System.out.println("\t\tAccording to your mentioned travelling date, Flights for booking are: ");

            String flight_domestic[]={"Delhi","Chandigarh","Goa","Mumbai","Bangalore"};
            for(int i=0;i<5;i++){
                System.out.println("\t\t"+i+1+".flight to "+flight_domestic[i]);
            }
            System.out.println();
            System.out.println("\t\tEnter the number of the country of which you want to book:");
            int country_choice=Integer.parseInt(buf.readLine());
            switch (country_choice){
                case 01:
                {
                    System.out.println("------------------------------------       WELCOME TO DELHI AIRLINES       -------------------------------------");
                    System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                    System.out.println("\t\t* Following are the flights: ");

                    System.out.println("\t\t  1. DEL-481 ");
                    System.out.println("\t\t\t"+tra_date+" 08:00AM Rs. 14000");

                    System.out.println("\t\t  2. DEL-482 ");
                    System.out.println("\t\t\t"+tra_date+" 02:00AM Rs. 15000");

                    System.out.println("\t\t  3. DEL-483 ");
                    System.out.println("\t\t\t"+tra_date+" 08:00PM Rs. 13000");

                    int flight_choice;

                    System.out.println("\t\t\n* Select which flight you want to book: ");
                    flight_choice=Integer.parseInt(buf.readLine());

                    if(flight_choice==1){
                        flight="DEL-481 ";
                        time_and_charges="08:00AM Rs. 14000";
                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==2){
                        flight="DEL-482 ";
                        time_and_charges="02:00AM Rs. 15000";
                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==3){
                        flight="DEL-483 ";
                        time_and_charges="08:00PM Rs. 13000";
                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid Input!!!");
                    }
                    break;
                }
                case 11 :
                {
                    System.out.println("------------------------------------       WELCOME TO CHANDIGARH AIRLINES       -------------------------------------");
                    System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                    System.out.println("\t\t* Following are the flights,");

                    System.out.println("\t\t  1. CH-381 ");
                    System.out.println("\t\t\t"+tra_date+" 08:00AM Rs. 9000");

                    System.out.println("\t\t  2. CH-382 ");
                    System.out.println("\t\t\t"+tra_date+" 01:00AM Rs. 8000");

                    System.out.println("\t\t  3. CH-383 ");
                    System.out.println("\t\t\t"+tra_date+" 07:00PM Rs. 10000");

                    System.out.println("\t\t\n* Select which flight you want to book: ");
                    int flight_choice=Integer.parseInt(buf.readLine());
                    if(flight_choice==1){
                        flight="CH-381 ";
                        time_and_charges="08:00AM Rs. 9000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is:"+seat_choice);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==2){
                        flight="CH-382 ";
                        time_and_charges="01:00AM Rs. 8000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==3){
                        flight="CH-383 ";
                        time_and_charges="07:00PM Rs. 10000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid Input!!!");
                    }
                    break;
                }
                case 21 :
                {
                    System.out.println("------------------------------------       WELCOME TO GOA AIRLINES       -------------------------------------");
                    System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                    System.out.println("\t\t* Following are the flights,");

                    System.out.println("\t\t  1. GOA-581 ");
                    System.out.println("\t\t\t"+tra_date+" 06:00AM Rs. 24000");

                    System.out.println("\t\t  2. GOA-582 ");
                    System.out.println("\t\t\t"+tra_date+" 03:00AM Rs. 25000");

                    System.out.println("\t\t  3. GOA-583 ");
                    System.out.println("\t\t\t"+tra_date+" 09:00PM Rs. 23000");

                    System.out.println("\t\t\n* Select which flight you want to book: ");
                    int flight_choice=Integer.parseInt(buf.readLine());
                    if(flight_choice==1){
                        flight="GOA-581 ";
                        time_and_charges="06:00AM Rs. 24000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==2){
                        flight="GOA-582 ";
                        time_and_charges="03:00AM Rs. 25000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==3){
                        flight="GOA-583 ";
                        time_and_charges="09:00PM Rs. 23000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid Input!!!");
                    }
                    break;
                }
                case 31 :
                {
                    System.out.println("------------------------------------       WELCOME TO MUMBAI AIRLINES       -------------------------------------");
                    System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                    System.out.println("\t\t* Following are the flights,");

                    System.out.println("\t\t  1. MB-781 ");
                    System.out.println("\t\t\t"+tra_date+" 08:00AM Rs. 19000");

                    System.out.println("\t\t  2. MB-782 ");
                    System.out.println("\t\t\t"+tra_date+" 02:00AM Rs. 21000");

                    System.out.println("\t\t  3. MB-783 ");
                    System.out.println("\t\t\t"+tra_date+" 08:00PM Rs. 20000");

                    System.out.println("\t\t\n* Select which flight you want to book: ");
                    int flight_choice=Integer.parseInt(buf.readLine());
                    if(flight_choice==1){
                        flight="MB-781 ";
                        time_and_charges="08:00AM Rs. 19000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }
                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==2){
                        flight="MB-782 ";
                        time_and_charges="02:00AM Rs. 21000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==3){
                        flight="MB-783 ";
                        time_and_charges="08:00PM Rs. 20000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid Input!!!");
                    }
                    break;
                }
                case 41 :
                {
                    System.out.println("------------------------------------       WELCOME TO BANGALORE AIRLINES       -------------------------------------");
                    System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                    System.out.println("\t\t* Following are the flights,");

                    System.out.println("\t\t  1. BL-481 ");
                    System.out.println("\t\t\t"+tra_date+" 08:00AM Rs. 14000");

                    System.out.println("\t\t  2. BL-482 ");
                    System.out.println("\t\t\t"+tra_date+" 02:00AM Rs. 15000");

                    System.out.println("\t\t  3. BL-483 ");
                    System.out.println("\t\t\t"+tra_date+" 08:00PM Rs. 13000");

                    System.out.println("\t\t\n* Select which flight you want to book: ");
                    int flight_choice=Integer.parseInt(buf.readLine());
                    if(flight_choice==1){
                        flight="BL-481 ";
                        time_and_charges="08:00AM Rs. 14000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==2){
                        flight="BL-482 ";
                        time_and_charges="02:00AM Rs. 15000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else if(flight_choice==3){
                        flight="BL-483 ";
                        time_and_charges="08:00PM Rs. 13000";

                        System.out.println("\n\t\t * Type of class:");
                        System.out.println("\t\t 1. Economy class.");
                        System.out.println("\t\t 2. Premium Economy class.");
                        System.out.println("\t\t 3. Business class.");
                        System.out.println("\t\t 4. First class.");

                        System.out.println("\t\t\n* Select which class do you want to book: ");
                        int class_choice=Integer.parseInt(buf.readLine());
                        switch(class_choice){
                            case 1:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 2:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 3:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            case 4:
                            {
                                System.out.println("Your class is: "+class_choice);
                                System.out.println("\t\t\t\n * Type of seat:");
                                System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                String seat_choice= buf.readLine();
                                System.out.println("\t\t\t your seat is: "+seat_choice);
                                break;
                            }

                            default: {
                                System.out.println("Invalid Input!!!");
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println("Invalid Input!!!");
                    }
                    break;
                }
                default: {
                    System.out.println("INVALID INPUT!!!!!");
                    break;
                }
            }
        }
        else if(service==2){
            System.out.println("Welcome to International Services");
            System.out.println("International Service is only available for future");
            System.out.println("Enter current date");
            curr_date=buf.readLine();
            System.out.println("Current Date is: "+curr_date);
            System.out.println("Enter your travelling date");
            tra_date=buf.readLine();
            System.out.println("Travelling Date is: "+tra_date);
            if(tra_date==curr_date){
                System.out.println("International Service is only available for future");
            }
            else{
                System.out.println("According to your mentioned travelling date, Flights for booking are: ");

                String flight_inter[]={"America","China","Russia","Sri Lanka","Africa"};
                for(int i=0;i<5;i++){
                    System.out.println("\t\t"+i+1+".flight to "+flight_inter[i]);
                }
                System.out.println();
                System.out.println("\t\tEnter the number of the country of which you want to book:");
                int country_choice=Integer.parseInt(buf.readLine());
                switch (country_choice){
                    case 01:
                    {
                        System.out.println("------------------------------------       WELCOME TO AMERICA AIRLINES       -------------------------------------");
                        System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                        System.out.println("\t\t* Following are the flights: ");

                        System.out.println("\t\t  1. AME-481 ");
                        System.out.println("\t\t\t"+tra_date+" 08:00AM Rs. 14000");

                        System.out.println("\t\t  2. AME-482 ");
                        System.out.println("\t\t\t"+tra_date+" 02:00AM Rs. 15000");

                        System.out.println("\t\t  3. AME-483 ");
                        System.out.println("\t\t\t"+tra_date+" 08:00PM Rs. 13000");

                        int flight_choice;

                        System.out.println("\t\t\n* Select which flight you want to book: ");
                        flight_choice=Integer.parseInt(buf.readLine());

                        if(flight_choice==1){
                            flight="AME-481 ";
                            time_and_charges="08:00AM Rs. 14000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==2){
                            flight="AME-482 ";
                            time_and_charges="02:00AM Rs. 15000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }
                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==3){
                            flight="AME-483 ";
                            time_and_charges="08:00AM Rs. 13000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("Invalid Input!!!");
                        }
                        break;
                    }
                    case 11 :
                    {
                        System.out.println("------------------------------------       WELCOME TO CHINA AIRLINES       -------------------------------------");
                        System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                        System.out.println("\t\t* Following are the flights,");

                        System.out.println("\t\t  1. CHI-381 ");
                        System.out.println("\t\t\t"+tra_date+" 08:00AM Rs. 9000");

                        System.out.println("\t\t  2. CHI-382 ");
                        System.out.println("\t\t\t"+tra_date+" 01:00AM Rs. 8000");

                        System.out.println("\t\t  3. CHI-383 ");
                        System.out.println("\t\t\t"+tra_date+" 07:00PM Rs. 10000");

                        System.out.println("\t\t\n* Select which flight you want to book: ");
                        int flight_choice=Integer.parseInt(buf.readLine());
                        if(flight_choice==1){
                            flight="CHI-381 ";
                            time_and_charges="08:00AM Rs. 9000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is:"+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==2){
                            flight="CHI-382 ";
                            time_and_charges="02:00AM Rs. 8000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==3){
                            flight="CHI-383 ";
                            time_and_charges="08:00AM Rs. 10000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("Invalid Input!!!");
                        }
                        break;
                    }
                    case 21 :
                    {
                        System.out.println("------------------------------------       WELCOME TO RUSSIA AIRLINES       -------------------------------------");
                        System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                        System.out.println("\t\t* Following are the flights,");

                        System.out.println("\t\t  1. RUS-581 ");
                        System.out.println("\t\t\t"+tra_date+" 06:00AM Rs. 24000");

                        System.out.println("\t\t  2. RUS-582 ");
                        System.out.println("\t\t\t"+tra_date+" 03:00AM Rs. 25000");

                        System.out.println("\t\t  3. RUS-583 ");
                        System.out.println("\t\t\t"+tra_date+" 09:00PM Rs. 23000");

                        System.out.println("\t\t\n* Select which flight you want to book: ");
                        int flight_choice=Integer.parseInt(buf.readLine());
                        if(flight_choice==1){
                            flight="RUS-581 ";
                            time_and_charges="06:00AM Rs. 24000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==2){
                            flight="RUS-582 ";
                            time_and_charges="03:00AM Rs. 25000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==3){
                            flight="RUS-583 ";
                            time_and_charges="09:00AM Rs. 23000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }
                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("Invalid Input!!!");
                        }
                        break;
                    }
                    case 31 :
                    {
                        System.out.println("------------------------------------       WELCOME TO SRI LANKA AIRLINES       -------------------------------------");
                        System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                        System.out.println("\t\t* Following are the flights,");

                        System.out.println("\t\t  1. SRI-781 ");
                        System.out.println("\t\t\t"+tra_date+" 08:00AM Rs. 19000");

                        System.out.println("\t\t  2. SRI-782 ");
                        System.out.println("\t\t\t"+tra_date+" 02:00AM Rs. 21000");

                        System.out.println("\t\t  3. SRI-783 ");
                        System.out.println("\t\t\t"+tra_date+" 08:00PM Rs. 20000");

                        System.out.println("\t\t\n* Select which flight you want to book: ");
                        int flight_choice=Integer.parseInt(buf.readLine());
                        if(flight_choice==1){
                            flight="SRI-781 ";
                            time_and_charges="08:00AM Rs. 19000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==2){
                            flight="SRI-782 ";
                            time_and_charges="02:00AM Rs. 21000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==3){
                            flight="SRI-783 ";
                            time_and_charges="08:00AM Rs. 20000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("Invalid Input!!!");
                        }
                        break;
                    }
                    case 41 :
                    {
                        System.out.println("------------------------------------       WELCOME TO AFRICA AIRLINES       -------------------------------------");
                        System.out.println("                               your comfort is our priority. Enjoy the journey! \n");
                        System.out.println("\t\t* Following are the flights,");

                        System.out.println("\t\t  1. AFR-481 ");
                        System.out.println("\t\t\t"+tra_date+" 08:00AM Rs. 14000");

                        System.out.println("\t\t  2. AFR-482 ");
                        System.out.println("\t\t\t"+tra_date+" 02:00AM Rs. 15000");

                        System.out.println("\t\t  3. AFR-483 ");
                        System.out.println("\t\t\t"+tra_date+" 08:00PM Rs. 13000");

                        System.out.println("\t\t\n* Select which flight you want to book: ");
                        int flight_choice=Integer.parseInt(buf.readLine());
                        if(flight_choice==1){
                            flight="AFR-481 ";
                            time_and_charges="08:00AM Rs. 14000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==2){
                            flight="AFR-482 ";
                            time_and_charges="02:00AM Rs. 15000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }
                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else if(flight_choice==3){
                            flight="AFR-483 ";
                            time_and_charges="08:00AM Rs. 13000";

                            System.out.println("\n\t\t * Type of class:");
                            System.out.println("\t\t 1. Economy class.");
                            System.out.println("\t\t 2. Premium Economy class.");
                            System.out.println("\t\t 3. Business class.");
                            System.out.println("\t\t 4. First class.");

                            System.out.println("\t\t\n* Select which class do you want to book: ");
                            int class_choice=Integer.parseInt(buf.readLine());
                            switch(class_choice){
                                case 1:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 2:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 3:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                case 4:
                                {
                                    System.out.println("Your class is: "+class_choice);
                                    System.out.println("\t\t\t\n * Type of seat:");
                                    System.out.println("\t\t\t Which seat do you want:window/middle/corner.");
                                    String seat_choice= buf.readLine();
                                    System.out.println("\t\t\t your seat is: "+seat_choice);
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input!!!");
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("Invalid Input!!!");
                        }
                        break;
                    }
                    default: {
                        System.out.println("INVALID INPUT!!!!!");
                        break;
                    }
                }


            }
        }
        else{
            System.out.println("INVALID INPUT!!!!!");
        }
        System.out.println("Do you have luggage(Yes/No): ");
        System.out.println("If YES then press 1:");
        int luggage=Integer.parseInt(buf.readLine());
        if(luggage==1){
            System.out.println("> Hand Baggage: One hand bag up to 7 kg is allowed per customer.\n" +
                    "\n" +
                    "> Check-in Baggage: 15kg per person (1 piece only). ");
        }

        System.out.println("Press any key to go back to main menu");
        String backMenu=buf.readLine();
        mainManu();
    }
    public static void choice()throws IOException{
        BufferedReader buf=new BufferedReader( new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        switch(choice){
            case 1:
            {

                fillCustomerDetails();

                break;
            }
            case 2:
            {
                flightReservation();
                break;
            }
            case 3:
            {
                ticketAndCharges();
                break;
            }
            case 4:
            {
                System.out.println("__       Thanks for visiting       __");
                System.out.println("__       have a nice journey       __");
                break;
            }
            default:{
                System.out.println("Invalid input, Please try again !");
                System.out.println();
                System.out.println("Press any key to go back to main menu");
                String backMenu=sc.next();
                mainManu();
                break;
            }

        }
    }
    public static void main(String args[])throws IOException {
        System.out.println();
        System.out.println("****************** CANVAS AIRLINES ******************");
        System.out.println();
        System.out.println("                                                  Welcome to our Airlines");
        System.out.println("                                               Your safety is our priority ^~^");
        System.out.println();
        System.out.println();
        mainManu();
        Airline_Reservation obj=new Airline_Reservation();
        obj.mainManu();
        obj.choice();
        obj.fillCustomerDetails();
        obj.flightReservation();
        obj.ticketAndCharges();

    }
}