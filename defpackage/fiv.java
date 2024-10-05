package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fiv implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ fiv u = new fiv(20);
    public static final /* synthetic */ fiv t = new fiv(19);
    public static final /* synthetic */ fiv s = new fiv(18);
    public static final /* synthetic */ fiv r = new fiv(17);
    public static final /* synthetic */ fiv q = new fiv(16);
    public static final /* synthetic */ fiv p = new fiv(15);
    public static final /* synthetic */ fiv o = new fiv(14);
    public static final /* synthetic */ fiv n = new fiv(13);
    public static final /* synthetic */ fiv m = new fiv(12);
    public static final /* synthetic */ fiv l = new fiv(11);
    public static final /* synthetic */ fiv k = new fiv(10);
    public static final /* synthetic */ fiv j = new fiv(9);
    public static final /* synthetic */ fiv i = new fiv(8);
    public static final /* synthetic */ fiv h = new fiv(7);
    public static final /* synthetic */ fiv g = new fiv(6);
    public static final /* synthetic */ fiv f = new fiv(5);
    public static final /* synthetic */ fiv e = new fiv(4);
    public static final /* synthetic */ fiv d = new fiv(3);
    public static final /* synthetic */ fiv c = new fiv(2);
    public static final /* synthetic */ fiv b = new fiv(1);
    public static final /* synthetic */ fiv a = new fiv(0);

    private /* synthetic */ fiv(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i2 = 1;
        switch (this.v) {
            case 0:
                return amru.o((List) obj);
            case 1:
                return aypy.T((amru) obj);
            case 2:
                return amsx.p((List) obj);
            case 3:
                return ((asxi) obj).getItems();
            case 4:
                asxj asxjVar = (asxj) obj;
                int i3 = asxjVar.b;
                if (i3 == 1) {
                    return (String) asxjVar.c;
                }
                return i3 == 2 ? (String) asxjVar.c : "";
            case 5:
                List list = (List) obj;
                return fie.a(list.size(), amru.o(list));
            case 6:
                return aypy.T((List) obj);
            case 7:
                return Integer.valueOf(((fie) obj).a);
            case 8:
                aakt aaktVar = ((aakz) obj).c;
                aaktVar.getClass();
                return aaktVar;
            case 9:
                return Boolean.valueOf(((fkg) obj).k);
            case 10:
                return Boolean.valueOf(((fhg) obj) == fhg.HIDDEN);
            case 11:
                return ((aakz) obj).c;
            case 12:
                ahel ahelVar = (ahel) obj;
                return ahelVar.a().V().A(new iis(ahelVar, i2));
            case 13:
                return OptionalInt.of(((Integer) obj).intValue());
            case 14:
                return Boolean.valueOf(((aplt) PaneDescriptor.b((gir) obj).e().pX(BrowseEndpointOuterClass.browseEndpoint)).c.equals("FEwhat_to_watch"));
            case 15:
                return Boolean.valueOf(((Integer) obj).equals(0));
            case 16:
                return aypy.W(Optional.empty());
            case 17:
                return (byte[]) ((ammv) obj).c();
            case 18:
                try {
                    return (avfb) aonm.parseFrom(avfb.a, (byte[]) obj, aomw.b());
                } catch (aoob e2) {
                    throw new RuntimeException(e2);
                }
            case 19:
                return ((Context) obj).getApplicationContext();
            default:
                return gpe.a((Context) obj);
        }
    }
}
