package in.brytcode.reservnxt.controller;


import in.brytcode.reservnxt.model.Hotel;
import in.brytcode.reservnxt.model.HotelRoom;
import in.brytcode.reservnxt.repository.HotelRoomRepository;
import in.brytcode.reservnxt.service.HotelRoomService;
import in.brytcode.reservnxt.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @Autowired
    private HotelRoomService hotelRoomService;
    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel){
        return hotelService.saveHotel(hotel);
    }
    @PostMapping("/{hotelId}/rooms")
    public HotelRoom addHotelRoom(@RequestBody HotelRoom hotelRoom, @PathVariable("hotelId") int hotelId){
        return hotelRoomService.addHotelRoom(hotelRoom, hotelId);
    }
}
