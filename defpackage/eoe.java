package defpackage;

import android.accounts.Account;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.WebviewEndpointOuterClass$WebviewEndpoint;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class eoe implements ayrv {
    private final /* synthetic */ int u;
    public static final /* synthetic */ eoe t = new eoe(20);
    public static final /* synthetic */ eoe s = new eoe(19);
    public static final /* synthetic */ eoe r = new eoe(18);
    public static final /* synthetic */ eoe q = new eoe(17);
    public static final /* synthetic */ eoe p = new eoe(16);
    public static final /* synthetic */ eoe o = new eoe(14);
    public static final /* synthetic */ eoe n = new eoe(13);
    public static final /* synthetic */ eoe m = new eoe(12);
    public static final /* synthetic */ eoe l = new eoe(11);
    public static final /* synthetic */ eoe k = new eoe(10);
    public static final /* synthetic */ eoe j = new eoe(9);
    public static final /* synthetic */ eoe i = new eoe(8);
    public static final /* synthetic */ eoe h = new eoe(7);
    public static final /* synthetic */ eoe g = new eoe(6);
    public static final /* synthetic */ eoe f = new eoe(5);
    public static final /* synthetic */ eoe e = new eoe(4);
    public static final /* synthetic */ eoe d = new eoe(3);
    public static final /* synthetic */ eoe c = new eoe(2);
    public static final /* synthetic */ eoe b = new eoe(1);
    public static final /* synthetic */ eoe a = new eoe(0);

    public /* synthetic */ eoe(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        switch (this.u) {
            case 0:
                return (fhg) ((List) obj).get(1);
            case 1:
                return Boolean.valueOf(((Integer) obj).intValue() == 3);
            case 2:
                return Boolean.valueOf(((eok) obj).j);
            case 3:
                aswb aswbVar = ((arfd) obj).e;
                if (aswbVar == null) {
                    aswbVar = aswb.a;
                }
                return Boolean.valueOf(aswbVar.ab);
            case 4:
                return Boolean.valueOf(((eok) obj).j);
            case 5:
                return (Account) ((ammv) obj).c();
            case 6:
                int i2 = ezw.g;
                return (WebviewEndpointOuterClass$WebviewEndpoint) ((apxf) obj).pX(WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint);
            case 7:
                return Uri.parse((String) obj);
            case 8:
                return ((fin) obj).a;
            case 9:
                return (fin) ((ammv) obj).c();
            case 10:
                return (fin) ((ammw) obj).a;
            case 11:
                return ((awiu) obj).getDownloads();
            case 12:
                String str = (String) obj;
                return new fin(str, aalt.a(str), aalt.g(str));
            case 13:
                return amru.o((List) obj);
            case 14:
                return aypy.T((List) obj);
            case 15:
                awiv awivVar = (awiv) obj;
                int i3 = awivVar.b;
                if (i3 == 1) {
                    return (String) awivVar.c;
                }
                if (i3 == 3) {
                    return (String) awivVar.c;
                }
                return i3 == 2 ? (String) awivVar.c : "";
            case 16:
                return ((fie) obj).b;
            case 17:
                return ((fiw) obj).a;
            case 18:
                return fiw.a((aakt) obj);
            case 19:
                return fiw.a((aakt) obj);
            default:
                return fiw.a((aakt) obj);
        }
    }
}
