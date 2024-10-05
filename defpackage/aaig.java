package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.FaultObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaig extends FaultObserver {
    final /* synthetic */ aaih a;

    public aaig(aaih aaihVar) {
        this.a = aaihVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.FaultObserver
    public final void storeDidFault(ByteStore byteStore, String str) {
        aaih aaihVar = this.a;
        aaih.k(aaihVar.f, aaihVar.a.b(str)).c(str);
    }
}
