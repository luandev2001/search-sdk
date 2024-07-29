package com.xuanluan.mc.sdk.search.helper.jpa.search;

import com.xuanluan.mc.sdk.search.domain.model.SearchColumns;

import javax.persistence.criteria.Predicate;

public interface ISearch {
    Predicate search(SearchColumns columns);
}
