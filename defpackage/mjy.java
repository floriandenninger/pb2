package defpackage;

import android.net.Uri;
import android.view.View;
import com.google.android.libraries.accountlinking.LinkResponse;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mjy implements amml {
    private final /* synthetic */ int v;
    public static final /* synthetic */ mjy u = new mjy(20);
    public static final /* synthetic */ mjy t = new mjy(19);
    public static final /* synthetic */ mjy s = new mjy(18);
    public static final /* synthetic */ mjy r = new mjy(17);
    public static final /* synthetic */ mjy q = new mjy(16);
    public static final /* synthetic */ mjy p = new mjy(15);
    public static final /* synthetic */ mjy o = new mjy(14);
    public static final /* synthetic */ mjy n = new mjy(13);
    public static final /* synthetic */ mjy m = new mjy(12);
    public static final /* synthetic */ mjy l = new mjy(11);
    public static final /* synthetic */ mjy k = new mjy(10);
    public static final /* synthetic */ mjy j = new mjy(9);
    public static final /* synthetic */ mjy i = new mjy(8);
    public static final /* synthetic */ mjy h = new mjy(7);
    public static final /* synthetic */ mjy g = new mjy(6);
    public static final /* synthetic */ mjy f = new mjy(5);
    public static final /* synthetic */ mjy e = new mjy(4);
    public static final /* synthetic */ mjy d = new mjy(3);
    public static final /* synthetic */ mjy c = new mjy(2);
    public static final /* synthetic */ mjy b = new mjy(1);
    public static final /* synthetic */ mjy a = new mjy(0);

    private /* synthetic */ mjy(int i2) {
        this.v = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((atvw) obj).c;
            case 1:
                atvx b2 = atvx.b(((atvw) obj).k);
                return b2 == null ? atvx.PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN : b2;
            case 2:
                return ((atvw) obj).d;
            case 3:
                aulq aulqVar = (aulq) obj;
                if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                    return (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
                }
                return null;
            case 4:
                return ((nrb) obj).d;
            case 5:
                return ((nrb) obj).a;
            case 6:
                return ((nrb) obj).b;
            case 7:
                return ((nrj) obj).b();
            case 8:
                return aahg.a((String) obj);
            case 9:
                aone builder = ((opo) obj).toBuilder();
                builder.copyOnWrite();
                opo opoVar = (opo) builder.instance;
                opoVar.b |= 1;
                opoVar.c = true;
                return (opo) builder.build();
            case 10:
                aone builder2 = ((opo) obj).toBuilder();
                builder2.copyOnWrite();
                opo opoVar2 = (opo) builder2.instance;
                opoVar2.b |= 2;
                opoVar2.d = true;
                return (opo) builder2.build();
            case 11:
                return amru.r((View) obj);
            case 12:
                return ((oqv) obj).a;
            case 13:
                aobl aoblVar = (aobl) rsg.a.get((rsl) obj);
                aoblVar.getClass();
                return aoblVar;
            case 14:
                ammv ammvVar = (ammv) obj;
                amrz amrzVar = rsg.a;
                if (ammvVar.h()) {
                    return new LinkResponse(true, ((ammr) ammvVar.c()).b);
                }
                return new LinkResponse(false, "PLACEHOLDER_CONSISTENCY_KEY");
            case 15:
                return ((aocf) obj).c;
            case 16:
                return ((rsk) obj).toString();
            case 17:
                return ((rsl) obj).toString();
            case 18:
                return rsk.a((String) obj);
            case 19:
                return rsl.a((String) obj);
            default:
                return Uri.parse((String) obj).buildUpon().appendQueryParameter("result_channel", rth.af).build().toString();
        }
    }
}
