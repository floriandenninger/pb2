package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anph extends anju {
    public anph() {
        super(anny.class, new anpg(ankf.class));
    }

    public static final void i(anny annyVar) {
        anrp.d(annyVar.b);
        if (annyVar.c.d() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anny) aonm.parseFrom(anny.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        i((anny) aooyVar);
    }

    @Override // defpackage.anju
    public final int h() {
        return 5;
    }
}
