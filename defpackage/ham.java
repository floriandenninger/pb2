package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ham implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ham u = new ham(20);
    public static final /* synthetic */ ham t = new ham(19);
    public static final /* synthetic */ ham s = new ham(18);
    public static final /* synthetic */ ham r = new ham(17);
    public static final /* synthetic */ ham q = new ham(16);
    public static final /* synthetic */ ham p = new ham(15);
    public static final /* synthetic */ ham o = new ham(14);
    public static final /* synthetic */ ham n = new ham(13);
    public static final /* synthetic */ ham m = new ham(12);
    public static final /* synthetic */ ham l = new ham(11);
    public static final /* synthetic */ ham k = new ham(10);
    public static final /* synthetic */ ham j = new ham(9);
    public static final /* synthetic */ ham i = new ham(8);
    public static final /* synthetic */ ham h = new ham(7);
    public static final /* synthetic */ ham g = new ham(6);
    public static final /* synthetic */ ham f = new ham(5);
    public static final /* synthetic */ ham e = new ham(4);
    public static final /* synthetic */ ham d = new ham(3);
    public static final /* synthetic */ ham c = new ham(2);
    public static final /* synthetic */ ham b = new ham(1);
    public static final /* synthetic */ ham a = new ham(0);

    private /* synthetic */ ham(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((hax) obj).b();
            case 1:
                return Boolean.valueOf(((aujz) obj).t);
            case 2:
                return Boolean.valueOf(((hax) obj).h());
            case 3:
                return ((hax) obj).a();
            case 4:
                return Long.valueOf(((aute) obj).c);
            case 5:
                return (iiq) ((ce) obj);
            case 6:
                return (PlaybackStartDescriptor) ((Intent) obj).getParcelableExtra("com.google.android.apps.youtube.PlaybackStartDescriptor");
            case 7:
                return ((PlaybackStartDescriptor) obj).b;
            case 8:
                return etx.aa((PlaybackStartDescriptor) obj);
            case 9:
                return Boolean.valueOf(etx.ak((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj));
            case 10:
                return Long.valueOf(((ihm) obj).a);
            case 11:
                int i2 = ijo.bC;
                return aahg.c(((Bundle) obj).getByteArray(hae.a));
            case 12:
                int i3 = ijo.bC;
                return Boolean.valueOf(((Bundle) obj).getBoolean("ReelWatchFragment.isInWatchWhileActivity", false));
            case 13:
                return ((ihm) obj).e;
            case 14:
                return ((ihm) obj).a();
            case 15:
                aujq b2 = aujq.b(((arsd) obj).j);
                return b2 == null ? aujq.REEL_LOOP_BEHAVIOR_UNKNOWN : b2;
            case 16:
                apxf apxfVar = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj).u;
                return apxfVar == null ? apxf.a : apxfVar;
            case 17:
                return Boolean.valueOf(((iiq) obj).p() == aujq.REEL_LOOP_BEHAVIOR_REPEAT);
            case 18:
                return (iiq) ((ce) obj);
            case 19:
                return ((gir) obj).mN().f("reel_watch_fragment_watch_while");
            default:
                int i4 = ivj.cs;
                return (ActionBarColor) obj;
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
