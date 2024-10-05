package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axpx implements axqk {
    private final aps a;
    private final Object b = new Object();
    private volatile ehu c;

    public axpx(zv zvVar) {
        this.a = new aps(zvVar, new axpt(zvVar));
    }

    @Override // defpackage.axqk
    public final /* bridge */ /* synthetic */ Object lM() {
        if (this.c == null) {
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = ((axpv) this.a.a(axpv.class)).a;
                }
            }
        }
        return this.c;
    }
}
