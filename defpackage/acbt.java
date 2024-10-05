package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acbt extends Thread {
    final /* synthetic */ acbv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acbt(acbv acbvVar) {
        super("rtmpOutput");
        this.a = acbvVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.b();
    }
}
