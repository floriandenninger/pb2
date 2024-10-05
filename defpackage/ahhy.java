package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhy extends ahga implements ahjn {
    private static final float f = ahkt.a(5.0f);
    public boolean e;
    private final ahgd g;
    private final ahjo h;
    private float i;
    private final ahlt j;

    public ahhy(Resources resources, azrw azrwVar, ahjl ahjlVar, ahkv ahkvVar, ahlr ahlrVar, ahlt ahltVar) {
        super(new ahhp(ahkvVar.clone(), 0.0f, 0.0f));
        this.j = ahltVar;
        ahjo a = ahjlVar.a(ahkvVar.clone(), 0.0f, 0.0f);
        this.h = a;
        a.g(this);
        a.B(true, true);
        a.y(resources.getString(R.string.live_label));
        float f2 = f;
        ahku c = ahku.c(f2);
        ahgd ahgdVar = new ahgd(c, ahkvVar.clone(), ahgd.s(ahgd.h(-1695465), c.f), azrwVar);
        this.g = ahgdVar;
        ahgdVar.l(((-f2) / 2.0f) - 0.4f, 0.0f, 0.0f);
        a.l((f2 + 0.4f) / 2.0f, 0.0f, 0.0f);
        n(a);
        n(ahgdVar);
        ((ahga) this).c = new ahhx(this, ahlrVar);
        c();
    }

    @Override // defpackage.ahjn
    public final void a(float f2, float f3) {
        float f4 = this.i;
        this.i = f2;
        this.g.l((f4 - f2) / 2.0f, 0.0f, 0.0f);
        m(this.i, f3);
        ahlt ahltVar = this.j;
        ahltVar.a.b.l((this.i - f4) / 2.0f, 0.0f, 0.0f);
        ahltVar.a.b();
    }

    public final float b() {
        return this.i + f + 0.4f;
    }

    public final void c() {
        if (this.e) {
            this.g.g(-1695465);
        } else {
            this.g.g(-5723992);
        }
    }
}
