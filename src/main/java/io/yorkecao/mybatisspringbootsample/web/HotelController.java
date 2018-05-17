package io.yorkecao.mybatisspringbootsample.web;

import io.yorkecao.mybatisspringbootsample.domain.Hotel;
import io.yorkecao.mybatisspringbootsample.service.HotelService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("")
    @ResponseBody
    public Hotel getHotelByCityId(@RequestParam int cityId) {
        return hotelService.getHotelByCityId(cityId);
    }
}
