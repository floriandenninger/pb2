package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class actw implements acte {
    protected final Set a = new HashSet();
    protected final Set b = new HashSet();
    final /* synthetic */ actz c;
    private final actc d;
    private final Class e;
    private final ammy f;
    private final boolean g;

    public actw(actz actzVar, actc actcVar, Class cls, ammy ammyVar, boolean z) {
        this.c = actzVar;
        actcVar.getClass();
        this.d = actcVar;
        this.e = cls;
        this.f = ammyVar;
        this.g = z;
    }

    @Override // defpackage.ypb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ynz ynzVar = (ynz) obj;
        ammy ammyVar = this.f;
        if (ammyVar == null || ammyVar.a(ynzVar)) {
            actb a = this.d.a(this.c);
            a.c(ynzVar, this.a, this.b);
            this.c.l(a, this.e, this.g);
            this.c.a.add(a);
        }
    }

    @Override // defpackage.acte
    public final void b(Class cls) {
        this.b.add(cls);
    }

    @Override // defpackage.acte
    public final void c(Class cls) {
        this.a.add(cls);
    }
}
