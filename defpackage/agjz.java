package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjz {
    public List a;
    public agns b;
    final /* synthetic */ agka c;
    private final List d;
    private final int e;
    private final bagd f;

    public agjz(agka agkaVar, bagd bagdVar, List list, List list2, int i, byte[] bArr) {
        this.c = agkaVar;
        this.f = bagdVar;
        list.getClass();
        this.d = list;
        this.a = list2;
        this.e = i;
    }

    public final agns a() {
        agns agnsVar;
        synchronized (this.c.k) {
            if (this.b == null) {
                this.b = new agns(this.f, this.d, this.a, this.e, null);
            }
            agnsVar = this.b;
        }
        return agnsVar;
    }
}
