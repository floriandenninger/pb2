package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rxy implements rxj, rwa {
    public rxr a;
    private rze b;
    private final Map c = rwh.t();
    private Map d = rwh.t();
    private Map e = rwh.t();
    private int f = 0;
    private int g = PrivateKeyType.INVALID;
    private int h = 0;
    private int i = PrivateKeyType.INVALID;
    private int l = 4;
    private final Rect j = new Rect();
    private final Rect k = new Rect();

    private final float l(Object obj, rze rzeVar) {
        float round = Math.round(rzeVar.a(obj));
        if (rzeVar.c() > 0.0f) {
            int i = this.a.j;
        }
        return round;
    }

    private final void m(Canvas canvas, Collection collection, Paint paint, TextPaint textPaint) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rxx rxxVar = (rxx) it.next();
            h(canvas, rxxVar, this.j, this.k, this.l, paint);
            if (rxxVar.b != null) {
                g(canvas, rxxVar, this.j, this.k, this.l, textPaint);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.rxm n(java.util.List r9, java.util.List r10, int r11, defpackage.rze r12, float r13, boolean r14) {
        /*
            r8 = this;
            int r0 = r9.size()
            int r1 = r10.size()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "domainValues and labels should have the same size"
            defpackage.sbt.a(r0, r1)
            rxm r0 = new rxm
            r0.<init>()
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto Laf
            r1 = 0
        L20:
            int r4 = r9.size()
            if (r2 >= r4) goto Laf
            java.lang.Object r4 = r9.get(r2)
            java.lang.Object r5 = r10.get(r2)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            sau r5 = defpackage.sau.a(r5)
            int r6 = r9.size()
            rxx r4 = r8.k(r4, r5, r2, r6)
            r4.c(r13)
            rxr r5 = r8.a
            android.text.TextPaint r5 = r5.g
            r8.j(r4, r12, r11, r5)
            java.util.List r5 = r0.b
            r5.add(r4)
            rxr r5 = r8.a
            int r5 = r5.e
            ryv r5 = r4.d
            if (r5 == 0) goto Laa
            if (r1 == 0) goto Laa
            ryv r6 = r1.d
            if (r6 != 0) goto L5a
            goto Laa
        L5a:
            java.lang.Object r5 = r5.a
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            ryv r6 = r1.d
            java.lang.Object r6 = r6.a
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r7 = 1101004800(0x41a00000, float:20.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L8c
            ryv r5 = r4.d
            java.lang.Object r5 = r5.b
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r5 = r5 + r7
            ryv r1 = r1.d
            java.lang.Object r1 = r1.a
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto Laa
            goto La5
        L8c:
            ryv r1 = r1.d
            java.lang.Object r1 = r1.b
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r1 + r7
            ryv r5 = r4.d
            java.lang.Object r5 = r5.a
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Laa
        La5:
            r0.a = r3
            if (r14 == 0) goto Laa
            return r0
        Laa:
            int r2 = r2 + 1
            r1 = r4
            goto L20
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxy.n(java.util.List, java.util.List, int, rze, float, boolean):rxm");
    }

    @Override // defpackage.rxj
    public final rxr a() {
        return this.a;
    }

    @Override // defpackage.rxj
    public final void c(rxr rxrVar) {
        this.a = rxrVar;
    }

    @Override // defpackage.rxj
    public final void d(int i, rze rzeVar, List list, Rect rect, Rect rect2) {
        float f;
        this.l = i;
        this.j.set(rect);
        this.k.set(rect2);
        this.c.putAll(this.d);
        this.c.putAll(this.e);
        this.d = rwh.t();
        this.e = rwh.t();
        for (int i2 = 0; i2 < list.size(); i2++) {
            rxx rxxVar = (rxx) list.get(i2);
            Object obj = rxxVar.a;
            if (rzeVar.d(obj) == 0) {
                rxx rxxVar2 = (rxx) this.c.remove(obj);
                if (rxxVar2 != null) {
                    i(rxxVar2, rxxVar, rzeVar, i);
                    this.d.put(obj, rxxVar2);
                } else {
                    f(rxxVar, rzeVar, this.b, i);
                    this.e.put(obj, rxxVar);
                }
            }
        }
        Iterator it = this.c.keySet().iterator();
        while (it.hasNext()) {
            rxx rxxVar3 = (rxx) this.c.get(it.next());
            Object obj2 = rxxVar3.a;
            if (rzeVar.n(obj2)) {
                f = l(obj2, rzeVar);
            } else {
                f = rxxVar3.e;
            }
            rxxVar3.b(f);
        }
        this.b = rzeVar.h();
    }

    @Override // defpackage.rxl
    public final rxm e(List list, List list2, int i, rze rzeVar, boolean z) {
        float f = this.a.d;
        rxm n = n(list, list2, i, rzeVar, 0.0f, z || f != 0.0f);
        return (!n.a || f == 0.0f) ? n : n(list, list2, i, rzeVar, f, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(rxx rxxVar, rze rzeVar, rze rzeVar2, int i) {
        Object obj = rxxVar.a;
        float l = l(obj, rzeVar);
        rxxVar.a((rzeVar2 == null || !rzeVar2.n(obj)) ? l : l(obj, rzeVar2));
        rxxVar.b(l);
        float f = rxxVar.h;
        rxxVar.f = f;
        rxxVar.e = f;
    }

    protected abstract void g(Canvas canvas, rxx rxxVar, Rect rect, Rect rect2, int i, TextPaint textPaint);

    protected abstract void h(Canvas canvas, rxx rxxVar, Rect rect, Rect rect2, int i, Paint paint);

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(rxx rxxVar, rxx rxxVar2, rze rzeVar, int i) {
        rxxVar.b(l(rxxVar2.a, rzeVar));
        rxxVar.c(rxxVar2.h);
        rxxVar.b = sau.a(rxxVar2.b);
    }

    protected abstract void j(rxx rxxVar, rze rzeVar, int i, TextPaint textPaint);

    protected rxx k(Object obj, CharSequence charSequence, int i, int i2) {
        return new rxx(obj, charSequence);
    }

    @Override // defpackage.rwa
    public final void setAnimationPercent(float f) {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((rxx) it.next()).setAnimationPercent(f);
        }
        Iterator it2 = this.d.values().iterator();
        while (it2.hasNext()) {
            ((rxx) it2.next()).setAnimationPercent(f);
        }
        Iterator it3 = this.e.values().iterator();
        while (it3.hasNext()) {
            ((rxx) it3.next()).setAnimationPercent(f);
        }
        if (f >= 1.0f) {
            this.c.clear();
        }
        int alpha = this.a.h.getAlpha();
        double d = f;
        Double.isNaN(d);
        double d2 = 1.0d - d;
        double d3 = alpha;
        Double.isNaN(d3);
        this.h = (int) (d3 * d2);
        this.i = (int) (alpha * f);
        int alpha2 = this.a.g.getAlpha();
        double d4 = alpha2;
        Double.isNaN(d4);
        this.f = (int) (d4 * d2);
        this.g = (int) (alpha2 * f);
    }

    @Override // defpackage.rxj
    public final void b(Canvas canvas, boolean z) {
        if (z) {
            Rect rect = this.j;
            int i = this.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                canvas.drawLine(rect.left, rect.bottom, rect.right, rect.bottom, this.a.i);
            } else if (i2 == 1) {
                canvas.drawLine(rect.left, rect.top, rect.left, rect.bottom, this.a.i);
            } else if (i2 != 2) {
                canvas.drawLine(rect.right, rect.top, rect.right, rect.bottom, this.a.i);
            } else {
                canvas.drawLine(rect.left, rect.top, rect.right, rect.top, this.a.i);
            }
        }
        rxr rxrVar = this.a;
        Paint paint = rxrVar.h;
        TextPaint textPaint = rxrVar.g;
        int alpha = paint.getAlpha();
        int alpha2 = textPaint.getAlpha();
        paint.setAlpha(this.i);
        textPaint.setAlpha(this.g);
        m(canvas, this.e.values(), paint, textPaint);
        paint.setAlpha(alpha);
        textPaint.setAlpha(alpha2);
        m(canvas, this.d.values(), paint, textPaint);
        paint.setAlpha(this.h);
        textPaint.setAlpha(this.f);
        m(canvas, this.c.values(), paint, textPaint);
        paint.setAlpha(alpha);
        textPaint.setAlpha(alpha2);
    }
}
