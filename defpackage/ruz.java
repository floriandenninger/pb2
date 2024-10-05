package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ruz implements View.OnHoverListener {
    final /* synthetic */ rvd a;

    public ruz(rvd rvdVar) {
        this.a = rvdVar;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = -4;
        if (action != 7) {
            if (action == 9) {
                rvd rvdVar = this.a;
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(32768);
                obtain.setEnabled(true);
                rvdVar.b.onPopulateAccessibilityEvent(obtain);
                obtain.setPackageName(rvdVar.b.getContext().getPackageName());
                obtain.setSource(rvdVar.b);
                rvdVar.b.getParent().requestSendAccessibilityEvent(rvdVar.b, obtain);
                if (rvdVar.h == rvc.EXPLORE) {
                    rvdVar.b.removeCallbacks(rvdVar.a);
                }
                return true;
            }
            if (action != 10) {
                return false;
            }
            rvd rvdVar2 = this.a;
            if (rvdVar2.h != rvc.EXPLORE) {
                return false;
            }
            int i3 = rvdVar2.k;
            if (i3 != -1 && i3 != -4) {
                rvdVar2.a(65536, i3);
                rvdVar2.k = -4;
                rvdVar2.a(32768, -4);
            }
            rvdVar2.b.postDelayed(rvdVar2.a, rvdVar2.d);
            return true;
        }
        rvd rvdVar3 = this.a;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (rvdVar3.h == rvc.EXPLORE) {
            if (x > rvdVar3.g) {
                int width = rvdVar3.b.getWidth();
                float f = rvdVar3.g;
                if (x < width - f && y > f && y < rvdVar3.b.getHeight() - rvdVar3.g) {
                    Iterator it = rvdVar3.c.iterator();
                    rvn rvnVar = null;
                    float f2 = Float.MAX_VALUE;
                    int i4 = -1;
                    int i5 = 0;
                    while (it.hasNext()) {
                        rvn f3 = ((rvp) it.next()).f(x, y);
                        if (f3 != null) {
                            float f4 = f3.b;
                            if (f4 < f2) {
                                i4 = i5;
                                rvnVar = f3;
                                f2 = f4;
                            }
                        }
                        i5++;
                    }
                    i2 = rvnVar == null ? -1 : rvd.f(i4, ((Integer) rvnVar.c.c.get(rvnVar.a)).intValue());
                }
            }
            if (i2 != -1 && i2 != (i = rvdVar3.k)) {
                rvdVar3.a(65536, i);
                rvdVar3.k = i2;
                rvdVar3.a(32768, i2);
                return true;
            }
        }
        return false;
    }
}
