package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tt implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ ub b;
    private final /* synthetic */ int c;

    public tt(ub ubVar, ArrayList arrayList, int i) {
        this.c = i;
        this.b = ubVar;
        this.a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        int i2 = 0;
        if (i == 0) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            while (i2 < size) {
                tz tzVar = (tz) arrayList.get(i2);
                ub ubVar = this.b;
                wv wvVar = tzVar.a;
                View view = wvVar == null ? null : wvVar.a;
                wv wvVar2 = tzVar.b;
                View view2 = wvVar2 != null ? wvVar2.a : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(250L);
                    ubVar.g.add(tzVar.a);
                    duration.translationX(tzVar.e - tzVar.c);
                    duration.translationY(tzVar.f - tzVar.d);
                    duration.alpha(0.0f).setListener(new tx(ubVar, tzVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    ubVar.g.add(tzVar.b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new ty(ubVar, tzVar, animate, view2)).start();
                }
                i2++;
            }
            this.a.clear();
            this.b.c.remove(this.a);
            return;
        }
        if (i == 1) {
            ArrayList arrayList2 = this.a;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                ua uaVar = (ua) arrayList2.get(i2);
                ub ubVar2 = this.b;
                wv wvVar3 = uaVar.a;
                int i3 = uaVar.b;
                int i4 = uaVar.c;
                int i5 = uaVar.d;
                int i6 = uaVar.e;
                View view3 = wvVar3.a;
                int i7 = i5 - i3;
                int i8 = i6 - i4;
                if (i7 != 0) {
                    view3.animate().translationX(0.0f);
                }
                if (i8 != 0) {
                    view3.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate2 = view3.animate();
                ubVar2.e.add(wvVar3);
                animate2.setDuration(ubVar2.i).setListener(new tw(ubVar2, wvVar3, i7, view3, i8, animate2)).start();
                i2++;
            }
            this.a.clear();
            this.b.b.remove(this.a);
            return;
        }
        ArrayList arrayList3 = this.a;
        int size3 = arrayList3.size();
        while (i2 < size3) {
            wv wvVar4 = (wv) arrayList3.get(i2);
            ub ubVar3 = this.b;
            View view4 = wvVar4.a;
            ViewPropertyAnimator animate3 = view4.animate();
            ubVar3.d.add(wvVar4);
            animate3.alpha(1.0f).setDuration(ubVar3.h).setListener(new tv(ubVar3, wvVar4, view4, animate3)).start();
            i2++;
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
