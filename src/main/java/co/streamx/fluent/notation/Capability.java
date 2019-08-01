package co.streamx.fluent.notation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Optional vendor capabilities. Contains a hint, so if the capability exists, the hint value will override the
 * existing. See {@link Function#parameterContextCapabilities()}.
 */
@RequiredArgsConstructor
@Getter
public enum Capability {
    ALIAS_INSERT(ParameterContext.FROM), ALIAS_UPDATE(ParameterContext.FROM), ALIAS_DELETE(ParameterContext.FROM),

    /**
     * Use AS keyword when aliasing tables in FROM clause. See {@link <a href=
     * "https://stackoverflow.com/questions/4940530/oracle-can-you-assign-an-alias-to-the-from-clause">oracle: can you
     * assign an alias to the from clause?</a>}
     */
    TABLE_AS_ALIAS(null),

    ;

    private final Enum<?> hint;

}
