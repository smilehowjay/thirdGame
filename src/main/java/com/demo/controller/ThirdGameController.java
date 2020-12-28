package com.demo.controller;

import com.demo.pojo.request.ForwardRequest;
import com.demo.pojo.request.GetBalanceRequest;
import com.demo.pojo.request.QueryBetRecordRequest;
import com.demo.pojo.request.TransactionInRequest;
import com.demo.pojo.request.TransactionOutRequest;
import com.demo.pojo.response.ForwardResponse;
import com.demo.pojo.response.GetBalanceResponse;
import com.demo.pojo.response.QueryBetRecordResponse;
import com.demo.pojo.response.TransactionInResponse;
import com.demo.pojo.response.TransactionOutResponse;
import com.demo.service.common.ThirdGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/thirdGame")
@RestController
public class ThirdGameController {
    @Autowired
    private ThirdGameService thirdGameService;

    @PostMapping("/forward")
    public ForwardResponse forward(@RequestBody ForwardRequest request) {
        return thirdGameService.forward(request);
    }

    @PostMapping("/getBalance")
    public GetBalanceResponse getBalance(@RequestBody GetBalanceRequest request) {
        return thirdGameService.getBalance(request);
    }

    @PostMapping("/transactionIn")
    public TransactionInResponse transactionIn(@RequestBody TransactionInRequest request) {
        return thirdGameService.transactionIn(request);
    }

    @PostMapping("/transactionOut")
    public TransactionOutResponse transactionOut(@RequestBody TransactionOutRequest request) {
        return thirdGameService.transactionOut(request);
    }

    @PostMapping("/queryBetRecord")
    public QueryBetRecordResponse queryBetRecord(@RequestBody QueryBetRecordRequest request) {
        return thirdGameService.queryBetRecords(request);
    }

}
