package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhn implements ajom {
    private aoyw a;
    private final wzq b;
    private final View c;
    private final View d;
    private final View e;
    private final fqy f;
    private fqw g;
    private fqw h;
    private final ajyw i;

    public nhn(Context context, final wzq wzqVar, ajyw ajywVar, final aahd aahdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = wzqVar;
        this.i = ajywVar;
        this.f = new fqy() { // from class: nhm
            @Override // defpackage.fqy
            public final void a(Object obj, List list) {
                wzq wzqVar2 = wzq.this;
                aahd aahdVar2 = aahdVar;
                if (obj == null || wzqVar2.d(obj)) {
                    return;
                }
                whl.J(aahdVar2, list, acrc.g(obj));
            }
        };
        View inflate = LayoutInflater.from(context).inflate(R.layout.ad_two_button_tray_section, (ViewGroup) null, false);
        this.c = inflate;
        this.d = inflate.findViewById(R.id.start_button);
        this.e = inflate.findViewById(R.id.end_button);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.b(this.a);
        this.a = null;
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoyw aoywVar = (aoyw) obj;
        whu.I(this.c, true);
        aulq aulqVar = aoywVar.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            if (this.g == null) {
                this.g = this.i.r(this.f, this.d);
            }
            fqw fqwVar = this.g;
            aulq aulqVar2 = aoywVar.b;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            fqwVar.c((aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
            whu.I(this.d, true);
        } else {
            whu.I(this.d, false);
        }
        aulq aulqVar3 = aoywVar.c;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            if (this.h == null) {
                this.h = this.i.r(this.f, this.e);
            }
            fqw fqwVar2 = this.h;
            aulq aulqVar4 = aoywVar.c;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            fqwVar2.c((aowm) aulqVar4.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
            whu.I(this.e, true);
        } else {
            whu.I(this.e, false);
        }
        this.a = aoywVar;
    }
}
