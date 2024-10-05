package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mmj {
    private final int a;
    private final Context b;
    private final ajjs c;
    private final ajuw d;
    private final ftn e;
    private final View f;
    private View g;
    private TextView h;
    private TextView i;
    private View j;
    private ImageView k;
    private ftm l;
    private ajkj m;
    private ajkj n;

    public mmj(Context context, ajjs ajjsVar, ftn ftnVar, ajuw ajuwVar, View view, int i) {
        this.f = view;
        this.b = context;
        this.c = ajjsVar;
        this.d = ajuwVar;
        this.e = ftnVar;
        this.a = i;
    }

    public final void a() {
        b();
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void b() {
        ajkj ajkjVar = this.m;
        if (ajkjVar != null) {
            ajkjVar.a();
        }
        ajkj ajkjVar2 = this.n;
        if (ajkjVar2 != null) {
            ajkjVar2.a();
        }
        ftm ftmVar = this.l;
        if (ftmVar != null) {
            ftmVar.d();
        }
    }

    public final void c(aqbh aqbhVar, ajok ajokVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        atdc atdcVar = null;
        if (this.g == null) {
            View inflate = ((ViewStub) this.f.findViewById(this.a)).inflate();
            this.g = inflate;
            this.h = (TextView) inflate.findViewById(R.id.channel_title);
            this.i = (TextView) this.g.findViewById(R.id.subscriber_count);
            this.j = this.g.findViewById(R.id.contextual_menu_anchor);
            this.k = (ImageView) this.g.findViewById(R.id.avatar_protection);
            ajkj z = ahbw.z(this.c, (ImageView) this.g.findViewById(R.id.channel_avatar));
            this.m = z;
            z.i(ImageView.ScaleType.CENTER_CROP);
            ajkj z2 = ahbw.z(this.c, (ImageView) this.g.findViewById(R.id.background_view));
            this.n = z2;
            z2.i(ImageView.ScaleType.CENTER_CROP);
            this.l = this.e.a((TextView) this.g.findViewById(R.id.subscribe_button), null);
        }
        this.g.setVisibility(0);
        int layoutDirection = this.b.getResources().getConfiguration().getLayoutDirection();
        if (this.g.getLayoutDirection() != layoutDirection) {
            this.g.setLayoutDirection(layoutDirection);
        }
        ajkj ajkjVar = this.m;
        avgg avggVar = aqbhVar.g;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajkjVar.k(avggVar);
        ajkj ajkjVar2 = this.n;
        avgg avggVar2 = aqbhVar.f;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        ajkjVar2.k(avggVar2);
        TextView textView = this.h;
        if ((aqbhVar.b & 1) != 0) {
            aqygVar = aqbhVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.i;
        if ((aqbhVar.b & 2) != 0) {
            aqygVar2 = aqbhVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(ajcq.b(aqygVar2));
        aqbi aqbiVar = aqbhVar.e;
        if (aqbiVar == null) {
            aqbiVar = aqbi.a;
        }
        auzj auzjVar = aqbiVar.c;
        if (auzjVar == null) {
            auzjVar = auzj.a;
        }
        aqbi aqbiVar2 = aqbhVar.e;
        if (aqbiVar2 == null) {
            aqbiVar2 = aqbi.a;
        }
        if ((aqbiVar2.b & 1) != 0) {
            Context context = this.b;
            aone builder = auzjVar.toBuilder();
            if ((aqbhVar.b & 1) != 0) {
                aqygVar3 = aqbhVar.c;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            fkc.p(context, builder, ajcq.b(aqygVar3));
            auzjVar = (auzj) builder.build();
            aone builder2 = aqbhVar.toBuilder();
            aqbi aqbiVar3 = aqbhVar.e;
            if (aqbiVar3 == null) {
                aqbiVar3 = aqbi.a;
            }
            aone builder3 = aqbiVar3.toBuilder();
            builder3.copyOnWrite();
            aqbi aqbiVar4 = (aqbi) builder3.instance;
            auzjVar.getClass();
            aqbiVar4.c = auzjVar;
            aqbiVar4.b |= 1;
            builder2.copyOnWrite();
            aqbh aqbhVar2 = (aqbh) builder2.instance;
            aqbi aqbiVar5 = (aqbi) builder3.build();
            aqbiVar5.getClass();
            aqbhVar2.e = aqbiVar5;
            aqbhVar2.b |= 4;
            aqbhVar = (aqbh) builder2.build();
        }
        this.l.i(auzjVar, ajokVar.a);
        if (this.j != null && (aqbhVar.b & 2048) != 0) {
            ajok ajokVar2 = new ajok(ajokVar);
            ajokVar2.b = aqbhVar.k.I();
            ajuw ajuwVar = this.d;
            View view = this.f;
            View view2 = this.j;
            aulq aulqVar = aqbhVar.l;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(MenuRendererOuterClass.menuRenderer)) {
                aulq aulqVar2 = aqbhVar.l;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                atdcVar = (atdc) aulqVar2.pX(MenuRendererOuterClass.menuRenderer);
            }
            ajuwVar.e(view, view2, atdcVar, aqbhVar, ajokVar2.a);
        }
        if (this.k == null || (aqbhVar.b & 256) == 0) {
            return;
        }
        mmi mmiVar = new mmi();
        ImageView imageView = this.k;
        asnf asnfVar = aqbhVar.j;
        if (asnfVar == null) {
            asnfVar = asnf.a;
        }
        imageView.setColorFilter(asnfVar.b, PorterDuff.Mode.SRC_IN);
        this.k.setImageDrawable(mmiVar);
    }
}
