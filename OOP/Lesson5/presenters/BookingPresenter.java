import ru.geekbrains.lesson5.models.Table;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, Model tableModel){
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.updateTablesView(loadTables());
    }

    private void showChangeReservationTableResult(int changeReservationNo, String name){
        bookingView.updateChangeReservationTableResult(changeReservationNo, name);
    }

    private void showReservationTableResult(int reservationNo, String name){
        bookingView.updateReservationTableResult(reservationNo, name);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo, name);
        showReservationTableResult(reservationNo, name);
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int changeReservationNo = tableModel.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        showChangeReservationTableResult(changeReservationNo,name);
        
    }
}
