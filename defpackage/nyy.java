package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nyy implements View.OnLayoutChangeListener, ofd {
    static final nzo a = new nyv(3, 2.4f, 2.4f);
    private final View b;
    private final nzc c;
    private final fgq d;
    private final gjz e;
    private final int f;
    private boolean g;

    public nyy(fgq fgqVar, gjz gjzVar, View view, int i, nzc nzcVar) {
        this.b = view;
        this.f = i;
        this.c = nzcVar;
        this.d = fgqVar;
        this.e = gjzVar;
    }

    private final void a(int i, int i2) {
        if (this.d.g() == fhg.WATCH_WHILE_MAXIMIZED && this.e.f()) {
            boolean z = i2 < Math.round(((float) i) / 1.777f) + this.f;
            if (this.g == z) {
                return;
            }
            if (z) {
                this.c.h(a);
            } else if (this.c.f(3) != null) {
                this.c.g(0, false);
            }
            this.g = z;
        }
    }

    @Override // defpackage.ofd
    public final void e(int i, int i2) {
        boolean h = ofe.h(i2);
        if (ofe.h(i) == h) {
            return;
        }
        if (h) {
            this.b.addOnLayoutChangeListener(this);
            a(this.b.getWidth(), this.b.getHeight());
        } else {
            this.b.removeOnLayoutChangeListener(this);
            this.c.f(3);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a(i3 - i, i4 - i2);
    }
}
