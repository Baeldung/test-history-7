// Generated by jextract

package foreign.c;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$7 {

    static final FunctionDescriptor vsnprintf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vsnprintf$MH = RuntimeHelper.downcallHandle(
        "vsnprintf",
        constants$7.vsnprintf$FUNC
    );
    static final FunctionDescriptor vscanf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vscanf$MH = RuntimeHelper.downcallHandle(
        "vscanf",
        constants$7.vscanf$FUNC
    );
    static final FunctionDescriptor vfscanf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vfscanf$MH = RuntimeHelper.downcallHandle(
        "vfscanf",
        constants$7.vfscanf$FUNC
    );
    static final FunctionDescriptor vsscanf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vsscanf$MH = RuntimeHelper.downcallHandle(
        "vsscanf",
        constants$7.vsscanf$FUNC
    );
    static final FunctionDescriptor getdelim$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getdelim$MH = RuntimeHelper.downcallHandle(
        "getdelim",
        constants$7.getdelim$FUNC
    );
    static final FunctionDescriptor getline$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getline$MH = RuntimeHelper.downcallHandle(
        "getline",
        constants$7.getline$FUNC
    );
}


