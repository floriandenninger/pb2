package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiaw implements aaha {
    private final aiaf a;
    private final aaqd b;
    private final afkk c;

    public aiaw(aiaf aiafVar, aaqd aaqdVar, afkk afkkVar) {
        this.a = aiafVar;
        this.b = aaqdVar;
        this.c = afkkVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        afkm afkmVar;
        auev auevVar = (auev) apxfVar.pX(auev.b);
        String str = auevVar.d;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "ReelPrefetchWatchCommandResolver.resolve taskId=".concat(valueOf);
        }
        aiaf aiafVar = this.a;
        aifz d = PlaybackStartDescriptor.d();
        d.a = apxfVar;
        PlaybackStartDescriptor a = d.a();
        aigg a2 = aigh.a();
        atww atwwVar = auevVar.m;
        if (atwwVar == null) {
            atwwVar = atww.a;
        }
        int bx = anaf.bx(atwwVar.d);
        if (bx == 0) {
            bx = 1;
        }
        a2.b = bx;
        atww atwwVar2 = auevVar.m;
        if (atwwVar2 == null) {
            atwwVar2 = atww.a;
        }
        a2.b(atwwVar2.c);
        aigh a3 = a2.a();
        aiav aiavVar = new aiav(str, this.b);
        atxp atxpVar = auevVar.k;
        if (atxpVar == null) {
            atxpVar = atxp.a;
        }
        long j = atxpVar.b;
        atxp atxpVar2 = auevVar.k;
        if (atxpVar2 == null) {
            atxpVar2 = atxp.a;
        }
        int bz = anaf.bz(atxpVar2.c);
        if (bz == 0) {
            bz = 1;
        }
        int i = bz - 1;
        if (i == 0) {
            afkmVar = afkm.a;
        } else if (i == 1) {
            afkmVar = null;
        } else if (i != 2) {
            afkmVar = this.c.b();
        } else {
            afkmVar = this.c.get();
        }
        aiafVar.b(a, a3, aiavVar, j, afkmVar);
    }
}
