package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class obx extends obb {
    public final List a;
    public final obv b;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float o;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    public float c = Float.NaN;
    private ammv n = amlr.a;

    public obx(List list, obv obvVar) {
        this.a = list;
        this.b = obvVar;
    }

    private final void c() {
        int i;
        float f = this.c;
        int i2 = 1;
        while (true) {
            if (i2 >= this.a.size()) {
                i = 0;
                break;
            } else {
                if (f <= ((obw) this.a.get(i2)).b) {
                    i = i2 - 1;
                    break;
                }
                i2++;
            }
        }
        obw obwVar = (obw) this.a.get(i);
        obw obwVar2 = (obw) this.a.get(i + 1);
        obp obpVar = obwVar.a;
        obp obpVar2 = obwVar2.a;
        float f2 = this.c;
        float f3 = obwVar.b;
        float f4 = (f2 - f3) / (obwVar2.b - f3);
        fav.s(this.d, obpVar.v(), obpVar2.v(), f4);
        fav.s(this.e, obpVar.t(), obpVar2.t(), f4);
        fav.s(this.f, obpVar.r(), obpVar2.r(), f4);
        fav.s(this.g, obpVar.s(), obpVar2.s(), f4);
        fav.s(this.h, obpVar.u(), obpVar2.u(), f4);
        float o = obpVar.o();
        this.i = o + ((obpVar2.o() - o) * f4);
        float l = obpVar.l();
        this.j = l + ((obpVar2.l() - l) * f4);
        float m = obpVar.m();
        this.k = m + ((obpVar2.m() - m) * f4);
        float n = obpVar.n();
        this.l = n + ((obpVar2.n() - n) * f4);
        float q = obpVar.q();
        this.o = q + ((obpVar2.q() - q) * f4);
        float p = obpVar.p();
        this.m = p + ((obpVar2.p() - p) * f4);
        if (obpVar.I().h() && obpVar2.I().h()) {
            int intValue = ((Integer) obpVar.I().c()).intValue();
            int intValue2 = ((Integer) obpVar2.I().c()).intValue();
            int n2 = fav.n(Color.red(intValue), Color.red(intValue2), f4);
            this.n = ammv.j(Integer.valueOf(Color.argb(fav.n(Color.alpha(intValue), Color.alpha(intValue2), f4), n2, n2, n2)));
        } else {
            this.n = amlr.a;
        }
        J();
    }

    @Override // defpackage.obb, defpackage.obp
    public final ammv I() {
        return this.n;
    }

    public final void a(float f) {
        if (this.c == f) {
            return;
        }
        this.c = f;
        c();
    }

    public final void b() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                int i2 = (size - i) - 1;
                obw obwVar = (obw) this.a.remove(i2);
                obw obwVar2 = (obw) this.a.remove(i);
                this.a.add(i, obwVar);
                this.a.add(i2, obwVar2);
            }
            ((obw) this.a.get(i)).b = 1.0f - ((obw) this.a.get(i)).b;
        }
        float f = this.c;
        if (f != Float.NaN) {
            this.c = 1.0f - f;
        }
    }

    @Override // defpackage.obp
    public final float l() {
        return this.j;
    }

    @Override // defpackage.obp
    public final float m() {
        return this.k;
    }

    @Override // defpackage.obp
    public final float n() {
        return this.l;
    }

    @Override // defpackage.obp
    public final float o() {
        return this.i;
    }

    @Override // defpackage.obp
    public final float p() {
        return this.m;
    }

    @Override // defpackage.obp
    public final float q() {
        return this.o;
    }

    @Override // defpackage.obp
    public final Rect r() {
        return this.f;
    }

    @Override // defpackage.obp
    public final Rect s() {
        return this.g;
    }

    @Override // defpackage.obp
    public final Rect t() {
        return this.e;
    }

    @Override // defpackage.obp
    public final Rect u() {
        return this.h;
    }

    @Override // defpackage.obp
    public final Rect v() {
        return this.d;
    }

    @Override // defpackage.obp
    public final void x() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obw) it.next()).a.x();
        }
    }

    @Override // defpackage.obp
    public final void y() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obw) it.next()).a.y();
        }
    }

    @Override // defpackage.obp
    public final void z(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((obw) it.next()).a.z(i, i2);
        }
        c();
    }
}
