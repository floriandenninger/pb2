package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
class ggw {
    public static final int[] a = {R.string.accessibility_like_video, R.string.accessibility_undo_like_video, R.plurals.accessibility_like_video_plural, R.plurals.accessibility_undo_like_video_plural};
    public static final int[] b = {R.string.accessibility_dislike_video, R.string.accessibility_undo_dislike_video, R.plurals.accessibility_dislike_video_plural, R.plurals.accessibility_undo_dislike_video_plural};
    protected final boolean c;
    protected final View d;

    public ggw(View view, boolean z) {
        this.d = view;
        this.c = z;
    }

    public final void a(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
    }

    public void b(boolean z) {
        this.d.setEnabled(z);
        this.d.setAlpha(true != z ? 0.2f : 1.0f);
    }

    public final void c(int i) {
        this.d.setVisibility(i);
    }

    public final boolean d(asno asnoVar) {
        return (!this.c && asnoVar == asno.LIKE) || (this.c && asnoVar == asno.DISLIKE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(asno asnoVar, aong aongVar) {
        if (aongVar != null) {
            if (!aongVar.pY(asnh.b) || !((Boolean) aongVar.pX(asnh.b)).booleanValue()) {
                aongVar.e(asnh.b, true);
            }
            aongVar.e(asnh.c, asnoVar);
        }
        asno asnoVar2 = asno.LIKE;
        int ordinal = asnoVar.ordinal();
        if (ordinal == 0) {
            this.d.setSelected(!this.c);
        } else if (ordinal == 1) {
            this.d.setSelected(this.c);
        } else {
            if (ordinal != 2) {
                return;
            }
            this.d.setSelected(false);
        }
    }
}
