package defpackage;

import android.util.LongSparseArray;
import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import com.google.android.libraries.elements.interfaces.EnvironmentDataSource;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqi extends EnvironmentDataSource {
    private final aypy e;
    private final AtomicLong b = new AtomicLong(1);
    private final Object c = new Object();
    private final LongSparseArray d = new LongSparseArray();
    public volatile byte[] a = syc.a;

    public sqi(aypy aypyVar) {
        this.e = aypyVar.G(new ayrs() { // from class: sqg
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                sqi.this.a = (byte[]) obj;
            }
        }).aJ().aN();
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final byte[] getEnvironmentData() {
        return this.a;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final long subscribeToEnvironmentData(final EnvironmentDataObserver environmentDataObserver) {
        if (environmentDataObserver == null) {
            return 0L;
        }
        long andIncrement = this.b.getAndIncrement();
        synchronized (this.c) {
            this.d.put(andIncrement, this.e.ax(new ayrs() { // from class: sqh
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    EnvironmentDataObserver.this.environmentDataDidChange();
                }
            }));
        }
        return andIncrement;
    }

    @Override // com.google.android.libraries.elements.interfaces.EnvironmentDataSource
    public final void unsubscribeFromEnvironmentData(long j) {
        synchronized (this.c) {
            ayqx ayqxVar = (ayqx) this.d.get(j);
            if (ayqxVar != null) {
                ayqxVar.qc();
            }
            this.d.remove(j);
        }
    }
}
