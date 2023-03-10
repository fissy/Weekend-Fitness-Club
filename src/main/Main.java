package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create some sample lessons
        FitnessLesson spin1 = new FitnessLesson("Spin", 7.99, "Saturday");
        FitnessLesson spin2 = new FitnessLesson("Spin", 7.99, "Sunday");
        FitnessLesson yoga1 = new FitnessLesson("Yoga", 8.50, "Saturday");
        FitnessLesson yoga2 = new FitnessLesson("Yoga", 8.50, "Sunday");

        // Create some sample customers
        Customer customer1 = new Customer("Ayodeji Moshood", "amoshood@fczmedia.com");
        Customer customer2 = new Customer("Tahira Moshood", "tahira@gmail.com");
        Customer customer3 = new Customer("Omotara Landt", "omotara@gmail.com");
        Customer customer4 = new Customer("Oreoluwa Freeman", "oreoluwa@gmail.com");
        Customer customer5 = new Customer("Emilia Egba", "emilia@gmail.com");
        Customer customer6 = new Customer("Shayomi Dokun", "shayomi@gmail.com");
        Customer customer7 = new Customer("Emeruwa Dennis", "emeruwa@gmail.com");
        Customer customer8 = new Customer("Bisola Kawthar", "bisola@gmail.com");

        // Create some bookings
        Booking booking1 = new Booking(customer1, spin1);
        customer1.makeBooking(booking1);
        Booking booking2 = new Booking(customer1, yoga1);
        customer1.makeBooking(booking2);
        Booking booking3 = new Booking(customer2, spin2);
        customer2.makeBooking(booking3);
        Booking booking4 = new Booking(customer2, yoga2);
        customer2.makeBooking(booking4);
        Booking booking5 = new Booking(customer3, spin1);
        customer2.makeBooking(booking5);
        Booking booking6 = new Booking(customer3, yoga1);
        customer2.makeBooking(booking6);
        Booking booking7 = new Booking(customer4, spin2);
        customer2.makeBooking(booking7);
        Booking booking8 = new Booking(customer4, yoga2);
        customer2.makeBooking(booking8);
        Booking booking9 = new Booking(customer5, spin1);
        customer2.makeBooking(booking9);
        Booking booking10 = new Booking(customer5, yoga1);
        customer2.makeBooking(booking10);
        Booking booking11 = new Booking(customer6, spin2);
        customer2.makeBooking(booking11);
        Booking booking12 = new Booking(customer6, yoga2);
        customer2.makeBooking(booking12);
        Booking booking13 = new Booking(customer7, spin1);
        customer2.makeBooking(booking13);
        Booking booking14 = new Booking(customer7, yoga1);
        customer2.makeBooking(booking14);
        Booking booking15 = new Booking(customer8, spin2);
        customer2.makeBooking(booking15);
        Booking booking16 = new Booking(customer8, yoga2);
        customer2.makeBooking(booking16);

        // Cancel a booking
        customer1.cancelBooking(booking2);


        // Add lessons to a list
//        List<FitnessLesson> fitnessLesson = new ArrayList<>();
//        fitnessLesson.add(spin1);
//        fitnessLesson.add(spin2);
//        fitnessLesson.add(yoga1);
//        fitnessLesson.add(yoga2);
//        fitnessLesson.add(boxFit1);
//        fitnessLesson.add(boxFit2);
//        fitnessLesson.add(bodysculpt1);
//        fitnessLesson.add(bodysculpt2);
//
//

//
//        // Print the customer's bookings
        System.out.println(customer1.getName() + "'s bookings:");
        for (Booking booking : customer1.getBookings()) {
            System.out.println(booking.getFitnessLesson().getType() + " on " + booking.getFitnessLesson().getDay());
        }

        // Generate a report of customer numbers and average ratings per lesson
//        ReportGenerator reportGenerator = new ReportGenerator(lessons);
//        Map<String, List<Integer>> customerCounts = reportGenerator.getCustomerCounts();
//        Map<String, Double> averageRatings = reportGenerator.getAverageRatings();
//        System.out.println("Customer numbers per lesson:");
//        for (String lesson : customerCounts.keySet()) {
//            System.out.println(lesson + ": " + customerCounts.get(lesson));
//        }
//        System.out.println("Average ratings per lesson:");
//        for (String lesson : averageRatings.keySet()) {
//            System.out.println(lesson + ": " + averageRatings.get(lesson));
//        }

        // Generate a report of lesson types and total income
//        Map<String, Double> lessonIncome = reportGenerator.getLessonIncome();
//        System.out.println("Total income per lesson type:");
//        for (String lessonType : lessonIncome
//        Map<String, List<Lesson>> timetable = new HashMap<>();
//        timetable.put("Saturday", new ArrayList<>());
//        timetable.put("Sunday", new ArrayList<>());

        // Add lessons to the timetable
//        for (Lesson lesson : lessons) {
//            timetable.get(lesson.getDay()).add(lesson);
//        }

        // Print the timetable
//        System.out.println("Timetable:");
//        for (String day : timetable.keySet()) {
//            List<Lesson> lessonsOfDay = timetable.get(day);
//            System.out.println(day + ":");
//            for (Lesson lesson : lessonsOfDay) {
//                System.out.println("\t" + lesson.getType() + " at " + lesson.getTime());
//            }
//        }
    }
}