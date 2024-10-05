package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.red.presenter.CompactYpcOfferModuleView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzn extends ajpc {
    private final CompactYpcOfferModuleView a;
    private final ajop b;
    private final gno c;
    private final aahd d;
    private final ajun e;

    public kzn(Context context, gma gmaVar, aahd aahdVar, akht akhtVar, ajun ajunVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        context.getClass();
        aahdVar.getClass();
        this.b = gmaVar;
        this.d = aahdVar;
        this.e = ajunVar;
        CompactYpcOfferModuleView compactYpcOfferModuleView = (CompactYpcOfferModuleView) LayoutInflater.from(context).inflate(R.layout.compact_ypc_offer_module_custom_view, (ViewGroup) null);
        this.a = compactYpcOfferModuleView;
        this.c = akhtVar.h(compactYpcOfferModuleView.c);
        gmaVar.c(compactYpcOfferModuleView);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.b).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqcg aqcgVar = (aqcg) obj;
        if (!this.e.m(aqcgVar)) {
            this.e.l(aqcgVar);
            whl.I(this.d, aqcgVar.g, aqcgVar);
        }
        TextView textView = this.a.a;
        apmg apmgVar = null;
        if (textView != null) {
            if ((aqcgVar.b & 2) != 0) {
                aqygVar2 = aqcgVar.c;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            whu.G(textView, ajcq.b(aqygVar2));
        }
        TextView textView2 = this.a.b;
        if (textView2 != null) {
            if ((aqcgVar.b & 4) != 0) {
                aqygVar = aqcgVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(textView2, ajcq.b(aqygVar));
        }
        if (this.a.c != null) {
            gno gnoVar = this.c;
            apmh apmhVar = aqcgVar.e;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((apmhVar.b & 1) != 0) {
                apmh apmhVar2 = aqcgVar.e;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmgVar = apmhVar2.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            }
            gnoVar.b(apmgVar, ajokVar.a);
        }
        this.b.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqcg) obj).f.I();
    }
}
