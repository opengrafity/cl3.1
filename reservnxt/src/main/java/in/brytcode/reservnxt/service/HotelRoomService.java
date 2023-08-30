package in.brytcode.reservnxt.service;

import in.brytcode.reservnxt.entity.Hotel;
import in.brytcode.reservnxt.entity.RoomType;
import in.brytcode.reservnxt.model.HotelRoom;
import in.brytcode.reservnxt.repository.HotelRepository;
import in.brytcode.reservnxt.repository.HotelRoomRepository;
import in.brytcode.reservnxt.repository.RoomTypeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelRoomService {
    @Autowired
    private HotelRoomRepository hotelRoomRepo;
    @Autowired
    private RoomTypeRepository roomTypeRepository;
    @Autowired
    private HotelRepository hotelRepo;
    public HotelRoom addHotelRoom(HotelRoom hotelRoom, int hotelId){
        in.brytcode.reservnxt.entity.HotelRoom hotelRoomEntity = new in.brytcode.reservnxt.entity.HotelRoom();
        RoomType roomType = roomTypeRepository.findById(hotelRoom.getRoomTypeId()).orElse(new RoomType());
        BeanUtils.copyProperties(hotelRoom,hotelRoomEntity);
        hotelRoomEntity.setRoomType(roomType);
        hotelRoomRepo.save(hotelRoomEntity);

        Hotel hotel = hotelRepo.findById(hotelId).orElse(new Hotel());
        hotel.getHotelRooms().add(hotelRoomEntity);
        hotelRepo.save(hotel);

        hotelRoom.setRoomId(hotelRoomEntity.getRoomId());
        return hotelRoom;
    }

}
