import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int reservationNo,String name);

    void updateChangeReservationTableResult(int changeReservationNo,String name);
}
