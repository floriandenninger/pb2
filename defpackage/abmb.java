package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abmb extends ablz {
    private final acqx j;
    private final ajkj k;
    private final ajjs l;
    private final LinearLayout m;

    public abmb(Context context, acqz acqzVar, aahd aahdVar, ajjs ajjsVar) {
        super(context, acqzVar, aahdVar);
        this.j = new acqx(acrb.PDG_LIVE_CHAT_TICKER_PAID_STICKER);
        this.k = ahbw.z(ajjsVar, this.c);
        this.l = ajjsVar;
        this.m = (LinearLayout) this.b.findViewById(R.id.thumbnail_holder);
    }

    @Override // defpackage.ablz, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.k.a();
        this.m.removeAllViews();
        this.m.setVisibility(8);
        this.d.setVisibility(0);
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ int f(Object obj) {
        return 0;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ int g(Object obj) {
        return ((asrm) obj).e;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ int h(Object obj) {
        return ((asrm) obj).d;
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ long i(Object obj) {
        return TimeUnit.SECONDS.toMillis(((asrm) obj).f);
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ long j(Object obj) {
        return TimeUnit.SECONDS.toMillis(((asrm) obj).g);
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ Spanned k(Object obj) {
        return null;
    }

    @Override // defpackage.ablz
    protected final acqx l() {
        return this.j;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ apxf m(Object obj) {
        apxf apxfVar = ((asrm) obj).h;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ avgg n(Object obj) {
        avgg avggVar = ((asrm) obj).c;
        return avggVar == null ? avgg.a : avggVar;
    }

    @Override // defpackage.ablz, defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        asrm asrmVar = (asrm) obj;
        super.oB(ajokVar, asrmVar);
        if (asrmVar.j.size() != 0) {
            for (avgg avggVar : asrmVar.j) {
                ImageView imageView = new ImageView(this.a);
                aott aottVar = avggVar.d;
                if (aottVar == null) {
                    aottVar = aott.a;
                }
                if ((aottVar.b & 1) != 0) {
                    aots aotsVar = aottVar.c;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                    imageView.setContentDescription(aotsVar.c);
                }
                int dimension = (int) this.a.getResources().getDimension(R.dimen.live_chat_ticker_thumbnail_size);
                this.m.setVisibility(0);
                this.m.addView(imageView, dimension, dimension);
                ahbw.z(this.l, imageView).k(avggVar);
            }
            this.d.setVisibility(8);
        }
    }

    @Override // defpackage.ablz
    public final void p(avgg avggVar) {
        this.k.k(avggVar);
    }
}
