// Generated by jextract

package foreign.c;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$18 {

    static final FunctionDescriptor fgetwc$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fgetwc$MH = RuntimeHelper.downcallHandle(
        "fgetwc",
        constants$18.fgetwc$FUNC
    );
    static final FunctionDescriptor fputwc$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fputwc$MH = RuntimeHelper.downcallHandle(
        "fputwc",
        constants$18.fputwc$FUNC
    );
    static final FunctionDescriptor ungetwc$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ungetwc$MH = RuntimeHelper.downcallHandle(
        "ungetwc",
        constants$18.ungetwc$FUNC
    );
    static final FunctionDescriptor swprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle swprintf$MH = RuntimeHelper.downcallHandleVariadic(
        "swprintf",
        constants$18.swprintf$FUNC
    );
    static final FunctionDescriptor vswprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vswprintf$MH = RuntimeHelper.downcallHandle(
        "vswprintf",
        constants$18.vswprintf$FUNC
    );
    static final FunctionDescriptor snwprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle snwprintf$MH = RuntimeHelper.downcallHandleVariadic(
        "snwprintf",
        constants$18.snwprintf$FUNC
    );
}


