package com.demo.service.ag;

import com.demo.constanins.annotation.ThirdGameHandler;
import com.demo.pojo.request.ThirdGameRequest;
import com.demo.pojo.response.ForwardResponse;
import com.demo.pojo.response.QueryBetRecordResponse;
import com.demo.service.common.ThirdGameMethodService;

import static com.demo.constanins.ActionType.FORWARD;
import static com.demo.constanins.ActionType.QUERY_BET_RECORD;
import static com.demo.constanins.ThirdGameFirm.AG;

@ThirdGameHandler(gameFirm = AG, actionType = QUERY_BET_RECORD)
public class AgQueryBetRecordServiceImpl implements ThirdGameMethodService<QueryBetRecordResponse> {
    @Override
    public QueryBetRecordResponse action(ThirdGameRequest request) {
        return null;
    }
}
