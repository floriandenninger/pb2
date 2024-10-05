package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akho extends ajsu implements akii, aklg {
    public final avlv a;
    public final akhm b;
    private final Context c;
    private final aahd d;
    private final acra e;
    private final akiu f;
    private final ajpd g;
    private final aoae h;

    public akho(avlv avlvVar, Context context, aahd aahdVar, aoae aoaeVar, acra acraVar, akiu akiuVar, akhm akhmVar, byte[] bArr) {
        avlvVar.getClass();
        this.a = avlvVar;
        this.c = context;
        this.d = aahdVar;
        this.h = aoaeVar;
        this.e = acraVar;
        this.f = akiuVar;
        this.b = akhmVar;
        ajpd ajpdVar = new ajpd();
        this.g = ajpdVar;
        ajpdVar.add(avlvVar);
    }

    @Override // defpackage.akii
    public final void b(List list) {
    }

    @Override // defpackage.akii
    public final void c(ajos ajosVar) {
        Context context = this.c;
        aahd aahdVar = this.d;
        aoae aoaeVar = this.h;
        acra acraVar = this.e;
        final akiu akiuVar = this.f;
        ajosVar.f(avlv.class, new aklf(context, aahdVar, aoaeVar, acraVar, new Runnable() { // from class: akhl
            @Override // java.lang.Runnable
            public final void run() {
                akiu.this.h();
            }
        }, this, null));
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.g;
    }
}
