package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjy {
    public final boolean a;

    public zjy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zjy) {
            return amkq.b(Boolean.valueOf(this.a), Boolean.valueOf(((zjy) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.g("recoverableError", this.a);
        return Y.toString();
    }
}
