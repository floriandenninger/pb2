package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnw {
    public ahla a;
    public ahnp b;
    public ahnz c;
    public ahoa d;
    public ahoa e;
    public ahob f;
    public ahny g;
    public ahny h;
    public ahny i;
    public ahny j;
    private final ahod k;

    public ahnw(ahod ahodVar, ahla ahlaVar) {
        this.k = ahodVar;
        this.a = ahlaVar;
        d();
    }

    public final azrw a() {
        return new ahnu(this, 1);
    }

    public final azrw b() {
        return new ahnu(this, 0);
    }

    public final azrw c() {
        return new ahnu(this, 2);
    }

    public final void d() {
        this.b = new ahnp(this.k);
        ahod ahodVar = this.k;
        this.f = new ahob(ahodVar.a(R.raw.gl_fixed_texture_program_vert), ahodVar.a(R.raw.gl_fixed_texture_program_frag));
        this.c = new ahnz(this.k);
        this.e = new ahoa(this.k, true, this.a.a());
        this.d = new ahoa(this.k, false, this.a.a());
        this.g = new ahny(this.k, false, this.a.a());
        this.h = new ahny(this.k, true, this.a.a());
        this.i = new ahny(this.k, false, this.a.a(), null);
        this.j = new ahny(this.k, true, this.a.a(), null);
    }

    public final void e() {
        this.b.i();
        this.f.i();
        this.c.i();
        this.d.i();
        this.e.i();
        this.g.i();
        this.h.i();
        this.i.i();
        this.j.i();
    }

    public final azrw f(int i) {
        return new ahnv(this, i, 1);
    }

    public final azrw g(int i) {
        return new ahnv(this, i, 2);
    }
}
