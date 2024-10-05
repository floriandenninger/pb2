package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class twq {
    public String a;
    public Integer b;
    public String c;
    public String d;
    public aokw e;
    public aols f;
    public String g;
    public aoio h;
    public aoms i;
    public int j;

    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("Null actionId");
        }
        this.a = str;
    }

    public final void b() {
        this.b = 0;
    }

    public final void c(aoio aoioVar) {
        if (aoioVar == null) {
            throw new NullPointerException("Null preferenceKey");
        }
        this.h = aoioVar;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null replyHintText");
        }
        this.g = str;
    }

    public final void e(aoms aomsVar) {
        if (aomsVar == null) {
            throw new NullPointerException("Null snoozeDuration");
        }
        this.i = aomsVar;
    }

    public final void f(aokw aokwVar) {
        if (aokwVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.e = aokwVar;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.d = str;
    }
}
