package defpackage;

import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oht implements ayrw {
    private final /* synthetic */ int u;
    public static final /* synthetic */ oht t = new oht(20);
    public static final /* synthetic */ oht s = new oht(19);
    public static final /* synthetic */ oht r = new oht(18);
    public static final /* synthetic */ oht q = new oht(16);
    public static final /* synthetic */ oht p = new oht(15);
    public static final /* synthetic */ oht o = new oht(14);
    public static final /* synthetic */ oht n = new oht(13);
    public static final /* synthetic */ oht m = new oht(12);
    public static final /* synthetic */ oht l = new oht(11);
    public static final /* synthetic */ oht k = new oht(10);
    public static final /* synthetic */ oht j = new oht(9);
    public static final /* synthetic */ oht i = new oht(8);
    public static final /* synthetic */ oht h = new oht(7);
    public static final /* synthetic */ oht g = new oht(6);
    public static final /* synthetic */ oht f = new oht(5);
    public static final /* synthetic */ oht e = new oht(4);
    public static final /* synthetic */ oht d = new oht(3);
    public static final /* synthetic */ oht c = new oht(2);
    public static final /* synthetic */ oht b = new oht(1);
    public static final /* synthetic */ oht a = new oht(0);

    public /* synthetic */ oht(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayrw
    public final boolean a(Object obj) {
        switch (this.u) {
            case 0:
                return ((aakz) obj).c != null;
            case 1:
                return ((ammv) obj).h();
            case 2:
                return ((Optional) obj).isPresent();
            case 3:
                return !((opl) obj).a.isEmpty();
            case 4:
                return ((Optional) obj).isPresent();
            case 5:
                String str = WebViewFallbackActivity.b;
                return !((Boolean) obj).booleanValue();
            case 6:
                int i2 = oqx.b;
                return ((List) obj).size() == 2;
            case 7:
                return ((ammv) obj).h();
            case 8:
                return ((ammv) obj).h();
            case 9:
                return ((ammv) obj).h();
            case 10:
                return ((aakz) obj).c != null;
            case 11:
                return ((aakz) obj).c != null;
            case 12:
                return ((ammv) obj).h();
            case 13:
                return ((ammv) obj).h();
            case 14:
                Map map = zxc.a;
                return true;
            case 15:
                Map map2 = zxc.a;
                return ((DeviceLocalFile) obj).a() == 1;
            case 16:
                Map map3 = zxc.a;
                return ((DeviceLocalFile) obj).a() == 0;
            case 17:
                return ((aafx) obj).c().equals("tf-lite-bandwidth-model");
            case 18:
                return ((arjy) obj).b == 58174010;
            case 19:
                return ((aakz) obj).c != null;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }
}
