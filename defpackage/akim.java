package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akim extends ajsu implements akii, akmd {
    public final Context a;
    public final akiu b;
    public final ajut c;
    public final aahd d;
    private final ajpd e;
    private final List f = new ArrayList();

    public akim(avmp avmpVar, Context context, akiu akiuVar, ajut ajutVar, aahd aahdVar) {
        ajpd ajpdVar = new ajpd();
        this.e = ajpdVar;
        ajpdVar.mK(new ldg(5));
        ajpdVar.mK(new ldg(6));
        this.a = context;
        this.b = akiuVar;
        this.c = ajutVar;
        this.d = aahdVar;
        for (aulq aulqVar : avmpVar.b) {
            if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
                this.f.add(apmgVar);
                this.e.add(apmgVar);
            }
        }
        akiuVar.i(true);
    }

    @Override // defpackage.akii
    public final void b(List list) {
    }

    @Override // defpackage.akii
    public final void c(ajos ajosVar) {
        ajosVar.f(apmg.class, new ajoq() { // from class: akil
            @Override // defpackage.ajoq
            public final ajom b(ViewGroup viewGroup) {
                akim akimVar = akim.this;
                return new akme(akimVar.a, akimVar, akimVar.c, akimVar.d);
            }
        });
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.e;
    }
}
