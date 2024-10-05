package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xjo {
    public static final xjo a = new xjo(null, null, null);
    public final CharSequence b;
    public final CharSequence c;
    public final avgg d;

    public xjo(CharSequence charSequence, CharSequence charSequence2, avgg avggVar) {
        this.b = charSequence;
        this.c = charSequence2;
        this.d = avggVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        xjo xjoVar = (xjo) obj;
        return amkq.b(this.b, xjoVar.b) && amkq.b(this.c, xjoVar.c) && amkq.b(this.d, xjoVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }
}
