package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aygh {
    public String a = "unknown-authority";
    public axzj b = axzj.a;
    public String c;
    public ayat d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof aygh)) {
            return false;
        }
        aygh ayghVar = (aygh) obj;
        return this.a.equals(ayghVar.a) && this.b.equals(ayghVar.b) && amkq.b(this.c, ayghVar.c) && amkq.b(this.d, ayghVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
