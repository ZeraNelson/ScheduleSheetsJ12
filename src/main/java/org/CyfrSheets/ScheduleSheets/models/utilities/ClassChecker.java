package org.CyfrSheets.ScheduleSheets.models.utilities;

import static org.CyfrSheets.ScheduleSheets.models.utilities.ClassCase.*;

public class ClassChecker {

    public static ClassCase checkClass(Object o) {
        // Fetch plaintext class name
        String s = o.getClass().getSimpleName().toLowerCase();

        // Add cases when adding further classes to enum
        switch (s) {
            case "string":
                return STRING;
            case "boolean":
                return BOOLEAN;
            case "integer":
                return INTEGER;
            case "reguser":
                return REGUSER;
            case "tempuser":
                return TEMPUSER;

            default:
                return UNKNOWN;

        }

    }
}