package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alsf {
    public final alsc a = new alsc(null);

    public final void a(Exception exc) {
        alsc alscVar = this.a;
        synchronized (alscVar.a) {
            if (alscVar.c) {
                return;
            }
            alscVar.c = true;
            alscVar.e = exc;
            alscVar.b.b(alscVar);
        }
    }

    public final void b(Object obj) {
        alsc alscVar = this.a;
        synchronized (alscVar.a) {
            if (alscVar.c) {
                return;
            }
            alscVar.c = true;
            alscVar.d = obj;
            alscVar.b.b(alscVar);
        }
    }
}
