package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pao {
    public final long a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;

    public pao(long j, long j2, boolean z, long j3, long j4, String str, List list) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = j3;
        this.e = j4;
        this.f = str;
        this.g = list == null ? Collections.emptyList() : list;
    }

    public final int a() {
        return this.g.size();
    }

    public final par b(int i) {
        return (par) this.g.get(i);
    }
}
