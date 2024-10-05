package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amwi extends amqs {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ amwj b;

    public amwi(amwj amwjVar, Map.Entry entry) {
        this.b = amwjVar;
        this.a = entry;
    }

    @Override // defpackage.amqs
    protected final Map.Entry a() {
        return this.a;
    }

    @Override // defpackage.amqs, defpackage.amqt
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.amqs, java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getValue() {
        return amkq.af((Collection) this.a.getValue(), this.b.a.g);
    }
}
