package defpackage;

import android.accounts.Account;
import com.google.android.apps.youtube.app.settings.datasaving.DataSavingEntityController;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class khe implements ayrv {
    private final /* synthetic */ int u;
    public static final /* synthetic */ khe t = new khe(20);
    public static final /* synthetic */ khe s = new khe(19);
    public static final /* synthetic */ khe r = new khe(17);
    public static final /* synthetic */ khe q = new khe(16);
    public static final /* synthetic */ khe p = new khe(15);
    public static final /* synthetic */ khe o = new khe(14);
    public static final /* synthetic */ khe n = new khe(13);
    public static final /* synthetic */ khe m = new khe(12);
    public static final /* synthetic */ khe l = new khe(11);
    public static final /* synthetic */ khe k = new khe(10);
    public static final /* synthetic */ khe j = new khe(9);
    public static final /* synthetic */ khe i = new khe(8);
    public static final /* synthetic */ khe h = new khe(7);
    public static final /* synthetic */ khe g = new khe(6);
    public static final /* synthetic */ khe f = new khe(5);
    public static final /* synthetic */ khe e = new khe(4);
    public static final /* synthetic */ khe d = new khe(3);
    public static final /* synthetic */ khe c = new khe(2);
    public static final /* synthetic */ khe b = new khe(1);
    public static final /* synthetic */ khe a = new khe(0);

    public /* synthetic */ khe(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        atxk atxkVar;
        switch (this.u) {
            case 0:
                return Integer.valueOf(((ahej) obj).a());
            case 1:
                khl khlVar = khb.b;
                return Boolean.valueOf(((ahcx) obj).d() == aigf.BACKGROUND);
            case 2:
                return khk.b;
            case 3:
                return 2;
            case 4:
                amru amruVar = khk.a;
                int a2 = ((ahej) obj).a();
                return Integer.valueOf(a2 != 2 ? a2 != 3 ? 0 : 3 : 1);
            case 5:
                switch (((aigr) obj).i - 1) {
                    case 0:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_UNKNOWN;
                        break;
                    case 1:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_VIDEO_ERROR;
                        break;
                    case 2:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE;
                        break;
                    case 3:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_REQUEST_FAILED;
                        break;
                    case 4:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_USER_AGE_CHECK_FAILED;
                        break;
                    case 5:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_USER_CONTENT_CHECK_FAILED;
                        break;
                    case 6:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_ERROR;
                        break;
                    case 7:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_NET_ERROR;
                        break;
                    case 8:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_CONCURRENT_PLAYBACK_ERROR;
                        break;
                    case 9:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_PLAYER_ERROR;
                        break;
                    case 10:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_NO_STREAMS;
                        break;
                    case 11:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_WATCH_NEXT_ERROR;
                        break;
                    case 12:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_IN_BACKGROUND;
                        break;
                    case 13:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_BY_APP_POLICY;
                        break;
                    default:
                        atxkVar = atxk.PLAYBACK_EXCEPTION_ERROR_REASON_PARTIAL_PLAYBACK_DATA_EXHAUSTED;
                        break;
                }
                return new kho(atxkVar);
            case 6:
                return Boolean.valueOf(((ahef) obj).c().a(aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING));
            case 7:
                return Integer.valueOf(((fof) obj).k);
            case 8:
                return ((aakz) obj).c;
            case 9:
                return (Collection) obj;
            case 10:
                return (List) obj;
            case 11:
                aunv aunvVar = ((arfd) obj).n;
                return aunvVar == null ? aunv.a : aunvVar;
            case 12:
                return (Account) ((ammv) obj).c();
            case 13:
                return Boolean.valueOf(evr.af((arfd) obj));
            case 14:
                return Boolean.valueOf(((lox) obj).l);
            case 15:
                int i2 = DataSavingEntityController.c;
                aakt aaktVar = ((aakz) obj).c;
                aaktVar.getClass();
                return aaktVar;
            case 16:
                avzr b2 = avzr.b(((awvr) obj).m);
                return b2 == null ? avzr.VIDEO_QUALITY_SETTING_UNKNOWN : b2;
            case 17:
                fof fofVar = (fof) obj;
                if ((fofVar.b & 4) != 0) {
                    return Integer.valueOf(fofVar.e);
                }
                return -1;
            case 18:
                lox loxVar = (lox) obj;
                aone createBuilder = apfp.a.createBuilder();
                boolean z = loxVar.f;
                createBuilder.copyOnWrite();
                apfp apfpVar = (apfp) createBuilder.instance;
                apfpVar.b |= 524288;
                apfpVar.e = z;
                boolean z2 = loxVar.g;
                createBuilder.copyOnWrite();
                apfp apfpVar2 = (apfp) createBuilder.instance;
                apfpVar2.b |= 1048576;
                apfpVar2.f = z2;
                boolean z3 = loxVar.h;
                createBuilder.copyOnWrite();
                apfp apfpVar3 = (apfp) createBuilder.instance;
                apfpVar3.b |= 2097152;
                apfpVar3.g = z3;
                boolean z4 = loxVar.i;
                createBuilder.copyOnWrite();
                apfp apfpVar4 = (apfp) createBuilder.instance;
                apfpVar4.b |= 4194304;
                apfpVar4.h = z4;
                boolean z5 = loxVar.j;
                createBuilder.copyOnWrite();
                apfp apfpVar5 = (apfp) createBuilder.instance;
                apfpVar5.b |= 16777216;
                apfpVar5.j = z5;
                boolean z6 = loxVar.k;
                createBuilder.copyOnWrite();
                apfp apfpVar6 = (apfp) createBuilder.instance;
                apfpVar6.b |= 8388608;
                apfpVar6.i = z6;
                return (apfp) createBuilder.build();
            case 19:
                return ammv.j((apfp) obj);
            default:
                aswb aswbVar = ((arfd) obj).e;
                return aswbVar == null ? aswb.a : aswbVar;
        }
    }
}
