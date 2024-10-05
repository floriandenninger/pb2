package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class thh implements thg {
    public final List a;
    public final int b;
    private final int c;

    public thh(int i, List list, int i2) {
        this.b = i;
        this.a = Collections.unmodifiableList(list);
        this.c = i2;
        if (i == 3) {
            amkq.E(i2 == -1);
        } else {
            amkq.E(i2 != -1);
        }
    }

    @Override // defpackage.thg
    public final /* synthetic */ tgf a() {
        return sgf.M(this);
    }

    @Override // defpackage.thg
    public final List b() {
        return this.a;
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        amkq.N(z);
        return this.c;
    }
}
