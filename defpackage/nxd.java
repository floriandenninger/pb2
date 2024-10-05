package defpackage;

import android.util.Pair;
import com.google.android.apps.youtube.embeddedplayer.service.model.a;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nxd implements ayro {
    private final /* synthetic */ int v;
    public static final /* synthetic */ nxd u = new nxd(20);
    public static final /* synthetic */ nxd t = new nxd(19);
    public static final /* synthetic */ nxd s = new nxd(18);
    public static final /* synthetic */ nxd r = new nxd(17);
    public static final /* synthetic */ nxd q = new nxd(16);
    public static final /* synthetic */ nxd p = new nxd(15);
    public static final /* synthetic */ nxd o = new nxd(14);
    public static final /* synthetic */ nxd n = new nxd(13);
    public static final /* synthetic */ nxd m = new nxd(12);
    public static final /* synthetic */ nxd l = new nxd(11);
    public static final /* synthetic */ nxd k = new nxd(10);
    public static final /* synthetic */ nxd j = new nxd(9);
    public static final /* synthetic */ nxd i = new nxd(8);
    public static final /* synthetic */ nxd h = new nxd(7);
    public static final /* synthetic */ nxd g = new nxd(6);
    public static final /* synthetic */ nxd f = new nxd(5);
    public static final /* synthetic */ nxd e = new nxd(4);
    public static final /* synthetic */ nxd d = new nxd(3);
    public static final /* synthetic */ nxd c = new nxd(2);
    public static final /* synthetic */ nxd b = new nxd(1);
    public static final /* synthetic */ nxd a = new nxd(0);

    private /* synthetic */ nxd(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayro
    public final Object a(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                nxf nxfVar = (nxf) obj;
                badl badlVar = (badl) obj2;
                boolean booleanValue = ((Boolean) badlVar.a()).booleanValue();
                nxh nxhVar = (nxh) badlVar.b();
                if (((nuu) badlVar.c()) == nuu.LANDSCAPE_PLAYER_OVERLAY) {
                    return nxf.NONE;
                }
                return nxhVar.equals(nxh.FULL_BLEED) ? booleanValue ? nxf.PAUSE_TEMPORARILY : nxfVar : nxfVar.equals(nxf.PAUSE_TEMPORARILY) ? nxf.UNPAUSE : nxf.NONE;
            case 1:
                Boolean bool = (Boolean) obj;
                int i2 = nxc.e;
                return bool;
            case 2:
                return Boolean.valueOf(((nxh) obj) == nxh.FULL_BLEED && ((nuu) obj2) == nuu.PORTRAIT_WATCH_PANEL);
            case 3:
                PlayerResponseModel a2 = ((ahds) obj2).a();
                return Boolean.valueOf((!((ahej) obj).f() || a2 == null || a2.C()) ? false : true);
            case 4:
                ammv ammvVar = (ammv) obj;
                nxh nxhVar2 = (nxh) obj2;
                int i3 = nxl.f;
                return (!ammvVar.h() || nxhVar2 == nxh.HIDDEN) ? amlr.a : ammv.j(nxj.a((nxh) ammvVar.c()));
            case 5:
                ammv ammvVar2 = (ammv) obj;
                Pair pair = (Pair) obj2;
                nxv nxvVar = (nxv) pair.first;
                boolean booleanValue2 = ((Boolean) pair.second).booleanValue();
                return !ammvVar2.h() ? booleanValue2 ? ammv.j(nxvVar) : ammvVar2 : (!nxvVar.equals(ammvVar2.c()) || booleanValue2) ? ammvVar2 : amlr.a;
            case 6:
                return Integer.valueOf(true != ((Boolean) obj2).booleanValue() ? ((Integer) obj).intValue() : 0);
            case 7:
                return Boolean.valueOf(((nuu) obj2) != nuu.LANDSCAPE_PLAYER_OVERLAY && ((Boolean) obj).booleanValue());
            case 8:
                Integer num = (Integer) obj;
                return Integer.valueOf(num.intValue() > 0 ? num.intValue() - ((zck) obj2).a.a.top : 0);
            case 9:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                int intValue = ((Integer) obj2).intValue();
                if (booleanValue3) {
                    if (intValue == 4) {
                        return odl.MINIPLAYER;
                    }
                } else if (intValue == 2) {
                    return odl.HIDDEN;
                }
                return odl.UNFORCED;
            case 10:
                return Pair.create((Integer) obj, (Boolean) obj2);
            case 11:
                return Boolean.valueOf(((ahuh) obj).a && !((fhg) obj2).k());
            case 12:
                ammw ammwVar = (ammw) obj;
                a a3 = opl.a();
                a3.f((String) ammwVar.a);
                a3.g(((Integer) ammwVar.b).intValue());
                a3.e(((Integer) obj2).intValue());
                return a3.d();
            case 13:
                Integer num2 = (Integer) obj;
                ((aypm) obj2).d(num2);
                return Integer.valueOf(num2.intValue() + 1);
            case 14:
                return ammw.a((String) obj, (Integer) obj2);
            case 15:
                Integer num3 = (Integer) obj;
                return Integer.valueOf((((Boolean) obj2).booleanValue() && num3.intValue() == 6) ? 12 : num3.intValue());
            case 16:
                Integer num4 = (Integer) obj;
                return Integer.valueOf((((Boolean) obj2).booleanValue() && num4.intValue() == 6) ? 12 : num4.intValue());
            case 17:
                return new Pair((Boolean) obj, (ammv) obj2);
            case 18:
                Boolean bool2 = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() && !bool2.booleanValue()) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 19:
                return new aenq((apks) obj, (ByteBuffer) obj2);
            default:
                return new Pair((aven) obj, (awrc) obj2);
        }
    }
}
