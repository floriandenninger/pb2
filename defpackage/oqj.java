package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oqj implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ oqj u = new oqj(20);
    public static final /* synthetic */ oqj t = new oqj(19);
    public static final /* synthetic */ oqj s = new oqj(18);
    public static final /* synthetic */ oqj r = new oqj(17);
    public static final /* synthetic */ oqj q = new oqj(16);
    public static final /* synthetic */ oqj p = new oqj(15);
    public static final /* synthetic */ oqj o = new oqj(14);
    public static final /* synthetic */ oqj n = new oqj(13);
    public static final /* synthetic */ oqj m = new oqj(12);
    public static final /* synthetic */ oqj l = new oqj(11);
    public static final /* synthetic */ oqj k = new oqj(10);
    public static final /* synthetic */ oqj j = new oqj(9);
    public static final /* synthetic */ oqj i = new oqj(8);
    public static final /* synthetic */ oqj h = new oqj(7);
    public static final /* synthetic */ oqj g = new oqj(6);
    public static final /* synthetic */ oqj f = new oqj(5);
    public static final /* synthetic */ oqj e = new oqj(4);
    public static final /* synthetic */ oqj d = new oqj(3);
    public static final /* synthetic */ oqj c = new oqj(2);
    public static final /* synthetic */ oqj b = new oqj(1);
    public static final /* synthetic */ oqj a = new oqj(0);

    private /* synthetic */ oqj(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return aypy.W(gnb.DISABLE_FULLSCREEN);
            case 1:
                return (String) ((Optional) obj).get();
            case 2:
                String str = WebViewFallbackActivity.b;
                oqw oqwVar = oqw.BROWSER;
                int ordinal = ((oqw) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        throw new AssertionError();
                    }
                    r2 = 5638;
                }
                return Integer.valueOf(r2);
            case 3:
                return Uri.parse((String) obj);
            case 4:
                return ((ammv) obj).b(mjy.l);
            case 5:
                int i2 = oqx.b;
                return (List) ((ammv) obj).e(amru.q());
            case 6:
                int i3 = oqx.b;
                return ((List) obj).isEmpty() ? oqw.BROWSER : oqw.FULLSCREEN_MEDIA;
            case 7:
                int i4 = oqx.b;
                return (ammv) ((List) obj).get(0);
            case 8:
                return aypn.w((List) obj);
            case 9:
                return ((oqv) obj).b;
            case 10:
                oqw oqwVar2 = (oqw) obj;
                int i5 = oqx.b;
                return Integer.valueOf(oqwVar2 != oqw.FULLSCREEN_MEDIA ? 8 : 0);
            case 11:
                return ((ammv) obj).g();
            case 12:
                return ((ammv) obj).b(mjy.m);
            case 13:
                return new uzc((List) obj);
            case 14:
                aswb aswbVar = ((arfd) obj).e;
                return aswbVar == null ? aswb.a : aswbVar;
            case 15:
                return Boolean.valueOf(((aswb) obj).ak);
            case 16:
                return ((aswb) obj).am;
            case 17:
                return ((aswb) obj).an;
            case 18:
                return Boolean.valueOf(((ora) obj) == ora.LOADING);
            case 19:
                aqrt aqrtVar = ((arfd) obj).v;
                return aqrtVar == null ? aqrt.a : aqrtVar;
            default:
                aqrt aqrtVar2 = ((arfd) obj).v;
                return aqrtVar2 == null ? aqrt.a : aqrtVar2;
        }
    }
}
