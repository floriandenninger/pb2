package defpackage;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dzy {
    final /* synthetic */ qux a;

    public dzy(qux quxVar) {
        this.a = quxVar;
    }

    public final boolean a(File file) {
        try {
            return this.a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
