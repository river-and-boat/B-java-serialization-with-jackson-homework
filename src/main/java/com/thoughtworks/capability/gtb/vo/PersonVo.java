package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonVo {

  private String id;
  private Integer age;
  private String name;

  private String hobby;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }
}
