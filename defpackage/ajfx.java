package defpackage;

import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;
import com.google.android.libraries.elements.interfaces.PublicKeyVerifierProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajfx extends PublicKeyVerifierProvider {
    @Override // com.google.android.libraries.elements.interfaces.PublicKeyVerifierProvider
    public final PublicKeyVerifier createVerifier() {
        return new ajfw();
    }
}
