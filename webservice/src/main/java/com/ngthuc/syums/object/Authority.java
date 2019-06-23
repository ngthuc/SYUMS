package com.ngthuc.syums.object;

import com.ngthuc.syums.entity.Account;
import com.ngthuc.syums.entity.Position;
import com.ngthuc.syums.entity.Scope;

import java.util.Set;

public class Authority {

    private Account account;

    private Set<Scope> listScope;

    public Authority() {}

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set<Scope> getListScope() {
        return listScope;
    }

    public void setListScope(Set<Scope> listScope) {
        this.listScope = listScope;
    }

    public Authority fromPosition(Position position) {
        Authority authority = new Authority();
        authority.setListScope(position.getListScope());
        return authority;
    }
}
