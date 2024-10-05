package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class xlf {
    protected final ypa a;
    protected final aiij b;
    protected final aijp c;
    protected final Executor d;
    protected final Executor e;
    protected final Set f;
    protected final zgj g;

    public xlf(ypa ypaVar, aiij aiijVar, aijp aijpVar, Executor executor, Executor executor2, Set set, zgj zgjVar) {
        ypaVar.getClass();
        this.a = ypaVar;
        aiijVar.getClass();
        this.b = aiijVar;
        aijpVar.getClass();
        this.c = aijpVar;
        executor.getClass();
        this.d = executor;
        executor2.getClass();
        this.e = executor2;
        this.f = set;
        this.g = zgjVar;
    }

    public aihs a(MediaAd mediaAd) {
        ArrayList arrayList = new ArrayList(this.f);
        arrayList.add(new xlh(mediaAd));
        return new aihs(this.a, this.b, this.c, this.d, this.e, arrayList, this.g);
    }
}
