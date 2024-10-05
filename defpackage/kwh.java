package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kwh implements ypd {
    public final zaw a;
    public final Context b;
    public final acqz c;
    public final aaea d;
    public final ajyf e;
    public final ajyf f;
    public final LoadingFrameLayout g;
    public final View h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final ajwi l;
    public final kwg m;
    public final ypa n;
    private final azrw o;
    private final Executor p;
    private final RecyclerView q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [ajos, java.lang.Object] */
    public kwh(azrw azrwVar, zaw zawVar, Context context, Executor executor, ajyg ajygVar, ajvb ajvbVar, ajxj ajxjVar, lwk lwkVar, ypa ypaVar, sxw sxwVar, acqz acqzVar, LoadingFrameLayout loadingFrameLayout, kwg kwgVar, aaea aaeaVar, byte[] bArr, byte[] bArr2) {
        this.o = azrwVar;
        this.a = zawVar;
        this.b = context;
        this.p = executor;
        this.c = acqzVar;
        this.g = loadingFrameLayout;
        loadingFrameLayout.f(new akdd() { // from class: kwf
            @Override // defpackage.akdd
            public final void qJ() {
                kwh.this.a();
            }
        });
        this.h = loadingFrameLayout.findViewById(R.id.suggested_videos_header);
        TextView textView = (TextView) loadingFrameLayout.findViewById(R.id.close_button);
        this.j = textView;
        this.e = ajygVar.a(textView);
        TextView textView2 = (TextView) loadingFrameLayout.findViewById(R.id.next_button);
        this.k = textView2;
        this.f = ajygVar.a(textView2);
        this.i = (TextView) loadingFrameLayout.findViewById(R.id.title);
        RecyclerView recyclerView = (RecyclerView) loadingFrameLayout.findViewById(R.id.suggested_videos_list);
        this.q = recyclerView;
        recyclerView.af(new LinearLayoutManager());
        kwx kwxVar = (kwx) acqzVar;
        this.l = lwkVar.a(null, null, recyclerView, (aasm) azrwVar.get(), ajxjVar.a((aasm) azrwVar.get(), kwxVar.af), kwxVar.af, ajvbVar.get(), ajxa.WI, ajwk.d, ajhb.SUGGESTED_PLAYLIST, sxwVar, context);
        this.n = ypaVar;
        this.m = kwgVar;
        this.d = aaeaVar;
    }

    public final void a() {
        this.g.c();
        this.h.setVisibility(8);
        abat f = ((abav) this.o.get()).f();
        f.k();
        abav abavVar = (abav) this.o.get();
        ynm.k(abavVar.g.b(f, this.p), angq.a, new ynk() { // from class: kwc
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                kwh kwhVar = kwh.this;
                zga.d("Error requesting suggested playlist videos.", th);
                kwhVar.g.b(kwhVar.a.b(th), true);
            }
        }, new ynl() { // from class: kwd
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                final kwh kwhVar = kwh.this;
                arsp arspVar = (arsp) obj;
                arsn arsnVar = arspVar.d;
                if (arsnVar == null) {
                    arsnVar = arsn.a;
                }
                if ((arsnVar.b & 1) == 0) {
                    kwhVar.g.b(kwhVar.b.getString(R.string.error_generic), false);
                    return;
                }
                kwhVar.g.a();
                kwhVar.h.setVisibility(0);
                if ((arspVar.b & 8) != 0) {
                    ((acqq) ((kwx) kwhVar.c).af).D(new acqx(arspVar.f.I()));
                }
                arsn arsnVar2 = arspVar.d;
                if (arsnVar2 == null) {
                    arsnVar2 = arsn.a;
                }
                auov auovVar = arsnVar2.c;
                if (auovVar == null) {
                    auovVar = auov.a;
                }
                auou auouVar = auovVar.g;
                if (auouVar == null) {
                    auouVar = auou.a;
                }
                if (auouVar == null || auouVar.b != 222895468) {
                    kwhVar.h.setVisibility(8);
                } else {
                    arbs arbsVar = (arbs) auouVar.c;
                    aulq aulqVar = arbsVar.d;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    kwhVar.b(aulqVar, kwhVar.e, kwhVar.j);
                    aulq aulqVar2 = arbsVar.c;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    kwhVar.b(aulqVar2, kwhVar.f, kwhVar.k);
                    if (kwhVar.k.getVisibility() == 0) {
                        kwhVar.f.d = new ajyb() { // from class: kwe
                            @Override // defpackage.ajyb
                            public final Map a() {
                                return amrz.k("PLAYLIST_CREATION_LISTENER_KEY", new kwb(kwh.this));
                            }
                        };
                    }
                    aqyg aqygVar = arbsVar.b;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    kwhVar.i.setText(ajcq.b(aqygVar));
                    kwhVar.i.setContentDescription(ajcq.i(aqygVar));
                    kwhVar.h.setElevation(yjk.K(kwhVar.b.getResources().getDisplayMetrics(), true != evr.af(kwhVar.d.a()) ? 4 : 0));
                }
                arsn arsnVar3 = arspVar.d;
                if (arsnVar3 == null) {
                    arsnVar3 = arsn.a;
                }
                auov auovVar2 = arsnVar3.c;
                if (auovVar2 == null) {
                    auovVar2 = auov.a;
                }
                kwhVar.l.M(new aamd(auovVar2));
            }
        });
    }

    public final void b(aulq aulqVar, ajyf ajyfVar, TextView textView) {
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
            ajyfVar.g();
            ajyfVar.b(apmgVar, ((kwx) this.c).af);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{kwj.class};
        }
        if (i == 0) {
            ((kwx) this.m).dismiss();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
