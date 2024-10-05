package defpackage;

import android.view.View;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oah implements View.OnClickListener {
    public final /* synthetic */ oai a;
    private final /* synthetic */ int b;

    public /* synthetic */ oah(oai oaiVar, int i) {
        this.b = i;
        this.a = oaiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            adlm g = this.a.c.a.g();
            if (g != null) {
                g.E();
                return;
            }
            return;
        }
        if (i == 1) {
            Iterator it = this.a.c.b.iterator();
            while (it.hasNext()) {
                ((ahep) it.next()).q(false);
            }
            return;
        }
        nzu nzuVar = this.a.c.i;
        azrw azrwVar = nzuVar.a;
        acra acraVar = nzuVar.b;
        long j = oad.a;
        ainy ainyVar = (ainy) azrwVar.get();
        if (ainyVar.d()) {
            acraVar.I(3, new acqx(acsb.c(35680)), null);
            ainyVar.a();
        } else {
            acraVar.I(3, new acqx(acsb.c(35681)), null);
            ainyVar.b();
        }
    }
}
