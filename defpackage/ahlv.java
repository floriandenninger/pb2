package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahlv extends ahhi {
    public final ahjo a;
    public final ahhy b;
    public final ahjp c;
    public final ahhr e;
    public final ahmj f;
    public float g;
    public long h;
    public boolean i;
    private final ahjy j;
    private float k;

    public ahlv(Resources resources, AudioManager audioManager, ahkm ahkmVar, ahjl ahjlVar, ahkv ahkvVar, ahlz ahlzVar, ahma ahmaVar, byte[] bArr) {
        azrw b = ahkmVar.a.b();
        azrw a = ahkmVar.a.a();
        float a2 = ahkt.a(-40.0f);
        ahjo a3 = ahjlVar.a(ahkvVar.clone(), 0.0f, ahkt.a(40.0f));
        this.a = a3;
        a3.l(-19.0f, a2, 0.0f);
        a3.h(17);
        a3.g(new ahjn() { // from class: ahls
            @Override // defpackage.ahjn
            public final void a(float f, float f2) {
                ahlv ahlvVar = ahlv.this;
                ahlvVar.a.l((f - ahlvVar.g) / 2.0f, 0.0f, 0.0f);
                ahlvVar.g = f;
                ahlvVar.b();
            }
        });
        a3.B(true, false);
        ahmj ahmjVar = new ahmj(a, b, ahkvVar.clone(), ahlzVar);
        this.f = ahmjVar;
        ahjy ahjyVar = new ahjy(resources, audioManager, a, b, ahkvVar);
        this.j = ahjyVar;
        ahjyVar.l(0.0f, a2, 0.0f);
        ahhy ahhyVar = new ahhy(resources, a, ahjlVar, ahkvVar.clone(), new ahlr(this, ahlzVar), new ahlt(this));
        this.b = ahhyVar;
        ahhyVar.l((ahhyVar.b() - 38.0f) / 2.0f, a2, 0.0f);
        Bitmap d = ahkt.d(resources, R.raw.white_box);
        float a4 = ahkt.a(d.getWidth());
        float a5 = ahkt.a(d.getHeight());
        ahjp ahjpVar = new ahjp(d, ahku.a(a4, a5, ahku.c), ahkvVar.clone(), ahkmVar.a.b());
        ahjpVar.l((38.0f - a4) / 2.0f, ahkt.a(-40.0f), 0.0f);
        ahhp ahhpVar = ahjpVar.g;
        if (ahhpVar == null) {
            ahjpVar.g = new ahhp(((ahfr) ahjpVar).a, a4, a5);
        } else {
            ahhpVar.a(a4, a5);
        }
        ahil ahilVar = new ahil(ahjpVar, ahil.b(0.5f), ahil.b(1.0f));
        ahjpVar.a(new ahif(ahjpVar, 0.75f, 1.0f));
        ahjpVar.c(ahilVar);
        ahjpVar.e = new ahlu(ahjpVar, ahkmVar);
        this.c = ahjpVar;
        ahjpVar.l = true;
        ahhr ahhrVar = new ahhr(resources, b, a, ahjlVar, ahkvVar, ahmaVar, null);
        this.e = ahhrVar;
        ahhrVar.l(ahkt.a(140.0f), a2, 0.0f);
        ahhrVar.l = true;
        n(ahmjVar);
        n(ahhrVar);
        n(a3);
        n(ahhyVar);
        n(ahjyVar);
        n(ahjpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.e.l = !z;
    }

    public final void b() {
        float b = this.i ? this.b.b() : this.g;
        float f = ((r1.f - 38.0f) / 2.0f) + b + 0.5f;
        this.j.l(f - this.k, 0.0f, 0.0f);
        this.k = f;
    }
}
