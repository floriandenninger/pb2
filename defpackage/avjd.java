package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjd extends whu {
    private final aone a;

    private avjd() {
        super(null);
        avjg avjgVar = avjg.a;
        throw null;
    }

    public avjd(aone aoneVar) {
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
        avjg avjgVar = (avjg) aoneVar.instance;
        avjg avjgVar2 = avjg.a;
        avjgVar.b |= 2;
        avjgVar.d = booleanValue;
    }

    public final avjf c() {
        return new avjf((avjg) this.a.build());
    }
}
