package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avhh extends whu {
    private final aone a;

    private avhh() {
        super(null);
        avhk avhkVar = avhk.a;
        throw null;
    }

    public avhh(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    public final /* bridge */ /* synthetic */ aakt a(aakv aakvVar) {
        return c();
    }

    public final void b(avhm avhmVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        avhk avhkVar = (avhk) aoneVar.instance;
        avhk avhkVar2 = avhk.a;
        avhmVar.getClass();
        avhkVar.d = avhmVar;
        avhkVar.b |= 2;
    }

    public final avhj c() {
        return new avhj((avhk) this.a.build());
    }
}
