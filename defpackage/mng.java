package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mng extends ajpc {
    public final Context a;
    public final aahd b;
    public final ajut c;
    public final ysy d;
    public aqcm e;
    public boolean f;
    mnf g;
    mnf h;
    mnf i;
    public final gcl j;
    public final akht k;
    private final ajop l;
    private final ajjz m;
    private final FrameLayout n;
    private final ajoi o;
    private final aadw p;
    private final ajun q;

    public mng(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajut ajutVar, akht akhtVar, aadw aadwVar, ajun ajunVar, ysy ysyVar, gcl gclVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.l = gmaVar;
        this.b = aahdVar;
        this.c = ajutVar;
        this.m = ajjzVar;
        this.k = akhtVar;
        this.p = aadwVar;
        this.q = ajunVar;
        ajoi ajoiVar = new ajoi(aahdVar, gmaVar);
        this.o = ajoiVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setOnClickListener(ajoiVar);
        gmaVar.c(frameLayout);
        this.d = ysyVar;
        this.j = gclVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.l).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.o.c();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        apmg apmgVar;
        aqcm aqcmVar = (aqcm) obj;
        ajoi ajoiVar = this.o;
        acra acraVar = ajokVar.a;
        if ((aqcmVar.b & 16) != 0) {
            apxfVar = aqcmVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        if (this.f) {
            return;
        }
        this.e = aqcmVar;
        this.n.removeAllViews();
        int i = this.a.getResources().getConfiguration().orientation;
        boolean z = (aqcmVar.b & 1024) != 0 && aqcmVar.m;
        if (i == 2) {
            if (this.h == null) {
                this.h = new mnf(this, this.a, this.m, this.p, z);
            }
            this.i = this.h;
        } else {
            if (this.g == null) {
                this.g = new mnf(this, this.a, this.m, this.p, z);
            }
            this.i = this.g;
        }
        mnf mnfVar = this.i;
        acra acraVar2 = ajokVar.a;
        TextView textView = mnfVar.e;
        aqyg aqygVar = mnfVar.k.e.e;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = mnfVar.f;
        aqyg aqygVar2 = mnfVar.k.e.f;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        mng mngVar = mnfVar.k;
        aqcm aqcmVar2 = mngVar.e;
        int i2 = aqcmVar2.c;
        if (i2 != 13) {
            mnfVar.b.h(mnfVar.d, i2 == 1 ? (avgg) aqcmVar2.d : null);
        } else {
            ImageView imageView = mnfVar.d;
            ajut ajutVar = mngVar.c;
            arfr b = arfr.b(((arfs) aqcmVar2.d).c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ajutVar.a(b));
        }
        if ((mnfVar.k.e.b & 256) == 0) {
            mnfVar.h.setVisibility(8);
        } else {
            mnfVar.h.setVisibility(0);
        }
        apmh apmhVar = mnfVar.k.e.i;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((1 & apmhVar.b) != 0) {
            apmh apmhVar2 = mnfVar.k.e.i;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", mnfVar.k.e);
        mnfVar.i.a(apmgVar, acraVar2, hashMap);
        if (mnfVar.i.h) {
            mnfVar.g.setPadding(0, 0, 0, 0);
        } else {
            TextView textView3 = mnfVar.g;
            int i3 = mnfVar.c;
            textView3.setPadding(i3, 0, i3, 0);
        }
        if (yjk.aa(mnfVar.k.a) && evr.aN(mnfVar.l)) {
            mnfVar.j.e(false);
        }
        mnfVar.a.setBackground(mnfVar.j);
        this.n.addView(this.i.a);
        if (!this.q.m(aqcmVar)) {
            this.q.l(aqcmVar);
            aahd aahdVar = this.b;
            apxf apxfVar2 = this.e.h;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar.c(apxfVar2, null);
        }
        this.l.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqcm) obj).n.I();
    }
}
