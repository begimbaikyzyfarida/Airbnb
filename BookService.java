public class BookService implements BookingInterface {
    public Booking[] bookings;
    public BookService(Booking[] bookings) {
        this.bookings = bookings;
    }
    @Override
    public void unBookAnnouncement(boolean isBooked, Announcements announcement) {
        if (announcement.isBooked()) {
            announcement.setBooked(false);
            System.out.println("The announcement has been unbooked: " + announcement.getUser());
        } else {
            System.out.println("The announcement is already unbooked: " + announcement.getUser());
        }
    }
    public void bookAnnouncement(boolean isBooked, Announcements announcementToBook) {
        announcementToBook.setBooked(isBooked);
        System.out.println("Announcement titled '" + announcementToBook.getTitle() + "' is now booked: " + isBooked);
    }
}
