package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcv extends bpc {
    private static final String a = zga.a("MDX.RouteController");
    private final azrw b;
    private final adgb c;
    private final azrw d;
    private final String e;

    public adcv(azrw azrwVar, adgb adgbVar, azrw azrwVar2, String str) {
        azrwVar.getClass();
        this.b = azrwVar;
        this.c = adgbVar;
        azrwVar2.getClass();
        this.d = azrwVar2;
        this.e = str;
    }

    @Override // defpackage.bpc
    public final void b(int i) {
        String str = a;
        StringBuilder sb = new StringBuilder(32);
        sb.append("set volume on route: ");
        sb.append(i);
        zga.h(str, sb.toString());
        ((adly) this.d.get()).b(i);
    }

    @Override // defpackage.bpc
    public final void c(int i) {
        String str = a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("update volume on route: ");
        sb.append(i);
        zga.h(str, sb.toString());
        if (i > 0) {
            adly adlyVar = (adly) this.d.get();
            if (adlyVar.e()) {
                adlyVar.d(3);
                return;
            } else {
                zga.c(adly.a, "Remote control is not connected, cannot change volume");
                return;
            }
        }
        adly adlyVar2 = (adly) this.d.get();
        if (adlyVar2.e()) {
            adlyVar2.d(-3);
        } else {
            zga.c(adly.a, "Remote control is not connected, cannot change volume");
        }
    }

    @Override // defpackage.bpc
    public final void g() {
        String str = a;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("route selected screen:");
        sb.append(valueOf);
        zga.h(str, sb.toString());
        addc addcVar = (addc) this.b.get();
        adgb adgbVar = this.c;
        String str2 = this.e;
        adda addaVar = (adda) addcVar.b.get();
        amkq.E(!TextUtils.isEmpty(str2));
        adcw a2 = adcx.a();
        synchronized (addaVar.c) {
            ammw ammwVar = addaVar.b;
            if (ammwVar != null && adeg.c((String) ammwVar.a, str2)) {
                adle adleVar = ((adcx) addaVar.b.b).a;
                if (adleVar == null) {
                    adleVar = adle.a;
                }
                a2.a = adleVar;
                addaVar.b = null;
            }
            a2.a = addaVar.a.c(addaVar.d.a());
            addaVar.b = null;
        }
        ((addb) addcVar.c.get()).r(adgbVar, a2.a().a);
        ((adda) addcVar.b.get()).b(str2, null);
    }

    @Override // defpackage.bpc
    public final void i(int i) {
        String str = a;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("route unselected screen:");
        sb.append(valueOf);
        sb.append(" with reason:");
        sb.append(i);
        zga.h(str, sb.toString());
        addc addcVar = (addc) this.b.get();
        String str2 = this.e;
        Optional of = Optional.of(Integer.valueOf(i));
        adcz a2 = ((adda) addcVar.b.get()).a(str2);
        boolean z = a2.a;
        String str3 = addc.a;
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Unselect route, is user initiated: ");
        sb2.append(z);
        zga.h(str3, sb2.toString());
        ((addb) addcVar.c.get()).b(a2, of);
    }
}
