package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adtn implements ynl {
    public final /* synthetic */ adtp a;
    private final /* synthetic */ int b;

    public /* synthetic */ adtn(adtp adtpVar, int i) {
        this.b = i;
        this.a = adtpVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        if (this.b == 0) {
            adtp adtpVar = this.a;
            adtpVar.e.g();
            int[] iArr = adtpVar.c;
            iArr[0] = iArr[0] + 1;
            adtpVar.e.e(iArr, adtpVar.d, 2);
            adtpVar.b();
            return;
        }
        adtp adtpVar2 = this.a;
        adtpVar2.e.g();
        int[] iArr2 = adtpVar2.d;
        if (iArr2[0] == 0) {
            iArr2[0] = 1;
        }
        adtpVar2.e.e(adtpVar2.c, iArr2, 1);
        adtpVar2.b();
    }
}
