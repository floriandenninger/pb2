package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amtz extends amwx {
    final /* synthetic */ amua a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amtz(amua amuaVar, ListIterator listIterator) {
        super(listIterator);
        this.a = amuaVar;
    }

    @Override // defpackage.amww
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
