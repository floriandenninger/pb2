package defpackage;

import java.security.PrivilegedAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class c implements PrivilegedAction {
    final /* synthetic */ Class a;
    final /* synthetic */ String b = "/android/icumessageformat/ICUConfig.properties";

    public c(Class cls) {
        this.a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        return this.a.getResourceAsStream(this.b);
    }
}
