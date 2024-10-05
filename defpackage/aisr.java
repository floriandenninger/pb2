package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisr extends wbs {
    @Override // defpackage.wbs
    public final void F(Deque deque, Attributes attributes, String str) {
        deque.pollFirst();
    }

    @Override // defpackage.wbs
    public final void G(Deque deque, Attributes attributes) {
        deque.offerFirst(new aitz());
    }
}
