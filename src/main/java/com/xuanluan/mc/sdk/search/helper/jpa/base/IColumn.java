package com.xuanluan.mc.sdk.search.helper.jpa.base;

import com.xuanluan.mc.sdk.helper.jpa.base.IBase;

import javax.persistence.criteria.Path;

public interface IColumn<T, C> extends IBase {
    C getColumn();

    <Y> Path<Y> getPath();
}
