package defpackage;

import com.google.android.apps.youtube.app.settings.datasaving.DataSavingEntityController;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class khf implements ayrw {
    private final /* synthetic */ int v;
    public static final /* synthetic */ khf u = new khf(20);
    public static final /* synthetic */ khf t = new khf(19);
    public static final /* synthetic */ khf s = new khf(18);
    public static final /* synthetic */ khf r = new khf(17);
    public static final /* synthetic */ khf q = new khf(16);
    public static final /* synthetic */ khf p = new khf(15);
    public static final /* synthetic */ khf o = new khf(14);
    public static final /* synthetic */ khf n = new khf(13);
    public static final /* synthetic */ khf m = new khf(12);
    public static final /* synthetic */ khf l = new khf(11);
    public static final /* synthetic */ khf k = new khf(10);
    public static final /* synthetic */ khf j = new khf(9);
    public static final /* synthetic */ khf i = new khf(8);
    public static final /* synthetic */ khf h = new khf(7);
    public static final /* synthetic */ khf g = new khf(6);
    public static final /* synthetic */ khf f = new khf(5);
    public static final /* synthetic */ khf e = new khf(4);
    public static final /* synthetic */ khf d = new khf(3);
    public static final /* synthetic */ khf c = new khf(2);
    public static final /* synthetic */ khf b = new khf(1);
    public static final /* synthetic */ khf a = new khf(0);

    private /* synthetic */ khf(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrw
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                aign c2 = ((ahef) obj).c();
                return c2.equals(aign.NEW) || c2.equals(aign.VIDEO_REQUESTED) || c2.equals(aign.ENDED);
            case 1:
                return ((ammv) obj).h();
            case 2:
                return ((List) obj).equals(khk.a);
            case 3:
                return ((aigr) obj).i != 3;
            case 4:
                return ((aakz) obj).c != null;
            case 5:
                return !((kyt) obj).h.isEmpty();
            case 6:
                return ((agni) obj).a.a.startsWith("BL");
            case 7:
                return ((agnv) obj).i() == agnq.PLAYABLE;
            case 8:
                return ((ammv) obj).h();
            case 9:
                int i2 = DataSavingEntityController.c;
                return ((aakz) obj).c != null;
            case 10:
                return ((arst) obj).b == 123267149;
            case 11:
                return ((arst) obj).b == 123267149;
            case 12:
                return ((arst) obj).b == 117866661;
            case 13:
                return ((Boolean) obj).booleanValue();
            case 14:
                return ((Optional) obj).isPresent();
            case 15:
                return ((Integer) obj).intValue() > 0;
            case 16:
                return ((Optional) obj).isPresent();
            case 17:
                return ((mmu) obj).a != null;
            case 18:
                return ((Boolean) obj).booleanValue();
            case 19:
                return ((aakz) obj).c != null;
            default:
                return ((ammv) obj).h();
        }
    }
}
