package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class albq extends alct {
    private final aseb a;
    private final alaj b;
    private final akyb c;
    private final aleh e;

    public albq(shf shfVar, aaea aaeaVar, aseb asebVar, alaj alajVar, axze axzeVar, akyb akybVar, albx albxVar, alep alepVar, aleh alehVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(avtr.UPLOAD_PROCESSOR_TYPE_FILE_ANALYSIS, shfVar, aaeaVar, axzeVar, akybVar, albxVar, alajVar, alepVar, null, null, null);
        this.a = asebVar;
        this.b = alajVar;
        this.c = akybVar;
        this.e = alehVar;
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        if (akzsVar.t && akzsVar.v) {
            return this.e;
        }
        return null;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.y;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0430, code lost:
    
        if (r2 != '\b') goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x026e, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x047b  */
    @Override // defpackage.albk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy c(java.lang.String r31, defpackage.akwm r32, defpackage.akzs r33) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.albq.c(java.lang.String, akwm, akzs):anhy");
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return albr.b;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "FileAnalysisTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return false;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        int i = akzsVar.b;
        return ((i & 2) == 0 || (i & 64) == 0) ? false : true;
    }

    @Override // defpackage.aldq
    public final void r(long j, akzs akzsVar) {
        if (akzsVar != null) {
            akyb akybVar = this.c;
            String str = akzsVar.k;
            String str2 = akzsVar.e;
            akzm akzmVar = akzsVar.x;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            int n = akwg.n(akzmVar.c);
            int i = 1;
            if (n == 0) {
                n = 1;
            }
            amkq.E(j >= 0);
            aone createBuilder = avtb.a.createBuilder();
            avta a = akybVar.a(str);
            createBuilder.copyOnWrite();
            avtb avtbVar = (avtb) createBuilder.instance;
            a.getClass();
            avtbVar.c = a;
            avtbVar.b |= 1;
            createBuilder.copyOnWrite();
            avtb avtbVar2 = (avtb) createBuilder.instance;
            avtbVar2.b |= 4;
            avtbVar2.e = j;
            int i2 = n - 1;
            if (i2 == 1) {
                i = 3;
            } else if (i2 == 2) {
                i = 4;
            } else if (i2 == 3) {
                i = 5;
            } else if (i2 == 4) {
                i = 6;
            } else if (i2 == 5) {
                i = 8;
            }
            createBuilder.copyOnWrite();
            avtb avtbVar3 = (avtb) createBuilder.instance;
            avtbVar3.d = i - 1;
            avtbVar3.b |= 2;
            avtb avtbVar4 = (avtb) createBuilder.build();
            arpn a2 = arpp.a();
            a2.copyOnWrite();
            ((arpp) a2.instance).dW(avtbVar4);
            akybVar.b(str2, (arpp) a2.build());
        }
    }
}
