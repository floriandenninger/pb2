package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahoa extends ahob implements ahns {
    public final ahnx b;
    public final ahoc d;
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ahoa(defpackage.ahod r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = defpackage.ahnx.b(r8)
            r1 = 2131951668(0x7f130034, float:1.9539757E38)
            java.lang.String r1 = r8.a(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L16
            java.lang.String r0 = r0.concat(r1)
            goto L1c
        L16:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L1c:
            java.lang.String r1 = defpackage.ahnx.a(r8, r9)
            java.lang.String r2 = defpackage.ahoc.a(r8, r10)
            r3 = 2131951667(0x7f130033, float:1.9539755E38)
            java.lang.String r8 = r8.a(r3)
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r5 = r8.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + r4
            int r3 = r3 + r5
            r6.<init>(r3)
            r6.append(r1)
            r6.append(r2)
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            r7.<init>(r0, r8)
            java.lang.String r8 = "uTexMultiplier"
            int r8 = r7.f(r8)
            r7.e = r8
            java.lang.String r8 = "uTexOffset"
            int r8 = r7.f(r8)
            r7.f = r8
            java.lang.String r8 = "uTextureMatrix"
            int r8 = r7.f(r8)
            r7.g = r8
            ahnx r8 = new ahnx
            r8.<init>(r7, r9)
            r7.b = r8
            ahoc r8 = new ahoc
            r8.<init>(r7, r10)
            r7.d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahoa.<init>(ahod, boolean, boolean):void");
    }

    @Override // defpackage.ahns
    public final void a(boolean z, byte[] bArr, long j, long j2) {
        this.b.d(z, bArr, j, j2);
    }

    @Override // defpackage.ahns
    public final void b(int i, int i2, int i3, int i4) {
        this.b.f(i, i2, i3, i4);
    }

    @Override // defpackage.ahnt
    public final void i() {
        this.b.c();
        super.i();
    }
}
