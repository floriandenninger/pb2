package defpackage;

import android.view.View;
import android.view.WindowId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bxb {
    private final WindowId a;

    public bxb(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bxb) && ((bxb) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
