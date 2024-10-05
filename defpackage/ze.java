package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ze implements wh {
    final /* synthetic */ zn a;

    public ze(zn znVar) {
        this.a = znVar;
    }

    @Override // defpackage.wh
    public final void h(boolean z) {
        if (z) {
            this.a.n(null, 0);
        }
    }

    @Override // defpackage.wh
    public final boolean n(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.q.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        zl zlVar = null;
        if (actionMasked == 0) {
            this.a.i = motionEvent.getPointerId(0);
            this.a.c = motionEvent.getX();
            this.a.d = motionEvent.getY();
            this.a.l();
            zn znVar = this.a;
            if (znVar.b == null) {
                if (!znVar.l.isEmpty()) {
                    View h = znVar.h(motionEvent);
                    int size = znVar.l.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        zl zlVar2 = (zl) znVar.l.get(size);
                        if (zlVar2.h.a == h) {
                            zlVar = zlVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (zlVar != null) {
                    zn znVar2 = this.a;
                    znVar2.c -= zlVar.l;
                    znVar2.d -= zlVar.m;
                    znVar2.j(zlVar.h, true);
                    if (this.a.a.remove(zlVar.h.a)) {
                        zn znVar3 = this.a;
                        znVar3.j.f(znVar3.m, zlVar.h);
                    }
                    this.a.n(zlVar.h, zlVar.i);
                    zn znVar4 = this.a;
                    znVar4.o(motionEvent, znVar4.k, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            zn znVar5 = this.a;
            znVar5.i = -1;
            znVar5.n(null, 0);
        } else {
            int i = this.a.i;
            if (i != -1 && motionEvent.findPointerIndex(i) >= 0) {
                this.a.p(actionMasked);
            }
        }
        VelocityTracker velocityTracker = this.a.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.a.b != null;
    }

    @Override // defpackage.wh
    public final void o(MotionEvent motionEvent) {
        this.a.q.a(motionEvent);
        VelocityTracker velocityTracker = this.a.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.a.i == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(this.a.i);
        if (findPointerIndex >= 0) {
            this.a.p(actionMasked);
        }
        zn znVar = this.a;
        wv wvVar = znVar.b;
        if (wvVar == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    znVar.o(motionEvent, znVar.k, findPointerIndex);
                    this.a.k(wvVar);
                    zn znVar2 = this.a;
                    znVar2.m.removeCallbacks(znVar2.n);
                    this.a.n.run();
                    this.a.m.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                zn znVar3 = this.a;
                if (pointerId == znVar3.i) {
                    znVar3.i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    zn znVar4 = this.a;
                    znVar4.o(motionEvent, znVar4.k, actionIndex);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = znVar.o;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        this.a.n(null, 0);
        this.a.i = -1;
    }
}
