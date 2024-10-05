package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akij extends ajsu implements akii {
    public final aahd a;
    public final avml b;
    public final ajpd c;
    private final Context d;

    public akij(avml avmlVar, Context context, aahd aahdVar) {
        this.d = context;
        this.a = aahdVar;
        this.b = avmlVar;
        ajpd ajpdVar = new ajpd();
        this.c = ajpdVar;
        ajpdVar.add(avmlVar);
    }

    @Override // defpackage.akii
    public final void b(List list) {
    }

    @Override // defpackage.akii
    public final void c(ajos ajosVar) {
        ajosVar.f(avml.class, new akls(this.d, this));
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.c;
    }
}
