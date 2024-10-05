package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgf {
    public final Object a;
    public final Throwable b;

    public cgf(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public cgf(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgf)) {
            return false;
        }
        cgf cgfVar = (cgf) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(cgfVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || cgfVar.b == null) {
            return false;
        }
        return th.toString().equals(this.b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
