package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayax {
    public final String a;
    public final ayav b;
    public final long c;
    public final aybg d;
    public final aybg e;

    private ayax(String str, ayav ayavVar, long j, aybg aybgVar, aybg aybgVar2) {
        this.a = str;
        ayavVar.getClass();
        this.b = ayavVar;
        this.c = j;
        this.d = null;
        this.e = aybgVar2;
    }

    public /* synthetic */ ayax(String str, ayav ayavVar, long j, aybg aybgVar, aybg aybgVar2, ayaw ayawVar) {
        this(str, ayavVar, j, null, aybgVar2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ayax) {
            ayax ayaxVar = (ayax) obj;
            if (amkq.b(this.a, ayaxVar.a) && amkq.b(this.b, ayaxVar.b) && this.c == ayaxVar.c && amkq.b(this.d, ayaxVar.d) && amkq.b(this.e, ayaxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e});
    }

    public String toString() {
        ammu Y = amkq.Y(this);
        Y.b("description", this.a);
        Y.b("severity", this.b);
        Y.f("timestampNanos", this.c);
        Y.b("channelRef", this.d);
        Y.b("subchannelRef", this.e);
        return Y.toString();
    }
}
