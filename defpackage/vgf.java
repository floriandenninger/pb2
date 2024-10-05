package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class vgf implements anfy {
    public final /* synthetic */ vgm a;
    private final /* synthetic */ int b;

    public /* synthetic */ vgf(vgm vgmVar, int i) {
        this.b = i;
        this.a = vgmVar;
    }

    @Override // defpackage.anfy
    public final anhy a() {
        if (this.b == 0) {
            vgm vgmVar = this.a;
            try {
                return anaf.O(vgmVar.b((Uri) anaf.W(vgmVar.a)));
            } catch (IOException e) {
                vgl vglVar = new vgl(vgmVar);
                if ((e instanceof vdi) || (e.getCause() instanceof vdi)) {
                    return anaf.N(e);
                }
                return anfq.i(vgmVar.d.a(e, vglVar), amjk.c(new vgh(vgmVar, 3)), vgmVar.b);
            }
        }
        vgm vgmVar2 = this.a;
        return anaf.P(anfq.i(vgmVar2.a, amjk.c(new vgh(vgmVar2, 2)), vgmVar2.b));
    }
}
