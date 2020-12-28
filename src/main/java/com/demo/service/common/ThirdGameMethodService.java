package com.demo.service.common;

import com.demo.pojo.request.ThirdGameRequest;

public interface ThirdGameMethodService<R> {
    R action(ThirdGameRequest request);
}
