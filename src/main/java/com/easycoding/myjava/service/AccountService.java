package com.easycoding.myjava.service;

import com.easycoding.myjava.common.json.JsonResult;
import com.easycoding.myjava.entity.account.AccountVo;
import com.easycoding.myjava.entity.board.BoardVo;
import com.easycoding.myjava.mapper.AccountMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    public AccountMapper accountMapper;
    public List<AccountVo> getAccountsDetails(AccountVo accountVo){
        List<AccountVo> accountList = accountMapper.getAccountsDetails(accountVo);
        return accountList;
    }
    public JsonResult createNewAccount(AccountVo accountVo, HttpServletRequest request) throws Exception{
        try{
            accountMapper.createNewAccount(accountVo);
            return new JsonResult(JsonResult.RESULT.SUCCESS, "Success");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return new JsonResult(JsonResult.RESULT.FAIL, e.getMessage());
        }
    }
    public JsonResult deleteOldAccounts(AccountVo accountVo, HttpServletRequest request) throws Exception{
        try{
            accountMapper.deleteOldAccounts(accountVo);
            return new JsonResult(JsonResult.RESULT.SUCCESS, "Successfully deleted.");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return new JsonResult(JsonResult.RESULT.FAIL, e.getMessage());
        }
    }
    public AccountVo getSelectedAccountDetails(AccountVo accountVo, HttpServletRequest request) throws Exception{
        accountMapper.getSelectedAccountsDetails(accountVo);
            AccountVo accountDetails = accountMapper.getSelectedAccountsDetails(accountVo);
            return accountDetails;
    }
    public JsonResult updateAccountDetails(AccountVo accountVo, HttpServletRequest request) throws Exception{
        try{
            accountMapper.updateAccountDetails(accountVo);
            return new JsonResult(JsonResult.RESULT.SUCCESS, "Successfully updated.");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return new JsonResult(JsonResult.RESULT.FAIL, e.getMessage());
        }
    }
}
