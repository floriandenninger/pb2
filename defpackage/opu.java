package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class opu implements ayrn {
    private final /* synthetic */ int g;
    public static final /* synthetic */ opu f = new opu(5);
    public static final /* synthetic */ opu e = new opu(4);
    public static final /* synthetic */ opu d = new opu(3);
    public static final /* synthetic */ opu c = new opu(2);
    public static final /* synthetic */ opu b = new opu(1);
    public static final /* synthetic */ opu a = new opu(0);

    private /* synthetic */ opu(int i) {
        this.g = i;
    }

    @Override // defpackage.ayrn
    public final void a(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            ammw ammwVar = (ammw) obj2;
            ((amrw) obj).g(ammwVar.a, ammwVar.b);
            return;
        }
        if (i == 1) {
            aqrf aqrfVar = (aqrf) obj2;
            aone createBuilder = askg.a.createBuilder();
            createBuilder.copyOnWrite();
            askg askgVar = (askg) createBuilder.instance;
            aqrfVar.getClass();
            askgVar.av = aqrfVar;
            askgVar.h |= 1048576;
            ((aong) obj).cx(createBuilder);
            return;
        }
        if (i == 2) {
            ((amrp) obj).h(obj2);
            return;
        }
        if (i == 3) {
            ((amsv) obj).c(obj2);
            return;
        }
        if (i == 4) {
            Intent intent = (Intent) obj2;
            apxf apxfVar = ((apen) obj).h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar == null) {
                return;
            }
            intent.putExtra("notification_opt_out_dialog_command", apxfVar.toByteArray());
            return;
        }
        apen apenVar = (apen) obj;
        Intent intent2 = (Intent) obj2;
        apxf apxfVar2 = apenVar.g;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aghv.j(intent2, apxfVar2);
        asuh asuhVar = apenVar.i;
        if (asuhVar == null) {
            asuhVar = asuh.b;
        }
        aear.N(intent2, asuhVar);
    }
}
