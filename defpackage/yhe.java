package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yhe extends ajpc implements View.OnClickListener {
    private final View a;
    private final aahd b;
    private final ajjz c;
    private final aahv d;
    private avvm e;
    private ayqx f;

    public yhe(aahd aahdVar, ajjz ajjzVar, aahv aahvVar, ViewStub viewStub) {
        this.b = aahdVar;
        this.c = ajjzVar;
        this.d = aahvVar;
        viewStub.setLayoutResource(R.layout.vc_balance_widget);
        View inflate = viewStub.inflate();
        this.a = inflate;
        inflate.setVisibility(8);
        inflate.setOnClickListener(this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e = null;
        this.a.setVisibility(8);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        avvm avvmVar = (avvm) obj;
        avvmVar.getClass();
        this.e = avvmVar;
        aulq aulqVar = avvmVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apob apobVar = (apob) aulqVar.pX(apoc.a);
        if (apobVar == null) {
            return;
        }
        ImageView imageView = (ImageView) this.a.findViewById(R.id.image);
        float f = this.a.getContext().getResources().getDisplayMetrics().density;
        yny.z(imageView, yny.y((int) (apobVar.g * f), (int) (apobVar.f * f)), ViewGroup.LayoutParams.class);
        if (apobVar.c == 1) {
            this.c.k(imageView, (avgg) apobVar.d, ajjv.b);
        } else {
            if ((apobVar.b & 4) == 0) {
                return;
            }
            ajjz ajjzVar = this.c;
            avgg avggVar = apobVar.e;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.k(imageView, avggVar, ajjv.b);
        }
        this.a.setVisibility(0);
        TextView textView = (TextView) this.a.findViewById(R.id.amount);
        ayqx ayqxVar = this.f;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.f);
        }
        this.f = null;
        this.f = this.d.c().h(this.e.c, true).L(oht.l).Y(suj.q).k(avvk.class).ab(ayqr.a()).ax(new zxd(textView, 1));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avvm) obj).f.I();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        avvm avvmVar = this.e;
        if (avvmVar == null || (avvmVar.b & 4) == 0) {
            return;
        }
        aahd aahdVar = this.b;
        apxf apxfVar = avvmVar.e;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, acrc.g(this.e));
    }
}
