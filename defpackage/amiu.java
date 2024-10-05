package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amiu {
    public final amja a;
    public final amip b;
    public final amjl c;

    public amiu(amja amjaVar, Set set, amjl amjlVar) {
        this.a = amjaVar;
        this.b = amip.c(set);
        this.c = amjlVar;
    }

    public final amir a(String str) {
        return this.a.b(str, this.b, this.c);
    }

    public final amij b(String str, amip amipVar) {
        return this.a.b(str, amip.d(this.b, amipVar), this.c);
    }

    public final amij c(String str) {
        return b(str, amio.a);
    }
}
