package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asnk extends whu {
    private final aone a;

    private asnk() {
        super(null);
        asnn asnnVar = asnn.a;
        throw null;
    }

    public asnk(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    public final /* bridge */ /* synthetic */ aakt a(aakv aakvVar) {
        return new asnm((asnn) this.a.build());
    }

    public final void b(asno asnoVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        asnn asnnVar = (asnn) aoneVar.instance;
        asnn asnnVar2 = asnn.a;
        asnnVar.d = asnoVar.e;
        asnnVar.b |= 2;
    }
}
