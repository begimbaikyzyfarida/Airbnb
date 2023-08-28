import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        User user1=new User("Begimbai", "Maksutov", "begimbaimaksutov@gmail.com", LocalDate.of(2023, 2, 1));
        User user2=new User("Samara", "Tologon kyzy", "samaratologonkyzy@gmail.com", LocalDate.of(2023, 1, 2));
        User user3=new User("Farida", "Begimbai  kyzy", "faridabegimbaikyzy@gmail.com", LocalDate.of(2023, 3, 3));
        User user4=new User("Azamat", "Begimbai uulu", "azamatbegimbaiuulu@gmail.com", LocalDate.of(2023, 4, 4));
        User user5=new User("Bekzat", "Jusupmamatov", "bekzatjusupmamatov@gmail.com", LocalDate.of(2023, 5, 5));
        User user6=new User("Alihan", "Jusupmamatov", "alihanjusupmamatov@gmail.com", LocalDate.of(2023, 6, 6));
        User user7=new User("Adahan", "Jusupmamatov", "adahanjusupmamatov@gmail.com", LocalDate.of(2023, 7, 7));
        User user8=new User("Guldana", "Mamatova", "guldanamamatova@gmail.com", LocalDate.of(2023, 8, 8));
        User user9=new User("Nargiza", "Joldoshbaeva", "nargizajoldoshbaeva@gmail.com", LocalDate.of(2023, 9, 9));
        User user10=new User("Dilnaz", "Niazova", "dilnazniazova@gmail.com", LocalDate.of(2023, 10, 10));
        User [] users={user1, user2,user3,user4,user5,user6,user7,user8,user9,user10};


        Address address1=new Address("Argentina", "Andes","Argentina65");
        Address address2=new Address("China", "Hong Kong", "China23");
        Address address3=new Address("France", "Paris","France123");
        Address address4=new Address("Greece", "Macedonia", "Greece789");
        Address address5=new Address("Kazakhstan", "Almaty","Kazakhstan 456");
        Address address6=new Address("Kyrgyzstan", "Bishkek", "Kyrgyzstan234");
        Address address7=new Address("Maldives", "Male","Maldives765");
        Address address8=new Address("New Zealand", "Auckland", "New-Zealand987");
        Address address9=new Address("Russia", "Moscow","Russia398");
        Address address10=new Address("Thailand", "Southern Thailand", "Thailand7543");
        Address [] addresses={address1, address2,address3,address4,address5,address6,address7,address8,address9,address10};

        Announcements announcements1=new Announcements("Elegant Art Deco Home with Garden in Condesa", "Luxury", "House", user1, true, 5, 123, address1);
        Announcements announcements2=new Announcements("Unique and Secluded AirShip with Breathtaking Highland Views", "Insta-worthy", "Apartment", user2, false,  4, 800, address2);
        Announcements announcements3=new Announcements("Luxury City Center Loft on a Traffic-Free Street", "Eclectic", "House", user3, true, 5, 1043, address3);
        Announcements announcements4=new Announcements("Romantic Stone House with Ocean Views ", "Rare", "House", user4, false, 4, 1001, address4);
        Announcements announcements5=new Announcements("Forest-and-Heaven Themed Apartment close to the Heart of the CBD", "Green", "Apartment", user5, true,  1, 100, address5);
        Announcements announcements6=new Announcements("Extra toilet paper, linens, and towels.", "Glamorous", "House", user6, false, 2, 1020, address6);
        Announcements announcements7=new Announcements("Basic cooking supplies like salt, pepper, and oil.", "Renovated", "Apartment", user7, true,  4, 1000, address7);
        Announcements announcements8=new Announcements("Light breakfast or snacks.", "Secluded", "House", user8, false, -1, 100, address8);
        Announcements announcements9=new Announcements("Dining basics like a coffee maker, cooking utensils, dishes, and silverware.", "Peaceful", "Apartment", user9, true,  4, 320, address9);
        Announcements announcements10=new Announcements("Wine glasses.", "Contemporary", "Apartment", user10, false, 5, 170, address10);
        Announcements [] announcements={announcements1, announcements2,announcements3,announcements4,announcements5,announcements6,announcements7,announcements8,announcements9,announcements10};


        Booking booking=new Booking(user1, announcements1);
        Booking []booking1={booking};
        BookService bookService=new BookService(booking1);
        UserService userService=new UserService(announcements);
        AnnouncementService announcementService=new AnnouncementService(announcements);
        System.out.println("\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C");
        System.out.println("Welcome to the Farida's Service");
        System.out.println("\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C");
        System.out.println("Option 1: Retrieve all users");
        System.out.println("Option 2: Retrieve announcements by address");
        System.out.println("Option 3: Retrieve announcements by user ID");
        System.out.println("\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C");
        System.out.println("Welcome to the Announcement Service");
        System.out.println("Option 4: Retrieve announcement by ID");
        System.out.println("Option 5: Retrieve all announcements");
        System.out.println("Option 6: Delete announcement by ID");
        System.out.println("Option 7: Update announcement by ID");
        System.out.println("Option 8: Sort announcements by price");
        System.out.println("Option 9: Sort announcements by rating");
        System.out.println("Option 10: Filter announcements by type");
        System.out.println("Option 11: Check if an announcement is booked");
        System.out.println("\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C");
        System.out.println("Welcome to the Booking Service");
        System.out.println("Option 12: Book an apartment");
        System.out.println("Option 13: Unbook an apartment");
        System.out.println("\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C\uD83D\uDC8C");


        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter a menu option: ");
            int num=scanner.nextInt();
            switch (num){
                case 1:
                    try {
                        userService.getAllUser();
                    } catch (Exception e) {
                        System.out.println("An error occurred: " + e.getMessage()); //this method will throw exception if rating of announcements is less than 0;;
                    }

                    break;
                case 2:
                    userService.getAnnouncementsByAddress(address1);
                    break;
                case 3:
                    userService.getAnnouncementsByUserId(9);
                    break;
                case 4:
                    announcementService.getAnnouncementById(6);
                    break;
                case 5:
                    announcementService.getAllAnnouncements();
                    break;
                case 6:
                    System.out.println(announcementService.deleteAnnouncement(3));
                    break;
                case 7:
                    announcementService.updateAnnouncementById(5, "hellooooooo");
                    break;
                case 8:
                    System.out.println(Arrays.toString(announcementService.sortByPrice()));
                    break;
                case 9:
                    System.out.println(Arrays.toString(announcementService.sortAnnouncementsByRating()));
                    break;
                case 10:
                    Scanner scanner1=new Scanner(System.in);
                    System.out.println("Put type of announcement: "+"House");
                    String name=scanner1.next();
                    announcementService.filterByType("House");
                    System.out.println("Put type of announcement: "+"Apartment");
                    String name2=scanner1.next();
                    announcementService.filterByType("Apartment");
                    break;
                case 11:
                    announcementService.isBooked();
                    break;
                case 12:
                    bookService.bookAnnouncement(true, announcements1);
                    bookService.bookAnnouncement(true, announcements3);
                    bookService.bookAnnouncement(true, announcements5);
                    bookService.bookAnnouncement(true, announcements7);
                    bookService.bookAnnouncement(true, announcements9);
                    break;
                case 13:
                    bookService.unBookAnnouncement(false,announcements2);
                    bookService.unBookAnnouncement(false,announcements4);
                    bookService.unBookAnnouncement(false,announcements6);
                    bookService.unBookAnnouncement(false,announcements8);
                    bookService.unBookAnnouncement(false,announcements10);
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid menu option.");
                    break;
            }
        }
    }
}
