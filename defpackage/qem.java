package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qem implements qnu {
    final CastDevice a;
    final Bundle b;
    final int c = 0;
    final String d = UUID.randomUUID().toString();
    final prh e;

    public qem(qel qelVar) {
        this.a = qelVar.a;
        this.e = qelVar.c;
        this.b = qelVar.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r1 == r3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.qem
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qem r8 = (defpackage.qem) r8
            com.google.android.gms.cast.CastDevice r1 = r7.a
            com.google.android.gms.cast.CastDevice r3 = r8.a
            boolean r1 = defpackage.qar.j(r1, r3)
            if (r1 == 0) goto L66
            android.os.Bundle r1 = r7.b
            android.os.Bundle r3 = r8.b
            if (r1 == 0) goto L57
            if (r3 != 0) goto L1f
            goto L57
        L1f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L2a
            goto L66
        L2a:
            java.util.Set r4 = r1.keySet()
            java.util.Set r5 = r3.keySet()
            boolean r5 = r4.containsAll(r5)
            if (r5 == 0) goto L66
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.get(r5)
            java.lang.Object r5 = r3.get(r5)
            boolean r5 = defpackage.qar.j(r6, r5)
            if (r5 != 0) goto L3c
            goto L66
        L57:
            if (r1 != r3) goto L66
        L59:
            int r1 = r8.c
            java.lang.String r1 = r7.d
            java.lang.String r8 = r8.d
            boolean r8 = defpackage.qar.j(r1, r8)
            if (r8 == 0) goto L66
            return r0
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qem.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, 0, this.d});
    }
}
