package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zeq {
    public final Set a = new HashSet();
    public RecyclerView b;
    private wh c;
    private lo d;

    public final wh a() {
        if (this.c == null) {
            this.c = new zeo(this);
        }
        return this.c;
    }

    public final lo b() {
        if (this.d == null) {
            this.d = new zep(this);
        }
        return this.d;
    }
}
