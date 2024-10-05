package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqoi extends whu {
    public final aone a;

    private aqoi() {
        super(null);
        aqol aqolVar = aqol.a;
        throw null;
    }

    public aqoi(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    public final void ah(Boolean bool) {
        aone aoneVar = this.a;
        boolean booleanValue = bool.booleanValue();
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        aqolVar.c |= 512;
        aqolVar.m = booleanValue;
    }

    public final void ai(Boolean bool) {
        aone aoneVar = this.a;
        boolean booleanValue = bool.booleanValue();
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        aqolVar.c |= 1024;
        aqolVar.n = booleanValue;
    }

    public final void aj(Integer num) {
        aone aoneVar = this.a;
        int intValue = num.intValue();
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        aqolVar.c |= 128;
        aqolVar.k = intValue;
    }

    public final void ak(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        str.getClass();
        aqolVar.c |= 8192;
        aqolVar.q = str;
    }

    public final void al(avgg avggVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        avggVar.getClass();
        aqolVar.e = avggVar;
        aqolVar.c |= 2;
    }

    public final void am(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        str.getClass();
        aqolVar.c |= 4;
        aqolVar.f = str;
    }

    public final void an(Integer num) {
        aone aoneVar = this.a;
        int intValue = num.intValue();
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        aqolVar.c |= 2048;
        aqolVar.o = intValue;
    }

    public final void ao(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        str.getClass();
        aqolVar.c |= 256;
        aqolVar.l = str;
    }

    public final void ap(Integer num) {
        aone aoneVar = this.a;
        int intValue = num.intValue();
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        aqolVar.c |= 16;
        aqolVar.h = intValue;
    }

    public final void aq(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        str.getClass();
        aqolVar.c |= 4096;
        aqolVar.p = str;
    }

    @Override // defpackage.whu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aqok a(aakv aakvVar) {
        return new aqok((aqol) this.a.build(), aakvVar);
    }

    public final void c(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        str.getClass();
        aqolVar.c |= 64;
        aqolVar.j = str;
    }

    public final void d(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqol aqolVar = (aqol) aoneVar.instance;
        aqol aqolVar2 = aqol.a;
        str.getClass();
        aqolVar.c |= 8;
        aqolVar.g = str;
    }
}
