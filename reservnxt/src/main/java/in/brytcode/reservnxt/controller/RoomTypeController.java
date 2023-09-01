package in.brytcode.reservnxt.controller;

import in.brytcode.reservnxt.model.RoomType;
import in.brytcode.reservnxt.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roomtypes")
public class RoomTypeController {
    @Autowired
    private RoomTypeService roomTypeService;
    @PostMapping("/{roomTypeName}")
    public RoomType addRoomType(@PathVariable("roomTypeName")  String roomTypeName){
        return roomTypeService.addRoomType(roomTypeName);
    }
    @GetMapping
    public List<RoomType> getRoomTypes(){
        return roomTypeService.getAllRoomsTypes();
    }
}
