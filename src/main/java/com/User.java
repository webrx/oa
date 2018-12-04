package com;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Created by webrx on 2018-12-03.
 */
@Data @AllArgsConstructor @NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String address;
}
