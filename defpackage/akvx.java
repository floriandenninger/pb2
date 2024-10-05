package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum akvx implements akvu {
    UNKNOWN(0),
    UPLOAD_FLOW(2),
    BACKGROUND_TASK(3);

    static final SparseArray d = new SparseArray();
    private final int f;

    static {
        for (akvx akvxVar : values()) {
            d.put(akvxVar.f, akvxVar);
        }
    }

    akvx(int i) {
        this.f = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r1 != 5) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(defpackage.akzq r1, defpackage.apwy r2, defpackage.akwg r3) {
        /*
            akzq r0 = defpackage.akzq.UNKNOWN_UPLOAD
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 4
            if (r1 == r0) goto L13
            r0 = 5
            if (r1 == r0) goto L1a
            goto L2e
        L13:
            akvx r1 = defpackage.akvx.UNKNOWN
            java.lang.String r1 = r1.c()
            return r1
        L1a:
            r3.h()
            avui r1 = r2.s
            if (r1 != 0) goto L23
            avui r1 = defpackage.avui.a
        L23:
            boolean r1 = r1.e
            if (r1 == 0) goto L2e
            akvx r1 = defpackage.akvx.UPLOAD_FLOW
            java.lang.String r1 = r1.c()
            return r1
        L2e:
            akvx r1 = defpackage.akvx.UPLOAD_FLOW
            java.lang.String r1 = r1.c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akvx.d(akzq, apwy, akwg):java.lang.String");
    }

    @Override // defpackage.akvu
    public final /* bridge */ /* synthetic */ akvu a(int i) {
        return (akvx) d.get(i);
    }

    @Override // defpackage.akvu
    public final String b() {
        return "um";
    }

    public final String c() {
        int i = this.f;
        StringBuilder sb = new StringBuilder(14);
        sb.append("um=");
        sb.append(i);
        return sb.toString();
    }
}
