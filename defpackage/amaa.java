package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amaa implements amml {
    public final /* synthetic */ AtomicReference a;
    private final /* synthetic */ int b;

    public /* synthetic */ amaa(AtomicReference atomicReference, int i) {
        this.b = i;
        this.a = atomicReference;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            return this.a.get();
        }
        return (List) this.a.get();
    }
}
