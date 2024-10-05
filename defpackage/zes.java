package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zes {
    private View c;
    private View d;
    private final int[] a = new int[2];
    private final View.OnLayoutChangeListener b = new View.OnLayoutChangeListener() { // from class: zer
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            zes.this.a();
        }
    };
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;

    private final void e() {
        View view = this.d;
        if (view == null || this.c == null || !jw.al(view)) {
            return;
        }
        a();
    }

    public final void a() {
        View view;
        if (this.d == null || (view = this.c) == null) {
            return;
        }
        view.getLocationOnScreen(this.a);
        int e = jw.e(this.d);
        int[] iArr = this.a;
        int i = iArr[0];
        int i2 = i - (e == 1 ? this.g : this.e);
        int i3 = iArr[1] - this.f;
        int width = i + this.c.getWidth();
        int i4 = e == 1 ? this.e : this.g;
        int i5 = this.a[1];
        int height = this.c.getHeight();
        int i6 = this.h;
        this.d.getLocationOnScreen(this.a);
        int[] iArr2 = this.a;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        zeu.b(this.d, this.c, new zet(new Rect(i2 - i7, i3 - i8, (width + i4) - i7, ((i5 + height) + i6) - i8), this.c, this.d));
    }

    public final void b(View view, View view2) {
        view.getClass();
        view2.getClass();
        amkq.E(view != view2);
        if (view == this.c && view2 == this.d) {
            return;
        }
        c();
        this.c = view;
        this.d = view2;
        view2.addOnLayoutChangeListener(this.b);
        e();
    }

    public final void c() {
        View view = this.d;
        if (view == null) {
            return;
        }
        TouchDelegate touchDelegate = view.getTouchDelegate();
        if (touchDelegate instanceof zeu) {
            ((zeu) touchDelegate).a(this.c);
        }
        this.d.removeOnLayoutChangeListener(this.b);
        this.c = null;
        this.d = null;
    }

    public final void d(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        e();
    }
}
