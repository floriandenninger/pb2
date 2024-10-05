package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbz {
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public final ArrayList a = new ArrayList(Collections.nCopies(60, 0));

    public final void a() {
        this.c -= ((Integer) this.a.get(this.e)).intValue();
        this.e = (this.e + 1) % 60;
        this.b--;
    }
}
