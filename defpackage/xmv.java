package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xmv extends ahga implements ahig, ahjn, ahik {
    private static final float[] e = {0.0f, 0.0f, 0.0f, 1.0f};
    private final ahgd f;
    private final ahjo g;
    private final ahhp h;
    private final Resources i;
    private float j;

    public xmv(Resources resources, ahjl ahjlVar, ahkv ahkvVar, azrw azrwVar) {
        super(new ahhp(ahkvVar, 0.0f, 0.0f));
        resources.getClass();
        this.i = resources;
        ahjo a = ahjlVar.a(ahkvVar.clone(), 10.0f, 0.0f);
        this.g = a;
        a.B(false, true);
        a.A(2.0f);
        a.g(this);
        a.h(17);
        ahku a2 = ahku.a(1.0f, 1.0f, ahku.c);
        ahgd ahgdVar = new ahgd(a2, ahkvVar.clone(), ahgd.s(e, a2.f), azrwVar);
        this.f = ahgdVar;
        ahgdVar.a(new ahil(this, ahil.b(1.0f), ahil.b(1.1f)));
        ahgdVar.a(new ahif(ahgdVar, 0.6f, 0.9f));
        ahgdVar.t();
        ahgdVar.d = 0.6f;
        n(ahgdVar);
        n(a);
        this.h = new ahhp(ahkvVar, 0.0f, 0.0f);
        j(false);
        d(5);
    }

    @Override // defpackage.ahjn
    public final void a(float f, float f2) {
        float a = f2 + ahkt.a(20.0f);
        this.j = a;
        this.f.rJ(12.0f, a, 1.0f);
        this.h.a(21.599998f, this.j * 1.8f);
        m(12.0f, this.j);
    }

    public final void c(boolean z) {
        if (z) {
            this.g.y(this.i.getString(R.string.skip_ad));
        }
        j(z);
    }

    public final void d(int i) {
        this.g.y(this.i.getString(R.string.skip_ad_in, Integer.valueOf(i / 1000)));
    }

    @Override // defpackage.ahig
    public final boolean f(ahjq ahjqVar) {
        return !v() && this.h.b(ahjqVar).b();
    }

    @Override // defpackage.ahig
    public final boolean g(ahjq ahjqVar) {
        return false;
    }

    @Override // defpackage.ahig
    public final boolean h(ahjq ahjqVar) {
        return !((ahga) this).b;
    }

    @Override // defpackage.ahga, defpackage.ahhi, defpackage.ahim
    public final void qD(boolean z, ahjq ahjqVar) {
        super.qD(z, ahjqVar);
        this.f.b = z;
    }

    @Override // defpackage.ahik
    public final void rJ(float f, float f2, float f3) {
        this.f.rJ(f * 12.0f, this.j * f2, f3);
    }
}
