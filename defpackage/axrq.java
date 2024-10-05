package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axrq extends axrs {
    public String a;
    public int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public axrq(int r6, java.lang.String r7) {
        /*
            r5 = this;
            axrr r0 = defpackage.axrr.Close
            r1 = 0
            if (r6 == 0) goto L1c
            byte[] r7 = g(r7)
            int r2 = r7.length
            int r3 = r2 + 2
            byte[] r3 = new byte[r3]
            r4 = 3
            r3[r1] = r4
            r4 = 1
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r3[r4] = r6
            r6 = 2
            java.lang.System.arraycopy(r7, r1, r3, r6, r2)
            goto L1e
        L1c:
            byte[] r3 = new byte[r1]
        L1e:
            r5.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axrq.<init>(int, java.lang.String):void");
    }

    public axrq(axrs axrsVar) {
        super(axrsVar);
        byte[] bArr = axrsVar.g;
        if (bArr.length >= 2) {
            int i = 0;
            int i2 = (bArr[1] & 255) | ((bArr[0] & 255) << 8);
            int[] iArr = {1000, 1001, 1002, 1003, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1015};
            int i3 = 0;
            while (true) {
                if (i3 >= 12) {
                    break;
                }
                int i4 = iArr[i3];
                if (i4 == i2) {
                    i = i4;
                    break;
                }
                i3++;
            }
            this.b = i;
            this.a = new String(this.g, 2, r7.length - 2, axrs.c);
        }
    }
}
