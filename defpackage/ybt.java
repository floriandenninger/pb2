package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ybt extends ajpc implements yfi, zfk {
    private static final String d = System.getProperty("line.separator");
    public final aahd a;
    public final ybo b;
    public final LoadingFrameLayout c;
    private final ybz e;
    private final View f;
    private final ycl g;
    private final ycl h;
    private final View i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final aoae n;

    public ybt(Context context, ViewGroup viewGroup, aahd aahdVar, aoae aoaeVar, zzw zzwVar, ajyw ajywVar, ybo yboVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        ycc yccVar = new ycc(aahdVar, new ycb(new Runnable() { // from class: ybs
            @Override // java.lang.Runnable
            public final void run() {
                ybt.this.b.a();
            }
        }, 1));
        this.a = yccVar;
        this.n = aoaeVar;
        this.b = yboVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ypc_membership_with_perks_offer_layout, viewGroup, false);
        this.f = inflate;
        this.e = ajywVar.e(inflate);
        View findViewById = inflate.findViewById(R.id.close_button);
        this.i = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: ybp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ybt.this.b.a();
            }
        });
        this.g = zzwVar.b(yccVar, inflate.findViewById(R.id.yt_perks));
        this.h = zzwVar.b(yccVar, inflate.findViewById(R.id.custom_perks));
        this.l = (TextView) inflate.findViewById(R.id.offer_alerts);
        this.j = (TextView) inflate.findViewById(R.id.offer_price_text);
        this.k = (TextView) inflate.findViewById(R.id.offer_payment_clauses);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.purchase_button_container);
        this.c = loadingFrameLayout;
        loadingFrameLayout.a();
        this.m = (TextView) inflate.findViewById(R.id.purchase_button);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.n.p(this);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(final ajok ajokVar, Object obj) {
        aqyg aqygVar;
        List asList;
        aqyg aqygVar2;
        atcp atcpVar = (atcp) obj;
        this.n.o(this);
        ybz ybzVar = this.e;
        avgg avggVar = atcpVar.k;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        avgg avggVar2 = atcpVar.e;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        avgg avggVar3 = atcpVar.d;
        if (avggVar3 == null) {
            avggVar3 = avgg.a;
        }
        arfs arfsVar = atcpVar.f;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        ybzVar.a(avggVar, avggVar2, avggVar3, arfsVar);
        View view = this.i;
        apmh apmhVar = atcpVar.j;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if (apmhVar != null) {
            apmg apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            aott aottVar = apmgVar.s;
            if (aottVar == null) {
                aottVar = aott.a;
            }
            aots aotsVar = aottVar.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            if ((aotsVar.b & 2) != 0) {
                apmg apmgVar2 = apmhVar.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                aott aottVar2 = apmgVar2.s;
                if (aottVar2 == null) {
                    aottVar2 = aott.a;
                }
                aots aotsVar2 = aottVar2.c;
                if (aotsVar2 == null) {
                    aotsVar2 = aots.a;
                }
                view.setContentDescription(aotsVar2.c);
            }
        }
        TextView textView = this.j;
        if ((atcpVar.b & 16) != 0) {
            aqygVar = atcpVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        final TextView textView2 = this.j;
        textView2.getClass();
        textView2.post(new Runnable() { // from class: ybr
            @Override // java.lang.Runnable
            public final void run() {
                textView2.requestLayout();
            }
        });
        this.k.setText(ajcq.j(d, aahk.d(atcpVar.h, this.a)));
        aony aonyVar = atcpVar.c;
        aahd aahdVar = this.a;
        if (aonyVar == null || aonyVar.isEmpty()) {
            asList = Arrays.asList(aahk.a);
        } else {
            asList = new ArrayList();
            Iterator it = aonyVar.iterator();
            while (it.hasNext()) {
                asList.add(aahk.a((aqyg) it.next(), aahdVar, true));
            }
        }
        boolean z = !asList.isEmpty();
        if (z) {
            this.l.setText(ajcq.j(d, asList));
        }
        whu.I(this.l, z);
        apmh apmhVar2 = atcpVar.i;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        final apmg apmgVar3 = apmhVar2.c;
        if (apmgVar3 == null) {
            apmgVar3 = apmg.a;
        }
        TextView textView3 = this.m;
        if ((apmgVar3.b & 256) != 0) {
            aqygVar2 = apmgVar3.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView3.setText(ajcq.b(aqygVar2));
        this.m.setOnClickListener(new View.OnClickListener() { // from class: ybq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ybt ybtVar = ybt.this;
                apmg apmgVar4 = apmgVar3;
                ajok ajokVar2 = ajokVar;
                ybtVar.c.c();
                Map g = acrc.g(apmgVar4);
                g.putAll(ajokVar2.e());
                aahd aahdVar2 = ybtVar.a;
                apxf apxfVar = apmgVar4.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar2.c(apxfVar, g);
            }
        });
        ycl yclVar = this.g;
        aulq aulqVar = atcpVar.l;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ybz.c(yclVar, aulqVar);
        ycl yclVar2 = this.h;
        aulq aulqVar2 = atcpVar.m;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        ybz.c(yclVar2, aulqVar2);
        ajokVar.a.u(new acqx(apmgVar3.t), null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atcp) obj).n.I();
    }

    @Override // defpackage.yfi
    public final void g() {
        this.c.a();
    }

    @Override // defpackage.yfi
    public final void h() {
        this.c.a();
    }

    @Override // defpackage.zfk
    public final void j() {
        throw null;
    }

    @Override // defpackage.yfi
    public final void mJ(asfw asfwVar) {
        this.c.a();
    }
}
