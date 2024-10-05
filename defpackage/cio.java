package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cio implements ciw {
    public final List a;

    public cio() {
        this.a = Collections.singletonList(new clt(new PointF(0.0f, 0.0f)));
    }

    public cio(List list) {
        this.a = list;
    }

    @Override // defpackage.ciw
    public final chk a() {
        if (((clt) this.a.get(0)).e()) {
            return new cht(this.a);
        }
        return new chs(this.a);
    }

    @Override // defpackage.ciw
    public final List b() {
        return this.a;
    }

    @Override // defpackage.ciw
    public final boolean c() {
        return this.a.size() == 1 && ((clt) this.a.get(0)).e();
    }
}
