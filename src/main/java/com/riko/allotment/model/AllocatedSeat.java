package com.riko.allotment.model;

import com.riko.allotment.model.enums.SeatType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocatedSeat {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long ticketId;

    @Column(nullable = false)
    private Long showId;

    @Column(nullable = false)
    private Long theatreId;

    @Column(nullable = false)
    private SeatType seatType;

    @Column(nullable = false)
    private String hallName;

    @Column(nullable = false)
    private Integer rowSeat;
}
