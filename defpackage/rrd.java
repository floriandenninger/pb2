package defpackage;

import android.accounts.Account;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrd implements qnr {
    public final int a;
    public final int b;
    public final Account c;
    final boolean d;

    public rrd() {
        this(new rrc());
    }

    public rrd(rrc rrcVar) {
        this.a = rrcVar.a;
        this.b = 1;
        this.d = true;
        this.c = rrcVar.b;
    }

    @Override // defpackage.qnr
    public final Account a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rrd) {
            rrd rrdVar = (rrd) obj;
            if (qar.j(Integer.valueOf(this.a), Integer.valueOf(rrdVar.a))) {
                int i = rrdVar.b;
                if (qar.j(1, 1) && qar.j(this.c, rrdVar.c)) {
                    boolean z = rrdVar.d;
                    if (qar.j(true, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, this.c, true});
    }
}
