package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SelectImageCellRendererOuterClass;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xzn extends vw implements xta {
    public final List d = new ArrayList();
    public final xud e;
    public final aahd f;
    public final xtb g;
    public aupd h;
    final amru i;
    private final int j;
    private final argd k;

    public xzn(xud xudVar, aahd aahdVar, xtb xtbVar, arge argeVar, int i) {
        this.e = xudVar;
        this.f = aahdVar;
        this.g = xtbVar;
        this.j = i;
        argd argdVar = argeVar.b;
        this.k = argdVar == null ? argd.a : argdVar;
        aulq aulqVar = argeVar.c;
        if ((aulqVar == null ? aulq.a : aulqVar).pY(SelectImageCellRendererOuterClass.selectImageCellRenderer)) {
            aulq aulqVar2 = argeVar.c;
            this.h = (aupd) (aulqVar2 == null ? aulq.a : aulqVar2).pX(SelectImageCellRendererOuterClass.selectImageCellRenderer);
        }
        this.i = amru.t(xudVar.e(new xuc() { // from class: xzk
            @Override // defpackage.xuc
            public final void a(xub xubVar) {
                xzn xznVar = xzn.this;
                xznVar.d.clear();
                xznVar.d.addAll(xubVar.a());
                xznVar.mw();
            }
        }), xudVar.d(new xua() { // from class: xzj
            @Override // defpackage.xua
            public final void a(xtz xtzVar) {
                xzn xznVar = xzn.this;
                amru a = xtzVar.a();
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    xuh xuhVar = (xuh) a.get(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= xznVar.d.size()) {
                            break;
                        }
                        if (((xuh) xznVar.d.get(i3)).a.equals(xuhVar.a)) {
                            xznVar.d.remove(i3);
                            xznVar.n(i3);
                            break;
                        }
                        i3++;
                    }
                }
            }
        }), xudVar.c(new xty() { // from class: xzi
            @Override // defpackage.xty
            public final void a(xtx xtxVar) {
                xzn xznVar = xzn.this;
                int a = xtxVar.a();
                if (a < 0 || a >= xznVar.d.size()) {
                    return;
                }
                xznVar.d.set(a, xtxVar.b());
                xznVar.oc(a);
            }
        }));
        xtbVar.c(this);
    }

    @Override // defpackage.vw
    public final int b() {
        if (this.h == null) {
            return this.d.size();
        }
        if (this.d.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return i == this.d.size() ? 1 : 0;
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        if (i != 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.post_select_image_cell, viewGroup, false);
            aott aottVar = this.h.e;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            aots aotsVar = aottVar.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            inflate.setContentDescription(aotsVar.c);
            xzm xzmVar = new xzm(inflate, this.j);
            TextView textView = xzmVar.t;
            aqyg aqygVar = this.h.b;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
            TextView textView2 = xzmVar.u;
            aqyg aqygVar2 = this.h.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            textView2.setText(ajcq.b(aqygVar2));
            whu.E(inflate, inflate.getBackground());
            xzmVar.a.setOnClickListener(new View.OnClickListener() { // from class: xzg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xzn xznVar = xzn.this;
                    aahd aahdVar = xznVar.f;
                    apxf apxfVar = xznVar.h.c;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.a(apxfVar);
                }
            });
            return xzmVar;
        }
        return new xzl(new xzf(viewGroup.getContext(), this.j, this.k));
    }

    @Override // defpackage.xta
    public final void g(xuh xuhVar, apmg apmgVar) {
        this.e.g(xuhVar);
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        argf argfVar;
        ImageView imageView;
        if (wvVar.f != 0) {
            return;
        }
        xzl xzlVar = (xzl) wvVar;
        final xuh xuhVar = (xuh) this.d.get(i);
        xzf xzfVar = xzlVar.t;
        xzfVar.a.setImageDrawable(xuhVar.c);
        if (xuhVar.c != null && (argfVar = xuhVar.d) != null && (imageView = xzfVar.a) != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF(0.0f, 0.0f, imageView.getLayoutParams().width, imageView.getLayoutParams().height);
            rectF.set(((float) argfVar.c) * r1.getIntrinsicWidth(), ((float) argfVar.d) * r1.getIntrinsicHeight(), ((float) argfVar.e) * r1.getIntrinsicWidth(), ((float) argfVar.f) * r1.getIntrinsicHeight());
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            imageView.setImageMatrix(matrix);
        }
        int i2 = xuhVar.e;
        final int i3 = 0;
        xzfVar.a.setVisibility(i2 == 3 ? 0 : 4);
        final int i4 = 1;
        whu.I(xzfVar.b, xzfVar.f != null && i2 == 3);
        whu.I(xzfVar.c, xzfVar.g != null && i2 == 3);
        whu.I(xzfVar.d, i2 == 1);
        final int i5 = 2;
        whu.I(xzfVar.e, i2 == 2);
        if (xuhVar.c == null || xuhVar.d == null) {
            return;
        }
        xzlVar.t.a.setOnClickListener(new View.OnClickListener(this) { // from class: xzh
            public final /* synthetic */ xzn a;

            {
                this.a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i4;
                if (i6 == 0) {
                    this.a.w(xuhVar);
                    return;
                }
                if (i6 == 1) {
                    this.a.w(xuhVar);
                    return;
                }
                xzn xznVar = this.a;
                xuh xuhVar2 = xuhVar;
                final xud xudVar = xznVar.e;
                amru r = amru.r(xuhVar2.a);
                yjk.f();
                amrp f = amru.f();
                amxe it = r.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    xuh xuhVar3 = (xuh) xudVar.g.get(uri);
                    if (xuhVar3 != null) {
                        xudVar.f.remove(uri);
                        xudVar.f(uri);
                        f.h(xuhVar3);
                    }
                }
                final amru g = f.g();
                if (g.isEmpty()) {
                    return;
                }
                xudVar.i.execute(new Runnable() { // from class: xtw
                    @Override // java.lang.Runnable
                    public final void run() {
                        xud.this.b.c(xtz.b(g));
                    }
                });
            }
        });
        xzlVar.t.c.setOnClickListener(new View.OnClickListener(this) { // from class: xzh
            public final /* synthetic */ xzn a;

            {
                this.a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i3;
                if (i6 == 0) {
                    this.a.w(xuhVar);
                    return;
                }
                if (i6 == 1) {
                    this.a.w(xuhVar);
                    return;
                }
                xzn xznVar = this.a;
                xuh xuhVar2 = xuhVar;
                final xud xudVar = xznVar.e;
                amru r = amru.r(xuhVar2.a);
                yjk.f();
                amrp f = amru.f();
                amxe it = r.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    xuh xuhVar3 = (xuh) xudVar.g.get(uri);
                    if (xuhVar3 != null) {
                        xudVar.f.remove(uri);
                        xudVar.f(uri);
                        f.h(xuhVar3);
                    }
                }
                final amru g = f.g();
                if (g.isEmpty()) {
                    return;
                }
                xudVar.i.execute(new Runnable() { // from class: xtw
                    @Override // java.lang.Runnable
                    public final void run() {
                        xud.this.b.c(xtz.b(g));
                    }
                });
            }
        });
        xzlVar.t.b.setOnClickListener(new View.OnClickListener(this) { // from class: xzh
            public final /* synthetic */ xzn a;

            {
                this.a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i5;
                if (i6 == 0) {
                    this.a.w(xuhVar);
                    return;
                }
                if (i6 == 1) {
                    this.a.w(xuhVar);
                    return;
                }
                xzn xznVar = this.a;
                xuh xuhVar2 = xuhVar;
                final xud xudVar = xznVar.e;
                amru r = amru.r(xuhVar2.a);
                yjk.f();
                amrp f = amru.f();
                amxe it = r.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    xuh xuhVar3 = (xuh) xudVar.g.get(uri);
                    if (xuhVar3 != null) {
                        xudVar.f.remove(uri);
                        xudVar.f(uri);
                        f.h(xuhVar3);
                    }
                }
                final amru g = f.g();
                if (g.isEmpty()) {
                    return;
                }
                xudVar.i.execute(new Runnable() { // from class: xtw
                    @Override // java.lang.Runnable
                    public final void run() {
                        xud.this.b.c(xtz.b(g));
                    }
                });
            }
        });
    }

    @Override // defpackage.vw
    public final void p(wv wvVar) {
        if (wvVar.f == 0) {
            xzf xzfVar = ((xzl) wvVar).t;
            xzfVar.a.setImageDrawable(null);
            xzfVar.b.setOnClickListener(null);
            xzfVar.c.setOnClickListener(null);
            xzfVar.a.setOnClickListener(null);
        }
    }

    @Override // defpackage.xta
    public final void qI(xuh xuhVar) {
    }

    public final void w(xuh xuhVar) {
        this.g.e(xuhVar);
        aahd aahdVar = this.f;
        apxf apxfVar = this.k.b;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.a(apxfVar);
    }
}
