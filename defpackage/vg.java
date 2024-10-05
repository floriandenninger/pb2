package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vg implements View.OnTouchListener {
    final /* synthetic */ vh a;

    public vg(vh vhVar) {
        this.a = vhVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            vh vhVar = this.a;
            vhVar.n.removeCallbacks(vhVar.q);
            return false;
        }
        PopupWindow popupWindow = this.a.p;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.a.p.getWidth() || y < 0 || y >= this.a.p.getHeight()) {
            return false;
        }
        vh vhVar2 = this.a;
        vhVar2.n.postDelayed(vhVar2.q, 250L);
        return false;
    }
}
