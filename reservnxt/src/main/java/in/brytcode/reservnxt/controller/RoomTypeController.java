package in.brytcode.reservnxt.controller;

import in.brytcode.reservnxt.model.RoomType;
import in.brytcode.reservnxt.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roomtypes")
public class RoomTypeController {
    @Autowired
    private RoomTypeService roomTypeService;
    @PostMapping("/{roomTypeName}")
    public RoomType addRoomType(@PathVariable("roomTypeName")  String roomTypeName){
        return roomTypeService.addRoomType(roomTypeName);
    }
}
