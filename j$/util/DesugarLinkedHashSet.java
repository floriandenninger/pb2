package j$.util;

import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class DesugarLinkedHashSet {
    public static Spliterator spliterator(LinkedHashSet linkedHashSet) {
        return Spliterators.spliterator(linkedHashSet, 17);
    }
}
