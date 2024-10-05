package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amux {
    public final Object a;
    int b;
    final /* synthetic */ amvc c;

    public amux() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (defpackage.amkq.b(r4.a, r2.a[r0]) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -1
            if (r0 == r1) goto L17
            amvc r2 = r4.c
            int r3 = r2.c
            if (r0 >= r3) goto L17
            java.lang.Object r3 = r4.a
            java.lang.Object[] r2 = r2.a
            r0 = r2[r0]
            boolean r0 = defpackage.amkq.b(r3, r0)
            if (r0 != 0) goto L21
        L17:
            amvc r0 = r4.c
            java.lang.Object r2 = r4.a
            int r0 = r0.d(r2)
            r4.b = r0
        L21:
            int r0 = r4.b
            if (r0 != r1) goto L27
            r0 = 0
            return r0
        L27:
            amvc r1 = r4.c
            int[] r1 = r1.b
            r0 = r1[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amux.a():int");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amux) {
            amux amuxVar = (amux) obj;
            if (a() == amuxVar.a() && amkq.b(this.a, amuxVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(" x ");
        sb.append(a);
        return sb.toString();
    }

    public amux(amvc amvcVar, int i) {
        this.c = amvcVar;
        this.a = amvcVar.a[i];
        this.b = i;
    }
}
