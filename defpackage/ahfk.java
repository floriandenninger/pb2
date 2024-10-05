package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahfk {
    private final shf a;
    private final acsy b;
    private final aaea c;
    private boolean d;
    private long e;
    private ammv f = amlr.a;
    private final ajkn g;

    public ahfk(shf shfVar, acsy acsyVar, ajkn ajknVar, aaea aaeaVar, byte[] bArr) {
        shfVar.getClass();
        this.a = shfVar;
        acsyVar.getClass();
        this.b = acsyVar;
        ajknVar.getClass();
        this.g = ajknVar;
        aaeaVar.getClass();
        this.c = aaeaVar;
    }

    public final synchronized void a() {
        this.e = this.a.c();
        this.d = true;
    }

    public final void b(ahcw ahcwVar) {
        if (this.d) {
            synchronized (this) {
                ajkn ajknVar = this.g;
                aaea aaeaVar = this.c;
                double a = ajknVar.a(0.0d, 1.0d);
                arfd a2 = aaeaVar.a();
                float f = 0.1f;
                if (a2 != null && (a2.b & 32768) != 0) {
                    atys atysVar = a2.j;
                    if (atysVar == null) {
                        atysVar = atys.a;
                    }
                    if ((atysVar.c & 16) != 0) {
                        f = atysVar.R;
                    }
                }
                if (a < f) {
                    acsy acsyVar = this.b;
                    long j = this.e;
                    ammv ammvVar = this.f;
                    if (ammvVar.h()) {
                        ahcy ahcyVar = (ahcy) ammvVar.c();
                        acsx d = acsyVar.d(asmn.LATENCY_ACTION_PLAYER_SEEK);
                        d.f(j);
                        ((acss) d).b(ahcyVar.f(), ahcyVar.a());
                        ((acss) d).b(ahcwVar.f(), ahcwVar.a());
                    }
                }
            }
            c();
        }
    }

    public final synchronized void c() {
        this.d = false;
        this.f = amlr.a;
    }

    public final synchronized void d(ahcy ahcyVar) {
        if (this.d) {
            this.f = ammv.j(ahcyVar);
        }
    }
}
