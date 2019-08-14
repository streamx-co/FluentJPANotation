package co.streamx.fluent.notation;

public enum CommonTableExpressionType {
    DECLARATION,

    /**
     * "Pass through" the CTE for later declaration
     */
    DECORATOR,

    /**
     * Reference the CTE which will be declared later
     */
    REFERENCE,

    /**
     * Indicates that the annotated function marks the table to recurse on (i.e. should be the current sub-query return
     * type).
     */
    SELF
}
