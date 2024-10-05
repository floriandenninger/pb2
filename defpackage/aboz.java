package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aboz implements Runnable {
    final /* synthetic */ abpb a;

    public aboz(abpb abpbVar) {
        this.a = abpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abpb abpbVar = this.a;
        abpa abpaVar = abpbVar.a;
        if (abpaVar != null) {
            abpaVar.b(abpbVar);
        }
    }
}
