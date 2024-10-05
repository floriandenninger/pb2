package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vgh implements anfz {
    public final /* synthetic */ vgm a;
    private final /* synthetic */ int b;

    public /* synthetic */ vgh(vgm vgmVar, int i) {
        this.b = i;
        this.a = vgmVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        anhy anhyVar;
        int i = this.b;
        if (i == 0) {
            vgm vgmVar = this.a;
            vgmVar.c((Uri) anaf.W(vgmVar.a), obj);
            return anhv.a;
        }
        if (i == 1) {
            vgm vgmVar2 = this.a;
            synchronized (vgmVar2.e) {
                anhyVar = vgmVar2.f;
            }
            return anhyVar;
        }
        if (i == 2) {
            vgm vgmVar3 = this.a;
            Uri uri = (Uri) obj;
            Uri i2 = vls.i(uri, ".bak");
            try {
                if (vgmVar3.c.h(i2)) {
                    vgmVar3.c.g(i2, uri);
                }
                return anhv.a;
            } catch (IOException e) {
                return anaf.N(e);
            }
        }
        vgm vgmVar4 = this.a;
        return anaf.O(vgmVar4.b((Uri) anaf.W(vgmVar4.a)));
    }
}
