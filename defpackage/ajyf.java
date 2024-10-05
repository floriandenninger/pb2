package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajyf extends ajyd {
    public final TextView f;
    public final boolean g;
    public boolean h;
    public boolean i;
    public int j;
    private final ajut k;
    private int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private int r;
    private boolean s;
    private final int t;

    public ajyf(aahd aahdVar, ajut ajutVar, aoae aoaeVar, aadw aadwVar, TextView textView, byte[] bArr) {
        super(aahdVar, aoaeVar, textView, null);
        boolean z;
        this.k = ajutVar;
        this.f = textView;
        if (textView.getLayoutParams() != null) {
            this.l = textView.getLayoutParams().height;
        }
        this.m = textView.getGravity();
        this.n = textView.getPaddingTop();
        this.o = textView.getPaddingStart();
        this.p = textView.getResources().getDimensionPixelSize(R.dimen.button_corner_radius);
        this.q = textView.getResources().getDimensionPixelSize(R.dimen.button_outline_width);
        apwy b = aadwVar.b();
        if (b != null && (b.b & 16) != 0) {
            asvu asvuVar = b.e;
            if ((asvuVar == null ? asvu.a : asvuVar).aw) {
                z = true;
                this.g = z;
                this.j = 0;
                this.r = -1;
                this.t = -1;
                this.s = false;
            }
        }
        z = false;
        this.g = z;
        this.j = 0;
        this.r = -1;
        this.t = -1;
        this.s = false;
    }

    public static void c(TextView textView, Drawable drawable, boolean z) {
        if (z) {
            if (drawable != null) {
                whu.r(textView, drawable);
            }
            textView.setOnTouchListener(akaw.c());
        } else {
            int orElse = wbs.W(textView.getContext(), R.attr.ytTouchResponse).orElse(0);
            if (drawable == null) {
                drawable = textView.getBackground();
            }
            akaw.d(textView, orElse, 0, drawable);
        }
    }

    private final int h(int i) {
        return fk.a(this.f.getResources(), i, this.f.getContext().getTheme());
    }

    private final int i(int i, int i2) {
        return wbs.W(this.f.getContext(), i).orElse(h(i2));
    }

    private final Drawable j(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(h(i));
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    private final Drawable k(int i) {
        return nz.b(this.f.getContext(), i);
    }

    private final GradientDrawable l(int i) {
        return m(i, true);
    }

    private final GradientDrawable m(int i, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        if (z) {
            gradientDrawable.setCornerRadius(this.p);
        }
        return gradientDrawable;
    }

    private final GradientDrawable n(int i, boolean z) {
        return m(wbs.W(this.f.getContext(), i).orElse(0), z);
    }

    private final GradientDrawable o(int i) {
        GradientDrawable l = l(0);
        l.setStroke(this.q, i);
        return l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01cf  */
    @Override // defpackage.ajyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.apmg r17, defpackage.acra r18, java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyf.a(apmg, acra, java.util.Map):void");
    }

    public final void d(boolean z) {
        apmg apmgVar = this.b;
        if (apmgVar != null) {
            aong aongVar = (aong) apmgVar.toBuilder();
            aongVar.copyOnWrite();
            apmg apmgVar2 = (apmg) aongVar.instance;
            apmgVar2.b |= 64;
            apmgVar2.h = !z;
            this.b = (apmg) aongVar.build();
            this.a.setEnabled(z);
            this.a.setClickable(z);
        }
        this.f.setAlpha(true != z ? 0.5f : 1.0f);
    }

    public final void e(int i) {
        this.r = this.f.getResources().getDimensionPixelOffset(i);
    }

    public final void f() {
        this.j = 1;
    }

    public final void g() {
        this.s = true;
    }
}
