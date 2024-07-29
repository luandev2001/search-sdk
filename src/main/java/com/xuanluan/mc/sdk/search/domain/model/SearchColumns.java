package com.xuanluan.mc.sdk.search.domain.model;

public interface SearchColumns extends EntityColumns<SearchColumns.Column> {
    String getKeyword();

    class Column extends BaseColumn {
    }
}
