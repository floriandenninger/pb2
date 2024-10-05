package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axrk extends Exception {
    private static final long serialVersionUID = 6569838532917408380L;
    public final axri a;

    public axrk(axri axriVar, String str) {
        super(str);
        this.a = axriVar;
    }

    public axrk(axri axriVar, String str, Exception exc) {
        super(str, exc);
        this.a = axriVar;
    }
}
