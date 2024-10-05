package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agzp {
    public final aapf a;
    public final aarr b;

    public agzp(aapf aapfVar, aarr aarrVar) {
        this.a = aapfVar;
        this.b = aarrVar;
    }

    public final List a(PlayerResponseModel playerResponseModel) {
        ArrayList arrayList = new ArrayList();
        long j = playerResponseModel.c.e;
        aony aonyVar = playerResponseModel.a.F;
        if (aonyVar.isEmpty()) {
            return arrayList;
        }
        Iterator it = aonyVar.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((asjc) it.next()).d.iterator();
            while (it2.hasNext()) {
                aryr aryrVar = (aryr) this.b.a(((asjb) it2.next()).c.I(), aryr.a);
                if (aryrVar != null) {
                    PlayerResponseModel playerResponseModel2 = new PlayerResponseModel(aryrVar, j, this.a);
                    if (playerResponseModel2.c != null) {
                        arrayList.add(playerResponseModel2);
                    }
                }
            }
        }
        return arrayList;
    }
}
