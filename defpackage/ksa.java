package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ksa {
    public final RecyclerView a;
    public final ajpd b;
    public final Rect c;
    public final int d;
    public final int e;
    public final axpg f;
    public final aaea g;
    public asht h;

    public ksa(krv krvVar, krx krxVar, krx krxVar2, ajoy ajoyVar, azrw azrwVar, axpg axpgVar, aaea aaeaVar, RecyclerView recyclerView, byte[] bArr) {
        this.a = recyclerView;
        this.f = axpgVar;
        this.g = aaeaVar;
        ajpd ajpdVar = new ajpd();
        this.b = ajpdVar;
        this.c = new Rect();
        this.d = recyclerView.getPaddingLeft();
        this.e = recyclerView.getPaddingRight();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(0);
        recyclerView.af(linearLayoutManager);
        ajnq ajnqVar = new ajnq();
        ajnqVar.f(aqzm.class, krvVar);
        ajnqVar.f(aqzi.class, krxVar);
        ajnqVar.f(aqrf.class, krxVar2);
        ajnqVar.f(ajds.class, new ajou(azrwVar));
        ajox a = ajoyVar.a(ajnqVar);
        a.h(ajpdVar);
        a.q(true);
        recyclerView.s = true;
        recyclerView.ac(a);
        a.rU(new ajol() { // from class: krz
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i) {
                asht ashtVar;
                ksa ksaVar = ksa.this;
                if (ajngVar.c(i) instanceof aqzm) {
                    ajokVar.f("ITEM_COUNT", Integer.valueOf(ajngVar.a()));
                } else {
                    if (!(ajngVar.c(i) instanceof aqzi) || (ashtVar = ksaVar.h) == null) {
                        return;
                    }
                    ajokVar.c = ashtVar;
                }
            }
        });
    }
}
