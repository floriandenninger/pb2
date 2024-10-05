package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Vibrator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.libraries.video.media.VideoMetaData;
import defpackage.acsb;
import defpackage.amkq;
import defpackage.amru;
import defpackage.hqf;
import defpackage.hqh;
import defpackage.hqw;
import defpackage.hrf;
import defpackage.hrg;
import defpackage.hrh;
import defpackage.hri;
import defpackage.hrj;
import defpackage.hrk;
import defpackage.hrm;
import defpackage.jqr;
import defpackage.uzu;
import defpackage.vsd;
import defpackage.vsf;
import defpackage.vsj;
import defpackage.vsm;
import defpackage.vsy;
import defpackage.vsz;
import defpackage.vya;
import defpackage.vye;
import defpackage.vyf;
import defpackage.vyg;
import defpackage.vyl;
import defpackage.vym;
import defpackage.vyn;
import defpackage.vza;
import defpackage.vzd;
import defpackage.vze;
import defpackage.zga;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsVideoTrimView2 extends ViewGroup implements vyl, vsz, vsj {
    public long A;
    public hqh B;
    public jqr C;
    private boolean D;
    private final Rect E;
    private final Rect F;
    private final vsf G;
    private final int H;
    private final int I;

    /* renamed from: J, reason: collision with root package name */
    private final int f157J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private final boolean R;
    private int S;
    private final boolean T;
    private final boolean U;
    private final boolean V;
    private final boolean W;
    public hrh a;
    private long aA;
    private long aB;
    private long aC;
    private long aD;
    private int aE;
    private long aF;
    private int aG;
    private Animator aH;
    private Animator aI;
    private final vza aJ;
    private final int aK;
    private final boolean aa;
    private final boolean ab;
    private final hqf ac;
    private final hrk ad;
    private final hrg ae;
    private final hri af;
    private final ImageView ag;
    private final ImageView ah;
    private final View ai;
    private final List aj;
    private final List ak;
    private boolean al;
    private VideoMetaData am;
    private vym an;
    private vym ao;
    private final Drawable ap;
    private final Vibrator aq;
    private int ar;
    private long as;
    private float at;
    private float au;
    private float av;
    private float aw;
    private float ax;
    private float ay;
    private float az;
    public final float b;
    public final int c;
    public final int d;
    public final uzu e;
    final Paint f;
    public final vze g;
    public float h;
    public boolean i;
    public vsf j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public float o;
    public long p;
    public hrj q;
    public final Rect r;
    public vsm s;
    public vsy t;
    public vyf u;
    public vyn v;
    public vyn w;
    public hrm x;
    public boolean y;
    public float z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShortsVideoTrimView2(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static boolean F(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private final float K() {
        return this.ag.getX() + this.f157J;
    }

    private final float L() {
        return this.ah.getX() + this.f157J;
    }

    private final float M(float f) {
        return (f - this.r.left) / this.r.width();
    }

    private static float N(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            return Float.NaN;
        }
        return motionEvent.getX(findPointerIndex);
    }

    private final float P() {
        return ((this.ah.getX() + this.K) - this.aJ.a()) + this.aJ.b;
    }

    private final float Q() {
        float x = this.ag.getX();
        int i = this.f157J;
        return ((x + (i + i)) - this.K) - this.aJ.b;
    }

    private static long R(long j, long j2, long j3) {
        return Math.abs(j2 - j) < Math.abs(j3 - j) ? j2 : j3;
    }

    private final long S(long j) {
        VideoMetaData videoMetaData;
        hrm hrmVar = hrm.BEGIN;
        int i = this.aK;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            return (i2 == 2 && (videoMetaData = this.am) != null) ? R(j, this.am.l(videoMetaData.b(j)), e()) : j;
        }
        long R = R(j, 0L, e());
        vym vymVar = this.ao;
        vya g = vymVar != null ? vymVar.g(j, false) : null;
        if (g == null) {
            return R;
        }
        long R2 = R(j, g.a(), R);
        g.d();
        return R2;
    }

    private final ImageView T(Context context, int i) {
        vzd vzdVar = new vzd(context, i, this.L);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(vzdVar);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    private final hrj U(int i) {
        boolean z = false;
        amkq.E(i >= 0);
        if (i == 0) {
            return hrj.a;
        }
        VideoMetaData videoMetaData = this.am;
        float a = videoMetaData != null ? videoMetaData.a() : 1.7777778f;
        vsy vsyVar = this.t;
        if (vsyVar != null) {
            int f = ((vsyVar.f() % 360) + 360) % 360;
            if (f % 90 == 0 && f >= 0) {
                z = true;
            }
            amkq.E(z);
            if (f == 90 || f == 270) {
                a = 1.0f / a;
            }
        }
        int i2 = this.H;
        int i3 = this.I;
        int max = Math.max(1, (int) Math.floor((i + i3) / ((i2 * a) + i3)));
        float f2 = (i - (this.I * (max - 1))) / max;
        return new hrj(f2, f2 / a, max);
    }

    private final void V(ImageView imageView, RectF rectF) {
        float f = this.M / 2.0f;
        float x = imageView.getX() + this.f157J;
        float f2 = x - f;
        float f3 = x + f;
        float f4 = 0.0f;
        if (f2 < 0.0f) {
            f4 = -f2;
        } else if (f3 > getWidth()) {
            f4 = getWidth() - f3;
        }
        rectF.left = f2 + f4;
        rectF.top = imageView.getTop();
        rectF.right = f3 + f4;
        rectF.bottom = imageView.getBottom();
    }

    private final void W(boolean z, boolean z2) {
        ImageView imageView;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z2) {
            Animator animator = this.aH;
            if (animator != null) {
                animator.cancel();
            }
            this.aH = animatorSet;
            imageView = this.ag;
        } else {
            Animator animator2 = this.aI;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.aI = animatorSet;
            imageView = this.ah;
        }
        float scaleX = imageView.getScaleX();
        float f = (true != z ? 1.0f : 2.0f) * this.b;
        long integer = getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        animatorSet.play(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, scaleX, f)).with(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, scaleX, f)).with(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.TRANSLATION_Z, imageView.getTranslationZ(), (true != z ? 0.0f : 2.0f) * this.b));
        animatorSet.setDuration(integer);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    private final void X() {
        hrm hrmVar;
        if (this.W && B()) {
            W(false, this.x == hrm.BEGIN);
        }
        if (this.y) {
            amkq.N(true);
            vsy vsyVar = this.t;
            if (vsyVar != null && (hrmVar = this.x) != null) {
                vsyVar.s(hrmVar.e);
            }
            this.y = false;
            vsf vsfVar = this.j;
            if (vsfVar != null) {
                vsfVar.a();
            }
            if (E()) {
                amkq.N(E());
                this.h = 0.0f;
                long j = this.m;
                long j2 = this.n;
                if (j > k()) {
                    j = k();
                    j2 = g() + j;
                }
                if (j2 < j()) {
                    j2 = j();
                    j = j2 - g();
                }
                vsm vsmVar = this.s;
                if (vsmVar != null) {
                    vsmVar.k(j, j2);
                }
                s();
                x();
                vyn vynVar = this.w;
                if (vynVar != null) {
                    vynVar.l(this);
                    this.w.j();
                    this.w = null;
                }
            }
            this.ad.a(0.0f);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            if (this.x == hrm.BEGIN) {
                o();
            } else if (this.x == hrm.END) {
                o();
            }
            this.x = null;
        }
    }

    private final void Y(float f, float f2) {
        vsd vsdVar;
        this.ag.setX((f - this.f157J) + this.av);
        this.ah.setX((f2 - this.f157J) + this.aw);
        aa();
        vze vzeVar = this.g;
        vzeVar.b = f + this.av;
        vzeVar.c = f2 + this.aw;
        if (this.G == null) {
            return;
        }
        int round = Math.round(((float) (i(L()) - i(K()))) / 100000.0f);
        String string = getContext().getResources().getString(com.google.android.youtube.R.string.seconds_abbr);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 15);
        sb.append(round / 10.0f);
        sb.append(string);
        String sb2 = sb.toString();
        int L = (int) (((L() - K()) / 2.0f) + K());
        int y = (int) (this.ag.getY() + (this.ag.getHeight() / 2.0f));
        vsf vsfVar = this.G;
        if (vsfVar.b == null || (vsdVar = vsfVar.c) == null) {
            return;
        }
        vsdVar.e(sb2);
        int[] c = vsfVar.c(L, y, this);
        vsd vsdVar2 = vsfVar.c;
        vsdVar2.d(c[0], c[1] + (vsdVar2.getIntrinsicHeight() / 2), vsfVar.a.getWidth());
    }

    private final void Z(long j) {
        VideoMetaData videoMetaData;
        int g;
        if (j < 0) {
            this.aE = -1;
            this.aF = -1L;
        } else {
            if (!this.U || (videoMetaData = this.am) == null || (g = videoMetaData.g(j)) == this.aE) {
                return;
            }
            if (E() && !A()) {
                this.aF = System.currentTimeMillis();
                this.aG = this.Q;
                postDelayed(new Runnable() { // from class: hqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShortsVideoTrimView2.this.A();
                    }
                }, this.aG);
            }
            this.aE = g;
        }
    }

    private final void aa() {
        double max;
        if (this.ab && this.A >= 0) {
            long k = k();
            long j = j();
            if (k == j) {
                return;
            }
            float Q = Q();
            float P = P();
            float f = P - Q;
            if (f <= this.aJ.c) {
                double d = f / 2.0f;
                double d2 = Q;
                Double.isNaN(d);
                Double.isNaN(d2);
                max = d + d2;
            } else {
                double d3 = Q;
                double d4 = this.A - k;
                double d5 = j - k;
                Double.isNaN(d4);
                Double.isNaN(d5);
                double d6 = d4 / d5;
                double d7 = f;
                Double.isNaN(d7);
                Double.isNaN(d3);
                max = Math.max(d3, Math.min((d6 * d7) + d3, P));
            }
            this.aJ.setX((float) max);
        }
    }

    public final boolean A() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.aF < this.aG) {
            return false;
        }
        n(this.O);
        this.aG = this.P;
        this.aF = currentTimeMillis;
        return true;
    }

    public final boolean B() {
        return this.x == hrm.BEGIN || this.x == hrm.END;
    }

    public final boolean C() {
        vsm vsmVar = this.s;
        return vsmVar != null && vsmVar.e(1.0f) > e();
    }

    public final boolean D() {
        vsm vsmVar = this.s;
        return vsmVar != null && vsmVar.e(0.0f) < 0;
    }

    public final boolean E() {
        vsm vsmVar = this.s;
        return vsmVar != null && vsmVar.c;
    }

    @Override // defpackage.vyl
    public final void G(Exception exc) {
        zga.d("Failed to render thumbnail", exc);
    }

    @Override // defpackage.vsj
    public final void H() {
        y(this.q);
        z();
        requestLayout();
    }

    @Override // defpackage.vyl
    public final void I(vya vyaVar) {
    }

    @Override // defpackage.vsj
    public final void J() {
    }

    @Override // defpackage.vsz
    public final void a(vsy vsyVar, Set set) {
        Z(-1L);
    }

    @Override // defpackage.vsz
    public final void b(vsy vsyVar, int i) {
        if (i == 0) {
            if (!this.y) {
                z();
                invalidate();
            }
            Z(k());
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            y(U(this.r.width()));
        } else {
            if (!this.y) {
                z();
                invalidate();
            }
            Z(j());
        }
    }

    @Override // defpackage.vsz
    public final void c(vsy vsyVar, Set set) {
        Z(-1L);
    }

    public final long d(long j, boolean z) {
        long e;
        float f;
        long j2 = 0;
        long j3 = true != z ? 0L : -1000000L;
        if (z) {
            e = e() + 1000000;
        } else {
            e = e();
        }
        long j4 = this.aD;
        long j5 = this.aC;
        long j6 = j4 - j5;
        long j7 = j5 - j;
        long j8 = j4 - j;
        if (j7 < j3) {
            j8 = j3 + j6;
        } else {
            j3 = j7;
        }
        if (j8 > e) {
            j3 = e - j6;
        } else {
            e = j8;
        }
        if (D() && j3 > 0) {
            j3 = 0;
            e = j6;
        }
        if (C() && e < e()) {
            j3 = e() - j6;
            e = e();
        }
        long[] jArr = {j3, e};
        long j9 = jArr[0];
        long j10 = jArr[1];
        vsm vsmVar = this.s;
        this.h -= (vsmVar == null ? 0.0f : vsmVar.b(j9)) * this.r.width();
        vsm vsmVar2 = this.s;
        if (vsmVar2 != null) {
            f = 0.0f;
            vsmVar2.i(j9, j10, false, false);
        } else {
            f = 0.0f;
        }
        long e2 = e();
        vsm vsmVar3 = this.s;
        long e3 = vsmVar3 == null ? 0L : vsmVar3.e(M(this.at));
        vsm vsmVar4 = this.s;
        long e4 = vsmVar4 == null ? 0L : vsmVar4.e(M(this.au));
        this.av = f;
        if (e3 < 0) {
            this.av = O(e3) - O(0L);
        } else {
            j2 = e3;
        }
        this.aw = f;
        if (e4 > e2) {
            this.aw = O(e4) - O(e2);
        } else {
            e2 = e4;
        }
        long[] jArr2 = {j2, e2};
        long j11 = jArr2[0];
        long j12 = jArr2[1];
        vsy vsyVar = this.t;
        if (vsyVar != null) {
            vsyVar.E(j11, j12);
        }
        v(j11);
        vyn vynVar = this.v;
        if (vynVar != null) {
            vynVar.b(j9, j10);
        }
        y(this.q);
        return this.aC - j9;
    }

    public final long e() {
        VideoMetaData videoMetaData = this.am;
        if (videoMetaData == null) {
            return 1L;
        }
        return videoMetaData.g;
    }

    public final long f() {
        vsy vsyVar = this.t;
        if (vsyVar == null) {
            return 0L;
        }
        return vsyVar.h();
    }

    public final long g() {
        vsy vsyVar = this.t;
        if (vsyVar == null) {
            return 1L;
        }
        return vsyVar.i();
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return !this.V ? super.getPaddingLeft() : Math.max((super.getPaddingLeft() - this.f157J) + (this.L / 2), 0);
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return !this.V ? super.getPaddingRight() : Math.max((super.getPaddingRight() - this.f157J) + (this.L / 2), 0);
    }

    public final long h() {
        vsy vsyVar = this.t;
        if (vsyVar == null) {
            return 1L;
        }
        return vsyVar.j();
    }

    public final long i(float f) {
        vsm vsmVar = this.s;
        if (vsmVar == null) {
            return 0L;
        }
        return vsmVar.e(M(f));
    }

    public final long j() {
        vsy vsyVar = this.t;
        return vsyVar == null ? e() : vsyVar.l();
    }

    public final long k() {
        vsy vsyVar = this.t;
        if (vsyVar == null) {
            return 0L;
        }
        return vsyVar.n();
    }

    public final void l(vye vyeVar) {
        vyeVar.b(null);
        vyeVar.setCallback(null);
        this.aj.remove(vyeVar);
    }

    public final void m() {
        hrm hrmVar;
        amkq.N(this.x != null);
        amkq.N(!this.y);
        this.y = true;
        vsy vsyVar = this.t;
        if (vsyVar != null && (hrmVar = this.x) != null) {
            vsyVar.r(hrmVar.e);
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void n(int i) {
        Vibrator vibrator;
        if (!this.T || (vibrator = this.aq) == null) {
            return;
        }
        vibrator.vibrate(i);
    }

    final void o() {
        jqr jqrVar = this.C;
        if (jqrVar == null) {
            zga.l("The interaction logger is null.");
        } else {
            jqrVar.a(acsb.c(110247)).f();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipRect(this.E);
        canvas.drawColor(getResources().getColor(com.google.android.youtube.R.color.trim_view_background_color));
        canvas.save();
        canvas.clipRect(O(0L), this.E.top, O(e()), this.E.bottom);
        if (this.i) {
            for (vye vyeVar : this.aj) {
                vsy vsyVar = this.t;
                vyeVar.a(canvas, vsyVar == null ? 0 : vsyVar.f());
            }
        } else {
            amkq.E(this.r.width() >= 0);
            float f = this.H;
            int i = this.I;
            hrj hrjVar = new hrj(f, this.H, Math.max(1, (int) Math.ceil((r0 + i) / (i + f))));
            float f2 = hrjVar.b + this.I;
            int i2 = hrjVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                float f3 = this.r.left + (i3 * f2);
                float f4 = hrjVar.b + f3;
                float paddingTop = getPaddingTop();
                float f5 = hrjVar.c + paddingTop;
                Drawable drawable = this.ap;
                if (drawable != null) {
                    drawable.setBounds((int) f3, (int) paddingTop, (int) f4, (int) f5);
                    this.ap.draw(canvas);
                }
            }
        }
        canvas.restore();
        this.g.draw(canvas);
        if (this.l) {
            float strokeWidth = this.f.getStrokeWidth() / 2.0f;
            canvas.drawRect(K(), this.r.top + strokeWidth, L(), this.r.bottom - strokeWidth, this.f);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hrm hrmVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.ac.a();
                    X();
                }
            } else if (motionEvent.getActionIndex() == motionEvent.findPointerIndex(this.ar)) {
                this.ac.a();
                X();
            }
        } else if (motionEvent.getPointerCount() == 1) {
            this.ae.a();
            int pointerId = motionEvent.getPointerId(0);
            this.ar = pointerId;
            this.z = N(motionEvent, pointerId);
            this.as = motionEvent.getEventTime();
            this.at = K();
            this.au = L();
            float f = this.z;
            RectF rectF = new RectF();
            V(this.ag, rectF);
            float f2 = rectF.left;
            float f3 = rectF.right;
            V(this.ah, rectF);
            float f4 = rectF.left;
            float f5 = rectF.right;
            if (f3 > f4) {
                float f6 = (f3 - f4) / 2.0f;
                f2 -= f6;
                f3 -= f6;
                f4 += f6;
                f5 += f6;
            }
            if (f >= f2 && f <= f3) {
                hrmVar = hrm.BEGIN;
            } else if (f >= f4 && f <= f5) {
                hrmVar = hrm.END;
            } else if (!this.ab || f < this.aJ.getX() || f > this.aJ.getX() + this.aJ.a()) {
                hrmVar = e() > g() ? hrm.BOTH : null;
            } else {
                hrmVar = hrm.PLAYHEAD;
            }
            this.x = hrmVar;
            if (hrmVar != null) {
                x();
                if (B()) {
                    this.ac.b(this.S, this.z);
                    if (this.W && !this.y) {
                        W(true, this.x == hrm.BEGIN);
                    }
                } else {
                    o();
                }
            }
        }
        return this.x != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.E.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.r.left = Math.min(this.E.left + this.f157J, this.E.right);
        this.r.top = this.E.top;
        this.r.right = Math.max(this.E.right - this.f157J, this.E.left);
        this.r.bottom = this.E.bottom;
        if (this.ab) {
            int i5 = this.r.left;
            vza vzaVar = this.aJ;
            int i6 = i5 - vzaVar.b;
            this.aJ.layout(i6, 0, vzaVar.a() + i6, getHeight());
        }
        int i7 = this.E.top;
        int i8 = this.E.bottom;
        int i9 = this.r.left;
        int i10 = this.f157J;
        int i11 = i9 - i10;
        this.ag.layout(i11, i7, i10 + i10 + i11, i8);
        int i12 = this.r.right;
        int i13 = this.f157J;
        int i14 = i12 - i13;
        this.ah.layout(i14, i7, i13 + i13 + i14, i8);
        z();
        hrj U = U(this.r.width());
        if (!F(U, this.q)) {
            y(U);
        }
        this.ai.layout(this.E.left, this.E.top, this.E.right, this.E.bottom);
        this.g.setBounds(this.E);
        getHitRect(this.F);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(amru.r(this.F));
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        amkq.N(View.MeasureSpec.getMode(i) != 0);
        setMeasuredDimension(resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), resolveSizeAndState(getPaddingTop() + this.H + getPaddingBottom(), i2, 0));
        int i3 = this.f157J;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 + i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.H, 1073741824);
        if (this.ab) {
            this.aJ.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        this.ag.measure(makeMeasureSpec, makeMeasureSpec2);
        this.ah.measure(makeMeasureSpec, makeMeasureSpec2);
        this.ai.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.D = bundle.getBoolean("trimHandleInteractionAlreadyLogged");
            Parcelable parcelable2 = bundle.getParcelable("superViewInstanceState");
            if (parcelable2 != null) {
                parcelable = parcelable2;
            }
            vsm vsmVar = this.s;
            if (vsmVar != null) {
                vsmVar.i(bundle.getLong("trimLayoutStartTimeKey", 0L), bundle.getLong("trimLayoutEndTimeKey", g()), false, false);
                z();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superViewInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("trimHandleInteractionAlreadyLogged", this.D);
        vsm vsmVar = this.s;
        if (vsmVar != null) {
            bundle.putLong("trimLayoutStartTimeKey", vsmVar.e(0.0f));
            vsm vsmVar2 = this.s;
            bundle.putLong("trimLayoutEndTimeKey", vsmVar2 == null ? 0L : vsmVar2.e(1.0f));
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r5 != 6) goto L130;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(long j) {
        hqh hqhVar = this.B;
        if (hqhVar == null) {
            zga.b("PlayheadPositionListener is null.");
        } else {
            hqhVar.accept(Long.valueOf(TimeUnit.MICROSECONDS.toMillis(j)));
        }
    }

    @Override // defpackage.vyl
    public final void q(final vym vymVar) {
        post(new Runnable() { // from class: hra
            @Override // java.lang.Runnable
            public final void run() {
                ShortsVideoTrimView2 shortsVideoTrimView2 = ShortsVideoTrimView2.this;
                vym vymVar2 = vymVar;
                vsm vsmVar = shortsVideoTrimView2.s;
                if (vsmVar == null || vsmVar.j() || vymVar2 != shortsVideoTrimView2.v) {
                    return;
                }
                shortsVideoTrimView2.i = true;
                shortsVideoTrimView2.y(shortsVideoTrimView2.q);
            }
        });
    }

    @Override // defpackage.vsj
    public final void r(vsm vsmVar) {
        for (vye vyeVar : this.aj) {
            float O = O(vyeVar.b);
            Rect bounds = vyeVar.getBounds();
            float centerX = bounds.centerX() - O;
            if (centerX != 0.0f) {
                int i = (int) (bounds.left - centerX);
                vyeVar.setBounds(i, bounds.top, bounds.width() + i, bounds.bottom);
            }
        }
        z();
        invalidate();
        hrh hrhVar = this.a;
        if (hrhVar != null) {
            ((hqw) hrhVar).as.c = vsmVar.e(0.0f);
        }
    }

    public final void s() {
        ArrayList arrayList = new ArrayList(this.ak);
        this.ak.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vye vyeVar = (vye) arrayList.get(i);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(vyeVar, "alpha", 0);
            ofInt.addListener(new hrf(this, vyeVar));
            ofInt.start();
        }
        vsm vsmVar = this.s;
        if (vsmVar != null) {
            vsmVar.g = true;
        }
        y(this.q);
        for (vye vyeVar2 : this.ak) {
            vyeVar2.c(true);
            ObjectAnimator.ofInt(vyeVar2, "alpha", 0, PrivateKeyType.INVALID).start();
        }
        vsm vsmVar2 = this.s;
        if (vsmVar2 != null) {
            vsmVar2.g = false;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            v(k());
            p(k());
        }
    }

    public final void t(long j) {
        if (!E()) {
            vsm vsmVar = this.s;
            j = Math.max(vsmVar == null ? 0L : vsmVar.e(0.0f), j);
        }
        long S = S(j);
        if (this.aK == 3) {
            if (j() - S < h()) {
                VideoMetaData videoMetaData = this.am;
                int e = videoMetaData == null ? 0 : videoMetaData.e((r3 - h()) - 1);
                VideoMetaData videoMetaData2 = this.am;
                S = videoMetaData2 != null ? videoMetaData2.l(e) : 0L;
            }
        }
        vsy vsyVar = this.t;
        if (vsyVar != null) {
            vsyVar.D(S);
        }
        v(S);
    }

    public final void u(long j) {
        if (!E()) {
            vsm vsmVar = this.s;
            j = Math.min(vsmVar == null ? 0L : vsmVar.e(1.0f), j);
        }
        long S = S(j);
        if (this.aK == 3) {
            long k = k();
            if (S - k < h()) {
                VideoMetaData videoMetaData = this.am;
                int c = videoMetaData == null ? 0 : videoMetaData.c(k + h() + 1);
                if (c < 0) {
                    S = e();
                } else {
                    VideoMetaData videoMetaData2 = this.am;
                    S = videoMetaData2 != null ? videoMetaData2.l(c) : 0L;
                }
            }
        }
        vsy vsyVar = this.t;
        if (vsyVar != null) {
            vsyVar.C(S);
        }
        v(S);
    }

    public final void v(long j) {
        if (this.ab) {
            this.A = j;
            aa();
            invalidate();
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof vye);
    }

    public final void w(final vsy vsyVar, vyf vyfVar, final vsm vsmVar) {
        VideoMetaData videoMetaData;
        if (vsyVar != null) {
            vyfVar.getClass();
            videoMetaData = vsyVar.b;
            amkq.E(videoMetaData.equals(((vyg) vyfVar).a));
            boolean L = vsyVar.L();
            this.l = L;
            if (L) {
                this.ag.setVisibility(0);
                this.ah.setVisibility(0);
            } else {
                this.ag.setVisibility(8);
                this.ah.setVisibility(8);
            }
        } else {
            amkq.E(vyfVar == null);
            videoMetaData = null;
        }
        vsmVar.getClass();
        if (F(vsyVar, this.t) && vyfVar == this.u) {
            return;
        }
        X();
        vsy vsyVar2 = this.t;
        if (vsyVar2 != null) {
            vsyVar2.u(this);
            this.u = null;
            vyn vynVar = this.v;
            if (vynVar != null) {
                vynVar.l(this);
            }
            this.v = null;
            vym vymVar = this.an;
            if (vymVar != null) {
                vymVar.l(this);
            }
            this.an = null;
            this.ao = null;
            amkq.N(this.w == null);
        }
        this.t = vsyVar;
        this.am = videoMetaData;
        this.u = vyfVar;
        final hrj U = U(this.r.width());
        vsy vsyVar3 = this.t;
        if (vsyVar3 != null) {
            vsyVar3.q(this);
            this.al = this.R;
            vyf vyfVar2 = this.u;
            if (vyfVar2 != null) {
                this.v = new vyn(vyfVar2);
                vym b = this.u.b();
                this.an = b;
                b.k(this);
            }
            vyf vyfVar3 = this.u;
            if (vyfVar3 != null) {
                this.ao = ((vyg) vyfVar3).c;
            }
        }
        if (this.aK == 3 && this.am != null) {
            long f = f() * 10;
            this.p = f;
            this.o = (float) (f / 2000);
        }
        vsm vsmVar2 = this.s;
        if (vsmVar2 != null) {
            vsmVar2.h(this);
        }
        this.s = vsmVar;
        vsmVar.f(this);
        if (this.t == null || this.v == null) {
            return;
        }
        post(new Runnable() { // from class: hqz
            @Override // java.lang.Runnable
            public final void run() {
                ShortsVideoTrimView2 shortsVideoTrimView2 = ShortsVideoTrimView2.this;
                vsm vsmVar3 = vsmVar;
                hrj hrjVar = U;
                vsy vsyVar4 = vsyVar;
                vyn vynVar2 = shortsVideoTrimView2.v;
                if (vynVar2 == null) {
                    return;
                }
                vynVar2.b(vsmVar3.e(0.0f), vsmVar3.e(1.0f));
                shortsVideoTrimView2.v.k(shortsVideoTrimView2);
                shortsVideoTrimView2.y(hrjVar);
                if (vsyVar4 != null) {
                    shortsVideoTrimView2.g.a = vsyVar4;
                }
                shortsVideoTrimView2.requestLayout();
            }
        });
    }

    public final void x() {
        this.ax = this.z;
        this.aA = k();
        this.aB = j();
        this.ay = K();
        this.az = L();
        vsm vsmVar = this.s;
        this.aC = vsmVar == null ? 0L : vsmVar.e(0.0f);
        vsm vsmVar2 = this.s;
        this.aD = vsmVar2 != null ? vsmVar2.e(1.0f) : 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x011a, code lost:
    
        if (java.lang.Math.abs(r10 - r14) >= java.lang.Math.abs(r10 - r12)) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(defpackage.hrj r18) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2.y(hrj):void");
    }

    public final void z() {
        Y(O(k()), O(j()));
    }

    private final float O(long j) {
        vsm vsmVar = this.s;
        return ((vsmVar == null ? 0.0f : vsmVar.b(j)) * this.r.width()) + this.r.left;
    }
}
