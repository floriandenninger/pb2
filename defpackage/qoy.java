package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qoy {
    private int d;
    private final adz c = new adz();
    public final rpv b = new rpv();
    private boolean e = false;
    public final adz a = new adz();

    public qoy(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(((qog) it.next()).p(), null);
        }
        this.d = this.a.keySet().size();
    }

    public final void a(qox qoxVar, ConnectionResult connectionResult, String str) {
        this.a.put(qoxVar, connectionResult);
        this.c.put(qoxVar, str);
        this.d--;
        if (!connectionResult.c()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.b.a(new qny(this.a));
            } else {
                this.b.b(this.c);
            }
        }
    }
}
