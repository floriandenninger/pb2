package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asyp extends whu {
    public final aone a;

    private asyp() {
        super(null);
        asyt asytVar = asyt.a;
        throw null;
    }

    public asyp(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    public final /* bridge */ /* synthetic */ aakt a(aakv aakvVar) {
        return c();
    }

    public final void b(asyu asyuVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        asyt asytVar = (asyt) aoneVar.instance;
        asyt asytVar2 = asyt.a;
        asytVar.i = asyuVar.d;
        asytVar.c |= 64;
    }

    public final asyr c() {
        return new asyr((asyt) this.a.build());
    }
}
