package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acuv implements acvn {
    private static final String a = zga.a("MDX.BackgroundScanStarter");
    private boolean b;
    private final ylf c;
    private final aoae d;

    public acuv(aoae aoaeVar, azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = aoaeVar;
        this.c = (ylf) azrwVar.get();
    }

    @Override // defpackage.acvn
    public final synchronized void a() {
        if (this.b) {
            return;
        }
        if (this.d.e().isEmpty()) {
            zga.h(a, "no background scan clients registered, not starting background scan job");
            return;
        }
        zga.h(a, "starting background scan job");
        this.c.e("mdx_background_scanner", 0L, true, 2, null, acvs.j, false);
        this.b = true;
    }
}
