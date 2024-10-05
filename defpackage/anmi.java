package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anmi implements anql {
    public final String a;
    public final int b;
    public anne c;
    public anmw d;
    public int e;
    public anni f;

    public anmi(anod anodVar) {
        String str = anodVar.b;
        this.a = str;
        if (str.equals(ankm.b)) {
            try {
                annf annfVar = (annf) aonm.parseFrom(annf.a, anodVar.c, aomw.a());
                this.c = (anne) ankk.b(anodVar);
                this.b = annfVar.b;
                return;
            } catch (aoob e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (str.equals(ankm.a)) {
            try {
                anmx anmxVar = (anmx) aonm.parseFrom(anmx.a, anodVar.c, aomw.a());
                this.d = (anmw) ankk.b(anodVar);
                anmz anmzVar = anmxVar.b;
                this.e = (anmzVar == null ? anmz.a : anmzVar).c;
                anoa anoaVar = anmxVar.c;
                this.b = this.e + (anoaVar == null ? anoa.a : anoaVar).c;
                return;
            } catch (aoob e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        if (str.equals(anlx.a)) {
            try {
                annj annjVar = (annj) aonm.parseFrom(annj.a, anodVar.c, aomw.a());
                this.f = (anni) ankk.b(anodVar);
                this.b = annjVar.b;
                return;
            } catch (aoob e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
    }
}
