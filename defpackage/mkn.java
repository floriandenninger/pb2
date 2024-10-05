package defpackage;

import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mkn implements View.OnClickListener {
    final /* synthetic */ mko a;

    public mkn(mko mkoVar) {
        this.a = mkoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apmp a = this.a.c.a();
        if (mko.e(a)) {
            this.a.f.E();
            HashMap hashMap = new HashMap();
            hashMap.put("ALLOW_RELOAD", true);
            aahd aahdVar = this.a.d;
            apxf apxfVar = a.l;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, hashMap);
            return;
        }
        this.a.e.i(!r4.b.isSelected());
    }
}
