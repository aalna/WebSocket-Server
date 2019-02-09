package com.asem.example.webscoket;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OutputMessage {

    private String name;
    private String text;

}
