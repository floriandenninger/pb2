package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amwl extends amww {
    final /* synthetic */ amwm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amwl(amwm amwmVar, Iterator it) {
        super(it);
        this.a = amwmVar;
    }

    @Override // defpackage.amww
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return amkq.af((Collection) obj, this.a.g);
    }
}
