package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ankg implements ankj {
    final /* synthetic */ anjp a;

    public ankg(anjp anjpVar) {
        this.a = anjpVar;
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
        return Collections.singleton(this.a.b());
    }

    @Override // defpackage.ankj
    public final anjp d(Class cls) {
        if (this.a.b().equals(cls)) {
            return this.a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // defpackage.ankj
    public final anjp e() {
        return this.a;
    }
}
