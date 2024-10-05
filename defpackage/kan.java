package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kan implements kbj {
    private final Context a;

    public kan(Context context) {
        this.a = context;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        aone createBuilder = askb.a.createBuilder();
        aone createBuilder2 = askh.a.createBuilder();
        aqyg h = ajcq.h(this.a.getResources().getString(R.string.download_recommendations_title));
        createBuilder2.copyOnWrite();
        askh askhVar = (askh) createBuilder2.instance;
        h.getClass();
        askhVar.c = h;
        askhVar.b |= 1;
        askh askhVar2 = (askh) createBuilder2.build();
        createBuilder.copyOnWrite();
        askb askbVar = (askb) createBuilder.instance;
        askhVar2.getClass();
        askbVar.g = askhVar2;
        askbVar.b |= 16;
        return amru.r(new kbh((askb) createBuilder.build()));
    }
}
