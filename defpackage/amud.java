package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amud extends amww {
    public amud(Iterator it) {
        super(it);
    }

    @Override // defpackage.amww
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getKey();
    }
}
