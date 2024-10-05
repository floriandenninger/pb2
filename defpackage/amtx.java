package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amtx extends amwx {
    final /* synthetic */ amty a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amtx(amty amtyVar, ListIterator listIterator) {
        super(listIterator);
        this.a = amtyVar;
    }

    @Override // defpackage.amww
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
