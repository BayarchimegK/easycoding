package com.easycoding.myjava.controller;

import com.easycoding.myjava.common.json.JsonResult;
import com.easycoding.myjava.entity.account.AccountVo;
import com.easycoding.myjava.service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping(value="/account/data")
    public List<AccountVo> getAccountsDetails(AccountVo accountVo, HttpServletRequest request) throws Exception{
        List<AccountVo> accountList = accountService.getAccountsDetails(accountVo);

        return accountList;
    }
    @RequestMapping(value="/account/create")
    public JsonResult createNewAccount(@RequestBody AccountVo accountVo, HttpServletRequest request) throws Exception{
        return  accountService.createNewAccount(accountVo, request);
    }
    @RequestMapping(value="/account/delete")
    public JsonResult deleteOldAccounts(@RequestBody AccountVo accountVo, HttpServletRequest request) throws Exception{
        return  accountService.deleteOldAccounts(accountVo, request);
    }
    @RequestMapping(value="/account/detail")
    public AccountVo getSelectedAccountDetails(@RequestBody AccountVo accountVo, HttpServletRequest request) throws Exception{
        return  accountService.getSelectedAccountDetails(accountVo, request);
    }
    @RequestMapping(value="/account/update")
    public JsonResult updateAccountDetails(@RequestBody AccountVo accountVo, HttpServletRequest request) throws Exception{
        return  accountService.updateAccountDetails(accountVo, request);
    }

}
