package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rzs extends View implements rwi, rzj {
    public final rzz a;
    public ruo b;
    public rzu c;
    public boolean d;
    public ajbh e;
    private final rzd f;
    private final rwh g;

    /* JADX INFO: Access modifiers changed from: protected */
    public rzs(Context context) {
        super(context);
        this.f = rzd.a;
        this.g = new rzr(this);
        this.d = false;
        rwk rwkVar = new rwk();
        rwkVar.d();
        setLayoutParams(rwkVar);
        this.a = new rzz(context);
        this.c = new rzw(context);
        this.e = new ajbh((int[]) null);
    }

    @Override // defpackage.rzj
    public void a(ruv ruvVar) {
        throw null;
    }

    @Override // defpackage.rwi
    public final void b(ruv ruvVar) {
        sbt.a(ruvVar instanceof ruo, "Touch Card behavior can only be used on cartesian charts");
        if (this.b == ruvVar) {
            return;
        }
        this.b = (ruo) ruvVar;
        ruvVar.m(this);
        ruvVar.z(this.g);
        ruvVar.v(this);
    }

    @Override // defpackage.rwi
    public final void c(ruv ruvVar) {
        if (this.b != ruvVar) {
            return;
        }
        ruvVar.removeView(this);
        ruvVar.A(this.g);
        ruvVar.o(this);
        f().b();
        this.b = null;
    }

    @Override // defpackage.rzj
    public void d(ruv ruvVar) {
    }

    public final void e(List list, rzk rzkVar) {
        double doubleValue;
        float f;
        if (!rzkVar.e() || list.isEmpty()) {
            f().b();
            return;
        }
        ArrayList x = rwh.x();
        Iterator it = list.iterator();
        double d = -1.7976931348623157E308d;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            rvg rvgVar = (rvg) it.next();
            sba sbaVar = rvgVar.a;
            rza rzaVar = rvgVar.d;
            rza rzaVar2 = rvgVar.c;
            saw c = sbaVar.c(sax.a);
            saw d2 = sbaVar.d(sax.b, Double.valueOf(0.0d));
            saw c2 = rvgVar.c();
            int i = -1;
            for (Object obj : sbaVar.a) {
                Iterator it2 = it;
                int i2 = i + 1;
                Object a = c2.a(obj, i2, sbaVar);
                float f4 = f2;
                Double d3 = (Double) c.a(obj, i2, sbaVar);
                Double d4 = (Double) d2.a(obj, i2, sbaVar);
                if (d4 == null) {
                    f = f3;
                    doubleValue = 0.0d;
                } else {
                    doubleValue = d4.doubleValue();
                    f = f3;
                }
                Double valueOf = Double.valueOf(doubleValue);
                if (d3 == null || Double.isNaN(d3.doubleValue())) {
                    f3 = f;
                    f2 = f4;
                    c2 = c2;
                    d2 = d2;
                    i = i2;
                    it = it2;
                } else {
                    saw sawVar = c2;
                    saw sawVar2 = d2;
                    if (rzkVar.f(sbaVar, a) == 1) {
                        x.add(new rzt(sbaVar.b, i2, a, d3, ((Integer) sbaVar.c(sax.e).a(obj, i2, sbaVar)).intValue()));
                        float a2 = this.f.a(rzaVar, a);
                        if (d < d3.doubleValue() + valueOf.doubleValue()) {
                            d = d3.doubleValue() + valueOf.doubleValue();
                            f2 = rzaVar2.b(d3, valueOf);
                            f3 = a2;
                            i = i2;
                            it = it2;
                            c2 = sawVar;
                            d2 = sawVar2;
                        } else {
                            f3 = a2;
                        }
                    } else {
                        f3 = f;
                    }
                    f2 = f4;
                    i = i2;
                    it = it2;
                    c2 = sawVar;
                    d2 = sawVar2;
                }
            }
        }
        if (x.isEmpty()) {
            f().b();
            return;
        }
        boolean z = this.b.c;
        float f5 = true != z ? f3 : f2;
        if (true == z) {
            f2 = f3;
        }
        View a3 = this.c.a(x);
        sac f6 = f();
        f6.b.removeAllViews();
        f6.b.addView(a3);
        a3.requestLayout();
        post(new rzq(this, f2, f5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract sac f();
}
