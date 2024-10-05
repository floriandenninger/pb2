package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aity extends aixi {
    private final List a;
    private final zfi b;

    public aity(long j, long j2, List list, zfi zfiVar) {
        super(j, j2, 1, 1, null);
        this.a = list;
        this.b = zfiVar;
    }

    @Override // defpackage.aixi
    protected final void a() {
    }

    @Override // defpackage.aixi
    public final void b(boolean z, boolean z2, boolean z3) {
        zfi zfiVar = this.b;
        if (zfiVar != null) {
            zfiVar.a(this.a);
        }
    }
}
