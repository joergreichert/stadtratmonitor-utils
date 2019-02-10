package de.oklab.leipzig.oparl.service.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Result<T> {
    private Pagination pagination;
    private List<T> data = new ArrayList<>();
    private Link links;
}