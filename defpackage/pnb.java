package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnb implements plg {
    public final long a = -9223372036854775807L;
    public final long b = -9223372036854775807L;
    public final long c = -9223372036854775807L;
    public final float d = -3.4028235E38f;
    public final float e = -3.4028235E38f;

    @Deprecated
    public pnb() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnb)) {
            return false;
        }
        pnb pnbVar = (pnb) obj;
        long j = pnbVar.a;
        long j2 = pnbVar.b;
        long j3 = pnbVar.c;
        float f = pnbVar.d;
        float f2 = pnbVar.e;
        return true;
    }

    public final int hashCode() {
        int i = (int) (-9223372034707292159L);
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
