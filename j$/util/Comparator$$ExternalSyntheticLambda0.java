package j$.util;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class Comparator$$ExternalSyntheticLambda0 implements Comparator, Serializable {
    public final /* synthetic */ Comparator f$0;
    public final /* synthetic */ Comparator f$1;

    public /* synthetic */ Comparator$$ExternalSyntheticLambda0(Comparator comparator, Comparator comparator2) {
        this.f$0 = comparator;
        this.f$1 = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Comparator$CC.lambda$thenComparing$36697e65$1(this.f$0, this.f$1, obj, obj2);
    }
}
