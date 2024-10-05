package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ggm extends fks implements obn, flm, fgp, aiva, aioa, gge, ypd {
    public float a;
    public Rect b;
    private final ypa c;
    private final boolean d;
    private final ggl e;
    private final Set f;
    private final aioc g;
    private final ayqw h;
    private float i;
    private boolean j;
    private float k;
    private int l;
    private int m;
    private Rect n;
    private fhg o;
    private boolean p;
    private final kch q;

    public ggm(kch kchVar, aadw aadwVar, ypa ypaVar, azrw azrwVar, aioc aiocVar, fln flnVar, fgq fgqVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController) {
        super(flnVar);
        this.b = new Rect();
        this.o = fhg.NONE;
        this.q = kchVar;
        this.c = ypaVar;
        this.f = new aeb();
        this.g = aiocVar;
        this.h = new ayqw();
        this.d = evr.au(aadwVar);
        this.e = new ggl(this);
        p();
        fgqVar.i(this);
        ((aivb) azrwVar.get()).a(this);
        inlinePlaybackLifecycleController.l(this);
    }

    private final void k() {
        View view;
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((kcz) this.q.get()).aT;
        if (youTubePlayerViewNotForReflection != null && (view = youTubePlayerViewNotForReflection.p) != null) {
            view.requestLayout();
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((obd) it.next()).a();
        }
    }

    private final void p() {
        this.i = -1.0f;
        this.o = fhg.NONE;
        this.n = null;
        this.k = 0.0f;
        this.l = 0;
        this.m = 0;
    }

    private final void q(float f) {
        if (this.i == f) {
            return;
        }
        this.i = f;
        k();
    }

    @Override // defpackage.obn
    public final Rect a(Rect rect) {
        if (!this.p || this.k <= 0.0f) {
            return rect;
        }
        float f = this.i;
        if (f <= 0.0f || Float.isNaN(f)) {
            return rect;
        }
        if (this.n == null) {
            this.n = new Rect();
        }
        fav.B(this.k, rect, this.n);
        Rect rect2 = this.n;
        fav.z(rect2, this.i, rect2);
        return this.n;
    }

    @Override // defpackage.aiva
    public final void d(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            this.k = 0.0f;
            this.l = 0;
            this.m = 0;
        } else {
            if (this.l == i && this.m == i2) {
                return;
            }
            this.l = i;
            this.m = i2;
            this.k = i / i2;
            h();
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ahef ahefVar) {
        aign c = ahefVar.c();
        boolean z = false;
        if (!c.h() && c.c(aign.READY) && c != aign.ENDED) {
            z = true;
        }
        if (this.j == z) {
            return;
        }
        this.j = z;
        h();
    }

    public final void h() {
        if (this.o.d()) {
            float f = this.a;
            if (f > 0.0f) {
                float f2 = this.k;
                if (f2 <= 0.0f) {
                    return;
                }
                if (this.p) {
                    float f3 = f / f2;
                    if (f3 <= 1.0f) {
                        f3 = 1.0f / f3;
                    }
                    q(f3);
                    return;
                }
                q(1.0f);
            }
        }
    }

    @Override // defpackage.obn
    public final void i(obd obdVar) {
        this.f.add(obdVar);
    }

    @Override // defpackage.obn
    public final void j(obd obdVar) {
        this.f.remove(obdVar);
    }

    @Override // defpackage.flm
    public final void kG() {
        if (this.d) {
            this.h.c();
        } else {
            this.c.m(this);
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((kcz) this.q.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.removeOnLayoutChangeListener(this.e);
        }
    }

    @Override // defpackage.flm
    public final void kH() {
        if (this.d) {
            this.h.c();
            this.h.g(kI(this.g));
        } else {
            this.c.g(this);
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((kcz) this.q.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.addOnLayoutChangeListener(this.e);
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().b.Y(new ayrs() { // from class: ggj
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ggm.this.g((ahef) obj);
            }
        }, ggk.a)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            g((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.gge
    public final void m(gfq gfqVar, int i, int i2) {
        boolean h;
        if (i2 == 0) {
            h = false;
        } else if (i2 != 1) {
            return;
        } else {
            h = gfqVar.b.h();
        }
        this.p = h;
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar != fhg.INLINE_MINIMAL) {
            p();
        } else {
            this.o = fhgVar;
            h();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
