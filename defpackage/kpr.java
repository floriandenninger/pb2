package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kpr extends aivc implements xja, fnp {
    public final Context a;
    public final ajjz b;
    public ViewGroup c;
    public xiz d;
    public final kpq e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    private TextView k;
    private ViewGroup l;
    private TextView[] m;
    private View n;
    private View o;
    private TextView p;
    private TextView q;
    private Drawable r;
    private Drawable s;
    private xke t;
    private boolean u;
    private boolean v;

    public kpr(Context context, ajjz ajjzVar) {
        super(context);
        this.j = 2;
        this.a = context;
        this.b = ajjzVar;
        this.e = new kpq(this, context);
        h();
    }

    private final boolean q(int i) {
        if (this.c == null) {
            return false;
        }
        TextView[] textViewArr = this.m;
        int length = textViewArr.length;
        return i < 5 && textViewArr[i].isSelected();
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.xja
    public final xiy d() {
        return this.e;
    }

    @Override // defpackage.xja
    public final void e() {
        this.v = true;
        n();
    }

    public final void f() {
        if (this.d == null) {
            return;
        }
        int[] iArr = new int[this.g];
        int i = 0;
        for (int i2 = 0; i2 < this.g; i2++) {
            if (q(i2)) {
                iArr[i] = i2;
                i++;
            }
        }
        this.d.b(Arrays.copyOf(iArr, i));
    }

    @Override // defpackage.xja
    public final void h() {
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.t.a();
            this.n.setVisibility(8);
            this.o.setVisibility(8);
        }
        this.u = false;
        this.v = false;
        this.h = 0;
        this.i = 0;
        setVisibility(8);
    }

    @Override // defpackage.xja
    public final void i(xiz xizVar) {
        this.d = xizVar;
    }

    public final void j(int i, boolean z) {
        if (this.c != null) {
            TextView[] textViewArr = this.m;
            int length = textViewArr.length;
            if (i >= 5) {
                return;
            }
            textViewArr[i].setSelected(z);
            if (this.f) {
                jm.u(this.m[i], null, null, z ? this.r : this.s);
            } else {
                this.m[i].setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @Override // defpackage.xja
    public final void k(boolean z) {
        setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.xja
    public final void l() {
        this.t.b(true, false);
    }

    @Override // defpackage.xja
    public final void m(int i) {
        if (this.c == null) {
            return;
        }
        this.q.setText(this.c.getResources().getString(R.string.survey_attribution, zhq.i((int) Math.ceil(i / 1000.0f))));
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fkc.d(fhgVar);
    }

    public final void n() {
        int i;
        boolean z;
        this.u = false;
        int i2 = 0;
        while (true) {
            i = this.g;
            z = true;
            if (i2 >= i) {
                break;
            }
            if (!this.u && !q(i2)) {
                z = false;
            }
            this.u = z;
            i2++;
        }
        if (!this.u && (!this.f || !q(i))) {
            z = false;
        }
        this.u = z;
        if (this.c != null) {
            this.o.setVisibility((z && this.f) ? 0 : 8);
            this.n.setVisibility((!this.v || this.u) ? 8 : 0);
        }
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        float dimension;
        float dimension2;
        if (fhgVar.l()) {
            if (this.c == null) {
                return;
            }
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            return;
        }
        if (this.c != null) {
            this.k.setVisibility(8);
            this.l.setVisibility(0);
        }
        kpq kpqVar = this.e;
        if (kpqVar != null) {
            boolean b = fhgVar.b();
            if (kpqVar.a != null) {
                if (b) {
                    dimension = kpqVar.f.a.getResources().getDimension(R.dimen.large_font_size);
                } else if (yjk.aa(kpqVar.f.a)) {
                    dimension = kpqVar.f.a.getResources().getDimension(R.dimen.medium_font_size);
                } else {
                    dimension = kpqVar.f.a.getResources().getDimension(R.dimen.small_font_size);
                }
                if (b) {
                    dimension2 = kpqVar.f.a.getResources().getDimension(R.dimen.large_font_size);
                } else {
                    dimension2 = kpqVar.f.a.getResources().getDimension(R.dimen.medium_font_size);
                }
                kpqVar.b.setTextSize(0, dimension);
                kpqVar.c.setTextSize(0, dimension2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010b A[LOOP:0: B:19:0x0106->B:21:0x010b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpr.o(int):void");
    }

    @Override // defpackage.xja
    public final void p(String str, List list, boolean z, int i) {
        o(i);
        h();
        this.f = z;
        this.g = list.size();
        this.k.setText(str);
        this.p.setText(str);
        int size = list.size();
        int i2 = 0;
        while (true) {
            int length = this.m.length;
            if (i2 < 5) {
                if (i2 < list.size()) {
                    this.m[i2].setText((CharSequence) list.get(i2));
                    this.m[i2].setVisibility(0);
                } else if (i2 != size || !z) {
                    this.m[i2].setVisibility(4);
                } else {
                    this.m[i2].setText(R.string.survey_none_of_the_above);
                    this.m[i2].setVisibility(0);
                }
                j(i2, false);
                i2++;
            } else {
                this.c.setVisibility(0);
                return;
            }
        }
    }
}
