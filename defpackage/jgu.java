package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jgu implements aaud {
    private final Context a;
    private final afyt b;

    public jgu(Context context, afyt afytVar) {
        this.a = context;
        this.b = afytVar;
    }

    @Override // defpackage.aaud
    public final void a(aauc aaucVar) {
        aone createBuilder = atnd.a.createBuilder();
        boolean d = this.b.d(this.a);
        createBuilder.copyOnWrite();
        atnd atndVar = (atnd) createBuilder.instance;
        atndVar.b |= 2;
        atndVar.c = d;
        boolean booleanValue = ((Boolean) ynm.g(this.b.c(), 5L, TimeUnit.SECONDS, true)).booleanValue();
        createBuilder.copyOnWrite();
        atnd atndVar2 = (atnd) createBuilder.instance;
        atndVar2.b |= 8;
        atndVar2.e = booleanValue;
        if (this.b.a() > 0) {
            long a = this.b.a();
            createBuilder.copyOnWrite();
            atnd atndVar3 = (atnd) createBuilder.instance;
            atndVar3.b |= 4;
            atndVar3.d = a;
        }
        aaucVar.v = (atnd) createBuilder.build();
    }
}
