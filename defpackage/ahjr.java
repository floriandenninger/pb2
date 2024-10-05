package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahjr extends ahhi implements ahjn, ahie {
    private static final float b = ahkt.a(40.0f);
    private static final float[] c = {0.266f, 0.266f, 0.266f, 0.7f};
    private static final float e = ahkt.a(15.0f);
    public final ahjo a;
    private final ahgd f;
    private final ahgd g;

    public ahjr(ahjl ahjlVar, ahkv ahkvVar, azrw azrwVar, ahfr ahfrVar, float f) {
        ahku a = ahku.a(1.0f, 1.0f, ahku.c);
        ahkv clone = ahkvVar.clone();
        float[] fArr = c;
        ahgd ahgdVar = new ahgd(a, clone, ahgd.s(fArr, a.f), azrwVar);
        this.f = ahgdVar;
        ahgdVar.t();
        float f2 = e;
        float f3 = f2 / 2.0f;
        float f4 = f2 / 2.0f;
        ahku ahkuVar = new ahku(new float[]{f3, f4, 0.0f, 0.0f, -f4, 0.0f, -f3, f4, 0.0f}, new float[]{1.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f}, 5);
        ahgd ahgdVar2 = new ahgd(ahkuVar, ahkvVar.clone(), ahgd.s(fArr, ahkuVar.f), azrwVar);
        this.g = ahgdVar2;
        ahgdVar2.t();
        float f5 = b;
        ahgdVar2.l(0.0f, -((f5 / 2.0f) + (f2 / 2.0f)), 0.0f);
        ahjo a2 = ahjlVar.a(ahkvVar.clone(), ahkt.a(100.0f), ahkt.a(20.0f));
        this.a = a2;
        a2.z(-1);
        a2.A(2.0f);
        a2.B(true, true);
        a2.g(this);
        n(ahgdVar);
        n(ahgdVar2);
        n(a2);
        l(0.0f, f + (f5 / 2.0f) + (f2 / 2.0f), 0.0f);
        ahfrVar.a(new ahif(this, 0.0f, 1.0f));
    }

    @Override // defpackage.ahjn
    public final void a(float f, float f2) {
        this.f.rJ(f + ahkt.a(20.0f), b, 1.0f);
    }

    @Override // defpackage.ahie
    public final void k(float f) {
        this.f.c = f;
        this.a.c = f;
        this.g.c = f;
    }
}
