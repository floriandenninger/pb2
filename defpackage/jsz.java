package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsz extends jsn {
    private final azrw a;

    public jsz(azrw azrwVar) {
        super(jht.class, asfc.class);
        this.a = azrwVar;
    }

    @Override // defpackage.jtc
    public final /* synthetic */ Object b(Object obj, amrz amrzVar) {
        jht jhtVar = (jht) obj;
        String str = (String) e(amrzVar, "downloaded_video_playlist_id");
        int intValue = ((Integer) e(amrzVar, "downloaded_video_list_index")).intValue();
        String str2 = (String) e(amrzVar, "watch_command_params");
        aomf aomfVar = (aomf) e(amrzVar, "watch_command_click_tracking_params");
        aong aongVar = (aong) asfc.a.createBuilder();
        apxf A = aedn.A(str, jhtVar.a, intValue, str2, aomfVar);
        aongVar.copyOnWrite();
        asfc asfcVar = (asfc) aongVar.instance;
        A.getClass();
        asfcVar.n = A;
        asfcVar.b |= 4096;
        aone createBuilder = asfd.a.createBuilder();
        aone createBuilder2 = auov.a.createBuilder();
        jti jtiVar = (jti) this.a.get();
        jhtVar.getClass();
        createBuilder2.aL((List) Optional.ofNullable((auwd) jtiVar.g(jht.class, auwd.class, jhtVar, null)).map(iur.r).orElseGet(ghx.n));
        auov auovVar = (auov) createBuilder2.build();
        aone createBuilder3 = aseu.a.createBuilder();
        aone createBuilder4 = aset.a.createBuilder();
        createBuilder4.copyOnWrite();
        aset asetVar = (aset) createBuilder4.instance;
        auovVar.getClass();
        asetVar.c = auovVar;
        asetVar.b = 49399797;
        createBuilder3.copyOnWrite();
        aseu aseuVar = (aseu) createBuilder3.instance;
        aset asetVar2 = (aset) createBuilder4.build();
        asetVar2.getClass();
        aseuVar.c = asetVar2;
        aseuVar.b |= 1;
        aseu aseuVar2 = (aseu) createBuilder3.build();
        createBuilder.copyOnWrite();
        asfd asfdVar = (asfd) createBuilder.instance;
        aseuVar2.getClass();
        asfdVar.c = aseuVar2;
        asfdVar.b = 51779735;
        aongVar.copyOnWrite();
        asfc asfcVar2 = (asfc) aongVar.instance;
        asfd asfdVar2 = (asfd) createBuilder.build();
        asfdVar2.getClass();
        asfcVar2.d = asfdVar2;
        asfcVar2.b |= 2;
        jti jtiVar2 = (jti) this.a.get();
        jhtVar.getClass();
        Optional.ofNullable((atzr) jtiVar2.g(jht.class, atzr.class, jhtVar, null)).ifPresent(new jsy(aongVar, 0));
        return (asfc) aongVar.build();
    }
}
