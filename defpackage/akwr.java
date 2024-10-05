package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class akwr implements akwp {
    private final akyb a;

    public akwr(akyb akybVar) {
        this.a = akybVar;
    }

    @Override // defpackage.akwp
    public final akzs a(akzs akzsVar) {
        akzs b = b(akzsVar);
        if (akzsVar != null && !akzsVar.af) {
            amru amruVar = akwh.a;
            akzr a = akzr.a(akzsVar.Z);
            if (a == null) {
                a = akzr.UNKNOWN;
            }
            if (!amruVar.contains(a) && !akzsVar.ae) {
                if (b == null) {
                    this.a.d(akzsVar.k, akzsVar.e, avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_COMPLETED);
                } else if (!b.af || (b.t && !b.u)) {
                    amru amruVar2 = akwh.a;
                    akzr a2 = akzr.a(b.Z);
                    if (a2 == null) {
                        a2 = akzr.UNKNOWN;
                    }
                    if (amruVar2.contains(a2)) {
                        akyb akybVar = this.a;
                        String str = akzsVar.k;
                        String str2 = akzsVar.e;
                        avsy a3 = avsz.a();
                        avto avtoVar = avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_REJECTED;
                        a3.copyOnWrite();
                        ((avsz) a3.instance).y(avtoVar);
                        aone createBuilder = avta.a.createBuilder();
                        createBuilder.copyOnWrite();
                        avta avtaVar = (avta) createBuilder.instance;
                        str.getClass();
                        avtaVar.b |= 1;
                        avtaVar.c = str;
                        a3.copyOnWrite();
                        ((avsz) a3.instance).F((avta) createBuilder.build());
                        avsz avszVar = (avsz) a3.build();
                        arpn a4 = arpp.a();
                        a4.copyOnWrite();
                        ((arpp) a4.instance).dV(avszVar);
                        akybVar.b(str2, (arpp) a4.build());
                    } else if (b.ae && (!b.t || b.u)) {
                        this.a.e(akzsVar.k, akzsVar.e, avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_DELETED_PENDING_UPLOAD);
                    }
                } else {
                    akyb akybVar2 = this.a;
                    String str3 = b.k;
                    String str4 = b.e;
                    avtr b2 = avtr.b(b.ag);
                    if (b2 == null) {
                        b2 = avtr.UPLOAD_PROCESSOR_TYPE_UNKNOWN;
                    }
                    avtq b3 = avtq.b(b.ah);
                    if (b3 == null) {
                        b3 = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
                    }
                    avsy a5 = avsz.a();
                    avto avtoVar2 = avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_FAILED;
                    a5.copyOnWrite();
                    ((avsz) a5.instance).y(avtoVar2);
                    aone createBuilder2 = avta.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    avta avtaVar2 = (avta) createBuilder2.instance;
                    str3.getClass();
                    avtaVar2.b |= 1;
                    avtaVar2.c = str3;
                    a5.copyOnWrite();
                    ((avsz) a5.instance).F((avta) createBuilder2.build());
                    a5.copyOnWrite();
                    ((avsz) a5.instance).A(b2);
                    a5.copyOnWrite();
                    ((avsz) a5.instance).z(b3);
                    avsz avszVar2 = (avsz) a5.build();
                    arpn a6 = arpp.a();
                    a6.copyOnWrite();
                    ((arpp) a6.instance).dV(avszVar2);
                    akybVar2.b(str4, (arpp) a6.build());
                }
            }
        }
        return b;
    }

    public abstract akzs b(akzs akzsVar);
}
