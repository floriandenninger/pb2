package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class thj implements tfp, thg {
    private final andp a;
    private final List b;
    private final tgc c;
    private final long d;
    private final boolean e = false;

    public thj(andp andpVar, List list, tgc tgcVar, long j, boolean z) {
        this.a = andpVar;
        this.b = list;
        this.c = tgcVar;
        this.d = j;
    }

    @Override // defpackage.thg
    public /* synthetic */ tgf a() {
        return sgf.M(this);
    }

    @Override // defpackage.thg
    public List b() {
        return this.b;
    }

    public long c() {
        return this.d;
    }

    public tgc d() {
        return this.c;
    }

    public /* synthetic */ tgf e() {
        return sgf.N(this);
    }

    public andp f() {
        return this.a;
    }

    public boolean g() {
        return this.e;
    }

    public String toString() {
        ammu Y = amkq.Y(this);
        ando andoVar = a().d;
        if (andoVar == null) {
            andoVar = ando.a;
        }
        Y.e("rootVeId", andoVar.d);
        ando andoVar2 = e().d;
        if (andoVar2 == null) {
            andoVar2 = ando.a;
        }
        Y.e("targetVeId", andoVar2.d);
        return Y.toString();
    }
}
