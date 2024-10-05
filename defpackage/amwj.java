package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amwj extends amww {
    final /* synthetic */ amwk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amwj(amwk amwkVar, Iterator it) {
        super(it);
        this.a = amwkVar;
    }

    @Override // defpackage.amww
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new amwi(this, (Map.Entry) obj);
    }
}
