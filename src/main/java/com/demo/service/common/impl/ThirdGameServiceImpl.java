package com.demo.service.common.impl;

import com.demo.component.ThirdGameFactory;
import com.demo.constanins.ActionType;
import com.demo.constanins.ThirdGameFirm;
import com.demo.pojo.request.ForwardRequest;
import com.demo.pojo.request.GetBalanceRequest;
import com.demo.pojo.request.QueryBetRecordRequest;
import com.demo.pojo.request.ThirdGameRequest;
import com.demo.pojo.request.TransactionInRequest;
import com.demo.pojo.request.TransactionOutRequest;
import com.demo.pojo.response.ForwardResponse;
import com.demo.pojo.response.GetBalanceResponse;
import com.demo.pojo.response.QueryBetRecordResponse;
import com.demo.pojo.response.TransactionInResponse;
import com.demo.pojo.response.TransactionOutResponse;
import com.demo.service.common.ThirdGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThirdGameServiceImpl implements ThirdGameService {
    @Autowired
    private ThirdGameFactory thirdGameFactory;

    @Override
    public ForwardResponse forward(ForwardRequest request) {
        ThirdGameRequest thirdGameRequest = new ThirdGameRequest();
        return (ForwardResponse) thirdGameFactory.getActionMap(ActionType.FORWARD, request.getGameFirm()).action(thirdGameRequest);
    }

    @Override
    public GetBalanceResponse getBalance(GetBalanceRequest request) {
        ThirdGameRequest thirdGameRequest = new ThirdGameRequest();
        return (GetBalanceResponse) thirdGameFactory.getActionMap(ActionType.GET_BALANCE, request.getGameFirm()).action(thirdGameRequest);
    }

    @Override
    public TransactionInResponse transactionIn(TransactionInRequest request) {
        ThirdGameRequest thirdGameRequest = new ThirdGameRequest();
        return (TransactionInResponse) thirdGameFactory.getActionMap(ActionType.TRANSACTION_IN, request.getGameFirm()).action(thirdGameRequest);
    }

    @Override
    public TransactionOutResponse transactionOut(TransactionOutRequest request) {
        ThirdGameRequest thirdGameRequest = new ThirdGameRequest();
        return (TransactionOutResponse) thirdGameFactory.getActionMap(ActionType.TRANSACTION_OUT, request.getGameFirm()).action(thirdGameRequest);
    }

    @Override
    public QueryBetRecordResponse queryBetRecords(QueryBetRecordRequest request) {
        ThirdGameRequest thirdGameRequest = new ThirdGameRequest();
        return (QueryBetRecordResponse) thirdGameFactory.getActionMap(ActionType.QUERY_BET_RECORD, request.getGameFirm()).action(thirdGameRequest);
    }
}
