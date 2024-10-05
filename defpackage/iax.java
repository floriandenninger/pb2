package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iax implements Animator.AnimatorListener {
    static final long a = TimeUnit.SECONDS.toMillis(5);
    public final int b;
    public final float c;
    public final int d;
    public ce e;
    public TextView f;
    final float g;
    private final Handler h;
    private final int i;
    private final Runnable j = new iav(this, 1);

    public iax(Context context, Handler handler) {
        this.h = handler;
        Resources resources = context.getResources();
        this.b = resources.getDisplayMetrics().heightPixels;
        this.i = resources.getDisplayMetrics().widthPixels;
        this.c = resources.getDimension(R.dimen.comment_sticker_container_bottom_margin);
        this.g = resources.getDimension(R.dimen.reel_edit_video_tap_for_more_static_sticker_margin);
        this.d = resources.getColor(R.color.add_text_shadow_color);
    }

    public final void a() {
        this.h.post(new iav(this, 0));
    }

    public final void b(int i) {
        TextView textView = this.f;
        textView.setShadowLayer(textView.getShadowRadius(), this.f.getShadowDx(), this.f.getShadowDy(), i);
    }

    public final void c(final int i) {
        this.h.post(new Runnable() { // from class: iaw
            @Override // java.lang.Runnable
            public final void run() {
                iax iaxVar = iax.this;
                int i2 = i;
                if (etx.S(iaxVar.e)) {
                    iaxVar.f.setAlpha(1.0f);
                    iaxVar.f.setVisibility(0);
                    iaxVar.b(iaxVar.d);
                    yny.A(iaxVar.f, new ejz(12), yny.h(yny.y(-1, -2), yny.v(i2 - iaxVar.f.getMeasuredHeight())), FrameLayout.LayoutParams.class);
                }
            }
        });
        this.h.removeCallbacks(this.j);
        this.h.postDelayed(this.j, a);
    }

    public final void d(axdl axdlVar) {
        axdj axdjVar = (axdj) axdlVar;
        c(Math.round((this.b / 2.0f) - Math.min(((axdk) axdjVar.instance).a(), (((axdk) axdjVar.instance).a() / ((axdk) axdjVar.instance).c()) * (this.i / 2.0f))));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
