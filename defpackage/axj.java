package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axj {
    public final long a;
    public final boolean b = false;
    public final List c;

    public axj(long j, List list) {
        this.a = j;
        this.c = list == null ? Collections.emptyList() : list;
    }

    public final par a() {
        return (par) this.c.get(0);
    }
}
