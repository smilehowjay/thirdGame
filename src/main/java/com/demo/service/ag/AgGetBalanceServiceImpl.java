package com.demo.service.ag;

import com.demo.constanins.annotation.ThirdGameHandler;
import com.demo.pojo.request.ThirdGameRequest;
import com.demo.pojo.response.GetBalanceResponse;
import com.demo.service.common.ThirdGameMethodService;

import static com.demo.constanins.ActionType.GET_BALANCE;
import static com.demo.constanins.ThirdGameFirm.AG;

@ThirdGameHandler(gameFirm = AG, actionType = GET_BALANCE)
public class AgGetBalanceServiceImpl implements ThirdGameMethodService<GetBalanceResponse> {
    @Override
    public GetBalanceResponse action(ThirdGameRequest request) {
        return null;
    }
}
