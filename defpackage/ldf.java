package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldf extends frc {
    private final Context a;
    private final ajop f;
    private final ajoi g;

    public ldf(Context context, ajjz ajjzVar, gma gmaVar, ajoy ajoyVar, byte[] bArr) {
        super(context, ajjzVar, R.layout.channel_card_item);
        this.a = context;
        this.f = gmaVar;
        gmaVar.c(this.b);
        this.g = ajoyVar.c(gmaVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.f).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.g.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        avgg avggVar;
        aqyg aqygVar;
        appg appgVar = (appg) obj;
        yny.z(a(), yny.x(this.a.getResources().getDimensionPixelSize(R.dimen.channel_card_width)), ViewGroup.LayoutParams.class);
        ajoi ajoiVar = this.g;
        acra acraVar = ajokVar.a;
        aqyg aqygVar2 = null;
        if ((appgVar.b & 8) != 0) {
            apxfVar = appgVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        ajokVar.a.u(new acqx(appgVar.g), null);
        if ((appgVar.b & 1) != 0) {
            avggVar = appgVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        d(avggVar);
        if ((appgVar.b & 2) != 0) {
            aqygVar = appgVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        f(ajcq.b(aqygVar));
        if ((appgVar.b & 4) != 0 && (aqygVar2 = appgVar.e) == null) {
            aqygVar2 = aqyg.a;
        }
        e(ajcq.b(aqygVar2));
        this.f.e(ajokVar);
    }
}
