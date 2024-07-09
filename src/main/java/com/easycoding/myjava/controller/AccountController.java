package com.easycoding.myjava.controller;

import com.easycoding.myjava.common.json.JsonResult;
import com.easycoding.myjava.entity.account.AccountVo;
import com.easycoding.myjava.service.AccountService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/account")
@Tag(name = "Account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping(value = "/data")
    public List<AccountVo> getAccountsDetails(AccountVo accountVo, HttpServletRequest request) throws Exception{
        return accountService.getAccountsDetails(accountVo);
    }
    @PostMapping(value="/create")
    public JsonResult createNewAccount(@RequestBody AccountVo accountVo, HttpServletRequest request) throws Exception{
        return  accountService.createNewAccount(accountVo, request);
    }
    @DeleteMapping(value="/delete")
    public JsonResult deleteOldAccounts(@RequestBody AccountVo accountVo, HttpServletRequest request) throws Exception{
        return  accountService.deleteOldAccounts(accountVo, request);
    }
    @GetMapping(name="/detail")
    public AccountVo getSelectedAccountDetails(@RequestBody AccountVo accountVo, HttpServletRequest request) throws Exception{
        return  accountService.getSelectedAccountDetails(accountVo, request);
    }
    @PostMapping(value = "/update")
    public JsonResult updateAccountDetails(@RequestBody AccountVo accountVo, HttpServletRequest request) throws Exception{
        return  accountService.updateAccountDetails(accountVo, request);
    }

}
