package com.xuanluan.mc.sdk.search.helper.jpa.base;

import com.xuanluan.mc.sdk.helper.jpa.base.IBase;

import javax.persistence.criteria.Join;
import java.util.Collection;

public interface IAssociation<T, X, C> extends IBase {

    Join<T, X> getJoin();

    Collection<C> getColumns();
}
