package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class puh {
    public static final puh a = new puh(320, 50, "320x50_mb");
    public static final puh b;
    public final int c;
    public final int d;
    public final String e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;

    static {
        new puh(468, 60, "468x60_as");
        new puh(320, 100, "320x100_as");
        new puh(728, 90, "728x90_as");
        new puh(300, 250, "300x250_as");
        new puh(160, 600, "160x600_as");
        new puh(-1, -2, "smart_banner");
        new puh(-3, -4, "fluid");
        b = new puh(0, 0, "invalid");
        new puh(50, 50, "50x50_mb");
        new puh(-3, 0, "search_v2");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public puh(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        La:
            r1 = -2
            if (r7 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L14:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 4
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = "x"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "_as"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puh.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof puh)) {
            return false;
        }
        puh puhVar = (puh) obj;
        return this.c == puhVar.c && this.d == puhVar.d && this.e.equals(puhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }

    public puh(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.c = i;
        this.d = i2;
        this.e = str;
    }
}
