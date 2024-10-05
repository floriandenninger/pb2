package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdp extends cds {
    final /* synthetic */ caj a;
    final /* synthetic */ UUID b;

    public cdp(caj cajVar, UUID uuid) {
        this.a = cajVar;
        this.b = uuid;
    }

    @Override // defpackage.cds
    public final void a() {
        WorkDatabase workDatabase = this.a.d;
        workDatabase.h();
        try {
            c(this.a, this.b.toString());
            workDatabase.j();
            workDatabase.i();
            d(this.a);
        } catch (Throwable th) {
            workDatabase.i();
            throw th;
        }
    }
}
