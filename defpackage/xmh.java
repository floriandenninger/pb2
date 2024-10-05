package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xmh implements View.OnTouchListener {
    public final /* synthetic */ xmi a;
    private final /* synthetic */ int b;

    public /* synthetic */ xmh(xmi xmiVar, int i) {
        this.b = i;
        this.a = xmiVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b != 0) {
            xmi xmiVar = this.a;
            if (motionEvent.getAction() == 0) {
                xmiVar.c();
                xmiVar.d.add(view);
            }
            return false;
        }
        xmi xmiVar2 = this.a;
        View.OnTouchListener onTouchListener = xmiVar2.b;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            xmiVar2.c();
            xmiVar2.d.add(xmiVar2.a);
            ncj ncjVar = xmiVar2.i;
            if (ncjVar != null) {
                amru o = amru.o(xmiVar2.d);
                nck nckVar = ncjVar.a;
                if (!nckVar.v(o)) {
                    if (nckVar.t(o)) {
                        nckVar.n(nckVar.j(o));
                    } else {
                        nckVar.o();
                    }
                }
            }
        } else if (action != 1) {
            xmiVar2.f = true;
        } else {
            xmiVar2.a();
            xmiVar2.e = MotionEvent.obtain(motionEvent);
            xmiVar2.f = true;
        }
        return false;
    }
}
