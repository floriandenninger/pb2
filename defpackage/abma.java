package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abma extends ablz {
    private final acqx j;
    private final ImageView k;
    private final ajkj l;

    public abma(Context context, acqz acqzVar, aahd aahdVar, ajjs ajjsVar) {
        super(context, acqzVar, aahdVar);
        this.j = new acqx(acrb.PDG_LIVE_CHAT_TICKER_PAID_MESSAGE);
        ImageView imageView = (ImageView) this.b.findViewById(R.id.currency_image);
        this.k = imageView;
        this.l = new ajkj(ajjsVar, imageView);
    }

    @Override // defpackage.ablz, defpackage.ajom
    public void b(ajos ajosVar) {
        super.b(ajosVar);
        this.l.a();
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ int f(Object obj) {
        return ((asro) obj).e;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ int g(Object obj) {
        return ((asro) obj).g;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ int h(Object obj) {
        return ((asro) obj).f;
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ long i(Object obj) {
        return ((asro) obj).j * 1000;
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ long j(Object obj) {
        return ((asro) obj).k * 1000;
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ Spanned k(Object obj) {
        aqyg aqygVar;
        asro asroVar = (asro) obj;
        if ((asroVar.b & 2) != 0) {
            aqygVar = asroVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.ablz
    protected final acqx l() {
        return this.j;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ apxf m(Object obj) {
        apxf apxfVar = ((asro) obj).l;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ avgg n(Object obj) {
        avgg avggVar = ((asro) obj).i;
        return avggVar == null ? avgg.a : avggVar;
    }

    @Override // defpackage.ablz, defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        avgg avggVar;
        asro asroVar = (asro) obj;
        super.oB(ajokVar, asroVar);
        if (asroVar == null) {
            avggVar = null;
        } else {
            aqhu aqhuVar = asroVar.h;
            if (aqhuVar == null) {
                aqhuVar = aqhu.a;
            }
            avggVar = aqhuVar.b;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        }
        if (ahbw.L(avggVar)) {
            this.k.setVisibility(0);
            this.l.k(avggVar);
        } else {
            this.k.setVisibility(8);
        }
    }
}
