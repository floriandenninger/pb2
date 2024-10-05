package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class jpc implements jpr {
    private final String a;

    public jpc(String str) {
        this.a = str;
    }

    protected abstract aakv a();

    @Override // defpackage.jpr
    public final aypy b() {
        return a().h(this.a, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jpc) {
            return ((jpc) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, a()});
    }
}
