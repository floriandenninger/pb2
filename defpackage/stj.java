package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stj implements View.OnAttachStateChangeListener, wh {
    public stg a;
    public sth b;
    private final RecyclerView c;
    private boolean d = false;
    private final dsz e;

    public stj(RecyclerView recyclerView, dsz dszVar) {
        this.c = recyclerView;
        this.e = dszVar;
    }

    public final int a() {
        vw vwVar = this.c.m;
        if (vwVar != null) {
            return vwVar.b();
        }
        return 0;
    }

    public final void b(int i, boolean z) {
        wd wdVar;
        int i2;
        wr draVar;
        if (c()) {
            if (!this.d) {
                this.c.v(this);
                this.c.addOnAttachStateChangeListener(this);
                this.d = true;
            }
            dsz dszVar = this.e;
            if (dszVar == null) {
                if (z) {
                    this.c.ak(i);
                    return;
                } else {
                    this.c.aa(i);
                    return;
                }
            }
            RecyclerView a = dszVar.a();
            if (a == null || (wdVar = a.n) == null || a.isLayoutSuppressed()) {
                return;
            }
            if (!z) {
                dszVar.c(i, false);
                return;
            }
            if (dszVar.b != Integer.MIN_VALUE) {
                Context context = a.getContext();
                int i3 = dszVar.b;
                if (i3 == -1) {
                    i2 = 6;
                } else if (i3 != 1) {
                    if (i3 != Integer.MAX_VALUE) {
                        switch (i3) {
                            case 2147483646:
                                break;
                            default:
                                i2 = 2;
                                break;
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 8;
                }
                if (i2 == 6 || i2 == 8) {
                    draVar = new dra(context, i2 - 7);
                } else if (i2 == 1) {
                    draVar = new dqs(context);
                } else {
                    draVar = new wr(context);
                }
                draVar.b = i;
                wdVar.bd(draVar);
                return;
            }
            dszVar.c(i, true);
        }
    }

    public final boolean c() {
        return this.c.r;
    }

    @Override // defpackage.wh
    public final void h(boolean z) {
    }

    @Override // defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        stg stgVar = this.a;
        if (stgVar == null || !stgVar.d.get()) {
            return false;
        }
        stgVar.a();
        return false;
    }

    @Override // defpackage.wh
    public final void o(MotionEvent motionEvent) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        sth sthVar = this.b;
        if (sthVar != null) {
            stg stgVar = sthVar.a;
            RecyclerView recyclerView = sthVar.b;
            Map map = stk.a;
            stgVar.a();
            stk.b.remove(recyclerView);
        }
        this.c.Y(this);
        this.c.removeOnAttachStateChangeListener(this);
        this.d = false;
    }
}
