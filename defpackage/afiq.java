package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afiq implements ammy {
    public final /* synthetic */ Set a;
    private final /* synthetic */ int b;

    public /* synthetic */ afiq(Set set, int i) {
        this.b = i;
        this.a = set;
    }

    @Override // defpackage.ammy
    public final boolean a(Object obj) {
        if (this.b != 0) {
            return !this.a.contains(obj) || (obj instanceof aqaj);
        }
        return this.a.contains(adyu.bH(((Integer) obj).intValue()));
    }
}
