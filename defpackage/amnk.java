package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amnk implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ amnm b;

    public amnk(amnm amnmVar, CharSequence charSequence) {
        this.b = amnmVar;
        this.a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.g(this.a);
    }

    public final String toString() {
        ammr b = ammr.b(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        b.f(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
