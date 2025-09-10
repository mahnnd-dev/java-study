package dev.m.obj;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
// class tich hop lib lombok
@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Sudent {
     String name;
     String code;
     String point;
}
