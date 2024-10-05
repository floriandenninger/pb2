package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bab extends Exception {
    public final String a;
    public final boolean b;
    public final baa c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bab(defpackage.pms r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 36
            r2.<init>(r1)
            java.lang.String r1 = "Decoder init failed: ["
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = "], "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r11.n
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r0 = 75
            r14.<init>(r0)
            java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r14.append(r0)
            r14.append(r11)
            java.lang.String r9 = r14.toString()
            r8 = 0
            r3 = r10
            r5 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bab.<init>(pms, java.lang.Throwable, boolean, int):void");
    }

    public bab(String str, Throwable th, String str2, boolean z, baa baaVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = baaVar;
        this.d = str3;
    }
}
