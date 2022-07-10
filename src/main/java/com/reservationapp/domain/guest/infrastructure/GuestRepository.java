package com.reservationapp.domain.guest.infrastructure;

import com.reservationapp.domain.guest.core.model.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GuestRepository extends CrudRepository<Guest, UUID> {
}
