package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afsg {
    public final String a;
    public final boolean b;
    protected final Pair c;

    public afsg(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = new Pair(str, Boolean.valueOf(z));
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass() && ((afsg) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
