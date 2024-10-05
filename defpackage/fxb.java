package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.protos.youtube.api.innertube.ShowMealbarActionOuterClass$ShowMealbarAction;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fxb implements fxi, afwx {
    public final acpl a;
    public final Handler b;
    public final aben c;
    public fwz d;
    private final gby f;
    private final akbw g;
    private final fxd h;
    private final acys i;
    private akby l;
    private final acyp j = new acyp() { // from class: fwx
        @Override // defpackage.acyp
        public final void a(adfy adfyVar) {
            final fxb fxbVar = fxb.this;
            Map m = adfyVar.m();
            fwz fwzVar = new fwz(adfyVar.a.f(), m != null ? (String) m.get("offerParams") : null, m != null ? (String) m.get("remoteTransactionSessionId") : null);
            if (fwzVar.a == null || fxbVar.e.contains(fwzVar.b)) {
                return;
            }
            fwz fwzVar2 = fxbVar.d;
            if (fwzVar2 != null && fwzVar2.a.equals(fwzVar.a) && TextUtils.equals(fxbVar.d.b, fwzVar.b)) {
                return;
            }
            fwz fwzVar3 = fxbVar.d;
            if (fwzVar3 == null || fwzVar3.a.equals(fwzVar.a)) {
                fwz fwzVar4 = fxbVar.d;
                if (fwzVar4 == null || TextUtils.isEmpty(fwzVar4.b) || !fxbVar.d.a.equals(fwzVar.a) || !TextUtils.isEmpty(fwzVar.b)) {
                    if (TextUtils.isEmpty(fwzVar.b)) {
                        return;
                    }
                    String.valueOf(String.valueOf(fwzVar)).length();
                    fxbVar.d = fwzVar;
                    aben abenVar = fxbVar.c;
                    abej abejVar = new abej(abenVar.f, abenVar.c.c(), null, null, null);
                    abejVar.a = abej.i(fxbVar.d.b);
                    abejVar.k();
                    String valueOf = String.valueOf(fxbVar.d.b);
                    if (valueOf.length() != 0) {
                        "YPCGetOfferDetailsRequest with offerParams: ".concat(valueOf);
                    }
                    fxbVar.c.k.e(abejVar, fxbVar);
                    fxbVar.e("deviceDetected");
                    aone createBuilder = atah.a.createBuilder();
                    createBuilder.copyOnWrite();
                    atah atahVar = (atah) createBuilder.instance;
                    atahVar.c = 8;
                    atahVar.b |= 1;
                    String str = fxbVar.d.c;
                    createBuilder.copyOnWrite();
                    atah atahVar2 = (atah) createBuilder.instance;
                    str.getClass();
                    atahVar2.b |= 2;
                    atahVar2.d = str;
                    atah atahVar3 = (atah) createBuilder.build();
                    arpn a = arpp.a();
                    a.copyOnWrite();
                    ((arpp) a.instance).da(atahVar3);
                    fxbVar.a.c((arpp) a.build());
                    return;
                }
                fxbVar.b.removeCallbacks(new Runnable() { // from class: fwy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fxb.this.d();
                    }
                });
                fxbVar.b.post(new Runnable() { // from class: fwy
                    @Override // java.lang.Runnable
                    public final void run() {
                        fxb.this.d();
                    }
                });
            }
        }

        @Override // defpackage.acyp
        public final /* synthetic */ void b() {
        }
    };
    private final fxa k = new fxa(this);
    public final Set e = new HashSet();

    public fxb(acpl acplVar, gby gbyVar, Handler handler, akbw akbwVar, fxd fxdVar, acys acysVar, aben abenVar) {
        this.a = acplVar;
        this.f = gbyVar;
        this.b = handler;
        this.g = akbwVar;
        this.h = fxdVar;
        this.i = acysVar;
        this.c = abenVar;
    }

    @Override // defpackage.fxi
    public final void a() {
        yjk.f();
        this.i.f(this.j);
    }

    @Override // defpackage.fxi
    public final void b() {
        yjk.f();
        this.i.c(this.j, false);
    }

    public final void d() {
        akby akbyVar = this.l;
        if (akbyVar != null) {
            this.g.n(akbyVar);
        }
    }

    public final void e(String str) {
        ScreenId screenId;
        fwz fwzVar = this.d;
        if (fwzVar == null || (screenId = fwzVar.a) == null) {
            if (str.length() != 0) {
                "Failed to update progress for event: ".concat(str);
            }
        } else {
            fxd fxdVar = this.h;
            fxdVar.b.a(new fxc(((adts) fxdVar.c.get()).h, str, screenId.c));
        }
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        String.valueOf(String.valueOf(cnqVar)).length();
        e("offerDetailsError");
        aone createBuilder = atah.a.createBuilder();
        createBuilder.copyOnWrite();
        atah atahVar = (atah) createBuilder.instance;
        atahVar.c = 9;
        atahVar.b |= 1;
        fwz fwzVar = this.d;
        if (fwzVar != null) {
            String str = fwzVar.c;
            createBuilder.copyOnWrite();
            atah atahVar2 = (atah) createBuilder.instance;
            str.getClass();
            atahVar2.b |= 2;
            atahVar2.d = str;
        }
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).da((atah) createBuilder.build());
        this.a.c((arpp) a.build());
        this.d = null;
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        asfi asfiVar = (asfi) obj;
        String.valueOf(String.valueOf(asfiVar)).length();
        for (apxf apxfVar : asfiVar.c) {
            if (apxfVar.pY(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction)) {
                ShowMealbarActionOuterClass$ShowMealbarAction showMealbarActionOuterClass$ShowMealbarAction = (ShowMealbarActionOuterClass$ShowMealbarAction) apxfVar.pX(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction);
                auub auubVar = showMealbarActionOuterClass$ShowMealbarAction.b;
                if (auubVar == null) {
                    auubVar = auub.a;
                }
                if ((auubVar.b & 1) != 0) {
                    auub auubVar2 = showMealbarActionOuterClass$ShowMealbarAction.b;
                    if (auubVar2 == null) {
                        auubVar2 = auub.a;
                    }
                    atcf atcfVar = auubVar2.c;
                    if (atcfVar == null) {
                        atcfVar = atcf.a;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("OnYpcTransactionListener", this.k);
                    akby f = this.f.b(atcfVar, hashMap).f();
                    this.l = f;
                    this.g.o(f);
                    return;
                }
                this.d = null;
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
