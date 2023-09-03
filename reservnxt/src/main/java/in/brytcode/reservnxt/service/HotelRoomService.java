package in.brytcode.reservnxt.service;

import in.brytcode.reservnxt.entity.Booking;
import in.brytcode.reservnxt.entity.Customer;
import in.brytcode.reservnxt.entity.Hotel;
import in.brytcode.reservnxt.entity.RoomType;
import in.brytcode.reservnxt.model.BookingDetails;
import in.brytcode.reservnxt.model.HotelRoom;
import in.brytcode.reservnxt.repository.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class HotelRoomService {
    @Autowired
    private HotelRoomRepository hotelRoomRepo;
    @Autowired
    private RoomTypeRepository roomTypeRepository;
    @Autowired
    private HotelRepository hotelRepo;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private BookingRepository bookingRepository;

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

    @Transactional(propagation = Propagation.REQUIRED)
    public BookingDetails bookRoom(int hotelId, int roomTypeId, BookingDetails bookingDetails) throws Exception {
        SimpleDateFormat ddmmyyyy = new SimpleDateFormat("ddMMyyyy");
        Hotel hotel = hotelRepo.findById(hotelId).orElse(null);
        Customer customer = customerRepository.findById(bookingDetails.getCustomerId()).orElse(null);
        Booking booking = new Booking();
        if(hotel == null){
            throw new Exception("Invalid Hotel");
        }
        if (customer == null) {
            throw new Exception("Invalid Customer");
        }

        List<in.brytcode.reservnxt.entity.HotelRoom> rooms = hotel.getHotelRooms();
        for(in.brytcode.reservnxt.entity.HotelRoom room:rooms){
            if(room.getRoomType().getRoomTypeId() == roomTypeId && "A".equals(room.getStatus())){
                room.setStatus("B");
                hotelRoomRepo.save(room);
                bookingDetails.setRoomNo(room.getRoomNo());
                bookingDetails.setHotelId(hotel.getId());
                bookingDetails.setHotelAddress(hotel.getAddress());
                bookingDetails.setCustomerName(customer.getName());
                bookingDetails.setRoomType(room.getRoomType().getRoomTypeName());
                bookingDetails.setRoomTypeId(roomTypeId);
                bookingDetails.setHotelName(hotel.getName());
                booking.setRoom(room);
            }
        }
        booking.setId(hotel);
        booking.setCustomer(customer);
        booking.setCheckinDate(ddmmyyyy.parse(bookingDetails.getStartDate()));
        booking.setCheckoutDate(ddmmyyyy.parse(bookingDetails.getEndDate()));
        booking.setBookingDate(new Date());

        bookingRepository.save(booking);
        return bookingDetails;
    }
}
