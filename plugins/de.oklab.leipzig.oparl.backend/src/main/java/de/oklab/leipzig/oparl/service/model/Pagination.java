package de.oklab.leipzig.oparl.service.model;

public class Pagination {
    int elementsPerPage;

    public Pagination() {
        // TODO Auto-generated constructor stub
    }

    public int getElementsPerPage() {
        return elementsPerPage;
    }

    public void setElementsPerPage(int elementsPerPage) {
        this.elementsPerPage = elementsPerPage;
    }

    @Override
    public String toString() {
        return "Pagination [elementsPerPage=" + elementsPerPage + "]";
    }
}