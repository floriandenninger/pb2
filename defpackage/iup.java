package defpackage;

import android.os.Bundle;
import android.view.Window;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iup implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ iup u = new iup(20);
    public static final /* synthetic */ iup t = new iup(19);
    public static final /* synthetic */ iup s = new iup(18);
    public static final /* synthetic */ iup r = new iup(17);
    public static final /* synthetic */ iup q = new iup(16);
    public static final /* synthetic */ iup p = new iup(15);
    public static final /* synthetic */ iup o = new iup(14);
    public static final /* synthetic */ iup n = new iup(13);
    public static final /* synthetic */ iup m = new iup(12);
    public static final /* synthetic */ iup l = new iup(11);
    public static final /* synthetic */ iup k = new iup(10);
    public static final /* synthetic */ iup j = new iup(9);
    public static final /* synthetic */ iup i = new iup(8);
    public static final /* synthetic */ iup h = new iup(7);
    public static final /* synthetic */ iup g = new iup(6);
    public static final /* synthetic */ iup f = new iup(5);
    public static final /* synthetic */ iup e = new iup(4);
    public static final /* synthetic */ iup d = new iup(3);
    public static final /* synthetic */ iup c = new iup(2);
    public static final /* synthetic */ iup b = new iup(1);
    public static final /* synthetic */ iup a = new iup(0);

    private /* synthetic */ iup(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                int i2 = ivj.cs;
                return ((Bundle) obj).getByteArray("navigation_endpoint_interaction_logging_extension");
            case 1:
                int i3 = ivj.cs;
                return ((Bundle) obj).getByteArray("navigation_endpoint");
            case 2:
                int i4 = ivj.cs;
                return Boolean.valueOf(((Bundle) obj).getBoolean("split_pane_library_opened_in_offline_mode"));
            case 3:
                return ((ci) obj).getWindow();
            case 4:
                return ((Window) obj).getDecorView();
            case 5:
                return Integer.valueOf(((SpecificNetworkErrorViewLoadingFrameLayout) obj).g);
            case 6:
                return ((ivf) obj).s;
            case 7:
                luc lucVar = (luc) obj;
                return new lub(lucVar.d, lucVar.b);
            case 8:
                return ((mbn) obj).b();
            case 9:
                return amru.o(new ArrayList(((mfr) obj).a.values()));
            case 10:
                return ((mgr) obj).b;
            case 11:
                int i5 = ivj.cs;
                return (nmb) ((nky) obj);
            case 12:
                int i6 = ivj.cs;
                return ((nky) obj).a(amvs.a);
            case 13:
                int i7 = ivj.cs;
                return Boolean.valueOf(((nky) obj).d() != null);
            case 14:
                return ((nky) obj).a;
            case 15:
                return false;
            case 16:
                nmb nmbVar = (nmb) obj;
                Object obj2 = nmbVar.a;
                ardu arduVar = null;
                if (obj2 != null) {
                    aubc aubcVar = ((aubg) obj2).K;
                    if (aubcVar == null) {
                        aubcVar = aubc.a;
                    }
                    if ((1 & aubcVar.b) != 0) {
                        aubc aubcVar2 = ((aubg) nmbVar.a).K;
                        if (aubcVar2 == null) {
                            aubcVar2 = aubc.a;
                        }
                        arduVar = aubcVar2.c;
                        if (arduVar == null) {
                            arduVar = ardu.a;
                        }
                    }
                }
                return new gfa(arduVar);
            case 17:
                nmp nmpVar = (nmp) obj;
                return ammw.a(new aame(nmpVar.a), Optional.ofNullable(nmpVar.c.ph()));
            case 18:
                return ((nmq) obj).i();
            case 19:
                return ((BrowseResponseModel) obj).a;
            default:
                return ammw.a((aame) obj, Optional.empty());
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
