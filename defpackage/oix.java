package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oix {
    public final ajox a;
    public final Map b;
    public final fqu c;
    public final oiw d;
    public ajpd e;
    public oiz f;
    public boolean g;
    public int h;
    private final ypa i;
    private final zaw j;
    private final acra k;
    private final aasm l;
    private RecyclerView m;
    private LoadingFrameLayout n;
    private boolean o;

    public oix(ypa ypaVar, aahd aahdVar, abds abdsVar, zaw zawVar, ajoy ajoyVar, ajpa ajpaVar, acra acraVar) {
        this.i = ypaVar;
        this.j = zawVar;
        this.l = abdsVar;
        acraVar.getClass();
        this.k = acraVar;
        this.d = new oiw();
        ajox a = ajoyVar.a(ajpaVar);
        this.a = a;
        a.rU(new ajnw(acraVar));
        a.rU(new ajnn(aahdVar));
        a.rU(new ajol() { // from class: ois
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i) {
                ajokVar.f("PLAYLIST_CURRENT_VIDEO_MONITOR", oix.this.d);
            }
        });
        this.b = new HashMap();
        fqu fquVar = new fqu();
        this.c = fquVar;
        a.h(fquVar.a);
        this.g = false;
    }

    private final void g() {
        if (this.g) {
            return;
        }
        if (this.n == null) {
            zga.l("loadingFrame is not initialized. Will not display the playlist.");
            return;
        }
        RecyclerView recyclerView = this.m;
        if (recyclerView == null) {
            zga.l("recyclerView is not initialized. Will not display the playlist.");
            return;
        }
        this.c.b(ajnl.a);
        this.a.mw();
        ajpd ajpdVar = new ajpd();
        this.e = ajpdVar;
        this.f = new oiz(this.l, this.i, ypa.c(), this.j, this.k, ajpdVar);
        recyclerView.aD(new oiv(this));
        this.g = true;
    }

    public final void a() {
        if (this.g) {
            LoadingFrameLayout loadingFrameLayout = this.n;
            if (loadingFrameLayout != null) {
                loadingFrameLayout.c();
            }
            ajpd ajpdVar = this.e;
            if (ajpdVar != null) {
                ajpdVar.clear();
            }
            oiz oizVar = this.f;
            if (oizVar != null) {
                oizVar.B();
            }
            this.b.clear();
            this.o = true;
        }
    }

    public final void b(int i, boolean z) {
        RecyclerView recyclerView = this.m;
        if (recyclerView == null) {
            return;
        }
        int max = Math.max(this.c.a(i) - 1, 0);
        wd wdVar = recyclerView.n;
        if (wdVar instanceof LinearLayoutManager) {
            if (z) {
                new ws();
                wdVar.ao(recyclerView, max);
            } else {
                ((LinearLayoutManager) wdVar).aa(max, 0);
            }
        }
    }

    public final void c(Object obj) {
        this.c.d(obj);
    }

    public final void d(LoadingFrameLayout loadingFrameLayout) {
        loadingFrameLayout.getClass();
        this.n = loadingFrameLayout;
    }

    public final void e(aubs aubsVar) {
        if (aubsVar == null) {
            return;
        }
        g();
        ajpd ajpdVar = this.e;
        if (ajpdVar != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (aubr aubrVar : aubsVar.i) {
                int i2 = aubrVar.b;
                if ((i2 & 1) != 0) {
                    aubw aubwVar = aubrVar.c;
                    if (aubwVar == null) {
                        aubwVar = aubw.a;
                    }
                    arrayList.add(aubwVar);
                    aubw aubwVar2 = aubrVar.c;
                    if (aubwVar2 == null) {
                        aubwVar2 = aubw.a;
                    }
                    String str = aubwVar2.o;
                    this.b.put(str, Integer.valueOf(i));
                    aubw aubwVar3 = aubrVar.c;
                    if (aubwVar3 == null) {
                        aubwVar3 = aubw.a;
                    }
                    if (aubwVar3.k) {
                        this.d.a(str);
                    }
                } else if ((i2 & 128) != 0) {
                    aubt aubtVar = aubrVar.e;
                    if (aubtVar == null) {
                        aubtVar = aubt.a;
                    }
                    arrayList.add(new kxv(aubtVar));
                }
                i++;
            }
            ajpdVar.p(arrayList);
            ajpd ajpdVar2 = this.e;
            ArrayList arrayList2 = new ArrayList();
            for (aubr aubrVar2 : aubsVar.i) {
                if ((aubrVar2.b & 32) != 0) {
                    aubp aubpVar = aubrVar2.d;
                    if (aubpVar == null) {
                        aubpVar = aubp.a;
                    }
                    arrayList2.add(aubpVar);
                }
            }
            ajpdVar2.addAll(arrayList2);
            ajpd ajpdVar3 = this.e;
            if (ajpdVar3 != null) {
                g();
                this.c.b(ajpdVar3);
                this.a.mw();
                LoadingFrameLayout loadingFrameLayout = this.n;
                if (loadingFrameLayout != null) {
                    loadingFrameLayout.a();
                }
            }
        }
        oiz oizVar = this.f;
        if (oizVar != null) {
            oizVar.c(adyu.di(aubsVar));
        }
        if (this.o) {
            this.o = false;
            Integer num = (Integer) this.b.get(this.d.a);
            if (num != null) {
                b(num.intValue(), false);
            }
        }
    }

    public final void f(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.m = recyclerView;
        recyclerView.ac(this.a);
        recyclerView.getContext();
        recyclerView.af(new oiu());
        this.a.mw();
    }
}
