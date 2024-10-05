package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class icu implements amml {
    private final /* synthetic */ int u;
    public static final /* synthetic */ icu t = new icu(20);
    public static final /* synthetic */ icu s = new icu(19);
    public static final /* synthetic */ icu r = new icu(18);
    public static final /* synthetic */ icu q = new icu(17);
    public static final /* synthetic */ icu p = new icu(16);
    public static final /* synthetic */ icu o = new icu(15);
    public static final /* synthetic */ icu n = new icu(14);
    public static final /* synthetic */ icu m = new icu(12);
    public static final /* synthetic */ icu l = new icu(11);
    public static final /* synthetic */ icu k = new icu(10);
    public static final /* synthetic */ icu j = new icu(9);
    public static final /* synthetic */ icu i = new icu(8);
    public static final /* synthetic */ icu h = new icu(7);
    public static final /* synthetic */ icu g = new icu(6);
    public static final /* synthetic */ icu f = new icu(5);
    public static final /* synthetic */ icu e = new icu(4);
    public static final /* synthetic */ icu d = new icu(3);
    public static final /* synthetic */ icu c = new icu(2);
    public static final /* synthetic */ icu b = new icu(1);
    public static final /* synthetic */ icu a = new icu(0);

    public /* synthetic */ icu(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.u) {
            case 0:
                int i2 = ida.s;
                aone builder = ((idr) obj).toBuilder();
                builder.copyOnWrite();
                ((idr) builder.instance).c = true;
                return (idr) builder.build();
            case 1:
                idr idrVar = (idr) obj;
                if (idrVar == null) {
                    return new ArrayList();
                }
                String str = idrVar.m;
                if (TextUtils.isEmpty(str)) {
                    return new ArrayList();
                }
                try {
                    auyc auycVar = (auyc) aonm.parseFrom(auyc.a, Base64.decode(str, 0), aomw.b());
                    ArrayList arrayList = new ArrayList(auycVar.b.size());
                    arrayList.addAll(auycVar.b);
                    return arrayList;
                } catch (aoob e2) {
                    zga.d("Error reading recent stickers.", e2);
                    return new ArrayList();
                }
            case 2:
                aone aoneVar = (aone) obj;
                aoneVar.copyOnWrite();
                idr idrVar2 = (idr) aoneVar.instance;
                idr idrVar3 = idr.a;
                idrVar2.b = 1;
                return aoneVar;
            case 3:
                return Boolean.valueOf(((idr) obj).b > 0);
            case 4:
                aone builder2 = ((ioq) obj).toBuilder();
                builder2.copyOnWrite();
                ((ioq) builder2.instance).b = true;
                return (ioq) builder2.build();
            case 5:
                return (avuf) obj;
            case 6:
                avuf avufVar = (avuf) obj;
                if (avufVar.getNumVideosFailed().intValue() > 0) {
                    return itc.a(avufVar.getNumVideosFailed().intValue(), avufVar.getNumVideosFailed().intValue() + avufVar.getNumVideosInProgress().intValue() + avufVar.getNumVideosCompleted().intValue());
                }
                if (avufVar.getNumVideosInProgress().intValue() > 0) {
                    return ite.a(avufVar.getUploadProgress().floatValue(), avufVar.getNumVideosInProgress().intValue(), avufVar.getNumVideosCompleted().intValue(), avufVar.getNumVideosFailed().intValue());
                }
                return itb.a(avufVar.getNumVideosCompleted().intValue(), avufVar.getNumVideosInProgress().intValue(), avufVar.getNumVideosFailed().intValue());
            case 7:
                return (Boolean) ((ammw) obj).b;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                amkq.O(!str2.isEmpty(), "key cannot be empty");
                aone createBuilder = asxe.a.createBuilder();
                createBuilder.copyOnWrite();
                asxe asxeVar = (asxe) createBuilder.instance;
                asxeVar.c = 1 | asxeVar.c;
                asxeVar.d = str2;
                return new asxb(createBuilder);
            case 9:
                return awib.d((String) obj);
            case 10:
                return awjo.d((String) obj);
            case 11:
                return Boolean.valueOf(((jps) obj).p);
            case 12:
                return Optional.ofNullable((aqpb) obj);
            case 13:
                agnq agnqVar = agnq.DELETED;
                switch (((agnq) obj).ordinal()) {
                    case 1:
                        return jps.PLAYABLE;
                    case 2:
                    case 11:
                    case 14:
                    case 19:
                    default:
                        zga.b("Unrecognized OfflineVideoDisplayState, defaulting to unknown");
                        return jps.UNKNOWN;
                    case 3:
                        return jps.TRANSFER_IN_PROGRESS;
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return jps.TRANSFER_WAITING_IN_QUEUE;
                    case 5:
                        return jps.TRANSFER_PENDING_USER_APPROVAL;
                    case 10:
                        return jps.TRANSFER_PAUSED;
                    case 12:
                        return jps.ERROR_PENDING_PLAYABILITY_ACTION;
                    case 13:
                        return jps.ERROR_STREAMS_MISSING;
                    case 15:
                        return jps.ERROR_NOT_PLAYABLE;
                    case 16:
                        return jps.ERROR_POLICY;
                    case 17:
                        return jps.ERROR_EXPIRED;
                    case 18:
                        return jps.ERROR_EXPIRED_RENTAL;
                    case 20:
                        return jps.ERROR_DISK;
                    case 21:
                        return jps.ERROR_DISK_SD_CARD;
                    case 22:
                        return jps.ERROR_GENERIC;
                }
            case 14:
                awos awosVar = (awos) obj;
                aone createBuilder2 = aqkj.a.createBuilder();
                createBuilder2.copyOnWrite();
                aqkj aqkjVar = (aqkj) createBuilder2.instance;
                awosVar.getClass();
                aqkjVar.h = awosVar;
                aqkjVar.c |= 16;
                return (aqkj) createBuilder2.build();
            case 15:
                aong aongVar = (aong) aqrf.a.createBuilder();
                ajdx.b(aongVar, (awos) obj);
                return (aqrf) aongVar.build();
            case 16:
                return Boolean.valueOf(((jph) obj).a());
            case 17:
                zga.d("Error adding the MainVideoDownloadStateEntity", (Throwable) obj);
                return agou.c;
            case 18:
                return agou.a;
            case 19:
                zga.d("Error deleting the MainVideoEntity", (Throwable) obj);
                return agou.c;
            default:
                return agou.c;
        }
    }
}
