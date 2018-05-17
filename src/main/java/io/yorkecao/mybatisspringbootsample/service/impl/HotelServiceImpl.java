package io.yorkecao.mybatisspringbootsample.service.impl;

import io.yorkecao.mybatisspringbootsample.domain.Hotel;
import io.yorkecao.mybatisspringbootsample.mapper.HotelMapper;
import io.yorkecao.mybatisspringbootsample.service.HotelService;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelMapper hotelMapper;

    public HotelServiceImpl(HotelMapper hotelMapper) {
        this.hotelMapper = hotelMapper;
    }

    @Override
    public Hotel getHotelByCityId(int cityId) {
        return this.hotelMapper.selectByCityId(cityId);
    }
}
