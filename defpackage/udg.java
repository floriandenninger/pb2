package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udg {
    public udh a;

    public final void a(aokm aokmVar) {
        uqq.i();
        udh udhVar = this.a;
        for (twu twuVar : udhVar.a.c()) {
            String str = twuVar.b;
            twb twbVar = twuVar.f;
            if (twbVar == twb.REGISTERED || twbVar == twb.PENDING_REGISTRATION || twbVar == twb.FAILED_REGISTRATION) {
                udhVar.a(str, true, aokmVar);
            }
        }
    }
}
