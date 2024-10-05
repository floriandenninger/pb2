package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmk {
    private Boolean a;
    private amsx b;

    public final tmm a() {
        if (this.b == null) {
            this.b = amvs.a;
        }
        Boolean bool = this.a;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
        }
        return new tmm(bool.booleanValue(), this.b);
    }

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void c(Set set) {
        this.b = amsx.p(set);
    }
}
