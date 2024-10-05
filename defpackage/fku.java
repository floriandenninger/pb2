package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fku extends fks implements fgk, aiva, xjf, ypd {
    public final Map a;
    private final aivb b;
    private final Map c;
    private final ypa d;
    private final fgm e;
    private final adlt f;
    private final xji g;
    private String h;
    private float i;
    private boolean j;
    private float k;

    public fku(fln flnVar, aivb aivbVar, ypa ypaVar, fgm fgmVar, adlt adltVar, xji xjiVar) {
        super(flnVar);
        this.a = new HashMap();
        this.c = new HashMap();
        this.i = 1.777f;
        this.k = 1.777f;
        this.b = aivbVar;
        this.d = ypaVar;
        this.e = fgmVar;
        this.f = adltVar;
        this.g = xjiVar;
    }

    private final void i(String str, float f) {
        Set set = (Set) this.a.get(str);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((fkt) it.next()).c(str, f);
        }
    }

    private final void j(String str, float f) {
        if (str == null) {
            return;
        }
        float a = a();
        this.c.put(str, Float.valueOf(f));
        float a2 = a();
        if (evr.bx(a, a2)) {
            return;
        }
        i(str, a2);
    }

    private final boolean k() {
        return this.f.g() != null;
    }

    public final float a() {
        return e(this.h);
    }

    @Override // defpackage.aiva
    public final void d(int i, int i2) {
        float f = 0.0f;
        if (i != 0 && i2 != 0) {
            f = i / i2;
        }
        this.i = f;
        j(this.h, f);
    }

    public final float e(String str) {
        if (str == null) {
            return 1.777f;
        }
        if (!this.j || !TextUtils.equals(this.h, str)) {
            Float f = (Float) this.c.get(str);
            if (f != null) {
                return f.floatValue();
            }
            return 1.777f;
        }
        return this.k;
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        String b;
        if (fhfVar == null) {
            b = null;
        } else {
            String c = fhfVar.c();
            if (TextUtils.isEmpty(c)) {
                b = fhfVar.b();
                if (TextUtils.isEmpty(b)) {
                    b = "INVALID_VIDEO_ID";
                }
            } else {
                b = c;
            }
        }
        this.h = b;
        this.j = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xjf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(boolean r3, int r4) {
        /*
            r2 = this;
            boolean r0 = r2.j
            if (r0 != r3) goto L5
            return
        L5:
            float r0 = r2.a()
            r2.j = r3
            r3 = 1071871164(0x3fe374bc, float:1.777)
            if (r4 == 0) goto L21
            int r4 = r4 + (-1)
            r1 = 2
            if (r4 == r1) goto L1f
            r1 = 3
            if (r4 == r1) goto L1b
            r2.k = r3
            goto L23
        L1b:
            r3 = 1059761370(0x3f2aacda, float:0.6667)
            goto L21
        L1f:
            r3 = 1065353216(0x3f800000, float:1.0)
        L21:
            r2.k = r3
        L23:
            float r3 = r2.a()
            boolean r4 = defpackage.evr.bx(r0, r3)
            if (r4 != 0) goto L32
            java.lang.String r4 = r2.h
            r2.i(r4, r3)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fku.h(boolean, int):void");
    }

    @Override // defpackage.flm
    public final void kG() {
        this.d.m(this);
        this.e.h(this);
        this.b.c(this);
        this.g.d.remove(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.d.g(this);
        this.e.d(this);
        this.b.a(this);
        this.g.d.add(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xag.class, ahef.class};
        }
        if (i == 0) {
            if (((xag) obj).a() != xaf.AD_VIDEO_PLAYING || k()) {
                return null;
            }
            j(this.h, this.i);
            return null;
        }
        if (i == 1) {
            if (((ahef) obj).c() != aign.VIDEO_PLAYING || k()) {
                return null;
            }
            j(this.h, this.i);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
