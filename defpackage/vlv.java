package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vlv {
    private final amnp a;
    private final aofe b;

    private vlv(amnp amnpVar, aofe aofeVar) {
        this.a = amnpVar;
        this.b = aofeVar;
    }

    public /* synthetic */ vlv(amnp amnpVar, aofe aofeVar, vlu vluVar) {
        this(amnpVar, aofeVar);
    }

    public vlv a() {
        amnp amnpVar = this.a;
        amnpVar.e();
        amnpVar.f();
        return this;
    }

    public aoff b() {
        aofe aofeVar = this.b;
        long a = this.a.a(TimeUnit.MICROSECONDS);
        aofeVar.copyOnWrite();
        ((aoff) aofeVar.instance).o(a);
        return (aoff) aofeVar.build();
    }
}
