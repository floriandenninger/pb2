package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axb extends awl {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[ADDED_TO_REGION, LOOP:4: B:33:0x00af->B:34:0x00b1, LOOP_START, PHI: r0
  0x00af: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0036, B:34:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.avr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r0 = r10.position()
            int r1 = r10.limit()
            int r2 = r1 - r0
            avp r3 = r9.b
            int r3 = r3.d
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.524355E-29)
            r7 = 4
            r8 = 3
            if (r3 == r8) goto L2d
            if (r3 == r7) goto L2a
            if (r3 == r6) goto L2e
            if (r3 == r5) goto L27
            if (r3 != r4) goto L21
            goto L2a
        L21:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L27:
            int r2 = r2 / 3
            goto L2d
        L2a:
            int r2 = r2 / 2
            goto L2e
        L2d:
            int r2 = r2 + r2
        L2e:
            java.nio.ByteBuffer r2 = r9.j(r2)
            avp r3 = r9.b
            int r3 = r3.d
            if (r3 == r8) goto Laf
            if (r3 == r7) goto L89
            if (r3 == r6) goto L74
            if (r3 == r5) goto L5d
            if (r3 != r4) goto L57
        L40:
            if (r0 >= r1) goto Lc4
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L40
        L57:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L5d:
            if (r0 >= r1) goto Lc4
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L5d
        L74:
            if (r0 >= r1) goto Lc4
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            byte r3 = r10.get(r0)
            r2.put(r3)
            int r0 = r0 + 2
            goto L74
        L89:
            if (r0 >= r1) goto Lc4
            float r3 = r10.getFloat(r0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = defpackage.pts.a(r3, r4, r5)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 4
            goto L89
        Laf:
            if (r0 >= r1) goto Lc4
            r3 = 0
            r2.put(r3)
            byte r3 = r10.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto Laf
        Lc4:
            int r0 = r10.limit()
            java.nio.Buffer r10 = r10.position(r0)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            java.nio.Buffer r10 = r2.flip()
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axb.e(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.awl
    public final avp i(avp avpVar) {
        int i = avpVar.d;
        if (i != 3) {
            if (i == 2) {
                return avp.a;
            }
            if (i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
                throw new avq(avpVar);
            }
        }
        return new avp(avpVar.b, avpVar.c, 2);
    }
}
