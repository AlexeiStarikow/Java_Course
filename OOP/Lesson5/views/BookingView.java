import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void updateTablesView(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    @Override
    public void updateReservationTableResult(int reservationNo, String name) {
        System.out.printf("%s, столик успешно забронирован. Номер вашей брони: #%d\n",name, reservationNo);
    }

    @Override
    public void updateChangeReservationTableResult(int changeReservationNo, String name) {
        System.out.printf("%s, бронь успешно изменена.Новый номер вашей брони: #%d\n",name, changeReservationNo);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиета
     */
    public void reservationTableEvent(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /** TODO: Доработать метод changeReservationTable в рамках домашнего задания
     * Действие клиента (пользователь нажал на кнопку изменения бронирования), изменение бронирование столика
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     */
    public void changeReservationTableEvent(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

    

}
