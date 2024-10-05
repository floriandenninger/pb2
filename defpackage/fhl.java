package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhl implements ylb {
    private final acpl a;
    private final azrw b;

    public fhl(acpl acplVar, azrw azrwVar) {
        this.a = acplVar;
        this.b = azrwVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        fhj fhjVar = (fhj) this.b.get();
        long d = fhjVar.b.d();
        atml a = atmm.a();
        int andSet = fhjVar.a.getAndSet(0);
        a.copyOnWrite();
        ((atmm) a.instance).f(andSet);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(d - fhjVar.c);
        a.copyOnWrite();
        ((atmm) a.instance).e(seconds);
        atmm atmmVar = (atmm) a.build();
        fhjVar.c = d;
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dl(atmmVar);
        this.a.c((arpp) a2.build());
        return 0;
    }
}
