package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uga extends oy {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    public uga(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.oy
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.oy
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.oy
    public final boolean c(int i, int i2) {
        Object obj = this.a.get(i);
        Object obj2 = this.b.get(i2);
        return amkq.b(tyo.Y(obj), tyo.Y(obj2)) && amkq.b(tyo.aa(obj), tyo.aa(obj2));
    }

    @Override // defpackage.oy
    public final boolean d(int i, int i2) {
        return tyo.X(this.a.get(i)).equals(tyo.X(this.b.get(i2)));
    }
}
