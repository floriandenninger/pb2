package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jte extends jsn {
    private final Context a;

    public jte(Context context) {
        super(agni.class, aqbw.class);
        this.a = context;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        agni agniVar = (agni) obj;
        agng agngVar = agniVar.a;
        aone createBuilder = aqbw.a.createBuilder();
        aqyg g = ajcq.g(agngVar.b);
        createBuilder.copyOnWrite();
        aqbw aqbwVar = (aqbw) createBuilder.instance;
        g.getClass();
        aqbwVar.g = g;
        aqbwVar.b |= 1;
        aqyg g2 = ajcq.g(mcy.ad(this.a, agniVar.a));
        createBuilder.copyOnWrite();
        aqbw aqbwVar2 = (aqbw) createBuilder.instance;
        g2.getClass();
        aqbwVar2.h = g2;
        aqbwVar2.b |= 2;
        aone createBuilder2 = aqby.a.createBuilder();
        aone createBuilder3 = aucy.a.createBuilder();
        avgg e = agngVar.e.e();
        createBuilder3.copyOnWrite();
        aucy aucyVar = (aucy) createBuilder3.instance;
        e.getClass();
        aucyVar.c = e;
        aucyVar.b |= 1;
        createBuilder2.copyOnWrite();
        aqby aqbyVar = (aqby) createBuilder2.instance;
        aucy aucyVar2 = (aucy) createBuilder3.build();
        aucyVar2.getClass();
        aqbyVar.d = aucyVar2;
        aqbyVar.b |= 2;
        createBuilder.copyOnWrite();
        aqbw aqbwVar3 = (aqbw) createBuilder.instance;
        aqby aqbyVar2 = (aqby) createBuilder2.build();
        aqbyVar2.getClass();
        aqbwVar3.i = aqbyVar2;
        aqbwVar3.b |= 32;
        aone createBuilder4 = aqbt.a.createBuilder();
        aone createBuilder5 = auar.a.createBuilder();
        String str = agngVar.a;
        createBuilder5.copyOnWrite();
        auar auarVar = (auar) createBuilder5.instance;
        auarVar.b |= 1;
        auarVar.c = str;
        createBuilder4.copyOnWrite();
        aqbt aqbtVar = (aqbt) createBuilder4.instance;
        auar auarVar2 = (auar) createBuilder5.build();
        auarVar2.getClass();
        aqbtVar.c = auarVar2;
        aqbtVar.b = 135739232;
        aqbt aqbtVar2 = (aqbt) createBuilder4.build();
        createBuilder.copyOnWrite();
        aqbw aqbwVar4 = (aqbw) createBuilder.instance;
        aqbtVar2.getClass();
        aqbwVar4.k = aqbtVar2;
        aqbwVar4.b |= 32768;
        aone createBuilder6 = aqbu.a.createBuilder();
        aone createBuilder7 = aqbz.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(agniVar.e);
        createBuilder7.copyOnWrite();
        aqbz aqbzVar = (aqbz) createBuilder7.instance;
        aqbzVar.b |= 1;
        aqbzVar.c = seconds;
        createBuilder6.copyOnWrite();
        aqbu aqbuVar = (aqbu) createBuilder6.instance;
        aqbz aqbzVar2 = (aqbz) createBuilder7.build();
        aqbzVar2.getClass();
        aqbuVar.c = aqbzVar2;
        aqbuVar.b = 135744618;
        createBuilder.copyOnWrite();
        aqbw aqbwVar5 = (aqbw) createBuilder.instance;
        aqbu aqbuVar2 = (aqbu) createBuilder6.build();
        aqbuVar2.getClass();
        aqbwVar5.l = aqbuVar2;
        aqbwVar5.b |= 65536;
        String str2 = agngVar.a;
        aone createBuilder8 = aplt.a.createBuilder();
        String concat = str2.length() != 0 ? "VL".concat(str2) : new String("VL");
        createBuilder8.copyOnWrite();
        aplt apltVar = (aplt) createBuilder8.instance;
        concat.getClass();
        apltVar.b = 1 | apltVar.b;
        apltVar.c = concat;
        aplt apltVar2 = (aplt) createBuilder8.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar2);
        apxf apxfVar = (apxf) aongVar.build();
        createBuilder.copyOnWrite();
        aqbw aqbwVar6 = (aqbw) createBuilder.instance;
        apxfVar.getClass();
        aqbwVar6.d = apxfVar;
        aqbwVar6.c = 4;
        return (aqbw) createBuilder.build();
    }
}
