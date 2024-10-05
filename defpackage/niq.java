package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class niq extends ajpc {
    private final ajjz a;
    private final ftn b;
    private final View c;
    private final ViewGroup d;
    private final ImageView e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final gaf m;
    private ftm n;
    private ajyd o;
    private final akpq p;

    public niq(Activity activity, ajjz ajjzVar, ajoy ajoyVar, ftn ftnVar, akpq akpqVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = ajjzVar;
        this.b = ftnVar;
        this.p = akpqVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.interactive_tabbed_header, (ViewGroup) null);
        this.c = inflate;
        this.d = (ViewGroup) inflate.findViewById(R.id.channel_banner_container);
        this.e = (ImageView) inflate.findViewById(R.id.banner);
        this.f = (ImageView) inflate.findViewById(R.id.box_art);
        this.g = (TextView) inflate.findViewById(R.id.channel_title);
        this.h = (TextView) inflate.findViewById(R.id.auto_generated_notice);
        this.i = (TextView) inflate.findViewById(R.id.description);
        this.j = (TextView) inflate.findViewById(R.id.metadata);
        this.k = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.l = (TextView) inflate.findViewById(R.id.subscriber_count);
        this.m = ajoyVar.J(activity, (ViewStub) inflate.findViewById(R.id.metadata_badge));
    }

    private final void f() {
        this.f.setBackground(null);
        this.e.setBackground(null);
        this.g.setText((CharSequence) null);
        this.h.setText((CharSequence) null);
        TextView textView = this.i;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.j;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        f();
        ftm ftmVar = this.n;
        if (ftmVar != null) {
            ftmVar.d();
            this.n = null;
        }
        this.o = null;
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        avgg avggVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        asiw asiwVar = (asiw) obj;
        f();
        avgg avggVar2 = asiwVar.i;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        boolean L = ahbw.L(avggVar2);
        if (L) {
            this.a.h(this.e, avggVar2);
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            whu.I(viewGroup, L);
        } else {
            whu.I(this.e, L);
        }
        if (asiwVar.c == 6) {
            avggVar = (avgg) asiwVar.d;
        } else {
            avggVar = avgg.a;
        }
        if (ahbw.L(avggVar)) {
            this.a.h(this.f, avggVar);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        TextView textView = this.g;
        aqyg aqygVar5 = null;
        if ((asiwVar.b & 2) != 0) {
            aqygVar = asiwVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.h;
        if ((asiwVar.b & 64) != 0) {
            aqygVar2 = asiwVar.k;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = this.i;
        if (textView3 != null) {
            if ((asiwVar.b & 4) != 0) {
                aqygVar4 = asiwVar.f;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            whu.G(textView3, ajcq.b(aqygVar4));
        }
        TextView textView4 = this.j;
        if (textView4 != null) {
            if ((asiwVar.b & 8) != 0) {
                aqygVar3 = asiwVar.g;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            whu.G(textView4, ajcq.b(aqygVar3));
        }
        if (asiwVar.h.size() > 0) {
            aulq aulqVar = (aulq) asiwVar.h.get(0);
            if (aulqVar.pY(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                this.m.f((atdu) aulqVar.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
            }
        }
        for (aulq aulqVar2 : asiwVar.j) {
            if (!aulqVar2.pY(SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
                if (aulqVar2.pY(ButtonRendererOuterClass.buttonRenderer)) {
                    apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                    ajyd c = this.p.c(this.k);
                    this.o = c;
                    c.b(apmgVar, ajokVar.a);
                    return;
                }
            } else {
                auzj auzjVar = (auzj) aulqVar2.pX(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
                ftm a = this.b.a(this.k, null);
                this.n = a;
                a.i(auzjVar, ajokVar.a);
                TextView textView5 = this.l;
                if ((auzjVar.b & 16) != 0 && (aqygVar5 = auzjVar.i) == null) {
                    aqygVar5 = aqyg.a;
                }
                whu.G(textView5, ajcq.b(aqygVar5));
                return;
            }
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
