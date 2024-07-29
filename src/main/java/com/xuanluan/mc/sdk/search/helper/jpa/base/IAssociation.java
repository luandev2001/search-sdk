package com.xuanluan.mc.sdk.search.helper.jpa.base;

import javax.persistence.criteria.Join;
import java.util.Collection;

public interface IAssociation<T, X, C> extends IBase {

    Join<T, X> getJoin();

    Collection<C> getColumns();
}
