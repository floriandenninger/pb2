package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bem extends beb {
    private final int d;
    private final Object e;

    public bem(asi asiVar) {
        this(asiVar, 0);
    }

    @Override // defpackage.bel
    public final int h() {
        return 0;
    }

    @Override // defpackage.bel
    public final int i() {
        return this.d;
    }

    @Override // defpackage.bel
    public final Object j() {
        return this.e;
    }

    @Override // defpackage.bel
    public final void o(long j, long j2, long j3, List list, bdw[] bdwVarArr) {
    }

    public bem(asi asiVar, int i) {
        this(asiVar, i, 0, null);
    }

    public bem(asi asiVar, int i, int i2, Object obj) {
        super(asiVar, new int[]{i}, null);
        this.d = i2;
        this.e = obj;
    }
}
