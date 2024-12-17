package labshopmonolith.domain;

import java.time.LocalDate;
import java.util.*;
import labshopmonolith.domain.*;
import labshopmonolith.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productid;
    private Integer qty;
    private String customerid;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
