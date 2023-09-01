package in.brytcode.reservnxt.service;

import in.brytcode.reservnxt.model.RoomType;
import in.brytcode.reservnxt.repository.RoomTypeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<RoomType> getAllRoomsTypes(){
        List<in.brytcode.reservnxt.entity.RoomType> allRoomTypes = roomTypeRepo.findAll();

        /*List<RoomType> roomTypeModels = allRoomTypes.stream().map(roomType->{
            RoomType roomTypeModel = new RoomType();
            BeanUtils.copyProperties(roomType,roomTypeModel);
            return roomTypeModel;
        }).collect(Collectors.toList());*/

        List<RoomType> roomTypeModels = new ArrayList<>();
        for(in.brytcode.reservnxt.entity.RoomType roomTypeEntity : allRoomTypes){
            RoomType roomTypeModel = new RoomType();
            BeanUtils.copyProperties(roomTypeEntity,roomTypeModel);
            roomTypeModels.add(roomTypeModel);
        }
        return roomTypeModels;
    }

}
