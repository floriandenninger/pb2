package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anqc extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) anqy.a.a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
