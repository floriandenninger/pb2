package defpackage;

import java.io.IOException;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aalj {
    public static final aoqa a = aoqa.a;

    public static aakt a(aalo aaloVar, aqua aquaVar, String str, aakt aaktVar, byte[] bArr) {
        aalb aalbVar;
        alwf alwfVar;
        if (aaktVar == null) {
            try {
                if ((aquaVar.b & 2) != 0) {
                    Class b = aaloVar.b(str);
                    aalu aaluVar = (aalu) aaloVar.a.get();
                    long b2 = aaluVar.b(b);
                    int i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                    if (b2 != -2147483648L && (aalbVar = (aalb) aaluVar.a.get(Long.valueOf(b2))) != null) {
                        i = aalbVar.a();
                    }
                    byte[] bArr2 = new byte[aomp.aa(i, str)];
                    aomp.ak(bArr2).z(i, str);
                    aaktVar = aaloVar.a(str, bArr2);
                } else {
                    return aaloVar.a(str, bArr);
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(str);
                zga.d(valueOf.length() != 0 ? "applyUpdates couldn't mergeSerialized for entity ".concat(valueOf) : new String("applyUpdates couldn't mergeSerialized for entity "), e);
                return null;
            }
        }
        aqtz aqtzVar = aquaVar.c;
        if (aqtzVar == null) {
            aqtzVar = aqtz.a;
        }
        int bK = aobq.bK(aqtzVar.c);
        char c = (bK == 0 || bK != 3) ? (char) 1 : (char) 2;
        alwi alwiVar = aquaVar.d;
        if (alwiVar == null) {
            alwiVar = alwi.a;
        }
        alwf d = alwf.d(alwiVar);
        byte[] c2 = aaktVar.c();
        if (c == 1) {
            alwfVar = d.f();
        } else {
            alwfVar = alwf.b;
        }
        abfh a2 = abfh.a(aomk.O(c2), alwfVar);
        abfh a3 = abfh.a(aomk.O(bArr), d);
        byte[] bArr3 = new byte[a2.b + a3.b];
        aomp ak = aomp.ak(bArr3);
        a2.b(ak);
        a3.b(ak);
        return aaloVar.a(aaktVar.d(), bArr3);
    }

    public static aakt b(amrz amrzVar, aakt aaktVar, aakt aaktVar2) {
        ajoy ajoyVar;
        if (aaktVar != null && aaktVar2 != null && (ajoyVar = (ajoy) amrzVar.get(aaktVar2.getClass())) != null && (aaktVar instanceof asyr) && (aaktVar2 instanceof asyr)) {
            asyr asyrVar = (asyr) aaktVar;
            asyr asyrVar2 = (asyr) aaktVar2;
            if (asyrVar.f() && !asyrVar2.f()) {
                asyp e = asyrVar2.e();
                e.b(asyrVar.getCurrentSyncMode());
                ((aahv) ajoyVar.a.get()).c();
                return e.c();
            }
        }
        return aaktVar2;
    }

    public static aoqa c(aoqa aoqaVar, aoqa aoqaVar2) {
        return aora.a(aoqaVar, aoqaVar2) < 0 ? aoqaVar2 : aoqaVar;
    }

    public static boolean d(aoqa aoqaVar, aoqa aoqaVar2) {
        return aoqaVar2.equals(a) || aora.a(aoqaVar2, aoqaVar) > 0;
    }
}
