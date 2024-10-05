package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ankm {
    public static final String a;
    public static final String b;

    static {
        new ankr();
        a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new anla();
        b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new anld();
        new ankx();
        new anlj();
        new anln();
        new anlg();
        new anlq();
        anon anonVar = anon.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        ankk.g(new anko());
        anmp.a();
        ankk.j(new ankr());
        ankk.j(new anla());
        if (anlt.a()) {
            return;
        }
        ankk.j(new ankx());
        if (anld.i()) {
            ankk.j(new anld());
        }
        ankk.j(new anlg());
        ankk.j(new anlj());
        ankk.j(new anln());
        ankk.j(new anlq());
    }
}
