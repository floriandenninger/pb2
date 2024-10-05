package defpackage;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anld extends anju {
    public anld() {
        super(anng.class, new anlb(anjh.class));
    }

    public static boolean i() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static anjr j(int i, int i2) {
        aone createBuilder = annh.a.createBuilder();
        createBuilder.copyOnWrite();
        ((annh) createBuilder.instance).b = i;
        return new anjr((annh) createBuilder.build(), i2);
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anlc(annh.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anng) aonm.parseFrom(anng.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anng anngVar = (anng) aooyVar;
        anrp.d(anngVar.b);
        anrp.a(anngVar.c.d());
    }

    @Override // defpackage.anju
    public final int h() {
        return 3;
    }
}
