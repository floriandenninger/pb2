package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class epc implements ayro {
    private final /* synthetic */ int v;
    public static final /* synthetic */ epc u = new epc(20);
    public static final /* synthetic */ epc t = new epc(19);
    public static final /* synthetic */ epc s = new epc(18);
    public static final /* synthetic */ epc r = new epc(17);
    public static final /* synthetic */ epc q = new epc(16);
    public static final /* synthetic */ epc p = new epc(15);
    public static final /* synthetic */ epc o = new epc(14);
    public static final /* synthetic */ epc n = new epc(13);
    public static final /* synthetic */ epc m = new epc(12);
    public static final /* synthetic */ epc l = new epc(11);
    public static final /* synthetic */ epc k = new epc(10);
    public static final /* synthetic */ epc j = new epc(9);
    public static final /* synthetic */ epc i = new epc(8);
    public static final /* synthetic */ epc h = new epc(7);
    public static final /* synthetic */ epc g = new epc(6);
    public static final /* synthetic */ epc f = new epc(5);
    public static final /* synthetic */ epc e = new epc(4);
    public static final /* synthetic */ epc d = new epc(3);
    public static final /* synthetic */ epc c = new epc(2);
    public static final /* synthetic */ epc b = new epc(1);
    public static final /* synthetic */ epc a = new epc(0);

    private /* synthetic */ epc(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayro
    public final Object a(Object obj, Object obj2) {
        khh d2;
        r1 = true;
        boolean z = true;
        switch (this.v) {
            case 0:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            case 1:
                return ammw.a((badl) obj, (aaxh) obj2);
            case 2:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            case 3:
                return ammw.a((fin) obj, (amsx) obj2);
            case 4:
                Context context = (Context) obj;
                Boolean bool = (Boolean) obj2;
                if (!yjk.aa(context)) {
                    return 0;
                }
                if (yjk.Y(context)) {
                    return Integer.valueOf(true != bool.booleanValue() ? 2 : 1);
                }
                return 1;
            case 5:
                return new ieg(((Boolean) obj).booleanValue(), (Rect) obj2);
            case 6:
                Optional optional = (Optional) obj;
                arsd arsdVar = (arsd) obj2;
                int i2 = ind.k;
                if (!optional.isPresent()) {
                    return arsdVar;
                }
                aone createBuilder = arsd.a.createBuilder(arsdVar);
                aryr aryrVar = ((PlayerResponseModel) optional.get()).a;
                createBuilder.copyOnWrite();
                arsd arsdVar2 = (arsd) createBuilder.instance;
                aryrVar.getClass();
                arsdVar2.e = aryrVar;
                arsdVar2.b |= 4;
                return (arsd) createBuilder.build();
            case 7:
                return ((isq) obj2) == isq.FORCE_GONE ? itd.a() : (ita) obj;
            case 8:
                Boolean bool2 = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() && !bool2.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return ammw.a((aakz) obj, obj2);
            case 10:
                Integer num = (Integer) obj;
                return Integer.valueOf(num.intValue() > 0 ? num.intValue() - ((zck) obj2).a.a.left : 0);
            case 11:
                return (zjf) obj;
            case 12:
                return ammw.a((Boolean) obj, (Boolean) obj2);
            case 13:
                return ammw.a((fie) obj, (aswl) obj2);
            case 14:
                return ammw.a((Integer) obj, (Boolean) obj2);
            case 15:
                return new khg((khi) obj, ((Integer) obj2).intValue());
            case 16:
                d2 = khh.d((khl) obj, (khg) obj2);
                return d2;
            case 17:
                return ammw.a((Float) obj, (Boolean) obj2);
            case 18:
                int intValue = ((Integer) obj).intValue();
                return Float.valueOf(((Integer) obj2).intValue() > 0 ? Math.round(anaf.al(1.0f - (intValue / r5), 0.0f, 1.0f) * 100.0f) / 100.0f : 0.0f);
            case 19:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                return Integer.valueOf((booleanValue || !((Boolean) obj2).booleanValue()) ? true != booleanValue ? R.drawable.yt_outline_screen_full_white_24 : R.drawable.yt_outline_screen_full_exit_white_24 : R.drawable.ic_fullscreen_vertical_button);
            default:
                return Boolean.valueOf((((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue()) ? false : true);
        }
    }
}
