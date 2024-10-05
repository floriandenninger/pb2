package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfc implements mes {
    public auex a;
    private final ajjz b;
    private final aahd c;
    private final acra d;
    private final wzq e;
    private final ajco f;
    private fqw g;
    private xbw h;
    private View i;
    private View j;
    private View k;
    private TextView l;
    private TextView m;
    private ImageView n;
    private final ajyw o;

    public mfc(ajjz ajjzVar, aahd aahdVar, acra acraVar, wzq wzqVar, Context context, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ajjzVar.getClass();
        this.b = ajjzVar;
        aahdVar.getClass();
        this.c = aahdVar;
        acraVar.getClass();
        this.d = acraVar;
        wzqVar.getClass();
        this.e = wzqVar;
        ajcn a = ajco.a();
        a.a = context;
        a.c = new ajrv(aahdVar);
        this.f = a.a();
        this.o = ajywVar;
    }

    @Override // defpackage.mes
    public final /* bridge */ /* synthetic */ void a(View view, Object obj) {
        avgg avggVar;
        auex auexVar = (auex) obj;
        if (auexVar == null) {
            return;
        }
        aqyg aqygVar = null;
        if (this.i == null) {
            View z = whu.z(view, R.id.prefilled_form_companion_extension_stub, R.id.prefilled_form_companion_extension);
            this.i = z;
            this.l = (TextView) z.findViewById(R.id.prefilled_input_text);
            this.n = (ImageView) this.i.findViewById(R.id.edit_icon);
            this.j = this.i.findViewById(R.id.ad_cta_button);
            this.m = (TextView) this.i.findViewById(R.id.disclaimer);
            this.k = this.i.findViewById(R.id.prefilled_input);
            this.h = new xbw(this.i, null);
            this.g = this.o.r(new fqy() { // from class: mfb
                @Override // defpackage.fqy
                public final void a(Object obj2, List list) {
                    mfc.this.c(obj2, list);
                }
            }, this.j);
        }
        this.a = auexVar;
        this.d.u(new acqx(this.a.j), null);
        aahd aahdVar = this.c;
        auex auexVar2 = this.a;
        whl.I(aahdVar, auexVar2.k, auexVar2);
        aone builder = this.a.toBuilder();
        builder.copyOnWrite();
        ((auex) builder.instance).k = auex.emptyProtobufList();
        auex auexVar3 = (auex) builder.build();
        this.a = auexVar3;
        ajjz ajjzVar = this.b;
        ImageView imageView = this.n;
        if ((auexVar3.b & 2) != 0) {
            avggVar = auexVar3.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.l;
        auex auexVar4 = this.a;
        if ((auexVar4.b & 1) != 0 && (aqygVar = auexVar4.c) == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.m;
        aqyg aqygVar2 = this.a.i;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.d(aqygVar2, this.f));
        this.k.setBackgroundColor(this.a.f);
        this.i.setBackgroundColor(this.a.g);
        aulq aulqVar = this.a.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            fqw fqwVar = this.g;
            aulq aulqVar2 = this.a.h;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            fqwVar.a((aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer), this.d);
        }
        this.k.setOnClickListener(new View.OnClickListener() { // from class: mfa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mfc mfcVar = mfc.this;
                auex auexVar5 = mfcVar.a;
                if (auexVar5 == null || (auexVar5.b & 4) == 0) {
                    return;
                }
                apxf apxfVar = auexVar5.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                mfcVar.c(auexVar5, amru.r(apxfVar));
            }
        });
        this.i.setVisibility(0);
    }

    @Override // defpackage.mes
    public final void b() {
        this.e.b(this.a);
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
            this.h.c();
            this.g.d();
        }
        this.i = null;
        this.a = null;
    }

    public final void c(Object obj, List list) {
        if (this.e.d(obj)) {
            return;
        }
        aahd aahdVar = this.c;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{this.h});
        whl.J(aahdVar, list, hashMap);
    }
}
