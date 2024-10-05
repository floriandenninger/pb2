package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class taq extends wo {
    private boolean a = false;
    private boolean b = false;

    @Override // defpackage.wo, defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        wd wdVar;
        if (!this.a) {
            this.a = true;
            ViewParent parent = recyclerView.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                }
                if ((parent instanceof RecyclerView) && (wdVar = ((RecyclerView) parent).n) != null && wdVar.ae()) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            this.b = z;
        }
        if (this.b && motionEvent.getAction() == 2) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
