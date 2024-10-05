package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import j$.util.Optional;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iur implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ iur u = new iur(20);
    public static final /* synthetic */ iur t = new iur(19);
    public static final /* synthetic */ iur s = new iur(18);
    public static final /* synthetic */ iur r = new iur(17);
    public static final /* synthetic */ iur q = new iur(16);
    public static final /* synthetic */ iur p = new iur(15);
    public static final /* synthetic */ iur o = new iur(14);
    public static final /* synthetic */ iur n = new iur(13);
    public static final /* synthetic */ iur m = new iur(12);
    public static final /* synthetic */ iur l = new iur(11);
    public static final /* synthetic */ iur k = new iur(10);
    public static final /* synthetic */ iur j = new iur(9);
    public static final /* synthetic */ iur i = new iur(8);
    public static final /* synthetic */ iur h = new iur(7);
    public static final /* synthetic */ iur g = new iur(6);
    public static final /* synthetic */ iur f = new iur(5);
    public static final /* synthetic */ iur e = new iur(4);
    public static final /* synthetic */ iur d = new iur(3);
    public static final /* synthetic */ iur c = new iur(2);
    public static final /* synthetic */ iur b = new iur(1);
    public static final /* synthetic */ iur a = new iur(0);

    private /* synthetic */ iur(int i2) {
        this.v = i2;
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

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return (aame) ((ammw) obj).a;
            case 1:
                return ((InteractionLoggingScreen) obj).a;
            case 2:
                apxf apxfVar = ((arjv) obj).p;
                return apxfVar == null ? apxf.a : apxfVar;
            case 3:
                return (Optional) ayqj.F((atvz) obj).G(ism.q).h(iub.a).x(ism.t).x(ism.p).X();
            case 4:
                return ((avhy) obj).d;
            case 5:
                return (aomf) ((Optional) obj).get();
            case 6:
                return new acqx((aomf) obj);
            case 7:
                return Integer.valueOf(((Bundle) obj).getInt("active_panel_on_single_panel_mode_key", 0));
            case 8:
                return ((iya) obj).f();
            case 9:
                return (MediaRouteButton) hm.c((MenuItem) obj);
            case 10:
                return ((jfr) obj).b().Y(ivh.q);
            case 11:
                return ((jga) obj).a.k;
            case 12:
                return jht.a((aakt) obj);
            case 13:
                return (jht) ((Optional) obj).get();
            case 14:
                atrv b2 = atrv.b(((aqll) obj).f);
                return b2 == null ? atrv.OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN : b2;
            case 15:
                return ((jht) obj).a;
            case 16:
                aubs aubsVar = (aubs) obj;
                aone createBuilder = ases.a.createBuilder();
                createBuilder.copyOnWrite();
                ases asesVar = (ases) createBuilder.instance;
                aubsVar.getClass();
                asesVar.c = aubsVar;
                asesVar.b = 50631000;
                return (ases) createBuilder.build();
            case 17:
                auwd auwdVar = (auwd) obj;
                aone createBuilder2 = auoy.a.createBuilder();
                createBuilder2.copyOnWrite();
                auoy auoyVar = (auoy) createBuilder2.instance;
                auwdVar.getClass();
                auoyVar.bm = auwdVar;
                auoyVar.e |= 32768;
                return amru.r((auoy) createBuilder2.build());
            case 18:
                atol b3 = atol.b(((atom) obj).d);
                return b3 == null ? atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN : b3;
            case 19:
                atrx b4 = atrx.b(((atom) obj).c);
                return b4 == null ? atrx.UNKNOWN_FORMAT_TYPE : b4;
            default:
                atrx b5 = atrx.b(((atom) obj).c);
                return b5 == null ? atrx.UNKNOWN_FORMAT_TYPE : b5;
        }
    }
}
