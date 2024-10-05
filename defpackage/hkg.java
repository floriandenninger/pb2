package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hkg {
    public final axpg a;
    public final List b = Collections.synchronizedList(new ArrayList());
    public final azrl c = azrl.e();
    public final hik d;

    public hkg(axpg axpgVar, hik hikVar) {
        this.a = axpgVar;
        this.d = hikVar;
    }

    public final int a() {
        return this.b.size();
    }

    public final aypy b() {
        return this.c.U();
    }
}
