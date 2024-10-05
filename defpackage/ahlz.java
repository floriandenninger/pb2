package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahlz {
    public final /* synthetic */ ahmc a;

    public final void a(final long j) {
        final ahmc ahmcVar = this.a;
        ahmcVar.a.post(new Runnable() { // from class: ahly
            @Override // java.lang.Runnable
            public final void run() {
                ahmc ahmcVar2 = ahmc.this;
                long j2 = j;
                ahvb ahvbVar = ahmcVar2.g;
                if (ahvbVar != null) {
                    ahvbVar.r(j2);
                }
            }
        });
        ahmcVar.c();
    }
}
