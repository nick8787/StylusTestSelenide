package handler;

public class DataHandler {
    public static String formatPhoneNumber(String phoneNumber) {
        return phoneNumber.replaceAll("[\\s\\-()]", "");
    }
}