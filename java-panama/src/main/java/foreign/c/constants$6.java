// Generated by jextract

package foreign.c;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$6 {

    static final FunctionDescriptor __msvcrt_vprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __msvcrt_vprintf$MH = RuntimeHelper.downcallHandle(
        "__msvcrt_vprintf",
        constants$6.__msvcrt_vprintf$FUNC
    );
    static final FunctionDescriptor __msvcrt_vsprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __msvcrt_vsprintf$MH = RuntimeHelper.downcallHandle(
        "__msvcrt_vsprintf",
        constants$6.__msvcrt_vsprintf$FUNC
    );
    static final FunctionDescriptor _snprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _snprintf$MH = RuntimeHelper.downcallHandleVariadic(
        "_snprintf",
        constants$6._snprintf$FUNC
    );
    static final FunctionDescriptor _vsnprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _vsnprintf$MH = RuntimeHelper.downcallHandle(
        "_vsnprintf",
        constants$6._vsnprintf$FUNC
    );
    static final FunctionDescriptor _vscprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _vscprintf$MH = RuntimeHelper.downcallHandle(
        "_vscprintf",
        constants$6._vscprintf$FUNC
    );
    static final FunctionDescriptor snprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle snprintf$MH = RuntimeHelper.downcallHandleVariadic(
        "snprintf",
        constants$6.snprintf$FUNC
    );
}


