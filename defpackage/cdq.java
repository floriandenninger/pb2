package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdq extends cds {
    final /* synthetic */ caj a;
    final /* synthetic */ String b;

    public cdq(caj cajVar, String str) {
        this.a = cajVar;
        this.b = str;
    }

    @Override // defpackage.cds
    public final void a() {
        WorkDatabase workDatabase = this.a.d;
        workDatabase.h();
        try {
            cdb r = workDatabase.r();
            String str = this.b;
            btn a = btn.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
            a.f(1, str);
            ((cdl) r).a.g();
            Cursor e = jr.e(((cdl) r).a, a, false);
            try {
                ArrayList arrayList = new ArrayList(e.getCount());
                while (e.moveToNext()) {
                    arrayList.add(e.getString(0));
                }
                e.close();
                a.i();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c(this.a, (String) it.next());
                }
                workDatabase.j();
                workDatabase.i();
                d(this.a);
            } catch (Throwable th) {
                e.close();
                a.i();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.i();
            throw th2;
        }
    }
}
