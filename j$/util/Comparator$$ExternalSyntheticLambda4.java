package j$.util;

import j$.lang.DesugarInteger$$ExternalSyntheticBackport0;
import j$.util.function.ToIntFunction;
import java.io.Serializable;
import java.util.Comparator;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Comparator$$ExternalSyntheticLambda4 implements Comparator, Serializable {
    public final /* synthetic */ ToIntFunction f$0;

    public /* synthetic */ Comparator$$ExternalSyntheticLambda4(ToIntFunction toIntFunction) {
        this.f$0 = toIntFunction;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int m;
        m = DesugarInteger$$ExternalSyntheticBackport0.m(r0.applyAsInt(obj), this.f$0.applyAsInt(obj2));
        return m;
    }
}
