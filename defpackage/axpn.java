package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axpn {
    private final Application a;
    private final Set b;
    private final efn c;

    public axpn(Application application, Set set, efn efnVar) {
        this.a = application;
        this.b = set;
        this.c = efnVar;
    }

    public final apo a(ce ceVar, apo apoVar) {
        return b(ceVar, ceVar.m, apoVar);
    }

    public final apo b(bue bueVar, Bundle bundle, apo apoVar) {
        if (apoVar == null) {
            apoVar = new apj(this.a, bueVar, bundle);
        }
        return new axpq(bueVar, bundle, this.b, apoVar, this.c);
    }
}
