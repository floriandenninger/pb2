package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahqx implements aifm {
    public final Executor a;
    public final aiov b;
    private final zgj c;
    private final aapf d;
    private final aarr e;

    public ahqx(zgj zgjVar, aapf aapfVar, Executor executor, aarr aarrVar, aiov aiovVar) {
        this.c = zgjVar;
        this.d = aapfVar;
        this.a = executor;
        this.e = aarrVar;
        this.b = aiovVar;
    }

    public static boolean b(asjc asjcVar) {
        if (asjcVar == null || (asjcVar.b & 1) == 0) {
            return false;
        }
        asjd asjdVar = asjcVar.c;
        if (asjdVar == null) {
            asjdVar = asjd.a;
        }
        int dk = amkq.dk(asjdVar.b);
        return dk != 0 && dk == 2;
    }

    @Override // defpackage.aifm
    public final void a() {
    }

    public final ajbu[] c(ajbv ajbvVar, asjc asjcVar, long j) {
        ArrayList arrayList = new ArrayList();
        boolean b = b(asjcVar);
        Iterator it = asjcVar.d.iterator();
        while (it.hasNext()) {
            aryr aryrVar = (aryr) this.e.a(((asjb) it.next()).c.I(), aryr.a);
            if (aryrVar != null) {
                PlayerResponseModel playerResponseModel = new PlayerResponseModel(aryrVar, j, this.d);
                if (playerResponseModel.c != null) {
                    playerResponseModel.d.a("PLAYER_IS_CONTENT_INTERSTITIAL_KEY", true);
                    playerResponseModel.d.a("PLAYER_CONTENT_INTERSTITIAL_IS_PREROLL_KEY", b);
                    arrayList.add(ajbvVar.m(playerResponseModel, this.c.a(), 2));
                }
            }
        }
        return (ajbu[]) arrayList.toArray(new ajbu[arrayList.size()]);
    }
}
