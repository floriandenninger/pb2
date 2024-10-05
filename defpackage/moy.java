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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class moy extends ajpc {
    final RelativeLayout a;
    final RelativeLayout b;
    final ImageView c;
    final TextView d;
    final TextView e;
    final TextView f;
    final TextView g;
    final View h;
    final lab i;
    private final Context j;
    private final Resources k;
    private final aahd l;
    private final ajop m;
    private final View n;
    private final ajjz o;
    private final ajuw p;
    private final LinearLayout q;
    private final ajoi r;
    private CharSequence s;
    private ardc t;

    public moy(Context context, gma gmaVar, ajjz ajjzVar, ajuw ajuwVar, aahd aahdVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ajoi ajoiVar = new ajoi(aahdVar, gmaVar);
        this.r = ajoiVar;
        this.j = context;
        aahdVar.getClass();
        this.l = aahdVar;
        this.m = gmaVar;
        ajjzVar.getClass();
        this.o = ajjzVar;
        this.p = ajuwVar;
        this.k = context.getResources();
        View inflate = LayoutInflater.from(context).inflate(R.layout.grid_show_item, (ViewGroup) null);
        this.n = inflate;
        this.q = (LinearLayout) inflate.findViewById(R.id.grid_show_view);
        this.a = (RelativeLayout) inflate.findViewById(R.id.thumbnail_layout);
        this.b = (RelativeLayout) inflate.findViewById(R.id.text_layout);
        this.c = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.d = (TextView) inflate.findViewById(R.id.bottom_panel);
        this.h = inflate.findViewById(R.id.contextual_menu_anchor);
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.f = (TextView) inflate.findViewById(R.id.short_byline);
        this.g = (TextView) inflate.findViewById(R.id.long_byline);
        this.i = cVar.g((ViewStub) inflate.findViewById(R.id.bottom_title_standalone_red_badge));
        gmaVar.c(inflate);
        inflate.setOnClickListener(ajoiVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.m).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.r.c();
    }

    @Override // defpackage.ajpc
    protected final /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aswa aswaVar;
        int dimension;
        avgg avggVar;
        atdc atdcVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        ardc ardcVar = (ardc) obj;
        apkf apkfVar = null;
        if (!ardcVar.equals(this.t)) {
            this.s = null;
        }
        this.t = ardcVar;
        ajoi ajoiVar = this.r;
        acra acraVar = ajokVar.a;
        if ((ardcVar.b & 4) != 0) {
            apxfVar = ardcVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        if (fav.h(ajokVar)) {
            this.q.setOrientation(1);
            layoutParams.width = -1;
            this.e.setMaxLines(this.k.getInteger(R.integer.compact_renderer_title_grid_mode_max_lines));
            dimension = 0;
        } else {
            this.q.setOrientation(0);
            Resources resources = this.k;
            ardc ardcVar2 = this.t;
            if ((ardcVar2.b & 1024) != 0) {
                aswaVar = ardcVar2.k;
                if (aswaVar == null) {
                    aswaVar = aswa.a;
                }
            } else {
                aswaVar = null;
            }
            muf.c(resources, aswaVar, layoutParams, layoutParams2);
            Resources resources2 = this.k;
            aswa aswaVar2 = this.t.k;
            if (aswaVar2 == null) {
                aswaVar2 = aswa.a;
            }
            this.e.setMaxLines(muf.a(resources2, aswaVar2));
            dimension = (int) this.k.getDimension(R.dimen.compact_video_thumbnail_margin);
        }
        layoutParams.setMarginEnd(dimension);
        this.o.e(this.c);
        ajjz ajjzVar = this.o;
        ImageView imageView = this.c;
        auul auulVar = this.t.d;
        if (auulVar == null) {
            auulVar = auul.a;
        }
        if ((auulVar.b & 1) != 0) {
            auul auulVar2 = this.t.d;
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
        TextView textView = this.d;
        if (this.s == null) {
            ArrayList arrayList = new ArrayList();
            for (avfv avfvVar : this.t.e) {
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
            this.s = TextUtils.join(System.getProperty("line.separator"), arrayList);
        }
        whu.G(textView, this.s);
        acra acraVar2 = ajokVar.a;
        ajuw ajuwVar = this.p;
        View view = ((gma) this.m).b;
        View view2 = this.h;
        atdf atdfVar = ardcVar.j;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = ardcVar.j;
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
        ajuwVar.e(view, view2, atdcVar, ardcVar, acraVar2);
        TextView textView2 = this.e;
        if ((ardcVar.b & 1) != 0) {
            aqygVar = ardcVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView2, ajcq.b(aqygVar));
        if ((ardcVar.b & 16) != 0) {
            aqygVar2 = ardcVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned a = aahk.a(aqygVar2, this.l, false);
        if (!TextUtils.isEmpty(a)) {
            whu.G(this.f, a);
            this.g.setVisibility(8);
        } else {
            TextView textView3 = this.g;
            if ((ardcVar.b & 32) != 0) {
                aqygVar3 = ardcVar.h;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            whu.G(textView3, aahk.a(aqygVar3, this.l, false));
            this.f.setVisibility(8);
        }
        lab labVar = this.i;
        apkd apkdVar = this.t.i;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 2) != 0) {
            apkd apkdVar2 = this.t.i;
            if (apkdVar2 == null) {
                apkdVar2 = apkd.a;
            }
            apkfVar = apkdVar2.d;
            if (apkfVar == null) {
                apkfVar = apkf.a;
            }
        }
        labVar.a(apkfVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ardc) obj).l.I();
    }
}
