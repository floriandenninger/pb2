package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gpa implements Iterator {
    int a;
    final /* synthetic */ ViewGroup b;

    public gpa(ViewGroup viewGroup) {
        this.b = viewGroup;
        this.a = viewGroup.getChildCount() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a >= 0;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.a--;
        return this.b.getChildAt(this.a);
    }
}
