package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adpw implements View.OnClickListener {
    public final /* synthetic */ adqc a;
    private final /* synthetic */ int b;

    public /* synthetic */ adpw(adqc adqcVar, int i) {
        this.b = i;
        this.a = adqcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            adqc adqcVar = this.a;
            if (adqcVar.c != null) {
                i = true != adqcVar.B ? 3 : 2;
                aone createBuilder = asht.a.createBuilder();
                aone createBuilder2 = ashk.a.createBuilder();
                createBuilder2.copyOnWrite();
                ashk ashkVar = (ashk) createBuilder2.instance;
                ashkVar.c = i - 1;
                ashkVar.b |= 1;
                ashk ashkVar2 = (ashk) createBuilder2.build();
                createBuilder.copyOnWrite();
                asht ashtVar = (asht) createBuilder.instance;
                ashkVar2.getClass();
                ashtVar.m = ashkVar2;
                ashtVar.b = 32768 | ashtVar.b;
                adqcVar.h.I(3, new acqx(acsb.c(61401)), (asht) createBuilder.build());
                adqcVar.c.ah(adlk.KEY_BACK);
                return;
            }
            return;
        }
        if (i2 == 1) {
            adqc adqcVar2 = this.a;
            adqcVar2.h.I(3, new acqx(acsb.c(61403)), null);
            if (adqcVar2.a.C() != null) {
                adqcVar2.a.C().finish();
            }
            adqcVar2.C = false;
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                this.a.h.I(3, new acqx(acsb.c(61402)), null);
                return;
            }
            if (i2 == 4) {
                adqc adqcVar3 = this.a;
                if (adqcVar3.k) {
                    adqcVar3.h();
                }
                adqcVar3.f();
                return;
            }
            adqc adqcVar4 = this.a;
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", adqcVar4.l.getPackageName(), null));
            intent.addFlags(268435456);
            adqcVar4.l.startActivity(intent);
            return;
        }
        adqc adqcVar5 = this.a;
        i = true == adqcVar5.k ? 3 : 2;
        aone createBuilder3 = asht.a.createBuilder();
        aone createBuilder4 = ashk.a.createBuilder();
        createBuilder4.copyOnWrite();
        ashk ashkVar3 = (ashk) createBuilder4.instance;
        ashkVar3.c = i - 1;
        ashkVar3.b |= 1;
        ashk ashkVar4 = (ashk) createBuilder4.build();
        createBuilder3.copyOnWrite();
        asht ashtVar2 = (asht) createBuilder3.instance;
        ashkVar4.getClass();
        ashtVar2.m = ashkVar4;
        ashtVar2.b = 32768 | ashtVar2.b;
        adqcVar5.h.I(3, new acqx(acsb.c(61407)), (asht) createBuilder3.build());
        adqcVar5.h();
        adqcVar5.C = false;
    }
}
