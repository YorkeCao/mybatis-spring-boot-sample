package io.yorkecao.mybatisspringbootsample.mapper;

import io.yorkecao.mybatisspringbootsample.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HotelMapper {

    Hotel selectByCityId(@Param("city") int cityId);
}
