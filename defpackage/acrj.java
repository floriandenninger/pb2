package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrj {
    final Map a = new HashMap();
    final Map b = new HashMap();

    public acrj() {
        new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized InteractionLoggingScreen a(acrs acrsVar) {
        Deque deque = (Deque) this.a.get(acrsVar);
        if (deque == null) {
            return null;
        }
        return (InteractionLoggingScreen) deque.peekFirst();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(InteractionLoggingScreen interactionLoggingScreen, acrr acrrVar) {
        String str = interactionLoggingScreen.a;
        if (TextUtils.isEmpty(str)) {
            zga.b("Empty CSN found when addVisibilityControllerToScreen");
            return;
        }
        if (!this.b.containsKey(str)) {
            this.b.put(str, new ArrayList());
        }
        ((List) this.b.get(str)).add(new WeakReference(acrrVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(InteractionLoggingScreen interactionLoggingScreen) {
        if (interactionLoggingScreen == null) {
            zga.b("Null interactionLoggingScreen found when removeInteractionLoggingScreen.");
            return;
        }
        for (Deque deque : this.a.values()) {
            if (deque.contains(interactionLoggingScreen)) {
                deque.remove(interactionLoggingScreen);
            }
        }
        String str = interactionLoggingScreen.a;
        if (!TextUtils.isEmpty(str) && this.b.containsKey(str)) {
            for (WeakReference weakReference : (List) this.b.get(str)) {
                if (weakReference.get() != null) {
                    ((acrr) weakReference.get()).b();
                }
            }
            this.b.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(acrs acrsVar, InteractionLoggingScreen interactionLoggingScreen) {
        Deque deque = (Deque) this.a.get(acrsVar);
        if (deque == null) {
            deque = new ArrayDeque();
            this.a.put(acrsVar, deque);
        }
        if (deque.contains(interactionLoggingScreen)) {
            deque.remove(interactionLoggingScreen);
        }
        deque.addFirst(interactionLoggingScreen);
        Deque deque2 = (Deque) this.a.get(acrsVar);
        if (deque2 != null && deque2.size() > 3) {
            while (deque2.size() > 3) {
                c((InteractionLoggingScreen) deque2.removeLast());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (acrs acrsVar : this.a.keySet()) {
            sb.append(str);
            sb.append(acrsVar);
            sb.append(" = {");
            String str2 = "";
            for (InteractionLoggingScreen interactionLoggingScreen : (Deque) this.a.get(acrsVar)) {
                sb.append(str2);
                sb.append(interactionLoggingScreen.a);
                str2 = ", ";
            }
            sb.append("}");
            str = ", ";
        }
        return sb.toString();
    }
}
