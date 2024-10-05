package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auk {
    public final String a;
    public final pms b;
    public final pms c;
    public final int d;
    public final int e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public auk(java.lang.String r3, defpackage.pms r4, defpackage.pms r5, int r6, int r7) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r1 = 1
            if (r6 == 0) goto La
            if (r7 != 0) goto Lb
            r7 = 0
        La:
            r0 = 1
        Lb:
            defpackage.pse.e(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L25
            r2.a = r3
            defpackage.pse.c(r4)
            r2.b = r4
            defpackage.pse.c(r5)
            r2.c = r5
            r2.d = r6
            r2.e = r7
            return
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auk.<init>(java.lang.String, pms, pms, int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            auk aukVar = (auk) obj;
            if (this.d == aukVar.d && this.e == aukVar.e && this.a.equals(aukVar.a) && this.b.equals(aukVar.b) && this.c.equals(aukVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
