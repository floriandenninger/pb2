package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amqj extends amrv {
    static final amqj a = new amqj();
    private static final long serialVersionUID = 0;

    private amqj() {
        super(amvo.b, 0);
    }

    private Object readResolve() {
        return a;
    }
}
