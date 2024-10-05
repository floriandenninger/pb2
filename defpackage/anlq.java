package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anlq extends anju {
    public anlq() {
        super(anow.class, new anlo(anjh.class));
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anlp(anox.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anow) aonm.parseFrom(anow.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anow anowVar = (anow) aooyVar;
        anrp.d(anowVar.b);
        if (anowVar.c.d() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // defpackage.anju
    public final int h() {
        return 3;
    }
}
