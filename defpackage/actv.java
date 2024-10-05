package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class actv implements ypb {
    final /* synthetic */ actz a;
    private final actc b;
    private final Class c;
    private final Set d;

    public actv(actz actzVar, actc actcVar, Class cls, Class cls2) {
        this.a = actzVar;
        this.b = actcVar;
        this.c = cls2;
        this.d = Collections.singleton(cls);
    }

    @Override // defpackage.ypb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ynz ynzVar = (ynz) obj;
        actb a = this.b.a(this.a);
        a.c(ynzVar, this.d, Collections.emptySet());
        this.a.l(a, this.c, true);
        if (!a.a(ynzVar) || a.a) {
            return;
        }
        this.a.b.add(a);
    }
}
