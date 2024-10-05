package com.google.android.libraries.youtube.mdx.smartremote;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.acqx;
import defpackage.acsb;
import defpackage.acsc;
import defpackage.adlk;
import defpackage.adlm;
import defpackage.adpn;
import defpackage.adpo;
import defpackage.adpp;
import defpackage.adpu;
import defpackage.adqc;
import defpackage.aone;
import defpackage.ashk;
import defpackage.asht;
import defpackage.jw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DpadView extends View {
    private static final int f = Color.argb(PrivateKeyType.INVALID, 144, 144, 144);
    private static final int g = Color.argb(PrivateKeyType.INVALID, 26, 26, 26);
    private static final int h = Color.argb(PrivateKeyType.INVALID, 144, 144, 144);
    private float A;
    public adpo a;
    public final Map b;
    public final Handler c;
    public final adpp d;
    public adpu e;
    private final adpn i;
    private Drawable j;
    private Path k;
    private final Map l;
    private final ArrayList m;
    private final Paint n;
    private float o;
    private float p;
    private float q;
    private final RectF r;
    private float s;
    private float t;
    private float u;
    private final RectF v;
    private float w;
    private float x;
    private float y;
    private float z;

    public DpadView(Context context) {
        super(context);
        this.i = new adpn(this, this);
        this.k = new Path();
        this.l = new HashMap(5);
        this.b = new HashMap(5);
        this.m = new ArrayList(4);
        this.d = new adpp(this);
        this.n = new Paint();
        this.r = new RectF();
        this.v = new RectF();
        this.c = new Handler(Looper.getMainLooper());
        c(context);
    }

    private final float b(float f2, float f3) {
        return (float) Math.toDegrees(Math.atan2(f3 - this.p, f2 - this.o));
    }

    private final void c(Context context) {
        this.j = context.getResources().getDrawable(R.drawable.mdx_dpad_ripple_drawable);
        jw.M(this, this.i);
    }

    private final void d() {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setState(new int[]{android.R.attr.state_enabled});
        }
        this.k = null;
        invalidate();
    }

    public final adpo a(float f2, float f3) {
        float hypot = (float) Math.hypot(this.o - f2, this.p - f3);
        float b = b(f2, f3);
        if (hypot > this.u) {
            return null;
        }
        if (hypot < this.q) {
            return adpo.ENTER;
        }
        if (b >= 45.0f && b < 135.0f) {
            return adpo.DOWN;
        }
        if (b >= 135.0f || b < -135.0f) {
            return adpo.LEFT;
        }
        if (b < -135.0f || b >= -45.0f) {
            return adpo.RIGHT;
        }
        return adpo.UP;
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.i.t(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (adpo adpoVar : this.l.keySet()) {
            this.n.setColor(adpoVar == adpo.ENTER ? f : g);
            canvas.drawPath((Path) this.l.get(adpoVar), this.n);
        }
        this.n.setColor(h);
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            canvas.drawPath((Path) this.m.get(i), this.n);
        }
        if (this.k != null) {
            if (this.j != null) {
                canvas.save();
                canvas.clipPath(this.k);
                this.j.draw(canvas);
                canvas.restore();
                return;
            }
            this.n.setColor(0);
            canvas.drawPath(this.k, this.n);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.o = i >> 1;
        this.p = i2 >> 1;
        float min = Math.min(i2, i);
        this.q = 0.15f * min;
        float f2 = 0.17f * min;
        RectF rectF = this.r;
        float f3 = this.o;
        float f4 = this.p;
        rectF.set(f3 - f2, f4 - f2, f3 + f2, f4 + f2);
        this.s = 0.11247f * min;
        this.t = 0.12747f * min;
        this.u = r8 >> 1;
        this.v.set(0.0f, 0.0f, min, min);
        this.w = 0.34597f * min;
        this.x = 0.36097f * min;
        this.y = 0.34f * min;
        this.z = 0.0375f * min;
        this.A = min * 0.07f;
        this.l.clear();
        this.b.clear();
        Path path = new Path();
        path.addCircle(this.o, this.p, this.q, Path.Direction.CW);
        this.l.put(adpo.ENTER, path);
        Map map = this.b;
        adpo adpoVar = adpo.ENTER;
        float f5 = this.o;
        float f6 = this.q;
        float f7 = this.p;
        map.put(adpoVar, new Rect((int) (f5 - f6), (int) (f7 - f6), (int) (f5 + f6), (int) (f7 + f6)));
        Path path2 = new Path();
        float f8 = this.o;
        float f9 = f8 - this.t;
        float f10 = this.p;
        float f11 = this.s;
        float f12 = f10 - f11;
        float f13 = f8 - this.x;
        float f14 = this.w;
        float f15 = f10 - f14;
        float f16 = f14 + f10;
        float f17 = f10 + f11;
        path2.moveTo(f9, f12);
        path2.arcTo(this.v, b(f13, f15), (b(f13, f16) - r0) - 360.0f, false);
        float b = b(f9, f17);
        path2.arcTo(this.r, b, (b(f9, f12) - b) + 360.0f, false);
        this.l.put(adpo.LEFT, path2);
        this.b.put(adpo.LEFT, new Rect(0, (int) f15, (int) f9, (int) f16));
        Path path3 = new Path();
        float f18 = this.o;
        float f19 = this.s;
        float f20 = f18 - f19;
        float f21 = this.p;
        float f22 = this.t + f21;
        float f23 = this.w;
        float f24 = f18 - f23;
        float f25 = f21 + this.x;
        float f26 = f23 + f18;
        path3.moveTo(f20, f22);
        float b2 = b(f24, f25);
        path3.arcTo(this.v, b2, b(f26, f25) - b2, false);
        float b3 = b(f18 + f19, f22);
        path3.arcTo(this.r, b3, b(f20, f22) - b3, false);
        this.l.put(adpo.DOWN, path3);
        Map map2 = this.b;
        adpo adpoVar2 = adpo.DOWN;
        float f27 = this.o;
        map2.put(adpoVar2, new Rect((int) f24, (int) f22, (int) f26, (int) (f27 + f27)));
        Path path4 = new Path();
        float f28 = this.o;
        float f29 = this.t + f28;
        float f30 = this.p;
        float f31 = this.s;
        float f32 = f30 + f31;
        float f33 = f28 + this.x;
        float f34 = this.w;
        float f35 = f30 + f34;
        float f36 = f30 - f34;
        path4.moveTo(f29, f32);
        float b4 = b(f33, f35);
        path4.arcTo(this.v, b4, b(f33, f36) - b4, false);
        float b5 = b(f29, f30 - f31);
        path4.arcTo(this.r, b5, b(f29, f32) - b5, false);
        this.l.put(adpo.RIGHT, path4);
        Map map3 = this.b;
        adpo adpoVar3 = adpo.RIGHT;
        float f37 = this.o;
        map3.put(adpoVar3, new Rect((int) f29, (int) f36, (int) (f37 + f37), (int) f35));
        Path path5 = new Path();
        float f38 = this.o;
        float f39 = this.s;
        float f40 = f38 + f39;
        float f41 = this.p;
        float f42 = f41 - this.t;
        float f43 = this.w;
        float f44 = f38 + f43;
        float f45 = f41 - this.x;
        float f46 = f38 - f43;
        path5.moveTo(f40, f42);
        float b6 = b(f44, f45);
        path5.arcTo(this.v, b6, b(f46, f45) - b6, false);
        float b7 = b(f38 - f39, f42);
        path5.arcTo(this.r, b7, b(f40, f42) - b7, false);
        this.l.put(adpo.UP, path5);
        this.b.put(adpo.UP, new Rect((int) f46, 0, (int) f44, (int) f42));
        this.m.clear();
        Path path6 = new Path();
        path6.moveTo(this.o - this.y, this.p - this.z);
        path6.lineTo((this.o - this.y) - this.A, this.p);
        path6.lineTo(this.o - this.y, this.p + this.z);
        this.m.add(path6);
        Path path7 = new Path();
        path7.moveTo(this.o - this.z, this.p + this.y);
        path7.lineTo(this.o, this.p + this.y + this.A);
        path7.lineTo(this.o + this.z, this.p + this.y);
        this.m.add(path7);
        Path path8 = new Path();
        path8.moveTo(this.o + this.y, this.p - this.z);
        path8.lineTo(this.o + this.y + this.A, this.p);
        path8.lineTo(this.o + this.y, this.p + this.z);
        this.m.add(path8);
        Path path9 = new Path();
        path9.moveTo(this.o - this.z, this.p - this.y);
        path9.lineTo(this.o, (this.p - this.y) - this.A);
        path9.lineTo(this.o + this.z, this.p - this.y);
        this.m.add(path9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        adpo a = a(x, y);
        int action = motionEvent.getAction();
        if (action == 0) {
            if (a != null) {
                Drawable drawable = this.j;
                if (drawable != null) {
                    drawable.setBounds((Rect) this.b.get(a));
                    this.j.setHotspot(x, y);
                    this.j.setState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed});
                }
                this.k = (Path) this.l.get(a);
                invalidate();
            }
            this.a = a;
            if (a != adpo.ENTER) {
                performClick();
                this.c.postDelayed(this.d, 500L);
            }
        } else if (action == 1) {
            d();
            if (this.a == adpo.ENTER) {
                performClick();
            } else {
                this.c.removeCallbacks(this.d);
            }
        } else if (action == 2) {
            if (a != this.a) {
                d();
                this.a = null;
                this.c.removeCallbacks(this.d);
            }
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        adpo adpoVar;
        acsc c;
        super.performClick();
        adpu adpuVar = this.e;
        if (adpuVar == null || (adpoVar = this.a) == null) {
            return false;
        }
        adqc adqcVar = adpuVar.a;
        if (adqcVar.c != null) {
            int ordinal = adpoVar.ordinal();
            adlk adlkVar = null;
            if (ordinal == 0) {
                c = acsb.c(61410);
            } else if (ordinal == 1) {
                c = acsb.c(61404);
            } else if (ordinal == 2) {
                c = acsb.c(61406);
            } else if (ordinal != 3) {
                c = ordinal != 4 ? null : acsb.c(61405);
            } else {
                c = acsb.c(61409);
            }
            if (c != null) {
                int i = true != adqcVar.B ? 3 : 2;
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = ashk.a.createBuilder();
                createBuilder2.copyOnWrite();
                ashk ashkVar = (ashk) createBuilder2.instance;
                ashkVar.c = i - 1;
                ashkVar.b |= 1;
                ashk ashkVar2 = (ashk) createBuilder2.build();
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                ashkVar2.getClass();
                ashtVar.m = ashkVar2;
                ashtVar.b |= 32768;
                adqcVar.h.I(3, new acqx(c), (asht) createBuilder.build());
            }
            adlm adlmVar = adqcVar.c;
            int ordinal2 = adpoVar.ordinal();
            if (ordinal2 == 0) {
                adlkVar = adlk.KEY_UP;
            } else if (ordinal2 == 1) {
                adlkVar = adlk.KEY_DOWN;
            } else if (ordinal2 == 2) {
                adlkVar = adlk.KEY_LEFT;
            } else if (ordinal2 == 3) {
                adlkVar = adlk.KEY_RIGHT;
            } else if (ordinal2 == 4) {
                adlkVar = adlk.KEY_ENTER;
            }
            adlmVar.ah(adlkVar);
        }
        return true;
    }

    public DpadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new adpn(this, this);
        this.k = new Path();
        this.l = new HashMap(5);
        this.b = new HashMap(5);
        this.m = new ArrayList(4);
        this.d = new adpp(this);
        this.n = new Paint();
        this.r = new RectF();
        this.v = new RectF();
        this.c = new Handler(Looper.getMainLooper());
        c(context);
    }

    public DpadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new adpn(this, this);
        this.k = new Path();
        this.l = new HashMap(5);
        this.b = new HashMap(5);
        this.m = new ArrayList(4);
        this.d = new adpp(this);
        this.n = new Paint();
        this.r = new RectF();
        this.v = new RectF();
        this.c = new Handler(Looper.getMainLooper());
        c(context);
    }
}
