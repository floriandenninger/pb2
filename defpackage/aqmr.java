package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmr extends whu {
    private final aone a;

    private aqmr() {
        super(null);
        aqmu aqmuVar = aqmu.a;
        throw null;
    }

    public aqmr(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    @Override // defpackage.whu
    public final /* bridge */ /* synthetic */ aakt a(aakv aakvVar) {
        return aj();
    }

    public final void ah(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqmu aqmuVar = (aqmu) aoneVar.instance;
        aqmu aqmuVar2 = aqmu.a;
        str.getClass();
        aqmuVar.c |= 2;
        aqmuVar.e = str;
    }

    public final void ai(Integer num) {
        aone aoneVar = this.a;
        int intValue = num.intValue();
        aoneVar.copyOnWrite();
        aqmu aqmuVar = (aqmu) aoneVar.instance;
        aqmu aqmuVar2 = aqmu.a;
        aqmuVar.c |= 4;
        aqmuVar.f = intValue;
    }

    public final aqmt aj() {
        return new aqmt((aqmu) this.a.build());
    }

    public final void b(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqmu aqmuVar = (aqmu) aoneVar.instance;
        aqmu aqmuVar2 = aqmu.a;
        aqmuVar.c |= 16;
        aqmuVar.h = str;
    }

    public final void c(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqmu aqmuVar = (aqmu) aoneVar.instance;
        aqmu aqmuVar2 = aqmu.a;
        str.getClass();
        aqmuVar.c |= 8;
        aqmuVar.g = str;
    }

    public final void d(Integer num) {
        aone aoneVar = this.a;
        int intValue = num.intValue();
        aoneVar.copyOnWrite();
        aqmu aqmuVar = (aqmu) aoneVar.instance;
        aqmu aqmuVar2 = aqmu.a;
        aqmuVar.c |= 32;
        aqmuVar.i = intValue;
    }
}
