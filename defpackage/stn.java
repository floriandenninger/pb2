package defpackage;

import com.google.android.libraries.elements.interfaces.JSCommandResolver;
import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stn extends JSCommandResolver {
    private final sww a;
    private final swu b;

    public stn(sww swwVar, swu swuVar) {
        this.a = swwVar;
        this.b = swuVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public final Status resolve(byte[] bArr) {
        AtomicReference atomicReference = new AtomicReference(Status.k);
        try {
            this.a.d((awnw) aonm.parseFrom(awnw.a, bArr, aomw.b()), this.b, 1).U(new stl(atomicReference));
            return (Status) atomicReference.get();
        } catch (aoob e) {
            throw new syf("Failed to parse command.", e);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public final void resolveAsync(byte[] bArr, JSPromiseResolver jSPromiseResolver) {
        if (jSPromiseResolver == null) {
            throw new syf("Failed to resolve command due to null JSPromiseResolver.");
        }
        try {
            this.a.d((awnw) aonm.parseFrom(awnw.a, bArr, aomw.b()), this.b, 1).U(new stm(jSPromiseResolver));
        } catch (aoob e) {
            throw new syf("Failed to parse command.", e);
        }
    }
}
