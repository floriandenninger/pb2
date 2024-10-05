package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alki implements alkb {
    private final float a;

    public alki(float f) {
        this.a = f;
    }

    @Override // defpackage.alkb
    public final float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alki) && this.a == ((alki) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
