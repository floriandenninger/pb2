package defpackage;

import android.graphics.Rect;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdy {
    public final double a;
    public final double b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Rect f;

    public tdy(double d, double d2, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        this.a = d;
        this.b = d2;
        this.c = rect;
        this.d = rect2;
        this.e = rect3;
        this.f = rect4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tdy)) {
            return false;
        }
        tdy tdyVar = (tdy) obj;
        return this.a == tdyVar.a && this.b == tdyVar.b && Objects.equals(this.c, tdyVar.c) && Objects.equals(this.d, tdyVar.d) && Objects.equals(this.e, tdyVar.e) && Objects.equals(this.f, tdyVar.f);
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.a), Double.valueOf(this.b), this.c, this.d, this.e, this.f);
    }
}
