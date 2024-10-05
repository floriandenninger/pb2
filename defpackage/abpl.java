package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatPopUpItemContainerLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abpl implements Runnable {
    public final /* synthetic */ abpo a;
    private final /* synthetic */ int b;

    public /* synthetic */ abpl(abpo abpoVar, int i) {
        this.b = i;
        this.a = abpoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            abpo abpoVar = this.a;
            abpoVar.p = ObjectAnimator.ofFloat(abpoVar.j, (Property<LiveChatPopUpItemContainerLayout, Float>) View.TRANSLATION_Y, abpoVar.j.getHeight(), 0.0f);
            abpoVar.p.setDuration(300L);
            abpoVar.p.setInterpolator(new DecelerateInterpolator());
            abpoVar.p.addListener(new abpn(abpoVar));
            float height = abpoVar.m.getHeight();
            float height2 = height - abpoVar.j.getHeight();
            float f = height * 0.3f;
            if (height2 < f) {
                abpoVar.j.a(-((int) (f - height2)));
            } else {
                abpoVar.j.a(0);
            }
            abpoVar.p.start();
            return;
        }
        abpo abpoVar2 = this.a;
        if (abpoVar2.r) {
            abpoVar2.r = false;
            return;
        }
        for (abph abphVar : abpoVar2.f) {
            abphVar.e.setVisibility(8);
            abphVar.f.setVisibility(0);
        }
    }
}
