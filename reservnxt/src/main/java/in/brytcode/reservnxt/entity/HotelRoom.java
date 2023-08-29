package in.brytcode.reservnxt.entity;

import javax.persistence.*;

@Entity
public class HotelRoom {
    @Id
    @SequenceGenerator(name = "roomIdSeq",sequenceName = "ROOM_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "roomIdSeq")
    private int roomId;
    private String roomNo;
    @ManyToOne
    @JoinColumn(name = "roomTypeId")
    private RoomType roomType;
    private String status;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
