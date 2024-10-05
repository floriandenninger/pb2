package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afqf implements afqq {
    static final int a = (int) TimeUnit.DAYS.toMinutes(1);
    private final aqjg b;

    public afqf(aqjg aqjgVar) {
        this.b = aqjgVar;
    }

    @Override // defpackage.afqq
    public final int a() {
        int i;
        aqjg aqjgVar = this.b;
        if (aqjgVar == null || (i = aqjgVar.d) <= 0) {
            return 100;
        }
        return i;
    }

    @Override // defpackage.afqq
    public final int b() {
        aqjg aqjgVar = this.b;
        if (aqjgVar == null) {
            return 720;
        }
        return aqjgVar.c;
    }

    @Override // defpackage.afqq
    public final int c() {
        aqjg aqjgVar = this.b;
        if (aqjgVar == null || (aqjgVar.b & 4) == 0) {
            return 0;
        }
        aqjh aqjhVar = aqjgVar.e;
        if (aqjhVar == null) {
            aqjhVar = aqjh.a;
        }
        if (aqjhVar.b < 0) {
            return 0;
        }
        aqjh aqjhVar2 = this.b.e;
        if (aqjhVar2 == null) {
            aqjhVar2 = aqjh.a;
        }
        return aqjhVar2.b;
    }

    @Override // defpackage.afqq
    public final int d() {
        aqjg aqjgVar = this.b;
        if (aqjgVar != null && (aqjgVar.b & 4) != 0) {
            aqjh aqjhVar = aqjgVar.e;
            if (aqjhVar == null) {
                aqjhVar = aqjh.a;
            }
            if (aqjhVar.c > 0) {
                aqjh aqjhVar2 = this.b.e;
                if (aqjhVar2 == null) {
                    aqjhVar2 = aqjh.a;
                }
                return aqjhVar2.c;
            }
        }
        return a;
    }
}
