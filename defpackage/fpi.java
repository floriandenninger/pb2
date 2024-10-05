package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fpi extends AnimatorListenerAdapter {
    final /* synthetic */ fpl a;

    public fpi(fpl fplVar) {
        this.a = fplVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte[] bArr;
        super.onAnimationEnd(animator);
        fpl fplVar = this.a;
        fplVar.c = 1.0f;
        afri afriVar = fplVar.o;
        if (afriVar != null && (bArr = fplVar.q) != null && fplVar.p != null) {
            try {
                Drawable drawable = (Drawable) afriVar.b(bArr);
                if (drawable instanceof FrameSequenceDrawable) {
                    fplVar.setImageDrawable(drawable);
                    fplVar.p.b((FrameSequenceDrawable) drawable);
                    fplVar.p.c();
                }
            } catch (IOException | zjg e) {
                Log.e("ImageZoomView", "Failed converting bytes to drawable", e);
            }
        }
        Dialog dialog = this.a.f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
