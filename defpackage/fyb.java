package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fyb implements zaw {
    private final zak a;
    private final zbi b;
    private final aahd c;

    public fyb(zak zakVar, zbi zbiVar, aahd aahdVar) {
        this.a = zakVar;
        this.b = zbiVar;
        this.c = aahdVar;
    }

    @Override // defpackage.zaw
    public final zfl a(Throwable th) {
        return this.a.a(th);
    }

    @Override // defpackage.zaw
    public final String b(Throwable th) {
        return this.a.b(th);
    }

    @Override // defpackage.zaw
    public final void c(int i) {
        this.a.c(i);
    }

    @Override // defpackage.zaw
    public final void d(String str) {
        this.a.d(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(2:9|10)|(9:12|13|14|(3:16|17|(2:26|(2:28|29)(2:30|31))(4:21|(1:23)|24|25))|33|17|(1:19)|26|(0)(0))|37|13|14|(0)|33|17|(0)|26|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
    
        defpackage.zga.n("Could not parse command error details from Any.", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[Catch: aoob -> 0x005c, TRY_LEAVE, TryCatch #0 {aoob -> 0x005c, blocks: (B:14:0x003d, B:16:0x0043), top: B:13:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    @Override // defpackage.zaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cng
            if (r0 == 0) goto La
            zbi r5 = r4.b
            r5.b()
            return
        La:
            boolean r0 = r5 instanceof defpackage.zhp
            if (r0 == 0) goto La9
            r0 = r5
            zhp r0 = (defpackage.zhp) r0
            java.util.List r1 = r0.b()     // Catch: defpackage.aoob -> L35
            boolean r2 = r1.isEmpty()     // Catch: defpackage.aoob -> L35
            if (r2 != 0) goto L3b
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: defpackage.aoob -> L35
            aols r1 = (defpackage.aols) r1     // Catch: defpackage.aoob -> L35
            aomf r1 = r1.c     // Catch: defpackage.aoob -> L35
            aomw r2 = defpackage.aomw.b()     // Catch: defpackage.aoob -> L35
            aols r3 = defpackage.aols.a     // Catch: defpackage.aoob -> L35
            aonm r1 = defpackage.aonm.parseFrom(r3, r1, r2)     // Catch: defpackage.aoob -> L35
            aols r1 = (defpackage.aols) r1     // Catch: defpackage.aoob -> L35
            ammv r1 = defpackage.ammv.j(r1)     // Catch: defpackage.aoob -> L35
            goto L3d
        L35:
            r1 = move-exception
            java.lang.String r2 = "Could not parse Any detail from StatusError."
            defpackage.zga.n(r2, r1)
        L3b:
            amlr r1 = defpackage.amlr.a
        L3d:
            boolean r2 = r1.h()     // Catch: defpackage.aoob -> L5c
            if (r2 == 0) goto L62
            java.lang.Object r1 = r1.c()     // Catch: defpackage.aoob -> L5c
            aols r1 = (defpackage.aols) r1     // Catch: defpackage.aoob -> L5c
            aomf r1 = r1.c     // Catch: defpackage.aoob -> L5c
            aomw r2 = defpackage.aomw.b()     // Catch: defpackage.aoob -> L5c
            apxc r3 = defpackage.apxc.a     // Catch: defpackage.aoob -> L5c
            aonm r1 = defpackage.aonm.parseFrom(r3, r1, r2)     // Catch: defpackage.aoob -> L5c
            apxc r1 = (defpackage.apxc) r1     // Catch: defpackage.aoob -> L5c
            ammv r1 = defpackage.ammv.j(r1)     // Catch: defpackage.aoob -> L5c
            goto L64
        L5c:
            r1 = move-exception
            java.lang.String r2 = "Could not parse command error details from Any."
            defpackage.zga.n(r2, r1)
        L62:
            amlr r1 = defpackage.amlr.a
        L64:
            boolean r2 = r1.h()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.c()
            apxc r2 = (defpackage.apxc) r2
            int r2 = r2.b
            r2 = r2 & 1
            if (r2 == 0) goto L8b
            aahd r5 = r4.c
            java.lang.Object r0 = r1.c()
            apxc r0 = (defpackage.apxc) r0
            com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand r0 = r0.c
            if (r0 != 0) goto L84
            com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand r0 = com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand.a
        L84:
            aony r0 = r0.b
            r1 = 0
            r5.d(r0, r1)
            return
        L8b:
            java.lang.String r1 = r0.getMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L9f
            zak r5 = r4.a
            java.lang.String r0 = r0.getMessage()
            r5.d(r0)
            return
        L9f:
            zak r0 = r4.a
            java.lang.String r5 = r4.b(r5)
            r0.d(r5)
            return
        La9:
            zak r0 = r4.a
            java.lang.String r5 = r4.b(r5)
            r0.d(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyb.e(java.lang.Throwable):void");
    }
}
