package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alhp {
    static final TimeInterpolator a = aleq.c;
    static final int[] b = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] c = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] d = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] e = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] f = {R.attr.state_enabled};
    static final int[] g = new int[0];
    private final alic A;
    public alkl h;
    public alkg i;
    public Drawable j;
    public algy k;
    public Drawable l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public int q;
    public Animator r;
    public alet s;
    public alet t;
    public int v;
    public final FloatingActionButton x;
    public ViewTreeObserver.OnPreDrawListener y;
    final alhe z;
    public float u = 1.0f;
    public int w = 0;
    private final Rect B = new Rect();
    private final RectF C = new RectF();
    private final RectF D = new RectF();
    private final Matrix E = new Matrix();

    public alhp(FloatingActionButton floatingActionButton, alhe alheVar) {
        this.x = floatingActionButton;
        this.z = alheVar;
        alic alicVar = new alic();
        this.A = alicVar;
        alicVar.a(o(new alhm(this)));
        alicVar.a(o(new alhl(this)));
        alicVar.a(o(new alhl(this)));
        alicVar.a(o(new alhl(this)));
        alicVar.a(o(new alhn(this)));
        alicVar.a(o(new alhk(this)));
        floatingActionButton.getRotation();
    }

    private static final ValueAnimator o(alho alhoVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(alhoVar);
        valueAnimator.addUpdateListener(alhoVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private static final void p(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new alhj());
    }

    public float a() {
        return this.n;
    }

    public final AnimatorSet b(alet aletVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.x, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        aletVar.b("opacity").b(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.x, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        aletVar.b("scale").b(ofFloat2);
        p(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.x, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        aletVar.b("scale").b(ofFloat3);
        p(ofFloat3);
        arrayList.add(ofFloat3);
        d(f4, this.E);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.x, new aler(), new alhh(this), new Matrix(this.E));
        aletVar.b("iconScale").b(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        akwg.v(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new alhi(this, this.x.getAlpha(), f2, this.x.getScaleX(), f3, this.x.getScaleY(), this.u, f4, new Matrix(this.E)));
        arrayList.add(ofFloat);
        akwg.v(animatorSet, arrayList);
        Context context = this.x.getContext();
        int integer = this.x.getContext().getResources().getInteger(com.google.android.youtube.R.integer.material_motion_duration_long_1);
        TypedValue l = alkd.l(context, com.google.android.youtube.R.attr.motionDurationLong1);
        if (l != null && l.type == 16) {
            integer = l.data;
        }
        animatorSet.setDuration(integer);
        Context context2 = this.x.getContext();
        TimeInterpolator timeInterpolator = aleq.b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(com.google.android.youtube.R.attr.motionEasingStandard, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be a string");
            }
            String valueOf = String.valueOf(typedValue.string);
            if (alkd.q(valueOf, "cubic-bezier")) {
                String[] split = alkd.p(valueOf, "cubic-bezier").split(",");
                int length = split.length;
                if (length != 4) {
                    StringBuilder sb = new StringBuilder(111);
                    sb.append("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                    sb.append(length);
                    throw new IllegalArgumentException(sb.toString());
                }
                timeInterpolator = jg.o(alkd.o(split, 0), alkd.o(split, 1), alkd.o(split, 2), alkd.o(split, 3));
            } else if (alkd.q(valueOf, "path")) {
                timeInterpolator = new PathInterpolator(gl.k(alkd.p(valueOf, "path")));
            } else {
                String valueOf2 = String.valueOf(valueOf);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Invalid motion easing type: ".concat(valueOf2) : new String("Invalid motion easing type: "));
            }
        }
        animatorSet.setInterpolator(timeInterpolator);
        return animatorSet;
    }

    public final void d(float f2, Matrix matrix) {
        matrix.reset();
        if (this.x.getDrawable() == null || this.v == 0) {
            return;
        }
        RectF rectF = this.C;
        RectF rectF2 = this.D;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f3 = this.v;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.v / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    public void e(Rect rect) {
        int b2 = this.m ? (this.q - this.x.b()) / 2 : 0;
        int max = Math.max(b2, (int) Math.ceil(a() + this.p));
        int max2 = Math.max(b2, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void f(float f2, float f3, float f4) {
        throw null;
    }

    public final void g(float f2) {
        this.u = f2;
        Matrix matrix = this.E;
        d(f2, matrix);
        this.x.setImageMatrix(matrix);
    }

    public final void h(alkl alklVar) {
        this.h = alklVar;
        alkg alkgVar = this.i;
        if (alkgVar != null) {
            alkgVar.c(alklVar);
        }
        algy algyVar = this.k;
        if (algyVar != null) {
            algyVar.h = alklVar;
            algyVar.invalidateSelf();
        }
    }

    public final void i() {
        g(this.u);
    }

    public final void j() {
        Rect rect = this.B;
        e(rect);
        gn.h(this.l, "Didn't initialize content background");
        if (l()) {
            this.z.a(new InsetDrawable(this.l, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.z.a(this.l);
        }
        alhe alheVar = this.z;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        alheVar.a.c.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = alheVar.a;
        int i5 = floatingActionButton.a;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    public final void k(float f2) {
        alkg alkgVar = this.i;
        if (alkgVar != null) {
            alkgVar.k(f2);
        }
    }

    public boolean l() {
        return true;
    }

    public final boolean m() {
        return jw.al(this.x) && !this.x.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        return !this.m || this.x.b() >= this.q;
    }
}
