package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bank {
    public final long a;
    public final bajn b;
    bank c;
    private String d;
    private int e = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    private int f = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    public bank(bajn bajnVar, long j) {
        this.a = j;
        this.b = bajnVar;
    }

    public final int a(long j) {
        bank bankVar = this.c;
        if (bankVar == null || j < bankVar.a) {
            int i = this.e;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            int a = this.b.a(this.a);
            this.e = a;
            return a;
        }
        return bankVar.a(j);
    }

    public final int b(long j) {
        bank bankVar = this.c;
        if (bankVar == null || j < bankVar.a) {
            int i = this.f;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            int c = this.b.c(this.a);
            this.f = c;
            return c;
        }
        return bankVar.b(j);
    }

    public final String c(long j) {
        bank bankVar = this.c;
        if (bankVar == null || j < bankVar.a) {
            if (this.d == null) {
                this.d = this.b.g(this.a);
            }
            return this.d;
        }
        return bankVar.c(j);
    }
}
