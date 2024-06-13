package com.easycoding.myjava.mapper;

import com.easycoding.myjava.entity.account.AccountVo;
import com.easycoding.myjava.entity.board.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AccountMapper {
    public List<AccountVo> getAccountsDetails(AccountVo accountVo);
    public void createNewAccount(AccountVo accountVo);
    public void deleteOldAccounts(AccountVo accountVo);
    public AccountVo getSelectedAccountsDetails(AccountVo accountVo);
    public void updateAccountDetails(AccountVo accountVo);
}
