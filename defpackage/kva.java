package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kva {
    public final Context a;
    public boolean b;
    public View c;
    public View d;
    public TextView e;
    public Animator.AnimatorListener f;
    public Animator.AnimatorListener g;
    public akcv h;
    private final ViewStub i;
    private final SparseArray j = new SparseArray();
    private final Map k = new HashMap();

    public kva(Context context, ViewStub viewStub) {
        this.a = context;
        this.i = viewStub;
    }

    public final void a(View view, int i, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        if (this.j.get(i) == null) {
            this.j.put(i, AnimatorInflater.loadAnimator(this.a, i));
        }
        Animator animator = (Animator) this.j.get(i);
        b(view);
        this.k.put(view, animator);
        animator.setTarget(view);
        animator.removeAllListeners();
        if (animatorListener != null) {
            animator.addListener(animatorListener);
        }
        animator.start();
    }

    public final void b(View view) {
        if (!this.k.containsKey(view) || this.k.get(view) == null) {
            return;
        }
        Animator animator = (Animator) this.k.get(view);
        animator.removeAllListeners();
        animator.cancel();
    }

    public final void c() {
        if (this.b) {
            a(this.d, R.animator.video_zoom_snap_threshold_indicator_hide, null);
            TextView textView = this.e;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public final void d() {
        if (this.b) {
            return;
        }
        View inflate = this.i.inflate();
        this.c = inflate;
        this.d = inflate.findViewById(R.id.video_zoom_snap_indicator);
        this.e = (TextView) this.c.findViewById(R.id.video_zoom_title);
        this.f = new kuy(this);
        this.g = new kuz(this);
        jw.V(this.e, 1);
        this.b = true;
    }
}
