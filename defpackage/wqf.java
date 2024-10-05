package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wqf implements ajau {
    final /* synthetic */ wol a;
    final /* synthetic */ wqg b;

    public wqf(wqg wqgVar, wol wolVar) {
        this.b = wqgVar;
        this.a = wolVar;
    }

    @Override // defpackage.ajau
    public final void a() {
        this.b.a = null;
        wxj wxjVar = (wxj) this.a;
        wxjVar.d = false;
        wxw wxwVar = wxjVar.e;
        xgh xghVar = wxjVar.a;
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : wxwVar.b.w()) {
            if (TextUtils.equals(xghVar.a, xgvVar.c.a)) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) wxwVar.a.get()).r(arrayList);
    }

    @Override // defpackage.ajau
    public final void b(ajbd ajbdVar) {
        this.b.a = ajbdVar;
        final wxj wxjVar = (wxj) this.a;
        if (wxjVar.b == xfn.PRE_ROLL) {
            wxjVar.c();
        } else {
            wxjVar.c.execute(new Runnable() { // from class: wxi
                @Override // java.lang.Runnable
                public final void run() {
                    wxj.this.c();
                }
            });
        }
    }
}
