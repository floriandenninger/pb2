package defpackage;

import java.security.InvalidKeyException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anlw extends anju {
    public anlw() {
        super(anni.class, new anlu(anjl.class));
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anlv(annj.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anni) aonm.parseFrom(anni.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anni anniVar = (anni) aooyVar;
        anrp.d(anniVar.b);
        if (anniVar.c.d() == 64) {
            return;
        }
        int d = anniVar.c.d();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(d);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // defpackage.anju
    public final int h() {
        return 3;
    }
}
