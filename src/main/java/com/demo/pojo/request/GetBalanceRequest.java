package com.demo.pojo.request;

import com.demo.constanins.ThirdGameFirm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBalanceRequest {
    private ThirdGameFirm gameFirm;

    private String account;

    private String password;
}
