package defpackage;

import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tai extends PerformOnceCommandController {
    public static final Set a = new HashSet();

    @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
    public final void clear() {
        Set set = a;
        synchronized (set) {
            set.clear();
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
    public final boolean contains(String str) {
        boolean contains;
        Set set = a;
        synchronized (set) {
            contains = set.contains(str);
        }
        return contains;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformOnceCommandController
    public final void insert(String str) {
        Set set = a;
        synchronized (set) {
            set.add(str);
        }
    }
}
