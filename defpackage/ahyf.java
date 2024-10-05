package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ahyf extends View implements ahyj {
    private final int a;
    private int b;
    private int[] c;
    private Point d;
    public ahyk r;
    public long s;
    protected final ahyc t;
    public boolean u;

    public ahyf(ahyk ahykVar, Context context, AttributeSet attributeSet) {
        this(ahykVar, context, attributeSet, new ahyc());
    }

    public static String I(long j) {
        return zhq.j(j / 1000, j >= 3600000 ? 5 : j >= 60000 ? 4 : 3);
    }

    public static void K(ahyk ahykVar, long j) {
        ahyg ahygVar = (ahyg) ahykVar;
        boolean z = false;
        if (ahygVar.p && j == ahygVar.a) {
            z = true;
        }
        ahygVar.q = z;
    }

    private final long f(long j) {
        return this.r.t() ? -(this.r.i() - j) : j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void B();

    protected abstract boolean C(float f, float f2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long E() {
        return this.r.h() - this.r.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long F() {
        return this.s - this.r.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Point G(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.c == null) {
            this.c = new int[2];
        }
        if (this.d == null) {
            this.d = new Point();
        }
        getLocationOnScreen(this.c);
        this.d.set(((int) motionEvent.getRawX()) - this.c[0], ((int) motionEvent.getRawY()) - this.c[1]);
        return this.d;
    }

    public final String H() {
        return getContext().getResources().getString(R.string.accessibility_player_progress_time, wbs.ay(getResources(), I(E())), wbs.ay(getResources(), I(kL())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(long j) {
        this.t.a(3, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L() {
        this.t.a(5, this.s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M() {
        this.t.a(4, this.s);
        kN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void N(int i) {
        o(i);
        long c = c();
        this.s = c;
        this.t.a(2, c);
        kN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O(int i) {
        o(i);
        long c = c();
        this.s = c;
        this.t.a(1, c);
        kN();
    }

    public final void P(long j) {
        this.s = j;
        kN();
    }

    public abstract long c();

    @Override // defpackage.ahyj
    public final long kJ() {
        return f(this.r.h());
    }

    @Override // defpackage.ahyj
    public final long kK() {
        return this.r.g() - this.r.j();
    }

    @Override // defpackage.ahyj
    public final long kL() {
        return this.r.i() - this.r.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void kM() {
        if (this.u) {
            kN();
            J(c());
        } else {
            J(c());
            kN();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void kN();

    @Override // defpackage.ahyj
    public final boolean kO() {
        return this.t.b;
    }

    @Override // defpackage.ahyj
    public final void kP() {
        ahyc ahycVar = this.t;
        long c = c();
        if (ahycVar.b) {
            ahycVar.b(false, 4, c);
        }
    }

    @Override // defpackage.ahyj
    public final long kQ() {
        return f(this.s);
    }

    @Override // defpackage.ahym
    public final void kR(ahyl ahylVar) {
        this.t.a.add(ahylVar);
    }

    protected abstract void o(float f);

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        Point G = G(motionEvent);
        int i = G.x;
        int i2 = G.y;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.t.b) {
                        M();
                        return true;
                    }
                } else if (this.t.b) {
                    if (i2 < this.a) {
                        int i3 = this.b;
                        i = ((i - i3) / 3) + i3;
                    } else {
                        this.b = i;
                    }
                    N(i);
                    return true;
                }
            } else if (this.t.b) {
                kM();
                return true;
            }
        } else if (C(i, i2)) {
            L();
            O(i);
            return true;
        }
        return false;
    }

    @Override // defpackage.ahym
    public final void q(ahyl ahylVar) {
        this.t.a.remove(ahylVar);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        if (isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        B();
    }

    @Override // defpackage.ahyj
    public final void y(ahyk ahykVar) {
        ahykVar.getClass();
        this.r = ahykVar;
        kN();
    }

    public ahyf(ahyk ahykVar, Context context, AttributeSet attributeSet, ahyc ahycVar) {
        super(context, attributeSet);
        this.t = ahycVar;
        this.r = ahykVar;
        ahycVar.c = new ahyb(this);
        setAccessibilityDelegate(new ahye(this));
        this.a = (int) (context.getResources().getDisplayMetrics().density * (-50.0f));
    }
}
