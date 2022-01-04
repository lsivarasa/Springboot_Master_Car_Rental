package at.ac.fhsalzburg.swd.spring.dao;

import at.ac.fhsalzburg.swd.spring.dao.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
    public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    @Transactional(timeout = 10)
    Reservation findById(long id);
    }


