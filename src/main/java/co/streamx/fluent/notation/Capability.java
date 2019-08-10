package co.streamx.fluent.notation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Optional vendor capabilities. Contains a hint, so if the capability exists, the hint value will override the
 * existing. See {@linkplain Function#parameterContextCapabilities()}.
 */
@RequiredArgsConstructor
@Getter
public enum Capability {
    /**
     * Allow aliasing INSERTed table
     */
    ALIAS_INSERT(ParameterContext.FROM),

    /**
     * Allow aliasing UPDATEd table
     */
    ALIAS_UPDATE(ParameterContext.FROM),

    /**
     * Allow aliasing DELETEd table
     */
    ALIAS_DELETE(ParameterContext.FROM),

    /**
     * Use AS keyword when aliasing tables in FROM clause. See
     * <a href= "https://stackoverflow.com/questions/4940530/oracle-can-you-assign-an-alias-to-the-from-clause">oracle:
     * can you assign an alias to the from clause?</a>
     */
    TABLE_AS_ALIAS(null),

    ;

    private final Enum<?> hint;

}
