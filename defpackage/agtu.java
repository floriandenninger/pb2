package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agtu {
    public final String a;
    public int b;
    public long c;
    public long d;
    public final agmx e;
    public agmx f;
    public final String g;
    public final int h;
    public int i;
    public avjo j;
    public avjp k;
    public final afsx l;
    public final boolean m;

    public agtu(afsx afsxVar, String str, agmx agmxVar, int i, avjo avjoVar, avjp avjpVar) {
        this.j = avjo.TRANSFER_STATE_UNKNOWN;
        this.a = str;
        this.e = agmxVar;
        this.b = 1;
        this.c = 0L;
        this.d = 0L;
        this.f = agmxVar;
        this.g = afsxVar.b();
        this.h = 0;
        this.i = i;
        this.l = afsxVar;
        this.m = true;
        this.j = avjoVar;
        this.k = avjpVar;
    }

    public final agnz a() {
        return new agnz(this.a, this.j, this.b, this.c, this.d, this.e, this.f, this.g, this.m, this.l);
    }

    public final boolean b() {
        return this.j == avjo.TRANSFER_STATE_PAUSED_BY_USER;
    }

    public final boolean c() {
        return this.j == avjo.TRANSFER_STATE_TRANSFERRING;
    }

    public final boolean d() {
        return c() || this.j == avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE;
    }

    public agtu(String str, String str2, int i, agmx agmxVar, int i2) {
        this.j = avjo.TRANSFER_STATE_UNKNOWN;
        zhq.n(str2, "transferId may not be empty");
        this.a = str2;
        this.e = agmxVar;
        this.j = avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE;
        this.b = 1;
        this.c = 0L;
        this.d = 0L;
        this.f = new agny();
        this.g = str;
        this.h = i;
        this.i = i2;
        this.l = afsw.a;
        this.m = false;
    }
}
