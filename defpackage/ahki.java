package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahki extends ahhi implements ahkk, ahkl {
    public final ahkm a;
    public final ahjl b;
    public final ahhi c;
    public final List e;
    public ahke f;
    public boolean g;
    public boolean h;
    public ahkg i;
    public ahkf j;
    public ahkc k;
    public ahkh m;
    private final ahhp n;
    private final ahhf o;
    private final ahga p;
    private boolean q;
    private boolean r;
    private int s;

    public ahki(Context context, ViewGroup viewGroup, ahkm ahkmVar) {
        ahkmVar.getClass();
        this.a = ahkmVar;
        ahjl ahjlVar = new ahjl(viewGroup, context, new Handler(Looper.getMainLooper()), ahkmVar.a.c());
        this.b = ahjlVar;
        ahhi ahhiVar = new ahhi();
        this.c = ahhiVar;
        this.e = new ArrayList();
        Resources resources = context.getResources();
        Bitmap d = ahkt.d(resources, R.raw.vr_button_border_small);
        Bitmap d2 = ahkt.d(resources, R.raw.vr_button_fill);
        ahkv clone = ahkmVar.c.clone();
        clone.e(false);
        ahgf A = A(d, clone, ahkmVar);
        A.a(new ahif(A, 0.8f, 0.0f));
        ahgf A2 = A(d2, clone, ahkmVar);
        A2.a(new ahif(A2, 0.0f, 1.0f));
        ahga ahgaVar = new ahga(new ahhp(clone, 0.0f, 0.0f));
        this.p = ahgaVar;
        ahgaVar.n(A2);
        ahgaVar.n(A);
        this.n = new ahhp(ahkmVar.c.clone(), ahkmVar.h * 3.0f, ahkmVar.i * 3.0f);
        this.s = ahkmVar.k;
        ahkmVar.a(this);
        ahkmVar.b(this);
        ahhi ahhiVar2 = new ahhi();
        Handler handler = new Handler(Looper.getMainLooper());
        ahkv clone2 = clone.clone();
        super.n(ahhiVar);
        super.n(ahgaVar);
        super.n(ahhiVar2);
        this.o = new ahhf(ahhiVar2, ahjlVar, handler, clone2.clone(), ahkmVar, resources.getString(R.string.vr_click_to_recenter));
        j(false);
    }

    private static ahgf A(Bitmap bitmap, ahkv ahkvVar, ahkm ahkmVar) {
        ahgf ahgfVar = new ahgf(bitmap, ahku.a(ahkt.a(bitmap.getWidth()), ahkt.a(bitmap.getHeight()), ahku.c), ahkvVar, ahkmVar.a.b());
        ahgfVar.a(new ahil(ahgfVar, ahil.b(0.5f), ahil.b(0.05f)));
        return ahgfVar;
    }

    public final ahkv a() {
        return this.a.c;
    }

    @Override // defpackage.ahkl
    public final void b(float f, float f2) {
        this.n.a(f * 3.0f, f2 * 3.0f);
    }

    public final void c(ahig ahigVar) {
        this.c.n(ahigVar);
        k();
    }

    public final void g() {
        this.a.b.l = false;
        ahkg ahkgVar = this.i;
        if (ahkgVar != null) {
            ahmc ahmcVar = (ahmc) ahkgVar;
            ahmcVar.p = true;
            ahmcVar.j();
        }
    }

    public final void h(boolean z) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ahkd) it.next()).c(z);
        }
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void i() {
        super.i();
        this.a.g(this);
        this.a.h(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(boolean z) {
        boolean z2 = !z;
        this.l = z2;
        this.r = z2;
    }

    public final void k() {
        boolean z;
        ahga ahgaVar = this.p;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!((ahim) it.next()).v()) {
                z = false;
                break;
            }
        }
        ahgaVar.l = z;
    }

    public final void m(String str, String str2) {
        ahkf ahkfVar = this.j;
        if (ahkfVar == null) {
            zga.b("Attempted to update the video metadata but the listener is null.");
            return;
        }
        ahmc ahmcVar = (ahmc) ahkfVar;
        ahmcVar.f.b(str);
        ahmcVar.f.a(str2);
        ahmcVar.p = false;
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void p(ahjq ahjqVar) {
        super.p(ahjqVar);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (!((ahig) ((ahim) it.next())).h(ahjqVar)) {
                return;
            }
        }
        this.a.t(ahjqVar);
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        boolean z;
        boolean z2;
        if (!v()) {
            Iterator it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ahim ahimVar = (ahim) it.next();
                if ((ahimVar instanceof ahig) && ((ahig) ahimVar).g(ahjqVar)) {
                    z = true;
                    break;
                }
            }
            Iterator it2 = this.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                ahim ahimVar2 = (ahim) it2.next();
                if ((ahimVar2 instanceof ahig) && ((ahig) ahimVar2).f(ahjqVar)) {
                    z2 = true;
                    break;
                }
            }
            this.p.qD(!s(), ahjqVar);
            this.p.l = z || !z2;
            int i = this.s;
            if (i != 3 && i != 2) {
                if (this.n.b(ahjqVar).b()) {
                    if (this.q) {
                        this.q = false;
                        ahhf ahhfVar = this.o;
                        ahhfVar.b.l = true;
                        ahhfVar.a.removeCallbacks(ahhfVar.c);
                    }
                } else if (!this.q) {
                    this.q = true;
                    ahhf ahhfVar2 = this.o;
                    ahhfVar2.b.l = false;
                    ahhfVar2.a.postAtTime(ahhfVar2.c, SystemClock.uptimeMillis() + 5000);
                }
            }
            super.q(ahjqVar);
        }
        if (this.r) {
            this.a.j(0.0f);
            this.r = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(boolean z, boolean z2) {
        this.g = z;
        this.h = z2;
    }

    public final boolean w() {
        ahke ahkeVar = this.f;
        return ahkeVar == null || ((ahmc) ahkeVar).n;
    }

    public final boolean x() {
        Object obj = this.k;
        return (obj == null || ((ahio) obj).v()) ? false : true;
    }

    public final boolean y() {
        ahkh ahkhVar = this.m;
        return ahkhVar != null && ((ahnn) ahkhVar).j;
    }

    @Override // defpackage.ahkk
    public final void z(int i) {
        this.s = i;
    }
}
