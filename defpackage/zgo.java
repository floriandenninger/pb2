package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zgo implements zgq {
    private final /* synthetic */ int a;

    public zgo(int i) {
        this.a = i;
    }

    @Override // defpackage.zgq
    public final Object a(Map.Entry entry) {
        return this.a != 0 ? entry.getKey() : ((zgr) entry).c;
    }
}
