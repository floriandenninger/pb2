package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwz implements akkw {
    final /* synthetic */ ser a;

    public gwz(ser serVar) {
        this.a = serVar;
    }

    @Override // defpackage.akkw
    public final void a() {
        scj scjVar = (scj) this.a;
        scjVar.a = ansd.PREVIOUSLY_DENIED;
        ser serVar = scjVar.b;
        if (serVar != null) {
            scb scbVar = (scb) serVar;
            scbVar.g = false;
            scbVar.f = false;
            scbVar.e.e.d().a();
        }
    }

    @Override // defpackage.akkw
    public final void b() {
        scj scjVar = (scj) this.a;
        scjVar.a = ansd.DENIED;
        ser serVar = scjVar.b;
        if (serVar != null) {
            scb scbVar = (scb) serVar;
            scbVar.g = false;
            scbVar.f = false;
            scbVar.e.e.d().a();
        }
    }

    @Override // defpackage.akkw
    public final void c() {
        this.a.d();
    }
}
