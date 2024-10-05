package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alqv {
    public final List a;
    public final List b;

    public alqv(alqu alquVar) {
        this.a = new ArrayList(alquVar.a);
        this.b = new ArrayList(alquVar.b);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.a, this.b);
    }
}
