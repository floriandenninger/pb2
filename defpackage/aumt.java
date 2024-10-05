package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aumt extends whu {
    public final aone a;

    private aumt() {
        super(null);
        aumw aumwVar = aumw.a;
        throw null;
    }

    public aumt(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    public final /* bridge */ /* synthetic */ aakt a(aakv aakvVar) {
        return c();
    }

    public final void b() {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aumw aumwVar = (aumw) aoneVar.instance;
        aumw aumwVar2 = aumw.a;
        aumwVar.d = aonm.emptyProtobufList();
    }

    public final aumv c() {
        return new aumv((aumw) this.a.build());
    }
}
