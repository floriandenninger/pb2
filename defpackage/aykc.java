package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aykc {
    final /* synthetic */ aykx a;

    public aykc(aykx aykxVar) {
        this.a = aykxVar;
    }

    public final aygg a(aybn aybnVar) {
        aybr aybrVar = this.a.t;
        if (this.a.A.get()) {
            return this.a.y;
        }
        if (aybrVar == null) {
            this.a.o.execute(new aykb(this));
            return this.a.y;
        }
        aygg b = ayiu.b(aybrVar.a(), aybnVar.a.f());
        return b != null ? b : this.a.y;
    }
}
