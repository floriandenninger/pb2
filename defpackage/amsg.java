package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amsg implements Serializable {
    private static final long serialVersionUID = 0;
    final amrz a;

    public amsg(amrz amrzVar) {
        this.a = amrzVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}
