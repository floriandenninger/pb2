package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class btg extends btp {
    public btg(btl btlVar) {
        super(btlVar);
    }

    public final void b(Object obj) {
        buu d = d();
        try {
            c(d, obj);
            d.a();
        } finally {
            e(d);
        }
    }

    public abstract void c(buu buuVar, Object obj);
}
