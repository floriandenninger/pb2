package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faf implements ylb {
    private final String a = "FElibrary";
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final asvu e;

    public faf(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, aadw aadwVar) {
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        asvu asvuVar = aadwVar.b().e;
        this.e = asvuVar == null ? asvu.a : asvuVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        arjv c;
        try {
            aaue aaueVar = (aaue) this.b.get();
            aauc f = aaueVar.f();
            f.d(this.a);
            f.b = true;
            f.k();
            if (this.e.bu) {
                f.q = yvn.LOW;
            }
            BrowseResponseModel browseResponseModel = (BrowseResponseModel) ynm.d(aaueVar.h(f, angq.a), ens.q);
            fap fapVar = (fap) this.d.get();
            browseResponseModel.getClass();
            fapVar.d().e(browseResponseModel);
            arjv arjvVar = browseResponseModel.a;
            if (arjvVar != null && (c = fae.c(arjvVar)) != null) {
                fapVar.l(c);
            }
            arjv b = fapVar.e.b(arjvVar);
            if (b != null) {
                fapVar.c().e(b);
            }
            ((afso) this.c.get()).b();
            return 0;
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zga.d("Failed to fetch offline library browse", e);
            return 1;
        }
    }
}
