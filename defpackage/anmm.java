package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anmm extends anjt {
    public anmm(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        annz annzVar = (annz) obj;
        anob anobVar = annzVar.c;
        if (anobVar == null) {
            anobVar = anob.a;
        }
        int V = aobq.V(anobVar.b);
        if (V == 0) {
            V = 1;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(annzVar.d.I(), "HMAC");
        anob anobVar2 = annzVar.c;
        if (anobVar2 == null) {
            anobVar2 = anob.a;
        }
        int i = anobVar2.c;
        int i2 = V - 2;
        if (i2 == 1) {
            return new anrh(new anrg("HMACSHA1", secretKeySpec), i);
        }
        if (i2 == 2) {
            return new anrh(new anrg("HMACSHA384", secretKeySpec), i);
        }
        if (i2 == 3) {
            return new anrh(new anrg("HMACSHA256", secretKeySpec), i);
        }
        if (i2 == 4) {
            return new anrh(new anrg("HMACSHA512", secretKeySpec), i);
        }
        if (i2 == 5) {
            return new anrh(new anrg("HMACSHA224", secretKeySpec), i);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
