package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cgg implements Runnable {
    final /* synthetic */ cgi a;

    public cgg(cgi cgiVar) {
        this.a = cgiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b == null) {
            return;
        }
        cgf cgfVar = this.a.b;
        Object obj = cgfVar.a;
        if (obj != null) {
            this.a.b(obj);
        } else {
            this.a.a(cgfVar.b);
        }
    }
}
