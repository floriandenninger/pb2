package defpackage;

import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.protos.youtube.api.innertube.ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;
import com.google.protos.youtube.api.innertube.PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint;
import com.google.protos.youtube.api.innertube.ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mjq implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ mjq u = new mjq(20);
    public static final /* synthetic */ mjq t = new mjq(19);
    public static final /* synthetic */ mjq s = new mjq(18);
    public static final /* synthetic */ mjq r = new mjq(17);
    public static final /* synthetic */ mjq q = new mjq(16);
    public static final /* synthetic */ mjq p = new mjq(15);
    public static final /* synthetic */ mjq o = new mjq(14);
    public static final /* synthetic */ mjq n = new mjq(13);
    public static final /* synthetic */ mjq m = new mjq(12);
    public static final /* synthetic */ mjq l = new mjq(11);
    public static final /* synthetic */ mjq k = new mjq(10);
    public static final /* synthetic */ mjq j = new mjq(9);
    public static final /* synthetic */ mjq i = new mjq(8);
    public static final /* synthetic */ mjq h = new mjq(7);
    public static final /* synthetic */ mjq g = new mjq(6);
    public static final /* synthetic */ mjq f = new mjq(5);
    public static final /* synthetic */ mjq e = new mjq(4);
    public static final /* synthetic */ mjq d = new mjq(3);
    public static final /* synthetic */ mjq c = new mjq(2);
    public static final /* synthetic */ mjq b = new mjq(1);
    public static final /* synthetic */ mjq a = new mjq(0);

    private /* synthetic */ mjq(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return Boolean.valueOf(((Integer) obj).intValue() == 0);
            case 1:
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            case 2:
                return Collection.EL.stream(((aska) obj).f);
            case 3:
                askb askbVar = ((askd) obj).d;
                if (askbVar == null) {
                    askbVar = askb.a;
                }
                aska askaVar = askbVar.c;
                return askaVar == null ? aska.a : askaVar;
            case 4:
                return (fze) ((Optional) obj).get();
            case 5:
                return ((aalz) obj).a;
            case 6:
                return Collection.EL.stream(((aame) obj).a().a());
            case 7:
                apmg apmgVar = ((apmh) obj).c;
                return apmgVar == null ? apmg.a : apmgVar;
            case 8:
                return Boolean.valueOf(((apxf) obj).pY(ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.clearWatchHistoryEndpoint));
            case 9:
                apxf apxfVar = (apxf) obj;
                return Boolean.valueOf(apxfVar.pY(PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.pauseWatchHistoryEndpoint) || apxfVar.pY(ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.resumeWatchHistoryEndpoint));
            case 10:
                return (fze) ((Optional) obj).get();
            case 11:
                return (auap) obj;
            case 12:
                return (auap) obj;
            case 13:
                return ((nmp) obj).a;
            case 14:
                return ((nmp) obj).c;
            case 15:
                return ((nmp) obj).d;
            case 16:
                return ((acra) obj).c();
            case 17:
                return (npj) ((nqg) obj);
            case 18:
                return ((WatchWhileActivity) obj).getSavedStateRegistry();
            case 19:
                return ((mka) obj).c;
            default:
                return ((mka) obj).d;
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                return Function.CC.$default$andThen(this, function);
            case 1:
                return Function.CC.$default$andThen(this, function);
            case 2:
                return Function.CC.$default$andThen(this, function);
            case 3:
                return Function.CC.$default$andThen(this, function);
            case 4:
                return Function.CC.$default$andThen(this, function);
            case 5:
                return Function.CC.$default$andThen(this, function);
            case 6:
                return Function.CC.$default$andThen(this, function);
            case 7:
                return Function.CC.$default$andThen(this, function);
            case 8:
                return Function.CC.$default$andThen(this, function);
            case 9:
                return Function.CC.$default$andThen(this, function);
            case 10:
                return Function.CC.$default$andThen(this, function);
            case 11:
                return Function.CC.$default$andThen(this, function);
            case 12:
                return Function.CC.$default$andThen(this, function);
            case 13:
                return Function.CC.$default$andThen(this, function);
            case 14:
                return Function.CC.$default$andThen(this, function);
            case 15:
                return Function.CC.$default$andThen(this, function);
            case 16:
                return Function.CC.$default$andThen(this, function);
            case 17:
                return Function.CC.$default$andThen(this, function);
            case 18:
                return Function.CC.$default$andThen(this, function);
            case 19:
                return Function.CC.$default$andThen(this, function);
            default:
                return Function.CC.$default$andThen(this, function);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return Function.CC.$default$compose(this, function);
            case 1:
                return Function.CC.$default$compose(this, function);
            case 2:
                return Function.CC.$default$compose(this, function);
            case 3:
                return Function.CC.$default$compose(this, function);
            case 4:
                return Function.CC.$default$compose(this, function);
            case 5:
                return Function.CC.$default$compose(this, function);
            case 6:
                return Function.CC.$default$compose(this, function);
            case 7:
                return Function.CC.$default$compose(this, function);
            case 8:
                return Function.CC.$default$compose(this, function);
            case 9:
                return Function.CC.$default$compose(this, function);
            case 10:
                return Function.CC.$default$compose(this, function);
            case 11:
                return Function.CC.$default$compose(this, function);
            case 12:
                return Function.CC.$default$compose(this, function);
            case 13:
                return Function.CC.$default$compose(this, function);
            case 14:
                return Function.CC.$default$compose(this, function);
            case 15:
                return Function.CC.$default$compose(this, function);
            case 16:
                return Function.CC.$default$compose(this, function);
            case 17:
                return Function.CC.$default$compose(this, function);
            case 18:
                return Function.CC.$default$compose(this, function);
            case 19:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }
}
