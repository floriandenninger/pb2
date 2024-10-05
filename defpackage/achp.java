package defpackage;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class achp implements View.OnTouchListener {
    final /* synthetic */ ScaleGestureDetector a;
    final /* synthetic */ acht b;

    public achp(acht achtVar, ScaleGestureDetector scaleGestureDetector) {
        this.b = achtVar;
        this.a = scaleGestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 5) {
            if (motionEvent.getPointerCount() >= 2) {
                this.b.ap = true;
            }
            action = 5;
        }
        if (action == 0) {
            this.b.aq = true;
        }
        if (action == 2) {
            if ((motionEvent.getHistorySize() == 0 ? 0.0f : (float) Math.hypot(motionEvent.getX() - motionEvent.getHistoricalX(0), motionEvent.getY() - motionEvent.getHistoricalY(0))) > 20.0f) {
                this.b.aq = false;
            }
        }
        if (action == 1) {
            acht achtVar = this.b;
            if (achtVar.ap || !achtVar.aq) {
                if (motionEvent.getPointerCount() < 2) {
                    this.b.ap = false;
                }
                view.performClick();
            } else {
                achtVar.aq = false;
                achq achqVar = achtVar.aj;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                acif acifVar = (acif) achqVar;
                if (acifVar.aK.i().B) {
                    acifVar.e.aM(x, y, new achy(acifVar));
                }
                return true;
            }
        }
        if (this.b.ap && action == 2) {
            return this.a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
