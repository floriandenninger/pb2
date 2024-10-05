package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsw extends jsn {
    public jsw() {
        super(jht.class, aubw.class);
    }

    @Override // defpackage.jtc
    public final /* synthetic */ Object b(Object obj, amrz amrzVar) {
        jht jhtVar = (jht) obj;
        int intValue = ((Integer) e(amrzVar, "downloaded_video_list_index")).intValue();
        boolean z = ((Integer) e(amrzVar, "downloaded_playlist_selected_video_index")).intValue() == intValue;
        String str = (String) e(amrzVar, "downloaded_video_playlist_id");
        String str2 = (String) e(amrzVar, "watch_command_params");
        aomf aomfVar = (aomf) e(amrzVar, "watch_command_click_tracking_params");
        aong aongVar = (aong) aubw.a.createBuilder();
        aongVar.copyOnWrite();
        aubw aubwVar = (aubw) aongVar.instance;
        aubwVar.b |= 128;
        aubwVar.k = z;
        String str3 = jhtVar.a;
        aongVar.copyOnWrite();
        aubw aubwVar2 = (aubw) aongVar.instance;
        str3.getClass();
        aubwVar2.b |= 4096;
        aubwVar2.o = str3;
        avgg avggVar = jhtVar.f;
        aongVar.copyOnWrite();
        aubw aubwVar3 = (aubw) aongVar.instance;
        avggVar.getClass();
        aubwVar3.f = avggVar;
        aubwVar3.b |= 8;
        aqyg g = ajcq.g(wbs.az(jhtVar.c.intValue()));
        aongVar.copyOnWrite();
        aubw aubwVar4 = (aubw) aongVar.instance;
        g.getClass();
        aubwVar4.g = g;
        aubwVar4.b |= 16;
        aqyg g2 = ajcq.g(jhtVar.b);
        aongVar.copyOnWrite();
        aubw aubwVar5 = (aubw) aongVar.instance;
        g2.getClass();
        aubwVar5.c = g2;
        aubwVar5.b |= 1;
        aqyg f = ajcq.f(intValue + 1);
        aongVar.copyOnWrite();
        aubw aubwVar6 = (aubw) aongVar.instance;
        f.getClass();
        aubwVar6.j = f;
        aubwVar6.b |= 64;
        apxf A = aedn.A(str, jhtVar.a, intValue, str2, aomfVar);
        aongVar.copyOnWrite();
        aubw aubwVar7 = (aubw) aongVar.instance;
        A.getClass();
        aubwVar7.m = A;
        aubwVar7.b |= 256;
        if (!TextUtils.isEmpty(jhtVar.d)) {
            aqyg g3 = ajcq.g(jhtVar.d);
            aongVar.copyOnWrite();
            aubw aubwVar8 = (aubw) aongVar.instance;
            g3.getClass();
            aubwVar8.e = g3;
            aubwVar8.b |= 4;
        }
        if (z) {
            aongVar.cr(aedn.B(jhtVar.a, true));
            aongVar.cr(aedn.B(jhtVar.a, false));
        }
        aone createBuilder = asvx.a.createBuilder();
        createBuilder.copyOnWrite();
        asvx asvxVar = (asvx) createBuilder.instance;
        asvxVar.c = 2;
        asvxVar.b |= 1;
        aongVar.copyOnWrite();
        aubw aubwVar9 = (aubw) aongVar.instance;
        asvx asvxVar2 = (asvx) createBuilder.build();
        asvxVar2.getClass();
        aubwVar9.t = asvxVar2;
        aubwVar9.b |= 2097152;
        return (aubw) aongVar.build();
    }
}
