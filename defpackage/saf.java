package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class saf extends rwf implements rwa {
    public static final sax a = new sax("aplos.line_width");
    public static final sax c = new sax("aplos.dash_pattern");
    public static final sax d = new sax("aplos.line_point.color");
    public static final sax e = new sax("aplos.line_point.radius");
    public static final sax f = new sax("aplos.line_area.color");
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private LinkedHashMap j;
    private final int k;
    private final Path l;
    private final Rect m;
    private final sag n;

    public saf(Context context, sag sagVar) {
        super(context);
        Paint paint = new Paint();
        this.g = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        Paint paint3 = new Paint();
        this.i = paint3;
        this.j = rwh.v();
        this.k = 10;
        this.l = new Path();
        this.m = new Rect();
        if (sagVar != null) {
            this.n = sagVar;
        } else {
            this.n = new sag(context);
        }
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setDither(true);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setDither(true);
        rwh.e(this, rwg.CLIP_PATH);
    }

    @Override // defpackage.rwf, defpackage.rwo
    public final CharSequence a() {
        int size = this.j.size();
        sag sagVar = this.n;
        int i = sagVar.i;
        if (sagVar.g) {
            return MessageFormat.format(getContext().getString(R.string.aplosA11yChartTypeStackedLine), Integer.valueOf(size));
        }
        return getContext().getString(R.string.aplosA11yChartTypeLine);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r7 <= (r4 + r3)) goto L32;
     */
    @Override // defpackage.rwf, defpackage.rwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(int r11, int r12, boolean r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = defpackage.rwh.x()
            android.graphics.Rect r1 = r10.m
            int r2 = r10.getPaddingLeft()
            int r3 = r10.getPaddingTop()
            int r4 = r10.getWidth()
            int r5 = r10.getPaddingRight()
            int r4 = r4 - r5
            int r5 = r10.getHeight()
            int r6 = r10.getPaddingBottom()
            int r5 = r5 - r6
            r1.set(r2, r3, r4, r5)
            android.graphics.Rect r1 = r10.m
            boolean r1 = r1.contains(r11, r12)
            if (r1 == 0) goto Ld1
            java.util.LinkedHashMap r1 = r10.j
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r1.next()
            sah r2 = (defpackage.sah) r2
            monitor-enter(r2)
            rwz r3 = r2.c     // Catch: java.lang.Throwable -> Lce
            int r3 = r3.l()     // Catch: java.lang.Throwable -> Lce
            rwz r4 = r2.c     // Catch: java.lang.Throwable -> Lce
            r5 = -1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = 0
        L4f:
            if (r7 >= r3) goto L7b
            float r8 = r4.h(r7)     // Catch: java.lang.Throwable -> Lce
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> Lce
            android.graphics.Rect r9 = r10.m     // Catch: java.lang.Throwable -> Lce
            int r9 = r9.left     // Catch: java.lang.Throwable -> Lce
            if (r8 < r9) goto L78
            android.graphics.Rect r9 = r10.m     // Catch: java.lang.Throwable -> Lce
            int r9 = r9.right     // Catch: java.lang.Throwable -> Lce
            if (r8 <= r9) goto L66
            goto L78
        L66:
            int r8 = r8 - r11
            int r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> Lce
            float r8 = (float) r8     // Catch: java.lang.Throwable -> Lce
            int r9 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r9 >= 0) goto L73
            r5 = r7
            r6 = r8
            goto L78
        L73:
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 <= 0) goto L78
            goto L7b
        L78:
            int r7 = r7 + 1
            goto L4f
        L7b:
            if (r5 < 0) goto Lcb
            float r3 = r4.j(r5)     // Catch: java.lang.Throwable -> Lce
            if (r13 != 0) goto L96
            int r4 = r10.k     // Catch: java.lang.Throwable -> Lce
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lce
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 > 0) goto Lcb
            float r7 = (float) r12     // Catch: java.lang.Throwable -> Lce
            float r8 = r3 - r4
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 < 0) goto Lcb
            float r4 = r4 + r3
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto Lcb
        L96:
            float r4 = (float) r12     // Catch: java.lang.Throwable -> Lce
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)     // Catch: java.lang.Throwable -> Lce
            rwz r4 = r2.c     // Catch: java.lang.Throwable -> Lce
            say r7 = new say     // Catch: java.lang.Throwable -> Lce
            r7.<init>()     // Catch: java.lang.Throwable -> Lce
            sba r8 = r2.a     // Catch: java.lang.Throwable -> Lce
            r7.c = r8     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r8 = r4.s(r5)     // Catch: java.lang.Throwable -> Lce
            r7.d = r8     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r8 = r4.t(r5)     // Catch: java.lang.Throwable -> Lce
            r7.e = r8     // Catch: java.lang.Throwable -> Lce
            float r8 = r4.h(r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> Lce
            r4.r(r5)     // Catch: java.lang.Throwable -> Lce
            float r4 = r4.j(r5)     // Catch: java.lang.Throwable -> Lce
            java.lang.Math.round(r4)     // Catch: java.lang.Throwable -> Lce
            r7.f = r6     // Catch: java.lang.Throwable -> Lce
            r7.g = r3     // Catch: java.lang.Throwable -> Lce
            r0.add(r7)     // Catch: java.lang.Throwable -> Lce
        Lcb:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lce
            goto L35
        Lce:
            r11 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lce
            throw r11
        Ld1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.saf.b(int, int, boolean):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.LinkedHashMap] */
    @Override // defpackage.rwo
    public final void c(List list, rzk rzkVar) {
        DashPathEffect dashPathEffect;
        int intValue;
        Iterator it;
        LinkedHashMap linkedHashMap;
        HashSet hashSet;
        LinkedHashMap v = rwh.v();
        HashSet<String> p = rwh.p(this.j.keySet());
        Iterator it2 = list.iterator();
        while (true) {
            dashPathEffect = null;
            if (!it2.hasNext()) {
                break;
            }
            rvg rvgVar = (rvg) it2.next();
            sba sbaVar = rvgVar.a;
            saw c2 = rvgVar.c();
            String str = sbaVar.b;
            p.remove(str);
            sah sahVar = (sah) this.j.get(str);
            if (sahVar == null) {
                sahVar = new sah();
            }
            v.put(str, sahVar);
            int intValue2 = ((Integer) sbaVar.c(sax.e).a(null, -1, sbaVar)).intValue();
            int intValue3 = ((Integer) sbaVar.d(d, Integer.valueOf(intValue2)).a(null, -1, sbaVar)).intValue();
            int intValue4 = ((Integer) sbaVar.d(a, Integer.valueOf(this.n.b)).a(null, -1, sbaVar)).intValue();
            sax saxVar = f;
            if (sbaVar.c(saxVar) == null) {
                int i = this.n.f;
                intValue = rwh.F(intValue2, 128);
            } else {
                intValue = ((Integer) sbaVar.c(saxVar).a(null, -1, sbaVar)).intValue();
            }
            sax saxVar2 = e;
            int intValue5 = sbaVar.c(saxVar2) == null ? this.n.d : ((Integer) sbaVar.c(saxVar2).a(null, -1, sbaVar)).intValue();
            sax saxVar3 = c;
            if (sbaVar.c(saxVar3) == null) {
                linkedHashMap = v;
                hashSet = p;
                it = it2;
            } else {
                String str2 = (String) sbaVar.c(saxVar3).a(null, -1, sbaVar);
                sbt.g(str2, "Dash pattern cannot be null");
                String[] split = str2.split(",");
                int length = split.length;
                it = it2;
                linkedHashMap = v;
                hashSet = p;
                sbt.b(1 == ((length & 1) ^ 1), "Dash pattern %s does not have an even number of intervals: %s", str2, Integer.valueOf(length));
                float[] fArr = new float[length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    try {
                        fArr[i2] = Float.parseFloat(split[i2]);
                    } catch (NumberFormatException unused) {
                        String valueOf = String.valueOf(str2);
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Dash pattern should have numeric intervals: ".concat(valueOf) : new String("Dash pattern should have numeric intervals: "));
                    }
                }
                dashPathEffect = new DashPathEffect(fArr, 0.0f);
            }
            int i3 = this.n.i;
            sak sakVar = new sak();
            sag sagVar = this.n;
            boolean z = sagVar.a;
            int i4 = sagVar.h;
            boolean z2 = sagVar.e;
            sahVar.b = intValue2;
            sahVar.i = intValue3;
            sahVar.j = intValue;
            sahVar.r = sakVar;
            sahVar.k = z;
            sahVar.l = intValue4;
            sahVar.m = dashPathEffect;
            sahVar.q = 1;
            sahVar.n = intValue5;
            sahVar.o = z2;
            boolean z3 = sagVar.g;
            sahVar.p = false;
            sahVar.c(rvgVar.d, rvgVar.c, sbaVar, c2, this.b);
            it2 = it;
            v = linkedHashMap;
            p = hashSet;
        }
        LinkedHashMap linkedHashMap2 = v;
        boolean z4 = false;
        for (String str3 : p) {
            ((sah) this.j.get(str3)).c(null, null, rwh.E(str3), null, this.b);
        }
        LinkedHashMap linkedHashMap3 = this.j;
        ?? linkedHashMap4 = new LinkedHashMap();
        int i5 = 0;
        for (Map.Entry entry : linkedHashMap3.entrySet()) {
            LinkedHashMap linkedHashMap5 = linkedHashMap2;
            if (linkedHashMap5.containsKey(entry.getKey())) {
                z4 = true;
            } else if (z4) {
                i5++;
            } else {
                linkedHashMap4.put(entry.getKey(), entry.getValue());
            }
            linkedHashMap2 = linkedHashMap5;
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap2;
        for (Map.Entry entry2 : linkedHashMap6.entrySet()) {
            linkedHashMap4.put(entry2.getKey(), entry2.getValue());
            if (i5 > 0) {
                Iterator it3 = linkedHashMap3.entrySet().iterator();
                while (it3.hasNext() && !((Map.Entry) it3.next()).getKey().equals(entry2.getKey())) {
                }
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!linkedHashMap6.containsKey(entry3.getKey())) {
                        linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                        i5--;
                    }
                }
            }
        }
        this.j = linkedHashMap4;
        if (rzkVar.e()) {
            Iterator it4 = linkedHashMap4.keySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                ?? r2 = (String) it4.next();
                if (rzkVar.f(((sah) linkedHashMap4.get(r2)).a, null) == 1) {
                    dashPathEffect = r2;
                    break;
                }
            }
            if (dashPathEffect != null) {
                linkedHashMap4.put(dashPathEffect, (sah) linkedHashMap4.remove(dashPathEffect));
            }
        }
    }

    @Override // defpackage.rwf, defpackage.rwo
    public final void d(ruv ruvVar, List list, rzk rzkVar) {
        super.d(ruvVar, list, rzkVar);
        if (this.n.g) {
            Iterator it = list.iterator();
            sba sbaVar = null;
            saw sawVar = null;
            while (it.hasNext()) {
                rvg rvgVar = (rvg) it.next();
                sba sbaVar2 = rvgVar.a;
                saw c2 = rvgVar.c();
                rwh.B(sbaVar2, c2, sbaVar, sawVar);
                sawVar = c2;
                sbaVar = sbaVar2;
            }
            String str = sbaVar.b;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean f2 = rwh.f(this, rwg.CLIP_PATH);
        for (sah sahVar : this.j.values()) {
            sahVar.d(this);
            if (f2) {
                canvas.save();
                this.l.rewind();
                this.l.addRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), Path.Direction.CW);
                canvas.clipPath(this.l);
            }
            this.i.setColor(sahVar.j);
            canvas.drawPath(sahVar.g, this.i);
            if (sahVar.l > 0) {
                this.g.setColor(sahVar.b);
                this.g.setStrokeWidth(sahVar.l);
                Paint paint = this.g;
                boolean z = this.n.c;
                paint.setStrokeCap(Paint.Cap.ROUND);
                this.g.setPathEffect(sahVar.m);
                canvas.drawPath(sahVar.e, this.g);
            }
            if (f2) {
                canvas.restore();
            }
            this.h.setColor(sahVar.i);
            canvas.drawPath(sahVar.f, this.h);
        }
        boolean f3 = rwh.f(this, rwg.CLIP_PATH);
        if (f3) {
            canvas.save();
            this.l.rewind();
            this.l.addRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), Path.Direction.CW);
            canvas.clipPath(this.l);
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            boolean z2 = ((sah) it.next()).p;
        }
        if (f3) {
            canvas.restore();
        }
    }

    @Override // defpackage.rwa
    public final void setAnimationPercent(float f2) {
        ArrayList y = rwh.y(this.j.keySet());
        int size = y.size();
        for (int i = 0; i < size; i++) {
            String str = (String) y.get(i);
            sah sahVar = (sah) this.j.get(str);
            sahVar.b(f2);
            if (sahVar.c.l() == 0) {
                this.j.remove(str);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof rwk) {
            ((rwk) layoutParams).d();
        }
    }
}
