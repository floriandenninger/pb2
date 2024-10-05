package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class orf implements org {
    private final aaea a;

    public orf(aaea aaeaVar) {
        this.a = aaeaVar;
    }

    private final aypn e() {
        return this.a.a.i(aypg.LATEST).A(oqj.o);
    }

    @Override // defpackage.org
    public final aypn a() {
        return e().A(oqj.q);
    }

    @Override // defpackage.org
    public final aypn b() {
        return e().A(oqj.r);
    }

    @Override // defpackage.org
    public final aypn c() {
        return e().A(oqj.p);
    }

    @Override // defpackage.org
    public final String d() {
        aswb aswbVar = this.a.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return (aswbVar.f & 1) != 0 ? aswbVar.al : "https://m.youtube.com/";
    }
}
