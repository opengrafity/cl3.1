package in.brytcode.reservnxt.service;

import in.brytcode.reservnxt.model.Hotel;
import in.brytcode.reservnxt.repository.HotelRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class HotelService {
    @Autowired
    private HotelRepository hotelRepo;
    public Hotel saveHotel(Hotel hotel){
        in.brytcode.reservnxt.entity.Hotel hotelEntity = new in.brytcode.reservnxt.entity.Hotel();
        hotel.setUuid(UUID.randomUUID().toString());
        BeanUtils.copyProperties(hotel, hotelEntity);
        hotelRepo.save(hotelEntity);
        hotel.setId(hotelEntity.getId());
        return hotel;
    }

    public List<Hotel> getHotelsByRoomType(Integer roomTypeId){
        List<in.brytcode.reservnxt.entity.Hotel> hotels = hotelRepo.findHotelsByRoomTypeAndStatus(roomTypeId,"A");
        List<Hotel> hotelModels = new ArrayList<>();
        Hotel hotelModel = null;
        for(in.brytcode.reservnxt.entity.Hotel hotel : hotels){
            hotelModel = new Hotel();
            BeanUtils.copyProperties(hotel,hotelModel);
            hotelModels.add(hotelModel);
        }
        return hotelModels;
    }
}
