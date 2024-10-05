package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gsz {
    public final /* synthetic */ gtf a;
    public final /* synthetic */ ajss b;
    public final /* synthetic */ RecyclerView c;
    public final /* synthetic */ Map d;

    public /* synthetic */ gsz(gtf gtfVar, ajss ajssVar, RecyclerView recyclerView, Map map) {
        this.a = gtfVar;
        this.b = ajssVar;
        this.c = recyclerView;
        this.d = map;
    }

    public final void a(aomf aomfVar) {
        gtf gtfVar = this.a;
        ajss ajssVar = this.b;
        RecyclerView recyclerView = this.c;
        Map map = this.d;
        gtf.b(ajssVar.g, recyclerView);
        Object obj = map.get("chipSelected");
        aptg aptgVar = obj instanceof aptg ? (aptg) obj : null;
        if (aptgVar == null || (aptgVar.b & 4096) == 0 || aomfVar == null) {
            return;
        }
        gtfVar.b.o(new acqx(aomfVar), new acqx(aptgVar.l));
    }
}
