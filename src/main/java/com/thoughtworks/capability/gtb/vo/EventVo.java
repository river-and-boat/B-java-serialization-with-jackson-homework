package com.thoughtworks.capability.gtb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.serializer.DataDeserializer;
import com.thoughtworks.capability.gtb.serializer.DataSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;
  private String name;
  private EventType type;
  @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
  @JsonSerialize(using = DataSerializer.class)
  @JsonDeserialize(using = DataDeserializer.class)
  private Date time;
  @JsonUnwrapped
  private UserVo user;
}
