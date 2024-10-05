package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmg extends whu {
    public final aone a;

    private aqmg() {
        super(null);
        aqmj aqmjVar = aqmj.a;
        throw null;
    }

    public aqmg(aone aoneVar) {
        super(null);
        this.a = aoneVar;
    }

    public final void ah(String str) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqmj aqmjVar = (aqmj) aoneVar.instance;
        aqmj aqmjVar2 = aqmj.a;
        str.getClass();
        aqmjVar.c |= 16;
        aqmjVar.h = str;
    }

    public final void ai(Boolean bool) {
        aone aoneVar = this.a;
        boolean booleanValue = bool.booleanValue();
        aoneVar.copyOnWrite();
        aqmj aqmjVar = (aqmj) aoneVar.instance;
        aqmj aqmjVar2 = aqmj.a;
        aqmjVar.c |= 128;
        aqmjVar.k = booleanValue;
    }

    public final void aj(Boolean bool) {
        aone aoneVar = this.a;
        boolean booleanValue = bool.booleanValue();
        aoneVar.copyOnWrite();
        aqmj aqmjVar = (aqmj) aoneVar.instance;
        aqmj aqmjVar2 = aqmj.a;
        aqmjVar.c |= 32;
        aqmjVar.i = booleanValue;
    }

    public final void ak(Float f) {
        aone aoneVar = this.a;
        float floatValue = f.floatValue();
        aoneVar.copyOnWrite();
        aqmj aqmjVar = (aqmj) aoneVar.instance;
        aqmj aqmjVar2 = aqmj.a;
        aqmjVar.c |= 8;
        aqmjVar.g = floatValue;
    }

    @Override // defpackage.whu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aqmi a(aakv aakvVar) {
        return new aqmi((aqmj) this.a.build(), aakvVar);
    }

    public final void c(Float f) {
        aone aoneVar = this.a;
        float floatValue = f.floatValue();
        aoneVar.copyOnWrite();
        aqmj aqmjVar = (aqmj) aoneVar.instance;
        aqmj aqmjVar2 = aqmj.a;
        aqmjVar.c |= 4;
        aqmjVar.f = floatValue;
    }

    public final void d(avxt avxtVar) {
        aone aoneVar = this.a;
        aoneVar.copyOnWrite();
        aqmj aqmjVar = (aqmj) aoneVar.instance;
        aqmj aqmjVar2 = aqmj.a;
        aqmjVar.e = avxtVar.j;
        aqmjVar.c |= 2;
    }
}
