package com.xuanluan.mc.sdk.search.helper.jpa.base;

import javax.persistence.criteria.Path;

public interface IColumn<T, C> extends IBase {
    C getColumn();

    <Y> Path<Y> getPath();
}
