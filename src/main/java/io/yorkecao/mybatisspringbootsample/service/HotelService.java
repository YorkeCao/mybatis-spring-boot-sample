package io.yorkecao.mybatisspringbootsample.service;

import io.yorkecao.mybatisspringbootsample.domain.Hotel;

public interface HotelService {

    Hotel getHotelByCityId(int cityId);
}
