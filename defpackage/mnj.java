package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnj extends ajpc {
    public final RelativeLayout a;
    public final Context b;
    public final Resources c;
    public aqcq d;
    private final ajop e;
    private final aahd f;
    private final ajjz g;
    private final View h;
    private final ajuw i;
    private final View j;
    private final ImageView k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final lab p;
    private final ajoi q;
    private CharSequence r;

    public mnj(Context context, gma gmaVar, ajjz ajjzVar, ajuw ajuwVar, aahd aahdVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ajoi ajoiVar = new ajoi(aahdVar, gmaVar);
        this.q = ajoiVar;
        this.b = context;
        this.e = gmaVar;
        this.i = ajuwVar;
        ajjzVar.getClass();
        this.g = ajjzVar;
        aahdVar.getClass();
        this.f = aahdVar;
        this.c = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_show_item, (ViewGroup) null);
        this.h = inflate;
        this.a = (RelativeLayout) inflate.findViewById(R.id.thumbnail_layout);
        this.k = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.j = inflate.findViewById(R.id.contextual_menu_anchor);
        this.o = (TextView) inflate.findViewById(R.id.bottom_text);
        this.l = (TextView) inflate.findViewById(R.id.title);
        this.m = (TextView) inflate.findViewById(R.id.short_byline);
        this.n = (TextView) inflate.findViewById(R.id.long_byline);
        this.p = cVar.g((ViewStub) inflate.findViewById(R.id.bottom_title_standalone_red_badge));
        gmaVar.c(inflate);
        inflate.setOnClickListener(ajoiVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.e).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.q.c();
    }

    @Override // defpackage.ajpc
    protected final /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        avgg avggVar;
        atdc atdcVar;
        aqyg aqygVar;
        aqcq aqcqVar = (aqcq) obj;
        apkf apkfVar = null;
        if (!aqcqVar.equals(this.d)) {
            this.r = null;
        }
        this.d = aqcqVar;
        ajoi ajoiVar = this.q;
        acra acraVar = ajokVar.a;
        if ((aqcqVar.b & 4) != 0) {
            apxfVar = aqcqVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        this.a.getViewTreeObserver().addOnPreDrawListener(new mni(this));
        this.g.e(this.k);
        ajjz ajjzVar = this.g;
        ImageView imageView = this.k;
        auul auulVar = this.d.d;
        if (auulVar == null) {
            auulVar = auul.a;
        }
        if ((auulVar.b & 1) != 0) {
            auul auulVar2 = this.d.d;
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
        TextView textView = this.o;
        if (this.r == null) {
            ArrayList arrayList = new ArrayList();
            for (avfv avfvVar : this.d.e) {
                avfl avflVar = avfvVar.d;
                if (avflVar == null) {
                    avflVar = avfl.a;
                }
                if ((avflVar.b & 1) != 0) {
                    avfl avflVar2 = avfvVar.d;
                    if (avflVar2 == null) {
                        avflVar2 = avfl.a;
                    }
                    aqyg aqygVar2 = avflVar2.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    arrayList.add(ajcq.b(aqygVar2));
                }
            }
            this.r = TextUtils.join(System.getProperty("line.separator"), arrayList);
        }
        whu.G(textView, this.r);
        acra acraVar2 = ajokVar.a;
        ajuw ajuwVar = this.i;
        View view = ((gma) this.e).b;
        View view2 = this.j;
        atdf atdfVar = aqcqVar.j;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = aqcqVar.j;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
        } else {
            atdcVar = null;
        }
        ajuwVar.e(view, view2, atdcVar, aqcqVar, acraVar2);
        TextView textView2 = this.l;
        aqyg aqygVar3 = aqcqVar.c;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar3));
        if ((aqcqVar.b & 8) != 0) {
            aqygVar = aqcqVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned a = aahk.a(aqygVar, this.f, false);
        if (!TextUtils.isEmpty(a)) {
            whu.G(this.m, a);
            this.n.setVisibility(8);
        } else {
            TextView textView3 = this.n;
            aqyg aqygVar4 = aqcqVar.h;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            whu.G(textView3, aahk.a(aqygVar4, this.f, false));
            this.m.setVisibility(8);
        }
        lab labVar = this.p;
        apkd apkdVar = this.d.i;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 2) != 0) {
            apkd apkdVar2 = this.d.i;
            if (apkdVar2 == null) {
                apkdVar2 = apkd.a;
            }
            apkfVar = apkdVar2.d;
            if (apkfVar == null) {
                apkfVar = apkf.a;
            }
        }
        labVar.a(apkfVar);
        this.e.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqcq) obj).l.I();
    }
}
