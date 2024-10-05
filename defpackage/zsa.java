package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zsa {
    private final zqc a;
    private final int[] c = new int[2];
    private final Rect b = new Rect();

    public zsa(zqc zqcVar) {
        this.a = zqcVar;
    }

    public final void a(View view, MotionEvent motionEvent, View view2, boolean z) {
        boolean z2;
        zqb zqbVar;
        int i = 0;
        if (motionEvent.getPointerCount() == 1 && view2.getVisibility() == 0) {
            view2.getGlobalVisibleRect(this.b);
            view2.getLocationOnScreen(this.c);
            Rect rect = this.b;
            int[] iArr = this.c;
            rect.offsetTo(iArr[0], iArr[1]);
            view.getLocationOnScreen(this.c);
            z2 = this.b.contains(((int) motionEvent.getX(0)) + this.c[0], ((int) motionEvent.getY(0)) + this.c[1]);
        } else {
            z2 = false;
        }
        zqc zqcVar = this.a;
        int width = view.getWidth();
        int height = view.getHeight();
        if (motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 1) {
            int actionIndex = (motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0) ? motionEvent.getActionIndex() : -1;
            while (i < motionEvent.getPointerCount()) {
                axea a = axeb.a();
                int pointerId = motionEvent.getPointerId(i);
                a.copyOnWrite();
                axeb.e((axeb) a.instance, pointerId);
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                zqc zqcVar2 = zqcVar;
                double max = Math.max(0.0d, Math.min(x / width, 1.0d));
                double max2 = Math.max(0.0d, Math.min(y / height, 1.0d));
                aone createBuilder = aorp.a.createBuilder();
                createBuilder.copyOnWrite();
                aorp aorpVar = (aorp) createBuilder.instance;
                aorpVar.b |= 1;
                aorpVar.c = max;
                createBuilder.copyOnWrite();
                aorp aorpVar2 = (aorp) createBuilder.instance;
                aorpVar2.b |= 2;
                aorpVar2.d = max2;
                aorp aorpVar3 = (aorp) createBuilder.build();
                a.copyOnWrite();
                axeb.f((axeb) a.instance, aorpVar3);
                if (actionIndex == -1) {
                    axec axecVar = axec.MOVE;
                    a.copyOnWrite();
                    axeb.c((axeb) a.instance, axecVar);
                } else if (i == actionIndex) {
                    if (motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0) {
                        axec axecVar2 = axec.START;
                        a.copyOnWrite();
                        axeb.c((axeb) a.instance, axecVar2);
                    } else {
                        axec axecVar3 = axec.END;
                        a.copyOnWrite();
                        axeb.c((axeb) a.instance, axecVar3);
                    }
                } else {
                    axec axecVar4 = axec.MOVE;
                    a.copyOnWrite();
                    axeb.c((axeb) a.instance, axecVar4);
                }
                if (motionEvent.getPointerCount() == 1) {
                    a.copyOnWrite();
                    axeb.d((axeb) a.instance, z2);
                }
                axcl a2 = axcq.a();
                a2.copyOnWrite();
                ((axcq) a2.instance).B((axeb) a.build());
                zqcVar2.a.add((axcq) a2.build());
                if (z && (zqbVar = zqcVar2.c) != null) {
                    zqbVar.b();
                }
                i++;
                zqcVar = zqcVar2;
            }
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Can't handle touch event: ");
        sb.append(actionMasked);
        zga.l(sb.toString());
    }
}
