package defpackage;

import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$ApiNotConnectedException;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException$DeveloperErrorException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ufj implements anfz {
    private final /* synthetic */ int t;
    public static final /* synthetic */ ufj s = new ufj(19);
    public static final /* synthetic */ ufj r = new ufj(18);
    public static final /* synthetic */ ufj q = new ufj(17);
    public static final /* synthetic */ ufj p = new ufj(16);
    public static final /* synthetic */ ufj o = new ufj(15);
    public static final /* synthetic */ ufj n = new ufj(14);
    public static final /* synthetic */ ufj m = new ufj(13);
    public static final /* synthetic */ ufj l = new ufj(12);
    public static final /* synthetic */ ufj k = new ufj(11);
    public static final /* synthetic */ ufj j = new ufj(10);
    public static final /* synthetic */ ufj i = new ufj(9);
    public static final /* synthetic */ ufj h = new ufj(8);
    public static final /* synthetic */ ufj g = new ufj(7);
    public static final /* synthetic */ ufj f = new ufj(6);
    public static final /* synthetic */ ufj e = new ufj(5);
    public static final /* synthetic */ ufj d = new ufj(4);
    public static final /* synthetic */ ufj c = new ufj(3);
    public static final /* synthetic */ ufj b = new ufj(2);
    public static final /* synthetic */ ufj a = new ufj(1);

    public /* synthetic */ ufj(int i2) {
        this.t = i2;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        switch (this.t) {
            case 0:
                return anaf.O((amru) obj);
            case 1:
                return anaf.O((aodx) aonm.parseFrom(aodx.a, (byte[]) obj, aomw.a()));
            case 2:
                qnx qnxVar = (qnx) obj;
                if (qnxVar.a() == 17) {
                    return anaf.N(new MdiNotAvailableException$ApiNotConnectedException());
                }
                return anaf.N(qnxVar);
            case 3:
                IOException iOException = (IOException) obj;
                qnx qnxVar2 = (qnx) tyo.V(iOException, qnx.class);
                if (qnxVar2 == null || qnxVar2.a() != 10) {
                    return anaf.N(iOException);
                }
                return anaf.N(new MdiNotAvailableException$DeveloperErrorException());
            case 4:
                qnx qnxVar3 = (qnx) obj;
                throw new uvw(qnxVar3.a(), qnxVar3.getMessage(), qnxVar3);
            case 5:
                return anaf.O("");
            case 6:
                return ((ywp) obj).a();
            case 7:
                return ((vgz) obj).a();
            case 8:
                return ((agcm) obj).a.a();
            case 9:
                return anaf.N(aaiq.a(new IllegalArgumentException("Commit aborted due to an exception during PendingEdits execution", (Throwable) obj), 4));
            case 10:
                atai[] ataiVarArr = (atai[]) obj;
                if (ataiVarArr == null) {
                    return anaf.O(amru.q());
                }
                return anaf.O(amru.p(ataiVarArr));
            case 11:
                return anaf.N(new aglv((Throwable) obj));
            case 12:
                return ((agsn) obj).m().i();
            case 13:
                return ((agsn) obj).m().i();
            case 14:
                return anaf.O(((awkk) obj).toByteArray());
            case 15:
                return anaf.O(((awkx) obj).toByteArray());
            case 16:
                aone createBuilder = awkk.a.createBuilder();
                aomf x = aomf.x((byte[]) obj);
                createBuilder.copyOnWrite();
                awkk awkkVar = (awkk) createBuilder.instance;
                awkkVar.b |= 1;
                awkkVar.c = x;
                return anaf.O((awkk) createBuilder.build());
            case 17:
                aone createBuilder2 = awkx.a.createBuilder();
                aomf x2 = aomf.x((byte[]) obj);
                createBuilder2.copyOnWrite();
                awkx awkxVar = (awkx) createBuilder2.instance;
                awkxVar.b |= 1;
                awkxVar.c = x2;
                return anaf.O((awkx) createBuilder2.build());
            case 18:
                return anaf.O(((awki) aonm.parseFrom(awki.a, (byte[]) obj, aomw.b())).b.I());
            default:
                return anaf.O(((awml) obj).toByteArray());
        }
    }
}
