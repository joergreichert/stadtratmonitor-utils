package de.oklab.leipzig.oparl.service.model;

import java.util.ArrayList;
import java.util.List;

public class Result<T> {
    private Pagination pagination;
    private List<T> data = new ArrayList<>();
    private Link links;

    public Result() {
        // OrganizationODO Auto-generated constructor stub
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "Result [pagination=" + pagination + ", data=" + data + ", links=" + links + "]";
    }
}