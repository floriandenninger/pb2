package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreateLivestreamHighlightClipCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abus implements aaha {
    public final Context a;
    public final aahd b;
    private final abxl c;
    private final abux d;
    private final Executor e;

    public abus(Context context, abxl abxlVar, abux abuxVar, aahd aahdVar, Executor executor) {
        this.a = context;
        abxlVar.getClass();
        this.c = abxlVar;
        abuxVar.getClass();
        this.d = abuxVar;
        aahdVar.getClass();
        this.b = aahdVar;
        executor.getClass();
        this.e = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        map.getClass();
        amkq.E(map.containsKey("callback"));
        amkq.E(map.get("callback") instanceof abvm);
        amkq.E(map.containsKey("menuIndex"));
        amkq.E(map.get("menuIndex") instanceof Integer);
        abuy k = this.d.k();
        if (k == null) {
            zga.b("HighlightFrontendIdGenerator null - livestream not in progress?");
            return;
        }
        aroc arocVar = ((aqgu) apxfVar.pX(CreateLivestreamHighlightClipCommandOuterClass.createLivestreamHighlightClipCommand)).b;
        if (arocVar == null) {
            arocVar = aroc.a;
        }
        abxl abxlVar = this.c;
        abxk abxkVar = new abxk(abxlVar.f, abxlVar.a.c(), null, null, null);
        abxkVar.a = arocVar.b;
        abxkVar.b = ((acif) k).ax.m.d();
        abxkVar.c = TimeUnit.SECONDS.convert(arocVar.c, TimeUnit.MILLISECONDS);
        abxkVar.d = (int) TimeUnit.NANOSECONDS.convert(arocVar.c % 1000, TimeUnit.MILLISECONDS);
        abxkVar.s = 3;
        abxl abxlVar2 = this.c;
        anhy b = abxlVar2.c(aroe.a, abxlVar2.b, abea.n, abxm.b).b(abxkVar, abxlVar2.c);
        whu.K(this.a, R.string.lc_highlight_creation_started, 0);
        anaf.Y(b, new abur(this, map), this.e);
    }
}
