package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aswt extends whu {
    private final aone a;

    private aswt() {
        super(null);
        asww aswwVar = asww.a;
        throw null;
    }

    public aswt(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    public final /* bridge */ /* synthetic */ aakt a(aakv aakvVar) {
        return new aswv((asww) this.a.build());
    }

    public final void b(asws aswsVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        asww aswwVar = (asww) aoneVar.instance;
        asww aswwVar2 = asww.a;
        aswwVar.e = aswsVar.c;
        aswwVar.c |= 2;
    }
}
