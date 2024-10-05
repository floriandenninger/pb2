package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcl {
    private final ammv a = amlr.a;
    private final ammv b;

    public tcl(int i) {
        this.b = ammv.j(Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tcl) {
            tcl tclVar = (tcl) obj;
            if (this.a.equals(tclVar.a) && this.b.equals(tclVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return ((Integer) ((amna) this.b).a).toString();
    }
}
