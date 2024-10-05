package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vlg implements vli {
    public final vlj a;
    private final anib b;

    public vlg(vlj vljVar, anib anibVar) {
        this.a = vljVar;
        this.b = anibVar;
    }

    public final anhy a(final vlf vlfVar) {
        return aney.i(c(vlfVar), aydd.class, new anfz() { // from class: vlb
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                vlg vlgVar = vlg.this;
                vlf vlfVar2 = vlfVar;
                aydd ayddVar = (aydd) obj;
                if (ayddVar.a.getCode().equals(Status.Code.UNAUTHENTICATED)) {
                    vlgVar.a.b();
                    return vlgVar.c(vlfVar2);
                }
                return anaf.N(ayddVar);
            }
        }, this.b);
    }

    @Override // defpackage.vli
    public final anhy b(final aoda aodaVar) {
        return a(new vlf() { // from class: vlc
            @Override // defpackage.vlf
            public final anhy a(aocy aocyVar) {
                aoda aodaVar2 = aoda.this;
                axzp axzpVar = aocyVar.a;
                aych aychVar = aocz.c;
                if (aychVar == null) {
                    synchronized (aocz.class) {
                        aychVar = aocz.c;
                        if (aychVar == null) {
                            ayce a = aych.a();
                            a.c = aycg.UNARY;
                            a.d = aych.c("google.internal.contactsui.v1.CustardService", "ListArchivedProfilePhotos");
                            a.b();
                            a.a = ayom.b(aoda.a);
                            a.b = ayom.b(aodb.a);
                            aychVar = a.a();
                            aocz.c = aychVar;
                        }
                    }
                }
                return ayox.a(axzpVar.a(aychVar, aocyVar.b), aodaVar2);
            }
        });
    }

    public final anht c(final vlf vlfVar) {
        anht q = anht.q(this.a.a());
        vlfVar.getClass();
        return (anht) anfq.i(q, new anfz() { // from class: vla
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                return vlf.this.a((aocy) obj);
            }
        }, this.b);
    }
}
