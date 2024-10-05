package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* compiled from: PG */
/* loaded from: classes.dex */
final class allc implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            allk allkVar = (allk) message.obj;
            int i2 = message.arg1;
            if (!allkVar.k() || allkVar.f.getVisibility() != 0) {
                allkVar.f(i2);
            } else if (allkVar.f.a == 1) {
                ValueAnimator c = allkVar.c(1.0f, 0.0f);
                c.setDuration(75L);
                c.addListener(new alky(allkVar, i2));
                c.start();
            } else {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(0, allkVar.b());
                valueAnimator.setInterpolator(aleq.b);
                valueAnimator.setDuration(250L);
                valueAnimator.addListener(new allb(allkVar, i2));
                valueAnimator.addUpdateListener(new alkz(allkVar, 3));
                valueAnimator.start();
            }
            return true;
        }
        allk allkVar2 = (allk) message.obj;
        allkVar2.f.d = new allg(allkVar2);
        if (allkVar2.f.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = allkVar2.f.getLayoutParams();
            if (layoutParams instanceof ahh) {
                ahh ahhVar = (ahh) layoutParams;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = allkVar2.n;
                if (baseTransientBottomBar$Behavior == null) {
                    baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                }
                baseTransientBottomBar$Behavior.k.a = allkVar2.o;
                baseTransientBottomBar$Behavior.y(new allg(allkVar2));
                ahhVar.b(baseTransientBottomBar$Behavior);
                ahhVar.g = 80;
            }
            allkVar2.j();
            allkVar2.f.setVisibility(4);
            allkVar2.d.addView(allkVar2.f);
        }
        if (jw.al(allkVar2.f)) {
            allkVar2.i();
        } else {
            allkVar2.f.c = new allg(allkVar2);
        }
        return true;
    }
}
