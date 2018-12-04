package com;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by webrx on 2018-12-03.
 */
public class Hello {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
    }
}
