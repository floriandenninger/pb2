package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jlp implements ykl {
    final /* synthetic */ jlr a;
    private final boolean b;

    public jlp(jlr jlrVar, boolean z) {
        this.a = jlrVar;
        this.b = z;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        jlr jlrVar = this.a;
        LoadingFrameLayout loadingFrameLayout = jlrVar.m;
        loadingFrameLayout.getClass();
        jlrVar.q.getClass();
        loadingFrameLayout.h(jlrVar.a.getString(R.string.no_videos_found));
        jlr jlrVar2 = this.a;
        mcy.af(jlrVar2.q, null, ((agof) jlrVar2.g.get()).a().m());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        jlv jlvVar;
        aqyg aqygVar;
        Pair pair = (Pair) obj2;
        jlr jlrVar = this.a;
        ajpd ajpdVar = jlrVar.o;
        ajpdVar.getClass();
        jlrVar.m.getClass();
        jlrVar.q.getClass();
        ajpdVar.clear();
        if (pair == null || pair.first == null || pair.second == null) {
            jlr jlrVar2 = this.a;
            jlrVar2.m.h(jlrVar2.a.getString(R.string.no_videos_found));
            if (!this.a.x.m().booleanValue() && (jlvVar = this.a.s) != null) {
                jlvVar.a();
            }
        } else {
            agng agngVar = (agng) pair.first;
            List list = (List) pair.second;
            if (evr.V(this.a.h) && (aqygVar = agngVar.k) != null) {
                jlr jlrVar3 = this.a;
                jlrVar3.o.add(mcy.Z(jlrVar3.a.getResources(), aqygVar));
            }
            this.a.l.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.l.add(((agnp) it.next()).f());
            }
            this.a.o.addAll(list);
            this.a.m.a();
            if (this.b) {
                final jvl jvlVar = this.a.c;
                agng agngVar2 = (agng) pair.first;
                List list2 = (List) pair.second;
                jlr jlrVar4 = this.a;
                final yki c = yki.c(jlrVar4.a, new jlq(jlrVar4));
                if (jvlVar.a.c()) {
                    String str = agngVar2.a;
                    final amrz k = amrz.k(str, agngVar2);
                    final amrz k2 = amrz.k(str, list2);
                    if (jvlVar.a.c()) {
                        jvlVar.c.execute(new Runnable() { // from class: jvj
                            @Override // java.lang.Runnable
                            public final void run() {
                                jvl.this.a(k, k2, c);
                            }
                        });
                    }
                }
            }
        }
        mcy.af(this.a.q, pair == null ? null : (List) pair.second, ((agof) this.a.g.get()).a().m());
    }
}
