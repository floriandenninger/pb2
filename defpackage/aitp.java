package defpackage;

import java.util.Deque;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class aitp {
    public static ajun a;

    public static aitn a(Deque deque, boolean z) {
        Object poll = z ? deque.poll() : deque.peek();
        if (poll == null || poll.getClass() != aitn.class) {
            return null;
        }
        return (aitn) poll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ aitc b(Deque deque) {
        Object peek = deque.peek();
        if (peek == null || peek.getClass() != aitc.class) {
            return null;
        }
        return (aitc) peek;
    }
}
