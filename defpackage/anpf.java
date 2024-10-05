package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anpf extends ankd {
    public anpf() {
        super(annx.class, new anpd(anke.class));
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anpe(annw.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (annx) aonm.parseFrom(annx.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        annx annxVar = (annx) aooyVar;
        anrp.d(annxVar.b);
        new anph();
        anny annyVar = annxVar.d;
        if (annyVar == null) {
            annyVar = anny.a;
        }
        anph.i(annyVar);
        if (annxVar.c.d() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
    }

    @Override // defpackage.anju
    public final int h() {
        return 4;
    }
}
