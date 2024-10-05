package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class asz extends Thread {
    final /* synthetic */ ata a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asz(ata ataVar) {
        super("ExoPlayer:SimpleDecoder");
        this.a = ataVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.a.p());
    }
}
