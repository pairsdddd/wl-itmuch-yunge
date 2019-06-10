package com.osyunge;


import lombok.Data;

import java.util.List;

@Data
public class EasyUIDateGridResult {
    private long total;
    private List<?> rows;

}
