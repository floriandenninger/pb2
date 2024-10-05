package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpo implements jpr {
    private final fjm a;

    public jpo(fjm fjmVar) {
        this.a = fjmVar;
    }

    @Override // defpackage.jpr
    public final aypy b() {
        return this.a.b.G().y().U();
    }

    public final boolean equals(Object obj) {
        return obj instanceof jpo;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
