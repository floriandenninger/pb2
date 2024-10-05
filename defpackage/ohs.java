package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.model.a;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ohs implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ohs u = new ohs(20);
    public static final /* synthetic */ ohs t = new ohs(19);
    public static final /* synthetic */ ohs s = new ohs(18);
    public static final /* synthetic */ ohs r = new ohs(17);
    public static final /* synthetic */ ohs q = new ohs(16);
    public static final /* synthetic */ ohs p = new ohs(15);
    public static final /* synthetic */ ohs o = new ohs(14);
    public static final /* synthetic */ ohs n = new ohs(13);
    public static final /* synthetic */ ohs m = new ohs(12);
    public static final /* synthetic */ ohs l = new ohs(11);
    public static final /* synthetic */ ohs k = new ohs(10);
    public static final /* synthetic */ ohs j = new ohs(9);
    public static final /* synthetic */ ohs i = new ohs(8);
    public static final /* synthetic */ ohs h = new ohs(7);
    public static final /* synthetic */ ohs g = new ohs(6);
    public static final /* synthetic */ ohs f = new ohs(5);
    public static final /* synthetic */ ohs e = new ohs(4);
    public static final /* synthetic */ ohs d = new ohs(3);
    public static final /* synthetic */ ohs c = new ohs(2);
    public static final /* synthetic */ ohs b = new ohs(1);
    public static final /* synthetic */ ohs a = new ohs(0);

    private /* synthetic */ ohs(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                aakt aaktVar = ((aakz) obj).c;
                aaktVar.getClass();
                return aaktVar;
            case 1:
                return Boolean.valueOf(((zcp) obj) instanceof zcs);
            case 2:
                return ((ahel) obj).a().b();
            case 3:
                return Boolean.valueOf(((Integer) obj).intValue() == 2);
            case 4:
                return Integer.valueOf(((zck) obj).a.a.top);
            case 5:
                return ((gir) obj).aP();
            case 6:
                return ((gir) obj).aP();
            case 7:
                return ((aaxh) obj).a;
            case 8:
                return ((arss) obj).d;
            case 9:
                arst arstVar = (arst) obj;
                if (arstVar.b == 117866661) {
                    return (atvy) arstVar.c;
                }
                return atvy.a;
            case 10:
                return ((atvy) obj).b;
            case 11:
                return mka.a((atvz) obj);
            case 12:
                return (mka) ((Optional) obj).get();
            case 13:
                String str = (String) obj;
                return str.isEmpty() ? Optional.empty() : Optional.of(str);
            case 14:
                return ((mka) obj).d;
            case 15:
                return Integer.valueOf(((opl) obj).c);
            case 16:
                return ((opl) obj).a;
            case 17:
                return ((ammw) obj).a;
            case 18:
                ammw ammwVar = (ammw) obj;
                a a2 = opl.a();
                a2.f((String) ammwVar.a);
                a2.g(((Integer) ammwVar.b).intValue());
                a2.e(((Integer) ammwVar.b).intValue());
                return a2.d();
            case 19:
                return ((amrw) obj).c();
            default:
                return (PaneDescriptor) ((Optional) obj).get();
        }
    }
}
