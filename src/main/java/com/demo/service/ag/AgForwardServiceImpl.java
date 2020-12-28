package com.demo.service.ag;

import com.demo.constanins.annotation.ThirdGameHandler;
import com.demo.pojo.request.ThirdGameRequest;
import com.demo.pojo.response.ForwardResponse;
import com.demo.service.common.ThirdGameMethodService;

import static com.demo.constanins.ActionType.FORWARD;
import static com.demo.constanins.ThirdGameFirm.AG;

@ThirdGameHandler(gameFirm = AG, actionType = FORWARD)
public class AgForwardServiceImpl implements ThirdGameMethodService<ForwardResponse> {
    @Override
    public ForwardResponse action(ThirdGameRequest request) {
        return null;
    }
}
