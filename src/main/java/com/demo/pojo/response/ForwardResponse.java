package com.demo.pojo.response;

import lombok.Data;

@Data
public class ForwardResponse implements ThirdGameResponse{
    @Override
    public String getResponseHeader() {
        return null;
    }

    @Override
    public String getResponseBody() {
        return null;
    }
}
