package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hys extends bv implements DialogInterface.OnKeyListener, ian {
    public icq ae;
    public acqz af;
    public int ag;
    public boolean ah;
    protected final hyq ai = new hyq(this);
    private AnimatorSet aj;

    protected abstract View aF();

    protected abstract View aG();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aH(boolean z, Animator.AnimatorListener animatorListener) {
        ArrayList arrayList;
        AnimatorSet animatorSet = this.aj;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.aj.end();
        }
        float f = true != z ? 0.0f : 1.0f;
        int i = z ? 0 : this.ag;
        if (!this.ah) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(ObjectAnimator.ofFloat(aG(), (Property<View, Float>) View.ALPHA, f).setDuration(300L));
            arrayList2.add(ObjectAnimator.ofFloat(aF(), (Property<View, Float>) View.TRANSLATION_Y, i).setDuration(300L));
            arrayList2.add(ObjectAnimator.ofFloat(aF(), (Property<View, Float>) View.ALPHA, f).setDuration(300L));
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList();
            float f2 = i;
            arrayList.add(ObjectAnimator.ofFloat(aG(), (Property<View, Float>) View.TRANSLATION_Y, f2).setDuration(300L));
            arrayList.add(ObjectAnimator.ofFloat(aF(), (Property<View, Float>) View.TRANSLATION_Y, f2).setDuration(300L));
            arrayList.add(ObjectAnimator.ofFloat(aF(), (Property<View, Float>) View.TRANSLATION_Y, f2).setDuration(300L));
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        if (!z) {
            animatorSet2.addListener(new hyr(this));
        } else if (animatorListener != null) {
            animatorSet2.addListener(animatorListener);
        }
        animatorSet2.start();
        this.aj = animatorSet2;
        if (z) {
            this.ae.aR();
        } else {
            this.af.mM().t();
            this.ae.aQ();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aI() {
        aH(false, null);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, R.style.ReelTheme_StickerCatalog);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        aI();
        return true;
    }
}
