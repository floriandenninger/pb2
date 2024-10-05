package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axrg extends HashMap {
    final /* synthetic */ axrj a;

    public axrg(axrj axrjVar) {
        this.a = axrjVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        this.a.b.put(str == null ? str : str.toLowerCase(), str2);
        return (String) super.put(str, str2);
    }
}
