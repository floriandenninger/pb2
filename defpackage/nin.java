package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AccountLinkButtonRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nin extends ajpc {
    public final ImageView a;
    public final Activity b;
    public final aahd c;
    public aouc d;
    private final View e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final aahv i;
    private ayqx j;
    private final ajjz k;

    public nin(Activity activity, aahd aahdVar, ajjz ajjzVar, aahv aahvVar) {
        this.b = activity;
        aahdVar.getClass();
        this.c = aahdVar;
        this.i = aahvVar;
        this.k = ajjzVar;
        View inflate = View.inflate(activity, R.layout.account_link_setting_item, null);
        this.e = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.link_status);
        this.a = (ImageView) inflate.findViewById(R.id.avatar);
        this.h = inflate.findViewById(R.id.item_view);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ayqx ayqxVar = this.j;
        if (ayqxVar == null || ayqxVar.e()) {
            return;
        }
        ayrz.c((AtomicReference) this.j);
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aoud aoudVar = (aoud) obj;
        aulq aulqVar = aoudVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        this.d = (aouc) aulqVar.pX(AccountLinkButtonRendererOuterClass.accountLinkButtonRenderer);
        TextView textView = this.f;
        if ((aoudVar.b & 2) != 0) {
            aqygVar = aoudVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        this.j = this.i.c().h(this.d.f, false).ab(ayqr.a()).ay(new ayrs() { // from class: nij
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                nin ninVar = nin.this;
                aakt aaktVar = ((aakz) obj2).c;
                if (aaktVar instanceof aoug) {
                    ninVar.g(((aoug) aaktVar).getLinked().booleanValue());
                } else {
                    zga.b("Entity update does not have account link status.");
                }
            }
        }, ktf.r);
        f(new nig(this, 0));
        this.h.setClickable(true);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: nif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nin ninVar = nin.this;
                ninVar.f(new nig(ninVar, 1));
            }
        });
        whu.E(this.h, null);
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.third_party_icon_size);
        avgg avggVar = aoudVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        Uri D = ahbw.D(avggVar, dimensionPixelSize);
        if (D != null) {
            this.a.setImageDrawable(aii.a(this.b, R.drawable.third_party_icon_placeholder));
            this.k.l(D, new nil(this));
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aoud) obj).f.I();
    }

    public final void f(final nim nimVar) {
        this.i.c().f(this.d.f).z(ayqr.a()).o(new ayrs() { // from class: nii
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                nim.this.a(((aoug) ((aakt) obj)).getLinked().booleanValue());
            }
        }).l(new ayrm() { // from class: nih
            @Override // defpackage.ayrm
            public final void a() {
                nim nimVar2 = nim.this;
                zga.b("Could not get link status from entities");
                nimVar2.a(false);
            }
        }).T();
    }

    public final void g(boolean z) {
        aqyg aqygVar;
        TextView textView = this.g;
        if (z) {
            apmh apmhVar = this.d.d;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            apmg apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            apmh apmhVar2 = this.d.e;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            aqygVar = apmgVar2.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        }
        textView.setText(ajcq.b(aqygVar));
        this.h.setClickable(true);
    }
}
