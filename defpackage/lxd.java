package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxd extends wo {
    final /* synthetic */ lxf a;

    public lxd(lxf lxfVar) {
        this.a = lxfVar;
    }

    @Override // defpackage.wo, defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        lxf lxfVar = this.a;
        if (recyclerView == lxfVar.b && lxfVar.e != null) {
            Rect rect = new Rect();
            this.a.e.b.getGlobalVisibleRect(rect);
            if (rect.contains((int) (motionEvent.getRawX() + 0.5f), (int) (motionEvent.getRawY() + 0.5f))) {
                return false;
            }
            lxm lxmVar = this.a.e;
            lxmVar.c.clearFocus();
            whu.C(lxmVar.c);
            if (lxmVar.g.length() == 0 && lxmVar.i && !lxmVar.f) {
                lxmVar.f();
            }
            this.a.d();
        }
        return false;
    }
}
