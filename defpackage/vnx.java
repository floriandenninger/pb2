package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vnx extends AnimatorListenerAdapter {
    final /* synthetic */ Matrix a;
    final /* synthetic */ EditablePhotoView b;

    public vnx(EditablePhotoView editablePhotoView, Matrix matrix) {
        this.b = editablePhotoView;
        this.a = matrix;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.postRotate(-90.0f, this.b.c.centerX(), this.b.c.centerY());
        this.b.b.set(this.a);
        EditablePhotoView editablePhotoView = this.b;
        voe voeVar = editablePhotoView.q;
        voeVar.a -= 90.0f;
        editablePhotoView.invalidate();
        this.b.g();
    }
}
