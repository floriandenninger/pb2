package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tze {
    public final twx a;

    public tze(twx twxVar) {
        this.a = twxVar;
    }

    public final void a(String str, twb twbVar) {
        synchronized (this.a) {
            try {
                twp b = this.a.b(str).b();
                b.d(twbVar);
                this.a.e(b.a());
            } catch (tww unused) {
            }
        }
    }
}
