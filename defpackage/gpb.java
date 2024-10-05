package defpackage;

import android.content.Context;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gpb implements abdr {
    private final Context a;
    private final boolean b;

    public gpb(Context context, aadw aadwVar) {
        this.a = context;
        this.b = evr.aE(aadwVar);
    }

    @Override // defpackage.abdr
    public final void no(abdu abduVar) {
        if (this.b && yjk.g()) {
            aone u = abduVar.u();
            armz armzVar = ((arnb) u.instance).c;
            if (armzVar == null) {
                armzVar = armz.a;
            }
            armx b = armx.b(armzVar.I);
            if (b == null) {
                b = armx.UNKNOWN_FORM_FACTOR;
            }
            if (b == armx.LARGE_FORM_FACTOR || b == armx.SMALL_FORM_FACTOR || b == armx.UNKNOWN_FORM_FACTOR) {
                armz armzVar2 = ((arnb) u.instance).c;
                if (armzVar2 == null) {
                    armzVar2 = armz.a;
                }
                aone builder = armzVar2.toBuilder();
                armx a = gpe.a(this.a);
                builder.copyOnWrite();
                armz armzVar3 = (armz) builder.instance;
                armzVar3.I = a.f;
                armzVar3.c |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                u.copyOnWrite();
                arnb arnbVar = (arnb) u.instance;
                armz armzVar4 = (armz) builder.build();
                armzVar4.getClass();
                arnbVar.c = armzVar4;
                arnbVar.b |= 1;
            }
        }
    }
}
