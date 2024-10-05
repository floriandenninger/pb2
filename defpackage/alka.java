package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alka implements alkb {
    private final alkb a;
    private final float b;

    public alka(float f, alkb alkbVar) {
        while (alkbVar instanceof alka) {
            alkbVar = ((alka) alkbVar).a;
            f += ((alka) alkbVar).b;
        }
        this.a = alkbVar;
        this.b = f;
    }

    @Override // defpackage.alkb
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alka)) {
            return false;
        }
        alka alkaVar = (alka) obj;
        return this.a.equals(alkaVar.a) && this.b == alkaVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
