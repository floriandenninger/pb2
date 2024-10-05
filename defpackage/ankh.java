package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ankh implements ankj {
    final /* synthetic */ anju a;

    public ankh(anju anjuVar) {
        this.a = anjuVar;
    }

    @Override // defpackage.ankj
    public final Class a() {
        return this.a.getClass();
    }

    @Override // defpackage.ankj
    public final Class b() {
        return null;
    }

    @Override // defpackage.ankj
    public final Set c() {
        return this.a.e();
    }

    @Override // defpackage.ankj
    public final anjp d(Class cls) {
        try {
            return new anjp(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // defpackage.ankj
    public final anjp e() {
        anju anjuVar = this.a;
        return new anjp(anjuVar, anjuVar.b);
    }
}
