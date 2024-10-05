package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anri extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
