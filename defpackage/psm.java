package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psm {
    private final SparseBooleanArray a = new SparseBooleanArray();
    private boolean b;

    public final psn a() {
        pse.g(!this.b);
        this.b = true;
        return new psn(this.a);
    }

    public final void b(int i) {
        pse.g(!this.b);
        this.a.append(i, true);
    }
}
