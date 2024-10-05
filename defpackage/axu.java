package defpackage;

import java.util.HashMap;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axu {
    public final HashMap a = new HashMap();
    public UUID b = plh.d;
    public azc e = aze.b;
    public final bfs d = new bfm();
    public int[] c = new int[0];

    public final void a(int... iArr) {
        for (int i : iArr) {
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            pse.e(z);
        }
        this.c = (int[]) iArr.clone();
    }
}
