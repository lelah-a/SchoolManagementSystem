package org.lelah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Department {
    private static int nextId = 1;

    private String departmentId;
    private String departmentName;

    /**
     *
     * @param departmentName
     */
    public Department(String departmentName) {
        this.departmentId = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }


}
