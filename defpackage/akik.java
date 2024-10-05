package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akik extends ajsu implements akii, aklo {
    private final Context a;
    private final aahd b;
    private final ajpd c;

    public akik(avmn avmnVar, Context context, aahd aahdVar) {
        this.a = context;
        this.b = aahdVar;
        ajpd ajpdVar = new ajpd();
        this.c = ajpdVar;
        avmnVar.getClass();
        ajpdVar.add(avmnVar);
    }

    @Override // defpackage.akii
    public final void b(List list) {
    }

    @Override // defpackage.akii
    public final void c(ajos ajosVar) {
        ajosVar.f(avmn.class, new aklv(this.a, this.b, 0));
    }

    @Override // defpackage.aklo
    public final void d(aqyg aqygVar) {
        avmn avmnVar = (avmn) this.c.get(0);
        ajpd ajpdVar = this.c;
        aone builder = avmnVar.toBuilder();
        builder.copyOnWrite();
        avmn avmnVar2 = (avmn) builder.instance;
        aqygVar.getClass();
        avmnVar2.d = aqygVar;
        avmnVar2.b |= 2;
        ajpdVar.set(0, builder.build());
        this.c.l();
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.c;
    }
}
