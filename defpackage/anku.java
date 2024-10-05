package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anku extends anju {
    public anku() {
        super(anmy.class, new anks(anrd.class));
    }

    public static final void i(anna annaVar) {
        int i = annaVar.b;
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public static final void j(anmy anmyVar) {
        anrp.d(anmyVar.b);
        anrp.a(anmyVar.d.d());
        anna annaVar = anmyVar.c;
        if (annaVar == null) {
            annaVar = anna.a;
        }
        i(annaVar);
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new ankt(anmz.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anmy) aonm.parseFrom(anmy.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        j((anmy) aooyVar);
    }

    @Override // defpackage.anju
    public final int h() {
        return 3;
    }
}
