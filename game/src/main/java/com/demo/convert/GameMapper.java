package com.demo.convert;

import com.demo.dto.GameDto;
import com.demo.entity.Game;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GameMapper {

    GameMapper INSTANCE = Mappers.getMapper( GameMapper.class );

    @Mapping(source = "nameDto", target = "name")
    Game dtoToGame(GameDto dto);
}
