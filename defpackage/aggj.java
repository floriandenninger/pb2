package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aggj implements agtv {
    final Map a = new HashMap();
    final /* synthetic */ aggk b;

    public aggj(aggk aggkVar) {
        this.b = aggkVar;
    }

    private final void m(agnz agnzVar) {
        for (final String str : this.b.f(agtw.t(agnzVar.f))) {
            agns b = this.b.b(str);
            if (b != null && b.b != null) {
                final ArrayList arrayList = new ArrayList();
                final agjl agjlVar = (agjl) this.b.e.get();
                this.b.b.s(new Runnable() { // from class: aggi
                    @Override // java.lang.Runnable
                    public final void run() {
                        long min;
                        agno agnoVar;
                        aggj aggjVar = aggj.this;
                        String str2 = str;
                        List list = arrayList;
                        agjl agjlVar2 = agjlVar;
                        aggk aggkVar = aggjVar.b;
                        atrg c = agjlVar2.c(str2);
                        agsm agsmVar = aggjVar.b.h;
                        long j = 0;
                        long j2 = agsmVar.a.contains(agsmVar.b.c().z() ? "main_app_auto_offline_storage_limit_megabytes_%s" : yny.L("main_app_auto_offline_storage_limit_megabytes_%s", agsmVar.b.c().d())) ? agsmVar.a.getInt(r9, 0) * 1048576 : 0L;
                        long b2 = aggjVar.b.h.b();
                        if (j2 == 0) {
                            min = b2;
                        } else {
                            akpq akpqVar = (akpq) aggjVar.b.c.get();
                            if (str2 != null) {
                                agns o = ((agil) akpqVar.b.get()).o(str2);
                                if (o != null) {
                                    List list2 = o.a;
                                    agil agilVar = (agil) akpqVar.b.get();
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        agnv p = agilVar.p((String) it.next());
                                        if (p != null) {
                                            j += p.e();
                                        }
                                    }
                                }
                                min = Math.min(b2, j2 - j);
                            } else {
                                throw new IllegalArgumentException("Either specify playlistId or videoListId");
                            }
                        }
                        atrx d = agjlVar2.d(str2);
                        Cursor query = agjlVar2.a.a().query("video_listsV13", new String[]{"stream_transfer_condition"}, "id = ?", new String[]{str2}, null, null, null, null);
                        try {
                            if (query.moveToNext()) {
                                agnoVar = agno.a(query.getInt(0));
                            } else {
                                agnoVar = agno.OFFLINE_IMMEDIATELY;
                            }
                            query.close();
                            aggkVar.t(str2, list, c, min, true, d, agnoVar, agjlVar2.a(str2), agjlVar2.k(str2));
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                });
            }
        }
    }

    private final void n(final agnz agnzVar) {
        this.b.b.s(new Runnable() { // from class: aggh
            @Override // java.lang.Runnable
            public final void run() {
                aggj aggjVar = aggj.this;
                agnz agnzVar2 = agnzVar;
                for (aghm aghmVar : aggjVar.b.k.r(agtw.t(agnzVar2.f))) {
                    aghmVar.g(agnzVar2);
                    aggjVar.b.g(aghmVar.b());
                }
            }
        });
    }

    @Override // defpackage.agtv
    public final void a(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void b(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void c() {
    }

    @Override // defpackage.agtv
    public final void d(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            n(agnzVar);
        }
    }

    @Override // defpackage.agtv
    public final void e(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            n(agnzVar);
            String t = agtw.t(agnzVar.f);
            if (this.a.containsKey(t) && this.b.i.c() - ((Long) this.a.get(t)).longValue() > aggk.a) {
                m(agnzVar);
            }
            this.a.put(t, Long.valueOf(this.b.i.c()));
        }
    }

    @Override // defpackage.agtv
    public final void f(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            for (aghm aghmVar : this.b.k.r(agtw.t(agnzVar.f))) {
                aghmVar.f(agnzVar);
                this.b.g(aghmVar.b());
            }
        }
    }

    @Override // defpackage.agtv
    public final void g() {
        this.b.b.s(new Runnable() { // from class: aggg
            @Override // java.lang.Runnable
            public final void run() {
                aggj aggjVar = aggj.this;
                String a = aggjVar.b.g.a();
                if (aggjVar.b.f.equals(a)) {
                    for (agnz agnzVar : aggjVar.b.g.b(a).values()) {
                        if (agnzVar.c()) {
                            String t = agtw.t(agnzVar.f);
                            for (String str : aggjVar.b.f(t)) {
                                aghm q = aggjVar.b.k.q(str);
                                if (q == null) {
                                    agns b = aggjVar.b.b(str);
                                    if (b != null) {
                                        q = aggjVar.b.k.v(b.d, null);
                                        aggjVar.b.g(q.b());
                                    } else {
                                        zga.b("[Offline] pudl transfer video list not in database");
                                    }
                                }
                                q.c(t);
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.agtv
    public final void h(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            n(agnzVar);
        }
    }

    @Override // defpackage.agtv
    public final void i(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void j(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void k(agnz agnzVar, atqs atqsVar, agnf agnfVar) {
        if (agtw.ai(agnzVar)) {
            n(agnzVar);
            if (agnfVar.b()) {
                m(agnzVar);
            }
        }
    }

    @Override // defpackage.agtv
    public final void l(agnz agnzVar) {
    }
}
