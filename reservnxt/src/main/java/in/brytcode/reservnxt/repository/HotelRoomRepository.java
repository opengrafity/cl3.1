package in.brytcode.reservnxt.repository;

import in.brytcode.reservnxt.entity.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRoomRepository extends JpaRepository<HotelRoom, Integer> {
}
