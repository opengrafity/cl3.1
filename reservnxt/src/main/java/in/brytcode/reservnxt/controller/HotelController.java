package in.brytcode.reservnxt.controller;


import in.brytcode.reservnxt.model.BookingDetails;
import in.brytcode.reservnxt.model.Hotel;
import in.brytcode.reservnxt.model.HotelRoom;
import in.brytcode.reservnxt.repository.HotelRoomRepository;
import in.brytcode.reservnxt.service.HotelRoomService;
import in.brytcode.reservnxt.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/roomtype/{roomTypeId}")
    public List<Hotel> getHotels(@PathVariable("roomTypeId") Integer roomTypeId){
        return hotelService.getHotelsByRoomType(roomTypeId);
    }
    @PostMapping("/{hotelId}/roomtype/{roomTypeId}")
    public ResponseEntity bookRoom(@PathVariable("hotelId") int hotelId, @PathVariable("roomTypeId") int roomTypeId, @RequestBody BookingDetails bookingDetails) {
        ResponseEntity<BookingDetails> bookingResponse = null;
        try{
            bookingDetails = hotelRoomService.bookRoom(hotelId, roomTypeId, bookingDetails);
            bookingResponse = new ResponseEntity<>(bookingDetails, HttpStatus.OK);
        }catch(Exception ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return bookingResponse;
    }

}
