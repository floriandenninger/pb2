package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxp extends whu {
    private final aone a;

    private aoxp() {
        super(null);
        aoxr aoxrVar = aoxr.a;
        throw null;
    }

    public aoxp(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    public final /* bridge */ /* synthetic */ aakt a(aakv aakvVar) {
        return c();
    }

    public final void b(Boolean bool) {
        aone aoneVar = this.a;
        boolean booleanValue = bool.booleanValue();
        aoneVar.copyOnWrite();
        aoxr aoxrVar = (aoxr) aoneVar.instance;
        aoxr aoxrVar2 = aoxr.a;
        aoxrVar.b |= 2;
        aoxrVar.d = booleanValue;
    }

    public final aoxq c() {
        return new aoxq((aoxr) this.a.build());
    }
}
