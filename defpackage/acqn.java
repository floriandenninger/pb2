package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqn {
    public final Map a = new ConcurrentHashMap();
    private final Deque b = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(InteractionLoggingScreen interactionLoggingScreen) {
        if (interactionLoggingScreen == null) {
            return;
        }
        String str = interactionLoggingScreen.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.a.containsKey(str)) {
            this.b.remove(str);
            this.b.addLast(str);
            return;
        }
        if (this.b.size() == 7) {
            this.a.remove((String) this.b.removeFirst());
        }
        this.b.addLast(str);
        this.a.put(str, interactionLoggingScreen);
    }
}
