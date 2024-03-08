package com.riko.allotment.controller;

import com.riko.allotment.model.AllocatedSeat;
import com.riko.allotment.repo.AllocatedSeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seat")
@RequiredArgsConstructor
public class AllocatedSeatController {

    private final AllocatedSeatRepository allocatedSeatRepository;

    @GetMapping("/fetch")
    public ResponseEntity<List<AllocatedSeat>> fetchAllocatedSeats(@RequestParam List<Long> deallocateIds) {
        return ResponseEntity.ok(allocatedSeatRepository.findAllById(deallocateIds));
    }

    @PostMapping("/allocate")
    public ResponseEntity<List<AllocatedSeat>> allocateSeats(@RequestBody List<AllocatedSeat> allocatedSeats) {
        return ResponseEntity.ok(allocatedSeatRepository.saveAll(allocatedSeats));
    }

    @DeleteMapping("/deallocate")
    public void deallocateSeats(@RequestParam Long ticketId) {
        List<AllocatedSeat> allocatedSeats = allocatedSeatRepository.findByTicketId(ticketId);
        allocatedSeatRepository.deleteAll(allocatedSeats);
    }
}
