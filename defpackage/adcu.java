package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcu {
    public final Optional a;
    private final afsy b;
    private final azrw c;
    private final boolean d;
    private final boolean e;
    private final dd f;
    private final azrw g;

    public adcu(afsy afsyVar, acxi acxiVar, dd ddVar, azrw azrwVar, Optional optional, azrw azrwVar2) {
        this.b = afsyVar;
        this.c = azrwVar;
        this.a = optional;
        this.d = acxiVar.c.equals("cl");
        this.e = acxiVar.c.equals("m");
        this.f = ddVar;
        this.g = azrwVar2;
    }

    public final boolean a(boolean z, final adct adctVar, String str) {
        int a;
        boolean z2 = this.d;
        if ((!z2 && !this.e) || this.f == null) {
            return false;
        }
        if (z2) {
            if (!this.b.c().g()) {
                if (!this.b.c().y()) {
                    return false;
                }
                adcg adcgVar = new adcg();
                adcgVar.ae = adctVar;
                adcgVar.qh(this.f, "youtube.mdx.mediaroute.MdxLoggedOutWatchHistoryDialogFragment");
            } else {
                wbs.h(this.f, new afsp() { // from class: adcs
                    @Override // defpackage.afsp
                    public final void a() {
                        adct.this.a();
                    }
                }, null);
            }
            return true;
        }
        if (!this.e) {
            return false;
        }
        if (z || !((Boolean) this.g.get()).booleanValue()) {
            if (!z || !((Boolean) this.c.get()).booleanValue() || !this.a.isPresent() || (a = ((adje) this.a.get()).a()) == 1) {
                return false;
            }
            if (a == 2) {
                adcb adcbVar = new adcb();
                adcbVar.ae = new adct() { // from class: adcr
                    @Override // defpackage.adct
                    public final void a() {
                        adcu adcuVar = adcu.this;
                        adct adctVar2 = adctVar;
                        ((adje) adcuVar.a.get()).b();
                        adctVar2.a();
                    }
                };
                adcbVar.qh(this.f, "youtube.mdx.mediaroute.MdxAudioCastPartlyCastableQueueDialogFragment");
                return true;
            }
            if (a != 3) {
                return false;
            }
            new adbz().qh(this.f, "youtube.mdx.mediaroute.MdxAudioCastNotCastableQueueDialogFragment");
            return true;
        }
        adcd adcdVar = new adcd();
        adcdVar.ae = str;
        adcdVar.qh(this.f, "youtube.mdx.mediaroute.MdxMatAvodHandoffDialogFragment");
        return true;
    }
}
