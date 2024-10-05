package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afaa extends afan implements aekh {
    public final aerf d;
    public final aezf e;

    public afaa(Executor executor, ayr ayrVar, afaf afafVar, Handler handler, aezf aezfVar, aerf aerfVar, afjf afjfVar, aezm aezmVar) {
        super(executor, ayrVar, afafVar, handler, aezfVar, afjfVar, aezmVar);
        afki.a(aezfVar.d);
        this.d = aerfVar;
        this.e = aezfVar;
    }

    @Override // defpackage.aekh
    public final void a(aelu aeluVar, int i) {
        this.e.d.j(aeluVar.c, aeluVar.d, aeluVar.j, aeluVar.e, aeluVar.b.length - 1);
        t();
    }
}
