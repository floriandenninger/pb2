package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amtn extends amww {
    final /* synthetic */ amml a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amtn(Iterator it, amml ammlVar) {
        super(it);
        this.a = ammlVar;
    }

    @Override // defpackage.amww
    public final Object a(Object obj) {
        return this.a.apply(obj);
    }
}
