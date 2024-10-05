package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zkd {
    public final Map a = new HashMap();
    public final axpg b;

    public zkd(axpg axpgVar) {
        this.b = axpgVar;
    }

    public final void a(zkj zkjVar) {
        yjk.f();
        for (Uri uri : zkjVar.b) {
            yjj.x(this.a, uri, zkjVar.a);
            Set set = (Set) this.a.get(uri);
            if (set == null || set.isEmpty()) {
                this.a.remove(uri);
            }
        }
    }
}
