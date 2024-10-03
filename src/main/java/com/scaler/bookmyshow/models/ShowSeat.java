package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}


/*
    1             1
ShowSeat ------- Show => M:1
    M             1

S1A1
S1A2
S1A3
S2A1
S3A1
S4A1

   1              1
ShowSeat ------- Seat => M:1
   M              1


class X {

}

class Y {

}

class XY {
   X
   Y
}

XY ----- X => M:1
XY ----- Y => M:1

 */