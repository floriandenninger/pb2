package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahfl extends aixi {
    private final Runnable a;

    public ahfl(long j, ainy ainyVar) {
        super(j, j + 1000, 1, 1, "PausingCueRange");
        this.a = new gkr(ainyVar, 6);
    }

    @Override // defpackage.aixi
    protected final void b(boolean z, boolean z2, boolean z3) {
        this.a.run();
    }
}
