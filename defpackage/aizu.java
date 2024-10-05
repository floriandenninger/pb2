package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aizu implements ajai {
    public String a;
    private final aifk b;
    private final ahbv c;
    private final ajaf d;

    public aizu(String str, aifk aifkVar, ahbv ahbvVar) {
        this.b = aifkVar;
        ahbvVar.getClass();
        this.c = ahbvVar;
        this.a = null;
        this.d = new aizt(this, str);
    }

    private static int k(ajah ajahVar) {
        aryi aryiVar = ajahVar.a;
        if (aryiVar == null) {
            return 4;
        }
        if (ahbx.l(aryiVar)) {
            return 0;
        }
        int bG = anaf.bG(aryiVar.c);
        return (bG != 0 && bG == 2) ? 4 : 2;
    }

    @Override // defpackage.ajai
    public final int a(ajah ajahVar) {
        return k(ajahVar);
    }

    @Override // defpackage.ajai
    public final int b(ajah ajahVar) {
        return k(ajahVar);
    }

    @Override // defpackage.ajai
    public final aigr c(aryi aryiVar) {
        int bG;
        if (ahbx.l(aryiVar)) {
            return null;
        }
        return (aryiVar == null || ((bG = anaf.bG(aryiVar.c)) != 0 && bG == 2)) ? new aigr(7, null) : new aigr(9, true, aryiVar.d);
    }

    @Override // defpackage.ajai
    public final aigr d(aasx aasxVar) {
        return new aigr(8, aasxVar);
    }

    @Override // defpackage.ajai
    public final ajaf e() {
        return this.d;
    }

    @Override // defpackage.ajai
    public final void f(ahef ahefVar) {
    }

    @Override // defpackage.ajai
    public final void g(aheg ahegVar) {
    }

    @Override // defpackage.ajai
    public final void h(ahej ahejVar) {
    }

    @Override // defpackage.ajai
    public final void i() {
        this.a = null;
    }

    @Override // defpackage.ajai
    public final boolean j(ajad ajadVar, ajah ajahVar) {
        if (ajadVar != null && (ajadVar.h || this.b.u())) {
            aryb arybVar = ajadVar.e;
            VideoStreamingData videoStreamingData = ajadVar.d;
            boolean z = videoStreamingData != null && videoStreamingData.v;
            byte[] bArr = ajadVar.b;
            if (arybVar != null) {
                this.a = arybVar.c;
            }
            if (this.c.d && arybVar != null && !arybVar.c.isEmpty() && arybVar.d > 0 && arybVar.e != 0 && bArr != null && bArr.length > 0 && (!z || arybVar.h)) {
                return true;
            }
        }
        return false;
    }
}
