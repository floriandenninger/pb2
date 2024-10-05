package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnj implements ahhb, aioa, ajtu {
    public final acra a;
    public ahnn b;
    public atzz[] c;
    private final Context d;
    private final ViewGroup e;
    private final ajjz f;
    private final aahd g;

    public ahnj(acra acraVar, Context context, ViewGroup viewGroup, ajjz ajjzVar, aahd aahdVar) {
        acraVar.getClass();
        this.a = acraVar;
        this.d = context;
        viewGroup.getClass();
        this.e = viewGroup;
        ajjzVar.getClass();
        this.f = ajjzVar;
        aahdVar.getClass();
        this.g = aahdVar;
    }

    @Override // defpackage.ajtu
    public final void a(ajcf ajcfVar) {
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.ao().Y(new ayrs() { // from class: ahni
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahnn ahnnVar;
                ahhw ahhwVar;
                ahhv ahhvVar;
                ahnj ahnjVar = ahnj.this;
                ahdv ahdvVar = (ahdv) obj;
                atzx atzxVar = null;
                if (ahdvVar.a() != null && ahdvVar.a().i != null) {
                    atzo atzoVar = ahdvVar.a().i.g;
                    if (atzoVar == null) {
                        atzoVar = atzo.a;
                    }
                    if ((atzoVar.b & 1) != 0) {
                        atzo atzoVar2 = ahdvVar.a().i.g;
                        if (atzoVar2 == null) {
                            atzoVar2 = atzo.a;
                        }
                        atzxVar = atzoVar2.c;
                        if (atzxVar == null) {
                            atzxVar = atzx.a;
                        }
                    }
                }
                if (ahdvVar.c() == aigk.VIDEO_LOADING && (ahnnVar = ahnjVar.b) != null && (ahhwVar = ahnnVar.i) != null && (ahhvVar = ahhwVar.k) != null) {
                    ahhvVar.removeAllViews();
                }
                if (atzxVar != null) {
                    int min = Math.min(4, atzxVar.d.size());
                    ahnjVar.c = new atzz[min];
                    System.arraycopy(atzxVar.d.toArray(new atzz[0]), 0, ahnjVar.c, 0, min);
                    ahnn ahnnVar2 = ahnjVar.b;
                    if (ahnnVar2 != null) {
                        ahnnVar2.b(ahnjVar.c);
                    }
                    ahnjVar.a.D(new acqx(atzxVar.g));
                }
            }
        }, ahfo.f)};
    }

    @Override // defpackage.ahhb
    public final void qF(ahkm ahkmVar, ahki ahkiVar) {
        ahnn ahnnVar = new ahnn(this.d, ahkiVar, ahkiVar.a().clone(), this.f, this.e, this.g);
        this.b = ahnnVar;
        azrw c = ahkmVar.a.c();
        ahnl ahnlVar = ahnnVar.h;
        float a = ahnlVar.a(R.dimen.watch_next_item_width);
        float a2 = ahnlVar.a(R.dimen.watch_next_item_margin);
        float a3 = ahkt.a((a + a2 + a2) * 4.0f);
        ahnl ahnlVar2 = ahnnVar.h;
        float a4 = ahnlVar2.a(R.dimen.watch_next_item_width);
        float a5 = ahnlVar2.a(R.dimen.thumbnail_margin);
        float a6 = ahnlVar2.a(R.dimen.text_margin);
        float a7 = ahnlVar2.a(R.dimen.text_size_medium);
        float a8 = ahnlVar2.a(R.dimen.text_size_small);
        float a9 = ahnlVar2.a(R.dimen.watch_next_item_margin);
        float a10 = ahnlVar2.a(R.dimen.watch_next_item_margin);
        float a11 = ahkt.a((a4 / 1.7777778f) + a5 + a5 + a6 + a6 + a7 + a8 + a9 + a10 + a10);
        ahnnVar.i = new ahhw(ahnnVar.e, ahnnVar.g, a3, a11, ahnnVar.f.clone(), c);
        ahnnVar.n(ahnnVar.i);
        ahnnVar.m(a3, a11);
        this.b.l(0.0f, -30.0f, 0.0f);
        ahkiVar.c(this.b);
        ahnn ahnnVar2 = this.b;
        ahkiVar.m = ahnnVar2;
        atzz[] atzzVarArr = this.c;
        if (atzzVarArr != null) {
            ahnnVar2.b(atzzVarArr);
        }
    }

    @Override // defpackage.ahhb
    public final void qG() {
        this.b = null;
    }
}
