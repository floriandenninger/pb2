package defpackage;

import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajis implements swv {
    public final syd a;
    private final aaxn b;

    public ajis(aaxn aaxnVar, syd sydVar, byte[] bArr) {
        aaxnVar.getClass();
        this.b = aaxnVar;
        this.a = sydVar;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return athc.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, final swu swuVar) {
        athc athcVar = (athc) obj;
        aawz f = this.b.f();
        Iterator it = athcVar.c.iterator();
        while (it.hasNext()) {
            f.d((String) it.next());
        }
        f.e(athcVar.c.size() > 1);
        f.k();
        sxs sxsVar = swuVar.f;
        if (sxsVar instanceof ajgg) {
            String k = ((ajgg) sxsVar).a.k();
            if (!TextUtils.isEmpty(k)) {
                f.n(k);
            }
        }
        return wbs.O(this.b.b.a(f)).q(new ayrs() { // from class: ajir
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                ajis ajisVar = ajis.this;
                swu swuVar2 = swuVar;
                ajisVar.a.a(31, "MultiFeedbackTokenCommand execution failed", swuVar2.i, (Throwable) obj2);
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
