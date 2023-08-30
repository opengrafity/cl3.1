package in.brytcode.reservnxt.service;

import in.brytcode.reservnxt.model.RoomType;
import in.brytcode.reservnxt.repository.RoomTypeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeService {
    @Autowired
    private RoomTypeRepository roomTypeRepo;
    public RoomType addRoomType(String roomTypeName){
        in.brytcode.reservnxt.entity.RoomType roomType = new in.brytcode.reservnxt.entity.RoomType();
        roomType.setRoomTypeName(roomTypeName);
        roomTypeRepo.save(roomType);
        RoomType roomTypeModel = new RoomType();
        BeanUtils.copyProperties(roomType, roomTypeModel);
        return roomTypeModel;
    }

}
