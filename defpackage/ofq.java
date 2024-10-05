package defpackage;

import android.content.res.Configuration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ofq implements oil {
    public final RecyclerView a;
    public Runnable b;
    private final LinearLayoutManager c;
    private final ohy d;

    public ofq(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, ohy ohyVar, azrw azrwVar, ajoy ajoyVar, acra acraVar, ajwi ajwiVar, View view) {
        this.a = recyclerView;
        this.c = linearLayoutManager;
        this.d = ohyVar;
        ohyVar.g = view;
        recyclerView.af(linearLayoutManager);
        recyclerView.ae(null);
        recyclerView.aD(new ofp(this));
        ajox a = ajoyVar.a((ajos) azrwVar.get());
        a.h(ohyVar.d);
        a.rU(new ajnw(acraVar));
        a.rU(new ajwy(ajwiVar));
        recyclerView.ac(a);
    }

    @Override // defpackage.oil
    public final void a(Configuration configuration) {
        vw vwVar;
        if (configuration.orientation != 2 || (vwVar = this.a.m) == null) {
            return;
        }
        vwVar.mw();
    }

    @Override // defpackage.oil
    public final void b(WatchNextResponseModel watchNextResponseModel) {
        aamd aamdVar;
        View view;
        ohw ohwVar;
        ohy ohyVar = this.d;
        ohyVar.a();
        if (watchNextResponseModel != null && (aamdVar = watchNextResponseModel.e) != null) {
            boolean z = false;
            for (auoy auoyVar : aamdVar.a.d) {
                askd askdVar = auoyVar.j;
                if (askdVar == null) {
                    askdVar = askd.a;
                }
                if (!ofh.c(askdVar)) {
                    if (askdVar.e.size() > 0) {
                        ajpd ajpdVar = new ajpd();
                        ajpdVar.addAll(ohyVar.b.a(askdVar.e));
                        ohyVar.e.put(askdVar.i, ajpdVar);
                        ohyVar.d.m(ajpdVar);
                    }
                } else {
                    ajpd ajpdVar2 = new ajpd();
                    ajpdVar2.addAll(ohyVar.c.a(askdVar.e));
                    ohyVar.e.put(askdVar.i, ajpdVar2);
                    ohyVar.d.m(ajpdVar2);
                    z = true;
                }
                if ((auoyVar.e & 32768) != 0) {
                    ohx ohxVar = ohyVar.a;
                    auwd auwdVar = auoyVar.bm;
                    if (auwdVar == null) {
                        auwdVar = auwd.a;
                    }
                    ohyVar.f = ohxVar.a(auwdVar);
                    ohyVar.f.f();
                    ohyVar.d.m(ohyVar.f.d);
                }
            }
            if (!z && (view = ohyVar.g) != null && view.getVisibility() == 0 && (ohwVar = ohyVar.f) != null) {
                ohwVar.h();
            }
        }
        if (!this.d.d.isEmpty()) {
            this.c.aa(0, 0);
        } else {
            this.d.a();
        }
    }

    @Override // defpackage.oil
    public final void c() {
        this.d.a();
    }

    @Override // defpackage.ajwo
    public final /* synthetic */ void lr(String str) {
        throw null;
    }

    @Override // defpackage.ajwo
    public final boolean v(String str, int i, Runnable runnable) {
        final OptionalInt of;
        ohy ohyVar = this.d;
        ajng ajngVar = (ajng) ohyVar.e.get(str);
        if (ajngVar == null) {
            of = OptionalInt.empty();
        } else {
            ajoc ajocVar = ohyVar.d;
            ajob k = ajocVar.k(ajocVar.i(ajngVar));
            if (k == null) {
                of = OptionalInt.empty();
            } else {
                int g = k.g();
                of = g >= 0 ? OptionalInt.of(g) : OptionalInt.empty();
            }
        }
        if (!of.isPresent()) {
            return false;
        }
        this.b = runnable;
        this.a.post(new Runnable() { // from class: ofo
            @Override // java.lang.Runnable
            public final void run() {
                ofq.this.a.ak(of.getAsInt());
            }
        });
        return true;
    }
}
