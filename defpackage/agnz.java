package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agnz {
    public final String a;
    public final avjo b;
    public final int c;
    public final long d;
    public final long e;
    public final agmx f;
    public final agmx g;
    public final String h;
    public final boolean i;
    public final afsx j;

    public agnz(String str, avjo avjoVar, int i, long j, long j2, agmx agmxVar, agmx agmxVar2, String str2, boolean z, afsx afsxVar) {
        zhq.m(str);
        this.a = str;
        avjoVar.getClass();
        this.b = avjoVar;
        this.c = i;
        this.d = j;
        this.e = j2;
        agmxVar.getClass();
        this.f = agmxVar;
        agmxVar2.getClass();
        this.g = agmxVar2;
        this.h = str2;
        this.i = z;
        this.j = afsxVar;
    }

    public final int a() {
        long j = this.e;
        return (int) (j != 0 ? (this.d * 100) / j : 0L);
    }

    public final boolean b() {
        return this.b == avjo.TRANSFER_STATE_TRANSFERRING;
    }

    public final boolean c() {
        return b() || this.b == avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agnz) {
            return this.a.equals(((agnz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append("{transferId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
