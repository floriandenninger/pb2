package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pqh {
    public static final int a = a(2, 2, 2, 0);
    public static final int b;
    public static final int c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final boolean[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    public final List l = new ArrayList();
    public final SpannableStringBuilder m = new SpannableStringBuilder();
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;

    static {
        int a2 = a(0, 0, 0, 0);
        b = a2;
        int a3 = a(0, 0, 0, 3);
        c = a3;
        d = new int[]{0, 0, 0, 0, 0, 2, 0};
        e = new int[]{0, 0, 0, 0, 0, 0, 2};
        f = new int[]{3, 3, 3, 3, 3, 3, 1};
        g = new boolean[]{false, false, false, true, true, true, false};
        h = new int[]{a2, a3, a2, a2, a3, a2, a2};
        i = new int[]{0, 1, 2, 3, 4, 3, 4};
        j = new int[]{0, 0, 0, 0, 0, 3, 3};
        k = new int[]{a2, a2, a2, a2, a2, a3, a3};
    }

    public pqh() {
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            defpackage.pse.i(r4, r0)
            defpackage.pse.i(r5, r0)
            defpackage.pse.i(r6, r0)
            defpackage.pse.i(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L21
            if (r7 == r1) goto L21
            r3 = 2
            if (r7 == r3) goto L1e
            r3 = 3
            if (r7 == r3) goto L1c
            goto L21
        L1c:
            r7 = 0
            goto L23
        L1e:
            r7 = 127(0x7f, float:1.78E-43)
            goto L23
        L21:
            r7 = 255(0xff, float:3.57E-43)
        L23:
            if (r4 <= r1) goto L28
            r4 = 255(0xff, float:3.57E-43)
            goto L29
        L28:
            r4 = 0
        L29:
            if (r5 <= r1) goto L2e
            r5 = 255(0xff, float:3.57E-43)
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r6 <= r1) goto L33
            r0 = 255(0xff, float:3.57E-43)
        L33:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqh.a(int, int, int, int):int");
    }

    public static void j(int i2, int i3, int i4) {
        a(i2, i3, i4, 0);
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.m);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.B != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.B, length, 33);
            }
            if (this.C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.C, length, 33);
            }
            if (this.D != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.E), this.D, length, 33);
            }
            if (this.F != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.G), this.F, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void c(char c2) {
        if (c2 == '\n') {
            this.l.add(b());
            this.m.clear();
            if (this.B != -1) {
                this.B = 0;
            }
            if (this.C != -1) {
                this.C = 0;
            }
            if (this.D != -1) {
                this.D = 0;
            }
            if (this.F != -1) {
                this.F = 0;
            }
            while (true) {
                if ((!this.v || this.l.size() < this.u) && this.l.size() < 15) {
                    return;
                } else {
                    this.l.remove(0);
                }
            }
        } else {
            this.m.append(c2);
        }
    }

    public final void d() {
        this.l.clear();
        this.m.clear();
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.F = -1;
        this.A = 0;
    }

    public final void e() {
        d();
        this.n = false;
        this.o = false;
        this.p = 4;
        this.q = false;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 15;
        this.v = true;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        int i2 = b;
        this.z = i2;
        this.E = a;
        this.G = i2;
    }

    public final boolean f() {
        return !this.n || (this.l.isEmpty() && this.m.length() == 0);
    }

    public final void g(boolean z, boolean z2) {
        if (this.B != -1) {
            if (!z) {
                this.m.setSpan(new StyleSpan(2), this.B, this.m.length(), 33);
                this.B = -1;
            }
        } else if (z) {
            this.B = this.m.length();
        }
        if (this.C == -1) {
            if (z2) {
                this.C = this.m.length();
            }
        } else {
            if (z2) {
                return;
            }
            this.m.setSpan(new UnderlineSpan(), this.C, this.m.length(), 33);
            this.C = -1;
        }
    }

    public final void h(int i2, int i3) {
        int i4;
        int i5;
        if (this.D != -1 && (i5 = this.E) != i2) {
            this.m.setSpan(new ForegroundColorSpan(i5), this.D, this.m.length(), 33);
        }
        if (i2 != a) {
            this.D = this.m.length();
            this.E = i2;
        }
        if (this.F != -1 && (i4 = this.G) != i3) {
            this.m.setSpan(new BackgroundColorSpan(i4), this.F, this.m.length(), 33);
        }
        if (i3 != b) {
            this.F = this.m.length();
            this.G = i3;
        }
    }

    public final void i(int i2, int i3) {
        this.z = i2;
        this.w = i3;
    }
}
