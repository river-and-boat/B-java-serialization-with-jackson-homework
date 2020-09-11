package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.serializer.PersonSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(using = PersonSerializer.class)
public class PersonVo {
  private String id;
  private Integer age;
  private String name;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String hobby;
}
