// Generated by jextract

package foreign.c;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$4 {

    static final FunctionDescriptor __mingw_vsnprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __mingw_vsnprintf$MH = RuntimeHelper.downcallHandle(
        "__mingw_vsnprintf",
        constants$4.__mingw_vsnprintf$FUNC
    );
    static final FunctionDescriptor _mingw_output_format_control$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _mingw_output_format_control$MH = RuntimeHelper.downcallHandle(
        "_mingw_output_format_control",
        constants$4._mingw_output_format_control$FUNC
    );
    static final FunctionDescriptor fprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fprintf$MH = RuntimeHelper.downcallHandleVariadic(
        "fprintf",
        constants$4.fprintf$FUNC
    );
    static final FunctionDescriptor printf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle printf$MH = RuntimeHelper.downcallHandleVariadic(
        "printf",
        constants$4.printf$FUNC
    );
    static final FunctionDescriptor sprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sprintf$MH = RuntimeHelper.downcallHandleVariadic(
        "sprintf",
        constants$4.sprintf$FUNC
    );
    static final FunctionDescriptor vfprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vfprintf$MH = RuntimeHelper.downcallHandle(
        "vfprintf",
        constants$4.vfprintf$FUNC
    );
}


