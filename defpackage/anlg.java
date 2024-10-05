package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anlg extends anju {
    public anlg() {
        super(annk.class, new anle(anjh.class));
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anlf(annl.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (annk) aonm.parseFrom(annk.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        annk annkVar = (annk) aooyVar;
        anrp.d(annkVar.b);
        if (annkVar.c.d() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // defpackage.anju
    public final int h() {
        return 3;
    }
}
