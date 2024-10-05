package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajqf implements ajpf {
    private long a;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(long j) {
        amkq.I(j >= 0, "Blocking duration must be greater or equal to 0: %ld", j);
        this.a = j;
    }

    @Override // defpackage.ajpf
    public final long j() {
        return this.a;
    }
}
