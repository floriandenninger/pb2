package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upp {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;

    public upp(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
        azrwVar4.getClass();
        this.d = azrwVar4;
        azrwVar5.getClass();
        this.e = azrwVar5;
        azrwVar6.getClass();
        this.f = azrwVar6;
    }

    public final upo a(Executor executor, axpg axpgVar, azrw azrwVar) {
        upm upmVar = (upm) this.a.get();
        upmVar.getClass();
        azrw azrwVar2 = this.b;
        unq unqVar = (unq) this.c.get();
        unqVar.getClass();
        uuf uufVar = (uuf) this.d.get();
        uufVar.getClass();
        azrw azrwVar3 = this.e;
        unx unxVar = (unx) this.f.get();
        unxVar.getClass();
        executor.getClass();
        axpgVar.getClass();
        return new upo(upmVar, azrwVar2, unqVar, uufVar, azrwVar3, unxVar, executor, axpgVar, azrwVar);
    }

    public final void b(aok aokVar, RecyclerView recyclerView, LinearProgressIndicator linearProgressIndicator, vnl vnlVar, ammv ammvVar, awze awzeVar) {
        ajyw ajywVar = (ajyw) this.d.get();
        vlx vlxVar = (vlx) this.b.get();
        vlxVar.getClass();
        ajoy ajoyVar = (ajoy) this.e.get();
        ajoyVar.getClass();
        ajoy ajoyVar2 = (ajoy) this.f.get();
        aps apsVar = (aps) this.c.get();
        apsVar.getClass();
        vrp vrpVar = (vrp) this.a.get();
        vrpVar.getClass();
        recyclerView.getClass();
        linearProgressIndicator.getClass();
        vnlVar.getClass();
        awzeVar.getClass();
        new vkz(ajywVar, vlxVar, ajoyVar, ajoyVar2, apsVar, vrpVar, aokVar, recyclerView, linearProgressIndicator, vnlVar, ammvVar, awzeVar, null, null, null, null, null);
    }

    public final weu c(wed wedVar, ViewGroup viewGroup) {
        Context context = (Context) this.f.get();
        context.getClass();
        wgj wgjVar = (wgj) this.d.get();
        Activity activity = (Activity) this.a.get();
        activity.getClass();
        ajyg ajygVar = (ajyg) this.b.get();
        ajygVar.getClass();
        Handler handler = (Handler) this.c.get();
        handler.getClass();
        wedVar.getClass();
        wgv wgvVar = (wgv) this.e.get();
        wgvVar.getClass();
        return new weu(context, wgjVar, activity, ajygVar, handler, wedVar, wgvVar, viewGroup);
    }

    public upp(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, byte[] bArr) {
        this.d = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        this.e = azrwVar3;
        this.f = azrwVar4;
        this.c = azrwVar5;
        azrwVar6.getClass();
        this.a = azrwVar6;
    }

    public upp(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, char[] cArr) {
        azrwVar.getClass();
        this.f = azrwVar;
        this.d = azrwVar2;
        azrwVar3.getClass();
        this.a = azrwVar3;
        azrwVar4.getClass();
        this.b = azrwVar4;
        azrwVar5.getClass();
        this.c = azrwVar5;
        azrwVar6.getClass();
        this.e = azrwVar6;
    }
}
