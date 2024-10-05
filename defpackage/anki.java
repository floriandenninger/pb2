package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anki implements ankj {
    final /* synthetic */ ankd a;
    final /* synthetic */ anju b;

    public anki(ankd ankdVar, anju anjuVar) {
        this.a = ankdVar;
        this.b = anjuVar;
    }

    @Override // defpackage.ankj
    public final Class a() {
        return this.a.getClass();
    }

    @Override // defpackage.ankj
    public final Class b() {
        return this.b.getClass();
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
        ankd ankdVar = this.a;
        return new anjp(ankdVar, ankdVar.b);
    }
}
