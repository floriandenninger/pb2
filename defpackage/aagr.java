package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceEntry;
import com.google.android.libraries.elements.interfaces.SecurityVerifier;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aagr extends SecurityVerifier {
    private final aagm a;

    public aagr(aagm aagmVar) {
        this.a = aagmVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.SecurityVerifier
    public final Status verify(ResourceEntry resourceEntry) {
        if (this.a.d(resourceEntry.getResourceMetadata().getResourceIdentifier())) {
            return Status.b;
        }
        return Status.e;
    }
}
