package com.xuanluan.mc.sdk.search.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Map;

public interface EntityColumns<T> {
    Collection<T> getColumns();

    Map<String, Collection<T>> getAssociatedColumns();

    @Getter
    @Setter
    class BaseColumn {
        private String name;
    }
}
