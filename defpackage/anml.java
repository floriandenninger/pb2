package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anml extends anju {
    public anml() {
        super(anmt.class, new anmj(anjy.class));
    }

    public static void i(anmv anmvVar) {
        int i = anmvVar.b;
        if (i < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (i > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void j(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anmk(anmu.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anmt) aonm.parseFrom(anmt.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anmt anmtVar = (anmt) aooyVar;
        anrp.d(anmtVar.b);
        j(anmtVar.c.d());
        anmv anmvVar = anmtVar.d;
        if (anmvVar == null) {
            anmvVar = anmv.a;
        }
        i(anmvVar);
    }

    @Override // defpackage.anju
    public final int h() {
        return 3;
    }
}
