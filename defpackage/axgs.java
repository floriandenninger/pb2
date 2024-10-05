package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgs extends FrameLayout implements View.OnTouchListener {
    public int a;
    public boolean b;
    public Runnable c;
    public Runnable d;
    private OrientationEventListener e;
    private ImageButton f;

    public axgs(Context context) {
        super(context);
        this.a = -1;
        setOnTouchListener(this);
        setBackground(new ColorDrawable(-12232092));
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(R.layout.transition_view, (ViewGroup) this, true);
        findViewById(R.id.transition_switch_action).setOnClickListener(new axgp(this, 1));
        ((ImageView) findViewById(R.id.transition_icon)).setOnClickListener(new axgp(this, 0));
        h();
        if (getResources().getConfiguration().orientation == 2) {
            findViewById(R.id.transition_bottom_frame).setVisibility(8);
        }
        super.setVisibility(8);
    }

    public static boolean d(int i) {
        return Math.abs(i + (-270)) < 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(boolean z) {
        g();
        Animation animation = getAnimation();
        if (animation != null) {
            if (z || animation.getStartOffset() == 0) {
                return;
            }
            animation.setAnimationListener(null);
            clearAnimation();
            z = false;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setDuration(500L);
        if (z) {
            alphaAnimation.setStartOffset(2000L);
        }
        alphaAnimation.setAnimationListener(new axgr(this));
        startAnimation(alphaAnimation);
    }

    private final void g() {
        OrientationEventListener orientationEventListener = this.e;
        if (orientationEventListener == null) {
            return;
        }
        this.a = -1;
        orientationEventListener.disable();
        this.e = null;
    }

    private final void h() {
        ImageButton imageButton = (ImageButton) ((ViewGroup) findViewById(R.id.transition_frame)).findViewById(R.id.back_button);
        this.f = imageButton;
        Runnable runnable = this.d;
        if (runnable == null) {
            imageButton.setVisibility(8);
            this.f.setTag(null);
            this.f.setOnClickListener(null);
        } else {
            imageButton.setTag(runnable);
            this.f.setVisibility(0);
            this.f.setOnClickListener(new axgp(this, 2));
        }
    }

    public final void a() {
        if (getWidth() <= 0 || getHeight() <= 0 || this.a == -1 || this.e == null || this.b) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        boolean z = width < height;
        int abs = Math.abs(this.a + NetError.ERR_TLS13_DOWNGRADE_DETECTED);
        if (z != (abs > 135)) {
            View findViewById = findViewById(R.id.transition_frame);
            int width2 = findViewById.getWidth();
            int height2 = findViewById.getHeight();
            if (getLayoutDirection() == 1) {
                findViewById.setPivotX(height2 - findViewById.getPivotX());
                findViewById.setPivotY(width2 - findViewById.getPivotY());
            }
            if (width < height) {
                findViewById.setRotation(90.0f);
            } else {
                findViewById.setRotation(-90.0f);
            }
            findViewById.setTranslationX((width2 - height2) / 2);
            findViewById.setTranslationY((height2 - width2) / 2);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = width2;
            layoutParams.width = height2;
            findViewById.requestLayout();
        }
        if (abs <= 135) {
            findViewById(R.id.transition_bottom_frame).setVisibility(8);
        } else {
            findViewById(R.id.transition_bottom_frame).setVisibility(0);
        }
        this.b = true;
        if (d(this.a)) {
            f(true);
        }
    }

    public final void b(Runnable runnable) {
        this.d = runnable;
        h();
    }

    public final void c(String str) {
        TextView textView = (TextView) findViewById(R.id.transition_text);
        if (str != null) {
            textView.setText(getContext().getString(R.string.place_your_viewer_into_viewer_format, str));
        } else {
            textView.setText(getContext().getString(R.string.place_your_phone_into_cardboard));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OrientationEventListener orientationEventListener = this.e;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        OrientationEventListener orientationEventListener = this.e;
        if (orientationEventListener != null) {
            this.a = -1;
            orientationEventListener.disable();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (visibility != i) {
            if (i != 0) {
                g();
            } else {
                if (this.e != null) {
                    return;
                }
                axgq axgqVar = new axgq(this, getContext());
                this.e = axgqVar;
                axgqVar.enable();
            }
        }
    }
}
