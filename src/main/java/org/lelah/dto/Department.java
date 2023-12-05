package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Department {
    private String id;
    private int nextId;
    private String departmentName;

    public String toString() {
        this.id = id;
        this.nextId = nextId;
        this.departmentName = departmentName;
    }
}
