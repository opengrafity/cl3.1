package in.brytcode.reservnxt.service;

import in.brytcode.reservnxt.model.Hotel;
import in.brytcode.reservnxt.repository.HotelRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
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
}
