package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpn implements jpr {
    private final azrw a;
    private final int b = 2;

    public jpn(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.jpr
    public final aypy b() {
        return ((aypn) this.a.get()).U();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jpn)) {
            return false;
        }
        int i = ((jpn) obj).b;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{2});
    }
}
