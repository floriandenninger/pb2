package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxt extends dyh {
    private final Callable a;

    public dxt(Callable callable) {
        super("internal.appMetadata");
        this.a = callable;
    }

    @Override // defpackage.dyh
    public final dyn a(dxk dxkVar, List list) {
        try {
            return esv.t(this.a.call());
        } catch (Exception unused) {
            return dyn.f;
        }
    }
}
