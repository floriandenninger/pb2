package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alpq implements Runnable {
    public final alsf d;

    public alpq() {
        this.d = null;
    }

    public alpq(alsf alsfVar) {
        this.d = alsfVar;
    }

    protected abstract void a();

    public final void b(Exception exc) {
        alsf alsfVar = this.d;
        if (alsfVar != null) {
            alsfVar.a(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            b(e);
        }
    }
}
