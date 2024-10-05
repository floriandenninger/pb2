package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnk extends kwy {
    private final ajjz o;
    private final ajop p;
    private final ajoi q;
    private final ImageView r;

    public mnk(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        super(context, ajjzVar, ajuwVar, R.layout.compact_station_item, ajutVar);
        ajjzVar.getClass();
        this.o = ajjzVar;
        this.p = gmaVar;
        this.r = (ImageView) this.c.findViewById(R.id.station_thumbnail);
        gmaVar.c(this.c);
        this.q = new ajoi(aahdVar, gmaVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.p).b;
    }

    @Override // defpackage.kwy, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.q.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqcv aqcvVar = (aqcv) obj;
        ajoi ajoiVar = this.q;
        acra acraVar = ajokVar.a;
        aqyg aqygVar3 = null;
        if ((aqcvVar.b & 8) != 0) {
            apxfVar = aqcvVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        ajokVar.a.u(new acqx(aqcvVar.h), null);
        if ((aqcvVar.b & 1) != 0) {
            aqygVar = aqcvVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        k(ajcq.b(aqygVar));
        if ((aqcvVar.b & 2) != 0) {
            aqygVar2 = aqcvVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        d(ajcq.b(aqygVar2));
        if ((aqcvVar.b & 4) != 0 && (aqygVar3 = aqcvVar.e) == null) {
            aqygVar3 = aqyg.a;
        }
        l(ajcq.b(aqygVar3));
        ajjz ajjzVar = this.o;
        ImageView imageView = this.r;
        avgg avggVar = aqcvVar.g;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        this.p.e(ajokVar);
    }
}
