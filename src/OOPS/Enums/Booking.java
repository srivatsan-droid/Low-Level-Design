package OOPS.Enums;

public class Booking {
    private BookingStatus status;

    public Booking() {
        status = BookingStatus.PENDING_PAYMENT;
    }
    public void onPaymentSuccess() {
        status = BookingStatus.CONFIRMED;
    }
    public void confirm() {
        if(status != BookingStatus.PENDING_PAYMENT) {
            throw new IllegalArgumentException("Cannot confirm a booking that is : " + status);
        }
        status = BookingStatus.CONFIRMED;
    }
    public void cancel() {
        if(status != BookingStatus.CANCELLED) {
            throw new IllegalArgumentException("Cannot cancel a booking : " + status);
        }
        status = BookingStatus.CANCELLED;
    }
    public void complete() {
        if(status != BookingStatus.COMPLETED) {
            throw new IllegalArgumentException("Cannot complete a booking that is : " + status);
        }
        status = BookingStatus.COMPLETED;
    }
    public BookingStatus getstatus (){
        return status;
    }
}
