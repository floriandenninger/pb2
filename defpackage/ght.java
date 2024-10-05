package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import j$.util.function.Function;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ght implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ght u = new ght(20);
    public static final /* synthetic */ ght t = new ght(19);
    public static final /* synthetic */ ght s = new ght(18);
    public static final /* synthetic */ ght r = new ght(17);
    public static final /* synthetic */ ght q = new ght(16);
    public static final /* synthetic */ ght p = new ght(15);
    public static final /* synthetic */ ght o = new ght(14);
    public static final /* synthetic */ ght n = new ght(13);
    public static final /* synthetic */ ght m = new ght(12);
    public static final /* synthetic */ ght l = new ght(11);
    public static final /* synthetic */ ght k = new ght(10);
    public static final /* synthetic */ ght j = new ght(9);
    public static final /* synthetic */ ght i = new ght(8);
    public static final /* synthetic */ ght h = new ght(7);
    public static final /* synthetic */ ght g = new ght(6);
    public static final /* synthetic */ ght f = new ght(5);
    public static final /* synthetic */ ght e = new ght(4);
    public static final /* synthetic */ ght d = new ght(3);
    public static final /* synthetic */ ght c = new ght(2);
    public static final /* synthetic */ ght b = new ght(1);
    public static final /* synthetic */ ght a = new ght(0);

    private /* synthetic */ ght(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return Boolean.valueOf(((PaneBackStack) obj).e());
            case 1:
                return ((PaneBackStack.BackStackEntry) obj).a;
            case 2:
                return Boolean.valueOf(!((PaneBackStack) obj).e());
            case 3:
                return Boolean.valueOf(!((PaneBackStack) obj).e());
            case 4:
                return Boolean.valueOf(!((PaneBackStack) obj).e());
            case 5:
                return ((PaneDescriptor) obj).g("search_cache_key");
            case 6:
                return Boolean.valueOf(((giy) obj).E());
            case 7:
                return ((buc) obj).a("pane_nav_controller");
            case 8:
                return (String) ((Map.Entry) obj).getKey();
            case 9:
                return ((Map.Entry) obj).getValue();
            case 10:
                int i2 = gru.a;
                return Boolean.valueOf(((Bundle) obj).getBoolean("menu_as_bottom_sheet", false));
            case 11:
                return Boolean.valueOf(((aujz) obj).f);
            case 12:
                return Boolean.valueOf(((aujz) obj).o);
            case 13:
                return Boolean.valueOf(((aujz) obj).s);
            case 14:
                return Boolean.valueOf(((aujz) obj).H);
            case 15:
                return Boolean.valueOf(((aujz) obj).j);
            case 16:
                return Boolean.valueOf(((aujz) obj).f124J);
            case 17:
                return Boolean.valueOf(((aujz) obj).p);
            case 18:
                return fhe.M((avgg) obj);
            case 19:
                int i3 = gsy.e;
                aujs aujsVar = ((aaea) obj).a().u;
                if (aujsVar == null) {
                    aujsVar = aujs.a;
                }
                aujz aujzVar = aujsVar.d;
                return aujzVar == null ? aujz.a : aujzVar;
            default:
                return Boolean.valueOf(((aujz) obj).L);
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
