package defpackage;

import android.database.sqlite.SQLiteException;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agwo implements aguf {
    private final agsn a;
    private final ague b;
    private final agnz c;
    private final Object d = new Object();
    private boolean e = false;

    public agwo(agsn agsnVar, agnz agnzVar, ague agueVar) {
        this.a = agsnVar;
        this.b = agueVar;
        this.c = agnzVar;
    }

    @Override // defpackage.aguf
    public final void a(int i) {
        synchronized (this.d) {
            this.e = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        synchronized (this.d) {
            if (!this.e) {
                agil A = this.a.A();
                agmm e = this.a.e();
                if (A != null && e != null) {
                    try {
                        try {
                            this.b.b(this.c.a, 0L, 0.0d, false);
                            agww.g(A, e, this.c);
                            this.b.a(this.c.a, new agny());
                        } catch (agug e2) {
                            this.b.d(this.c.a, e2, new agny());
                        }
                    } catch (SQLiteException e3) {
                        this.b.d(this.c.a, agug.a("SQL error encountered while saving the thumbnail.", e3, agnf.FAILED_UNKNOWN, atqs.UNKNOWN_FAILURE_REASON), new agny());
                    } catch (Exception e4) {
                        String valueOf = String.valueOf(e4.getMessage());
                        afsi.c(2, 28, valueOf.length() != 0 ? "Thumbnail save exception: ".concat(valueOf) : new String("Thumbnail save exception: "), e4);
                        this.b.d(this.c.a, agug.a("Unknown error encountered while saving the thumbnail.", e4, agnf.FAILED_UNKNOWN, atqs.UNKNOWN_FAILURE_REASON), new agny());
                    }
                }
            }
        }
    }
}
