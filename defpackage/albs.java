package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class albs extends albk {
    private static final amru a = amru.v(1000L, 5000L, 30000L, 60000L, 300000L);
    private final axze b;

    public albs(aaea aaeaVar, axze axzeVar, akyb akybVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(aaeaVar, avtr.UPLOAD_PROCESSOR_TYPE_FINAL_CLEANUP, akybVar, axzeVar, alepVar, null, null, null);
        this.b = axzeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if ((!r0.delete()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if ((!r1.delete()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.anhy s(defpackage.akzs r9, boolean r10) {
        /*
            r8 = this;
            int r0 = r9.d
            r0 = r0 & 2
            if (r0 == 0) goto L85
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r9.am
            r0.<init>(r1)
            boolean r1 = r0.exists()
            r2 = 1
            if (r1 == 0) goto L52
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L52
            java.io.File[] r1 = r0.listFiles()
            if (r1 == 0) goto L46
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L23:
            if (r4 >= r3) goto L3c
            r6 = r1[r4]
            boolean r7 = r6.delete()
            if (r7 != 0) goto L39
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r5.length()
            r5 = 1
        L39:
            int r4 = r4 + 1
            goto L23
        L3c:
            if (r5 != 0) goto L6a
            boolean r1 = r0.delete()
            r1 = r1 ^ r2
            if (r1 != 0) goto L6a
            goto L52
        L46:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            goto L6a
        L52:
            java.lang.String r0 = r0.getParent()
            if (r0 == 0) goto L85
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L85
            boolean r0 = r1.delete()
            r0 = r0 ^ r2
            if (r0 == 0) goto L85
        L6a:
            alep r0 = r8.d
            avtq r1 = defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_FILE_DELETION_FAILED
            akzp r9 = r9.ao
            if (r9 != 0) goto L74
            akzp r9 = defpackage.akzp.a
        L74:
            amru r2 = defpackage.albs.a
            axze r3 = r8.b
            akzp r9 = r0.o(r1, r9, r2, r3)
            akwp r9 = r8.t(r9, r10)
            anhy r9 = defpackage.anaf.O(r9)
            return r9
        L85:
            alep r9 = r8.d
            akzp r9 = r9.d()
            akwp r9 = r8.t(r9, r10)
            anhy r9 = defpackage.anaf.O(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albs.s(akzs, boolean):anhy");
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return null;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.ao;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        if (albw.c(akzsVar)) {
            return anaf.O(new akwo(0));
        }
        return s(akzsVar, true);
    }

    @Override // defpackage.aldq
    public final anhy d(String str, akwm akwmVar) {
        try {
            akzs b = akwmVar.b(str);
            if (b == null) {
                return anaf.N(akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_JOB_NOT_FOUND));
            }
            return s(b, false);
        } catch (akwn e) {
            return anaf.N(e);
        }
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return albr.a;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "FinalCleanupTask";
    }

    @Override // defpackage.albk
    public final boolean g() {
        return true;
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        return true;
    }

    @Override // defpackage.aldq
    public final boolean j() {
        return true;
    }
}
