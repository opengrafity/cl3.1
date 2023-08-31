package in.brytcode.reservnxt.service;

import in.brytcode.reservnxt.entity.PriceStrategy;
import in.brytcode.reservnxt.entity.StrategyKey;
import in.brytcode.reservnxt.repository.PriceStrategyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceStrategyService {
    @Autowired
    private PriceStrategyRepository priceStrategyRepository;
    public PriceStrategy savePriceStrategy(PriceStrategy strategy){
        priceStrategyRepository.save(strategy);
        return strategy;
    }
    public PriceStrategy fetchPriceStrategy(int hotelId, int roomTypeId){
        StrategyKey key = new StrategyKey();
        key.setHotelId(hotelId);
        key.setRoomTypeId(roomTypeId);
        return priceStrategyRepository.findById(key).orElse(null);
    }
}
