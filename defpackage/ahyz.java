package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahyz extends aivc implements ahza {
    public boolean a;
    public boolean b;
    public long c;
    private final Handler d;
    private final boolean e;
    private View f;
    private TextView g;
    private boolean h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private final Runnable m;

    public ahyz(Context context) {
        this(context, false);
    }

    private final void j() {
        if (this.f == null || this.g == null) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.j = yjk.I(displayMetrics, -24.0f);
            this.k = yjk.I(displayMetrics, -48.0f);
            this.l = yjk.I(displayMetrics, -16.0f);
            LayoutInflater from = LayoutInflater.from(getContext());
            if (this.e) {
                this.f = from.inflate(R.layout.tappable_paid_content_overlay, this);
            } else {
                this.f = from.inflate(R.layout.paid_content_overlay, this);
            }
            this.g = (TextView) this.f.findViewById(R.id.paid_content_text);
        }
    }

    private final void k() {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        View view = this.f;
        if (view == null || this.g == null || !this.e) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.paid_content_container);
        View findViewById = this.f.findViewById(R.id.paid_content_icon);
        View findViewById2 = this.f.findViewById(R.id.paid_content_arrow);
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            findViewById.setRotationY(180.0f);
            findViewById2.setRotationY(180.0f);
        } else {
            findViewById.setRotationY(0.0f);
            findViewById2.setRotationY(0.0f);
        }
        Resources resources = getResources();
        if (this.h) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.paid_content_text_max_width_landscape);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.paid_content_text_max_width_portrait);
        }
        if (this.h) {
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.paid_content_margin_landscape);
        } else {
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.paid_content_margin_portrait);
        }
        if (this.h) {
            dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.paid_content_padding_top_bottom_landscape);
        } else {
            dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.paid_content_padding_top_bottom_portrait);
        }
        int i = true != this.h ? R.style.TextAppearance_YouTube_Spec_Body1a : R.style.TextAppearance_YouTube_Spec_Title1;
        this.g.setMaxWidth(dimensionPixelSize);
        jm.s(this.g, i);
        this.g.setTextColor(aih.d(getContext(), R.color.yt_white1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize2, 0, 0);
        constraintLayout.setLayoutParams(layoutParams);
        constraintLayout.setPadding(0, dimensionPixelSize3, 0, dimensionPixelSize3);
    }

    @Override // defpackage.ahza
    public final void a(boolean z) {
        if (this.f == null || this.g == null || !this.i) {
            return;
        }
        this.i = false;
        this.d.removeCallbacks(this.m);
        if (!z) {
            this.f.clearAnimation();
            setVisibility(8);
            return;
        }
        ka q = jw.q(this.f);
        q.c(0.0f);
        q.e(new DecelerateInterpolator());
        q.d(250L);
        q.k(new ahyx(this, 1));
        q.b();
    }

    @Override // defpackage.ahza
    public final void b(boolean z) {
        this.a = z;
        if (this.i) {
            i(z, !z);
        }
        k();
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new aivh(-1, -1, true);
    }

    @Override // defpackage.ahza
    public final void d(boolean z) {
        this.h = z;
        if (this.i) {
            i(this.a, false);
            k();
        }
    }

    @Override // defpackage.ahza
    public final void e(int i) {
        j();
        ImageView imageView = (ImageView) this.f.findViewById(R.id.paid_content_icon);
        if (imageView != null) {
            if (i != 0) {
                imageView.setImageDrawable(aii.a(getContext(), i));
                imageView.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                imageView.setVisibility(8);
            }
            k();
        }
    }

    @Override // defpackage.ahza
    public final void f(View.OnClickListener onClickListener) {
        j();
        View findViewById = this.f.findViewById(R.id.paid_content_tap_area);
        if (findViewById != null) {
            findViewById.setOnClickListener(onClickListener);
        }
        View findViewById2 = this.f.findViewById(R.id.paid_content_arrow);
        if (findViewById2 != null) {
            if (onClickListener != null) {
                findViewById2.setVisibility(0);
            } else {
                findViewById2.setVisibility(8);
            }
        }
        k();
    }

    @Override // defpackage.ahza
    public final void g(CharSequence charSequence) {
        j();
        this.g.setText(charSequence);
        View findViewById = this.f.findViewById(R.id.paid_content_tap_area);
        if (charSequence != null && findViewById != null) {
            findViewById.setContentDescription(charSequence);
        }
        k();
    }

    @Override // defpackage.ahza
    public final void h() {
        if (this.f == null || this.g == null || this.c == 0) {
            return;
        }
        this.i = true;
        setVisibility(0);
        this.f.clearAnimation();
        this.f.setAlpha(0.0f);
        ka q = jw.q(this.f);
        q.c(1.0f);
        q.e(new DecelerateInterpolator());
        q.d(250L);
        q.b();
        Context context = getContext();
        TextView textView = this.g;
        zev.c(context, textView, textView.getText());
        addOnLayoutChangeListener(new ahyy(this));
        this.d.postDelayed(this.m, this.c);
    }

    public final void i(boolean z, boolean z2) {
        if (this.f == null || this.g == null || this.e) {
            return;
        }
        float f = this.h ? this.k : this.j;
        float height = getHeight() - this.f.getHeight();
        if (true != z) {
            f = 0.0f;
        }
        float f2 = height + f + this.l;
        if (z2) {
            this.b = true;
            ka q = jw.q(this.f);
            q.e(new DecelerateInterpolator());
            q.d(150L);
            View view = (View) q.a.get();
            if (view != null) {
                view.animate().y(f2);
            }
            q.k(new ahyx(this, 2));
            q.b();
            return;
        }
        if (this.b) {
            jw.q(this.f).a();
            this.b = false;
        }
        this.f.setY(f2);
    }

    @Override // defpackage.ahza
    public final void rQ(long j) {
        this.c = j;
    }

    public ahyz(Context context, boolean z) {
        super(context);
        this.h = false;
        this.i = false;
        this.a = false;
        this.b = false;
        this.m = new ahyx(this, 0);
        this.e = z;
        setBackgroundColor(0);
        setVisibility(8);
        setFocusable(false);
        setFocusableInTouchMode(false);
        jw.V(this, 2);
        this.d = new Handler(context.getMainLooper());
    }
}
