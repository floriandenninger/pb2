package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jth extends jsn {
    private final Context a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public jth(Context context, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        super(agni.class, auov.class);
        this.a = context;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        aqyg aqygVar;
        audj audjVar;
        agni agniVar = (agni) obj;
        agng agngVar = agniVar.a;
        String str = agngVar.a;
        jti jtiVar = (jti) this.c.get();
        agsw m = ((agof) this.b.get()).a().m();
        ArrayList arrayList = new ArrayList();
        Iterator it = agniVar.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            agnp d = m.d((String) it.next());
            if (d != null && (audjVar = (audj) jtiVar.g(agnp.class, audj.class, d, amrz.l("downloaded_video_playlist_id", str, "downloaded_video_list_index", Integer.valueOf(i)))) != null) {
                arrayList.add(audjVar);
                i++;
            }
        }
        aone createBuilder = audc.a.createBuilder();
        if (!ammx.e(str)) {
            createBuilder.copyOnWrite();
            audc audcVar = (audc) createBuilder.instance;
            audcVar.c |= 1;
            audcVar.f = str;
        }
        if (evr.V((aaea) this.d.get()) && (aqygVar = agngVar.k) != null) {
            aone createBuilder2 = aude.a.createBuilder();
            atdn Z = mcy.Z(this.a.getResources(), aqygVar);
            createBuilder2.copyOnWrite();
            aude audeVar = (aude) createBuilder2.instance;
            Z.getClass();
            audeVar.i = Z;
            audeVar.b |= 64;
            createBuilder.aJ((aude) createBuilder2.build());
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            aone createBuilder3 = aude.a.createBuilder();
            audj audjVar2 = (audj) arrayList.get(i2);
            createBuilder3.copyOnWrite();
            aude audeVar2 = (aude) createBuilder3.instance;
            audjVar2.getClass();
            audeVar2.c = audjVar2;
            audeVar2.b |= 1;
            createBuilder.aJ((aude) createBuilder3.build());
        }
        aone createBuilder4 = auov.a.createBuilder();
        aone createBuilder5 = auoy.a.createBuilder();
        createBuilder5.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder5.instance;
        audc audcVar2 = (audc) createBuilder.build();
        audcVar2.getClass();
        auoyVar.r = audcVar2;
        auoyVar.b |= 4096;
        createBuilder4.aM((auoy) createBuilder5.build());
        return (auov) createBuilder4.build();
    }
}
