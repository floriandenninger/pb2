package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpq implements jpr {
    private final ywr a;
    private final ayrv b;

    public jpq(ywr ywrVar, ayrv ayrvVar) {
        this.a = ywrVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.jpr
    public final aypy b() {
        return this.a.d().G().A(this.b).n().U();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jpq) {
            jpq jpqVar = (jpq) obj;
            if (jpqVar.a.equals(this.a) && jpqVar.b.equals(this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
