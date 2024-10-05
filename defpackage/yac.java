package defpackage;

import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yac implements View.OnClickListener {
    final /* synthetic */ apmp a;
    final /* synthetic */ Map b;
    final /* synthetic */ yae c;
    private final /* synthetic */ int d;

    public yac(yae yaeVar, apmp apmpVar, Map map, int i) {
        this.d = i;
        this.c = yaeVar;
        this.a = apmpVar;
        this.b = map;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d == 0) {
            aahd aahdVar = this.c.a;
            apxf apxfVar = this.a.l;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, this.b);
            return;
        }
        aahd aahdVar2 = this.c.a;
        apxf apxfVar2 = this.a.l;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar2.c(apxfVar2, this.b);
    }
}
