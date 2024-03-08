package com.riko.allotment.repo;

import com.riko.allotment.model.AllocatedSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AllocatedSeatRepository extends JpaRepository<AllocatedSeat, Long> {
    List<AllocatedSeat> findByTicketId(Long ticketId);
}
