package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmj extends ahhi {
    public final ahiq a;
    public final ahjp b;
    public final ahgd c;
    public final float[] e = new float[3];
    public final Bitmap f;
    public long g;
    public long h;
    public float i;
    public float j;
    public ControlsOverlayStyle k;
    public boolean m;

    public ahmj(azrw azrwVar, azrw azrwVar2, ahkv ahkvVar, ahlz ahlzVar) {
        ahiq ahiqVar = new ahiq(azrwVar, new int[]{-1695465, -5723992, -1}, 38.0f, ahkvVar.clone(), new ahmi(this, ahlzVar));
        this.a = ahiqVar;
        Bitmap c = ahkt.c();
        this.f = c;
        ahkt.h(c, zhq.i(this.g / 1000));
        ahjp ahjpVar = new ahjp(c, ahku.a(ahkt.a(71.0f), ahkt.a(30.0f), ahku.c), ahkvVar.clone(), azrwVar2);
        this.b = ahjpVar;
        ahjpVar.a(new ahif(ahjpVar, 0.0f, 1.0f));
        ahjpVar.l((-ahiqVar.h) / 2.0f, ahkt.a(35.0f), 0.0f);
        ahku c2 = ahku.c(ahkt.a(8.0f));
        ahgd ahgdVar = new ahgd(c2, ahkvVar.clone(), ahgd.s(ahgd.h(-1695465), c2.f), azrwVar);
        this.c = ahgdVar;
        ahgdVar.l((-ahiqVar.h) / 2.0f, 0.0f, 0.0f);
        ahgdVar.a(new ahif(ahgdVar, 0.0f, 1.0f));
        ahgdVar.a(new ahil(ahgdVar, ahil.b(0.0f), ahil.b(1.0f)));
        n(ahiqVar);
        n(ahgdVar);
        n(ahjpVar);
    }

    public final boolean a() {
        return this.m && this.k != ControlsOverlayStyle.k;
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        super.q(ahjqVar);
        boolean j = this.a.j();
        this.b.b = j;
        this.c.b = j;
    }
}
