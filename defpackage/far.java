package defpackage;

import android.os.Bundle;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class far implements ylb {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final asvu d;

    public far(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, aadw aadwVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        asvu asvuVar = aadwVar.b().e;
        this.d = asvuVar == null ? asvu.a : asvuVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        try {
            abcp abcpVar = (abcp) this.a.get();
            abcg a = abcpVar.a(null);
            if (this.d.bu) {
                a.q = yvn.LOW;
            }
            ((fap) this.b.get()).j((abci) abcpVar.d(a).get());
            ((afso) this.c.get()).b();
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            zga.d("Failed to fetch settings", e);
            return 1;
        }
    }
}
