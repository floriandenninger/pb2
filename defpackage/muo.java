package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muo implements ajom {
    private final Context a;
    private final aahd b;
    private final ajuw c;
    private final ajjz d;
    private final FrameLayout e;
    private final ajoi f;
    private mun g;
    private mun h;
    private mun i;
    private final c j;

    public muo(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = aahdVar;
        this.a = context;
        this.c = ajuwVar;
        ajjzVar.getClass();
        this.d = ajjzVar;
        this.j = cVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setBackground(new fyl(wbs.Q(context, R.attr.yt10PercentLayer), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
        this.f = new ajoi(aahdVar, frameLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.f.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        avgg avggVar;
        atdc atdcVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        apkf apkfVar;
        jak jakVar = (jak) obj;
        ajoi ajoiVar = this.f;
        acra acraVar = ajokVar.a;
        apxf apxfVar = jakVar.a().g;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        this.e.removeAllViews();
        if (this.a.getResources().getConfiguration().orientation == 2) {
            if (this.h == null) {
                this.h = new mun(this.a, this.d, this.b, this.c, this.j, null, null, null);
            }
            this.i = this.h;
        } else {
            if (this.g == null) {
                this.g = new mun(this.a, this.d, this.b, this.c, this.j, null, null, null);
            }
            this.i = this.g;
        }
        mun munVar = this.i;
        jakVar.getClass();
        auuf a = jakVar.a();
        a.getClass();
        avgg avggVar2 = null;
        if (!a.equals(munVar.n)) {
            munVar.o = null;
        }
        munVar.n = a;
        ajokVar.a.u(new acqx(munVar.n.l), null);
        whl.I(munVar.b, jakVar.a.i, munVar.n);
        munVar.e.e(munVar.c);
        ajjz ajjzVar = munVar.e;
        ImageView imageView = munVar.c;
        auul auulVar = munVar.n.d;
        if (auulVar == null) {
            auulVar = auul.a;
        }
        if ((auulVar.b & 1) != 0) {
            auul auulVar2 = munVar.n.d;
            if (auulVar2 == null) {
                auulVar2 = auul.a;
            }
            auuk auukVar = auulVar2.c;
            if (auukVar == null) {
                auukVar = auuk.a;
            }
            avggVar = auukVar.b;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        View view = munVar.i;
        if (view != null) {
            if (munVar.q == null) {
                munVar.q = new lad((ViewStub) view);
            }
            lad ladVar = munVar.q;
            if (munVar.o == null) {
                ArrayList arrayList = new ArrayList();
                for (avfv avfvVar : munVar.n.e) {
                    avfl avflVar = avfvVar.d;
                    if (avflVar == null) {
                        avflVar = avfl.a;
                    }
                    if ((avflVar.b & 1) != 0) {
                        avfl avflVar2 = avfvVar.d;
                        if (avflVar2 == null) {
                            avflVar2 = avfl.a;
                        }
                        aqyg aqygVar4 = avflVar2.c;
                        if (aqygVar4 == null) {
                            aqygVar4 = aqyg.a;
                        }
                        arrayList.add(ajcq.b(aqygVar4));
                    }
                }
                munVar.o = TextUtils.join(System.getProperty("line.separator"), arrayList);
            }
            CharSequence charSequence = munVar.o;
            if (TextUtils.isEmpty(charSequence)) {
                ladVar.a.setVisibility(8);
            } else {
                if (!ladVar.b) {
                    ladVar.c = (TextView) ladVar.a.inflate();
                    ladVar.b = true;
                }
                TextView textView = ladVar.c;
                if (textView != null) {
                    textView.setText(charSequence);
                    ladVar.c.setVisibility(0);
                    ladVar.a.setVisibility(0);
                }
            }
        }
        View view2 = munVar.h;
        if (view2 != null) {
            if (munVar.p == null) {
                munVar.p = new gnz((ViewStub) view2);
            }
            munVar.p.a(mcy.O(munVar.n.e));
        }
        acra acraVar2 = ajokVar.a;
        ajuw ajuwVar = munVar.f;
        View view3 = munVar.a;
        View view4 = munVar.g;
        atdf atdfVar = munVar.n.k;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = munVar.n.k;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdc atdcVar2 = atdfVar2.c;
            if (atdcVar2 == null) {
                atdcVar2 = atdc.a;
            }
            atdcVar = atdcVar2;
        } else {
            atdcVar = null;
        }
        ajuwVar.e(view3, view4, atdcVar, munVar.n, acraVar2);
        TextView textView2 = munVar.j;
        auuf auufVar = munVar.n;
        if ((auufVar.b & 1) != 0) {
            aqygVar = auufVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView2, ajcq.b(aqygVar));
        auuf auufVar2 = munVar.n;
        if ((auufVar2.b & 16) != 0) {
            aqygVar2 = auufVar2.h;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned a2 = aahk.a(aqygVar2, munVar.b, false);
        if (!TextUtils.isEmpty(a2)) {
            whu.G(munVar.k, a2);
            munVar.l.setVisibility(8);
        } else {
            TextView textView3 = munVar.l;
            auuf auufVar3 = munVar.n;
            if ((auufVar3.b & 32) != 0) {
                aqygVar3 = auufVar3.i;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            whu.G(textView3, aahk.a(aqygVar3, munVar.b, false));
            munVar.k.setVisibility(8);
        }
        lab labVar = munVar.m;
        apkd apkdVar = munVar.n.j;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 2) != 0) {
            apkd apkdVar2 = munVar.n.j;
            if (apkdVar2 == null) {
                apkdVar2 = apkd.a;
            }
            apkfVar = apkdVar2.d;
            if (apkfVar == null) {
                apkfVar = apkf.a;
            }
        } else {
            apkfVar = null;
        }
        labVar.a(apkfVar);
        munVar.e.e(munVar.d);
        ajjz ajjzVar2 = munVar.e;
        ImageView imageView2 = munVar.d;
        apsq apsqVar = munVar.n.f;
        if (apsqVar == null) {
            apsqVar = apsq.a;
        }
        apsr apsrVar = apsqVar.c;
        if (apsrVar == null) {
            apsrVar = apsr.a;
        }
        if ((apsrVar.b & 1) != 0) {
            apsq apsqVar2 = munVar.n.f;
            if (apsqVar2 == null) {
                apsqVar2 = apsq.a;
            }
            apsr apsrVar2 = apsqVar2.c;
            if (apsrVar2 == null) {
                apsrVar2 = apsr.a;
            }
            avggVar2 = apsrVar2.c;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
        }
        ajjzVar2.h(imageView2, avggVar2);
        this.e.addView(this.i.a);
    }
}
