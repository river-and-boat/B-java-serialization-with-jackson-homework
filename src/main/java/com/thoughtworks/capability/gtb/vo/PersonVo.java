package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.serializer.AgeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonSerialize(using = PersonSerializer.class)
public class PersonVo {

  private String id;

  @JsonSerialize(nullsUsing = AgeSerializer.class)
  private Integer age;

  private String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String hobby;
}
