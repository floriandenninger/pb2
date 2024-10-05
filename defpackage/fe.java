package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fe {
    final Resources a;
    final Resources.Theme b;

    public fe(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fe feVar = (fe) obj;
            if (this.a.equals(feVar.a) && Objects.equals(this.b, feVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
