package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anrf extends ThreadLocal {
    final /* synthetic */ anrg a;

    public anrf(anrg anrgVar) {
        this.a = anrgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) anqy.b.a(this.a.a);
            mac.init(this.a.b);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
