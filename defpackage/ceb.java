package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ceb implements Runnable {
    final /* synthetic */ caj a;
    final /* synthetic */ String b;
    public final cex c = cex.h();

    public ceb(caj cajVar, String str) {
        this.a = cajVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            cdb r = this.a.d.r();
            String str = this.b;
            btn a = btn.a("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str == null) {
                a.e(1);
            } else {
                a.f(1, str);
            }
            ((cdl) r).a.g();
            ((cdl) r).a.h();
            try {
                Cursor e = jr.e(((cdl) r).a, a, true);
                try {
                    int h = jr.h(e, "id");
                    int h2 = jr.h(e, "state");
                    int h3 = jr.h(e, "output");
                    int h4 = jr.h(e, "run_attempt_count");
                    adz adzVar = new adz();
                    adz adzVar2 = new adz();
                    while (e.moveToNext()) {
                        if (!e.isNull(h)) {
                            String string = e.getString(h);
                            if (((ArrayList) adzVar.get(string)) == null) {
                                adzVar.put(string, new ArrayList());
                            }
                        }
                        if (!e.isNull(h)) {
                            String string2 = e.getString(h);
                            if (((ArrayList) adzVar2.get(string2)) == null) {
                                adzVar2.put(string2, new ArrayList());
                            }
                        }
                    }
                    e.moveToPosition(-1);
                    ((cdl) r).m(adzVar);
                    ((cdl) r).l(adzVar2);
                    ArrayList arrayList = new ArrayList(e.getCount());
                    while (e.moveToNext()) {
                        ArrayList arrayList2 = !e.isNull(h) ? (ArrayList) adzVar.get(e.getString(h)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = e.isNull(h) ? null : (ArrayList) adzVar2.get(e.getString(h));
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        ccz cczVar = new ccz();
                        cczVar.a = e.getString(h);
                        cczVar.f = abn.n(e.getInt(h2));
                        cczVar.b = byr.a(e.getBlob(h3));
                        cczVar.c = e.getInt(h4);
                        cczVar.d = arrayList2;
                        cczVar.e = arrayList3;
                        arrayList.add(cczVar);
                    }
                    ((cdl) r).a.j();
                    ((cdl) r).a.i();
                    this.c.e(cda.b.a(arrayList));
                } finally {
                    e.close();
                    a.i();
                }
            } catch (Throwable th) {
                ((cdl) r).a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.c.f(th2);
        }
    }

    public ceb() {
    }
}
