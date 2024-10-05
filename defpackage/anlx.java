package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anlx {
    public static final String a;

    static {
        new anlw();
        a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        anon anonVar = anon.a;
        try {
            ankk.g(new anlz());
            if (anlt.a()) {
                return;
            }
            ankk.j(new anlw());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
