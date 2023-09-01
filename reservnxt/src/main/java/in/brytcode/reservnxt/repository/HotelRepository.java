package in.brytcode.reservnxt.repository;

import in.brytcode.reservnxt.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {
    @Query("SELECT DISTINCT h FROM Hotel h JOIN FETCH h.hotelRooms r JOIN r.roomType rt WHERE rt.roomTypeId = :roomTypeId AND r.status = :status")
    List<Hotel> findHotelsByRoomTypeAndStatus(Integer roomTypeId, String status);
}
