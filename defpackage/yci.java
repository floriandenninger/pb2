package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipConfirmCancelRendererOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yci extends ybn {
    public final aahd c;
    public final LoadingFrameLayout d;
    public final ybo e;
    private final ybz f;
    private final View g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private auwo k;

    public yci(Context context, aahd aahdVar, aoae aoaeVar, ajyw ajywVar, ViewGroup viewGroup, ybo yboVar, aoae aoaeVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(aoaeVar2, null, null, null);
        this.e = yboVar;
        this.c = new ycc(aahdVar, new ycb(new Runnable() { // from class: ycg
            @Override // java.lang.Runnable
            public final void run() {
                yci.this.e.a();
            }
        }, 1));
        View inflate = LayoutInflater.from(context).inflate(R.layout.ypc_sponsorship_confirm_cancel_layout, viewGroup, false);
        this.g = inflate;
        this.i = (TextView) inflate.findViewById(R.id.title);
        this.j = (TextView) inflate.findViewById(R.id.description);
        this.f = ajywVar.e(inflate);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.confirm_button_container);
        this.d = loadingFrameLayout;
        loadingFrameLayout.a();
        this.h = (TextView) inflate.findViewById(R.id.confirm_button);
        inflate.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() { // from class: yce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yci.this.e.a();
            }
        });
        aoaeVar.q(new ych(this));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ybn
    public final void d() {
        aahc.c(this.c, this.k.h, null);
    }

    @Override // defpackage.ybn, defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(final ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        auwo auwoVar = (auwo) obj;
        this.b.b.add(this);
        this.a = true;
        this.k = auwoVar;
        aulq aulqVar = auwoVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        auwp auwpVar = (auwp) aulqVar.pX(SponsorshipConfirmCancelRendererOuterClass.sponsorshipDialogHeaderRenderer);
        ybz ybzVar = this.f;
        avgg avggVar = auwpVar.b;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        avgg avggVar2 = auwpVar.d;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        avgg avggVar3 = auwpVar.c;
        if (avggVar3 == null) {
            avggVar3 = avgg.a;
        }
        arfs arfsVar = auwpVar.e;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        ybzVar.a(avggVar, avggVar2, avggVar3, arfsVar);
        TextView textView = this.i;
        if ((auwoVar.b & 2) != 0) {
            aqygVar = auwoVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.j;
        if ((auwoVar.b & 4) != 0) {
            aqygVar2 = auwoVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(ajcq.b(aqygVar2));
        apmh apmhVar = auwoVar.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        final apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        TextView textView3 = this.h;
        aqyg aqygVar3 = apmgVar.i;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        textView3.setText(ajcq.b(aqygVar3));
        this.h.setOnClickListener(new View.OnClickListener() { // from class: ycf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yci yciVar = yci.this;
                apmg apmgVar2 = apmgVar;
                ajok ajokVar2 = ajokVar;
                yciVar.a = false;
                yciVar.d.c();
                Map g = acrc.g(apmgVar2);
                g.putAll(ajokVar2.e());
                aahd aahdVar = yciVar.c;
                apxf apxfVar = apmgVar2.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, g);
            }
        });
        acra acraVar = ajokVar.a;
        acraVar.u(new acqx(auwoVar.i), null);
        acraVar.u(new acqx(apmgVar.t), null);
        aahc.c(this.c, auwoVar.g, null);
    }
}
