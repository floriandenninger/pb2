package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bej extends beo {
    public final AtomicReference c;
    private static final int[] g = new int[0];
    public static final amvd a = amvd.b(bea.c);
    public static final amvd b = amvd.b(bea.d);

    @Deprecated
    public bej() {
        bee beeVar = bee.x;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(pms pmsVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(pmsVar.e)) {
            return 4;
        }
        String b2 = b(str);
        String b3 = b(pmsVar.e);
        if (b3 == null || b2 == null) {
            return (z && b3 == null) ? 1 : 0;
        }
        if (b3.startsWith(b2) || b2.startsWith(b3)) {
            return 3;
        }
        return pts.ag(b3, "-")[0].equals(pts.ag(b2, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean e(int i, boolean z) {
        int D = muf.D(i);
        return D == 4 || (z && D == 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List j(defpackage.asi r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r12.a
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto La5
            if (r14 == r2) goto La5
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L22:
            int r5 = r12.a
            if (r3 >= r5) goto L7f
            pms r5 = r12.a(r3)
            int r6 = r5.s
            if (r6 <= 0) goto L7c
            int r7 = r5.t
            if (r7 <= 0) goto L7c
            if (r15 == 0) goto L42
            r8 = 1
            if (r6 > r7) goto L39
            r9 = 0
            goto L3a
        L39:
            r9 = 1
        L3a:
            if (r13 > r14) goto L3d
            r8 = 0
        L3d:
            if (r9 == r8) goto L42
            r8 = r13
            r9 = r14
            goto L44
        L42:
            r9 = r13
            r8 = r14
        L44:
            int r10 = r6 * r8
            int r11 = r7 * r9
            if (r10 < r11) goto L54
            android.graphics.Point r7 = new android.graphics.Point
            int r6 = defpackage.pts.b(r11, r6)
            r7.<init>(r9, r6)
            goto L5e
        L54:
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = defpackage.pts.b(r10, r7)
            r6.<init>(r7, r8)
            r7 = r6
        L5e:
            int r6 = r5.s
            int r8 = r5.t
            int r8 = r8 * r6
            int r9 = r7.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r6 < r9) goto L7c
            int r5 = r5.t
            int r6 = r7.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L7c
            if (r8 >= r4) goto L7c
            r4 = r8
        L7c:
            int r3 = r3 + 1
            goto L22
        L7f:
            if (r4 == r2) goto La5
            int r13 = r0.size()
            r14 = -1
            int r13 = r13 + r14
        L87:
            if (r13 < 0) goto La5
            java.lang.Object r15 = r0.get(r13)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            pms r15 = r12.a(r15)
            int r15 = r15.a()
            if (r15 == r14) goto L9f
            if (r15 <= r4) goto La2
        L9f:
            r0.remove(r13)
        La2:
            int r13 = r13 + (-1)
            goto L87
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bej.j(asi, int, int, boolean):java.util.List");
    }

    private static boolean k(pms pmsVar, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        if ((pmsVar.g & 16384) == 0 && e(i, false) && (i & i2) != 0 && ((str == null || pts.R(pmsVar.n, str)) && (((i7 = pmsVar.s) == -1 || (i7 >= 0 && i7 <= i3)) && ((i8 = pmsVar.t) == -1 || (i8 >= 0 && i8 <= i4))))) {
            float f = pmsVar.u;
            if ((f == -1.0f || (f >= 0.0f && f <= i5)) && (i9 = pmsVar.j) != -1 && i9 >= 0 && i9 <= i6) {
                return true;
            }
        }
        return false;
    }

    public final void c(bee beeVar) {
        if (((bee) this.c.getAndSet(beeVar)).equals(beeVar)) {
            return;
        }
        i();
    }

    @Override // defpackage.beq
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015d A[LOOP:1: B:13:0x0039->B:21:0x015d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0157 A[SYNTHETIC] */
    @Override // defpackage.beo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.util.Pair f(defpackage.ben r33, int[][][] r34, int[] r35) {
        /*
            Method dump skipped, instructions count: 1739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bej.f(ben, int[][][], int[]):android.util.Pair");
    }

    public bej(Context context) {
        this.c = new AtomicReference(bee.a(context));
    }
}
