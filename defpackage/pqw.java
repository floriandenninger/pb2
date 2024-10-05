package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pqw implements ppw {
    private final List a;
    private final /* synthetic */ int b;

    public pqw(List list, int i) {
        this.b = i;
        this.a = list;
    }

    public pqw(List list, int i, byte[] bArr) {
        this.b = i;
        this.a = Collections.unmodifiableList(list);
    }

    @Override // defpackage.ppw
    public final int a() {
        return 1;
    }

    @Override // defpackage.ppw
    public final int b(long j) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (i == 2 || j >= 0) ? -1 : 0;
            }
            if (j < 0) {
                return 0;
            }
        }
        return -1;
    }

    @Override // defpackage.ppw
    public final long c(int i) {
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    pse.e(i == 0);
                }
                return 0L;
            }
            pse.e(i == 0);
        }
        return 0L;
    }

    @Override // defpackage.ppw
    public final List d(long j) {
        int i = this.b;
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return j >= 0 ? this.a : Collections.emptyList();
        }
        if (i != 2 && j < 0) {
            return Collections.emptyList();
        }
        return this.a;
    }
}
