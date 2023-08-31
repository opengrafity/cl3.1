package in.brytcode.reservnxt.controller;

import in.brytcode.reservnxt.entity.PriceStrategy;
import in.brytcode.reservnxt.model.PriceStrategyModel;
import in.brytcode.reservnxt.service.PriceStrategyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pricestrategy")
public class PriceStategyController {
    @Autowired
    private PriceStrategyService priceStrategyService;
    @PostMapping("hotels/{id}")
    public PriceStrategy save(@PathVariable("id") int hotelId, @RequestBody PriceStrategyModel priceStrategyModel){
        PriceStrategy strategy = new PriceStrategy();
        BeanUtils.copyProperties(priceStrategyModel,strategy);
        strategy.setHotelId(hotelId);
        priceStrategyService.savePriceStrategy(strategy);
        return strategy;
    }
    @GetMapping("hotels/{id}/roomTypes/{roomTypeId}")
    public PriceStrategy get(@PathVariable("id") int hotelId, @PathVariable("roomTypeId") int roomTypeId){
        return priceStrategyService.fetchPriceStrategy(hotelId,roomTypeId);
    }
}
