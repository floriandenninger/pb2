package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzg {
    public final ahza c;
    public final aahd d;
    public final azrw e;
    public boolean g;
    private final ajut h;
    public boolean f = false;
    public final ahzf a = new ahzf(this);
    public final ahzd b = new ahzd(this);

    public ahzg(ahza ahzaVar, aahd aahdVar, ajut ajutVar, azrw azrwVar) {
        this.c = ahzaVar;
        this.d = aahdVar;
        this.h = ajutVar;
        this.e = azrwVar;
    }

    public final void a(aryr aryrVar) {
        final attc attcVar;
        aqyg aqygVar;
        if ((aryrVar.b & 134217728) == 0 || this.f) {
            return;
        }
        arye aryeVar = aryrVar.B;
        if (aryeVar == null) {
            aryeVar = arye.a;
        }
        if (aryeVar.b == 130741768) {
            attcVar = (attc) aryeVar.c;
        } else {
            attcVar = attc.a;
        }
        this.c.rQ(attcVar.d);
        ahza ahzaVar = this.c;
        if ((attcVar.b & 1) != 0) {
            aqygVar = attcVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        ahzaVar.g(ajcq.b(aqygVar));
        final acqx acqxVar = new acqx(attcVar.h);
        ((acra) this.e.get()).u(acqxVar, null);
        if ((attcVar.b & 4) == 0) {
            this.c.f(null);
        } else {
            this.c.f(new View.OnClickListener() { // from class: ahzb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ahzg ahzgVar = ahzg.this;
                    attc attcVar2 = attcVar;
                    acsa acsaVar = acqxVar;
                    aahd aahdVar = ahzgVar.d;
                    apxf apxfVar = attcVar2.e;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.a(apxfVar);
                    ((acra) ahzgVar.e.get()).I(3, acsaVar, null);
                }
            });
        }
        if ((attcVar.b & 8) == 0) {
            this.c.e(0);
        } else {
            ahza ahzaVar2 = this.c;
            ajut ajutVar = this.h;
            arfs arfsVar = attcVar.f;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            ahzaVar2.e(ajutVar.a(b));
        }
        this.f = true;
        this.c.h();
    }
}
