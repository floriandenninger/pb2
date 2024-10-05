package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fpl extends ImageView implements View.OnTouchListener {
    public int a;
    public boolean b;
    public float c;
    boolean d;
    final PointF e;
    Dialog f;
    public ImageView g;
    public sxc h;
    public sww i;
    public awnw j;
    public awnw k;
    public boolean l;
    public boolean m;
    public boolean n;
    public afri o;
    public szn p;
    public byte[] q;
    public int r;
    public int s;
    public int t;
    private final ScaleGestureDetector u;
    private PointF v;
    private final int[] w;
    private final int[] x;

    public fpl(Context context) {
        super(context);
        this.l = true;
        this.m = false;
        this.a = 0;
        this.r = 1;
        this.b = false;
        getContext().registerReceiver(new fpk(this, this), new IntentFilter("android.intent.action.SCREEN_OFF"));
        this.u = new ScaleGestureDetector(getContext(), new fpj(this));
        setOnTouchListener(this);
        this.w = new int[2];
        this.x = new int[2];
        this.e = new PointF(0.0f, 0.0f);
        this.v = new PointF(0.0f, 0.0f);
        this.s = 1;
        this.t = 1;
    }

    private static PointF d(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    public final ImageView a() {
        ImageView imageView = new ImageView(getContext());
        imageView.setMaxWidth(getWidth());
        imageView.setMinimumWidth(getWidth());
        imageView.setMinimumHeight(getHeight());
        imageView.setMaxHeight(getHeight());
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.m = true;
    }

    public final void c(View view) {
        if (this.g != null && view != null) {
            view.getLocationInWindow(new int[2]);
            ArrayList arrayList = new ArrayList();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, "scaleX", 1.0f);
            ofFloat.setDuration(200L);
            arrayList.add(ofFloat);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.g, "scaleY", 1.0f);
            ofFloat2.setDuration(200L);
            arrayList.add(ofFloat2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.g, "translationX", r0[0]);
            ofFloat3.setDuration(200L);
            arrayList.add(ofFloat3);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.g, "translationY", r0[1]);
            ofFloat4.setDuration(200L);
            arrayList.add(ofFloat4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new fpi(this));
            animatorSet.start();
        }
        PointF pointF = this.e;
        if (pointF != null) {
            pointF.x = 0.0f;
            this.e.y = 0.0f;
        }
        this.d = false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.u.onTouchEvent(motionEvent);
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount >= 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        view.getLocationInWindow(this.w);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            PointF d = d(motionEvent);
            this.v = d;
            this.x[0] = (view.getWidth() / 2) - ((int) d.x);
            this.x[1] = (view.getHeight() / 2) - ((int) d.y);
        } else if (actionMasked == 1) {
            if (this.l) {
                int i = this.t;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    ObjectAnimator.ofFloat(this, "translationX", 0.0f, 8.0f, -8.0f, 8.0f, -8.0f, 0.0f).setDuration(250L).start();
                } else if (i2 == 2) {
                    boolean isHapticFeedbackEnabled = isHapticFeedbackEnabled();
                    if (!isHapticFeedbackEnabled) {
                        setHapticFeedbackEnabled(true);
                    }
                    performHapticFeedback(0);
                    if (!isHapticFeedbackEnabled) {
                        setHapticFeedbackEnabled(false);
                    }
                }
                if (this.i != null && this.k != null) {
                    sws a = swu.a();
                    sxc sxcVar = this.h;
                    if (sxcVar != null) {
                        a.f = sxcVar.r;
                    }
                    this.i.b(this.k, a.a()).Q();
                }
            }
            if (!this.l && pointerCount == 1) {
                this.l = true;
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (actionMasked == 2 && pointerCount > 1) {
            PointF d2 = d(motionEvent);
            float f = d2.x - this.v.x;
            float f2 = d2.y - this.v.y;
            if (this.d) {
                this.e.offset(f, f2);
            }
            this.v = d2;
        }
        if (!this.d) {
            return true;
        }
        if (this.g != null) {
            int[] iArr = this.w;
            iArr[0] = iArr[0] + ((int) this.e.x) + ((int) ((this.c - 1.0f) * this.x[0]));
            int[] iArr2 = this.w;
            iArr2[1] = iArr2[1] + ((int) this.e.y) + ((int) ((this.c - 1.0f) * this.x[1]));
            this.g.setX(this.w[0]);
            this.g.setY(this.w[1]);
            this.g.setScaleX(this.c);
            this.g.setScaleY(this.c);
        }
        if (pointerCount == 1) {
            c(view);
        }
        invalidate();
        return true;
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new BitmapDrawable(getResources(), bitmap));
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setImageDrawable(null);
            return;
        }
        setScaleType(ahbn.o(this.r));
        drawable.setAutoMirrored(this.b);
        if (this.a != 0) {
            drawable.mutate().setColorFilter(this.a, PorterDuff.Mode.SRC_IN);
        }
        super.setImageDrawable(drawable);
    }
}
