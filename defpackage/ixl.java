package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ixl implements ixk {
    private final axzg a;

    static {
        zga.a("MDX.RemoteWatchPromptHelper");
    }

    public ixl(axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = axzgVar;
    }

    @Override // defpackage.ixk
    public final void a(WatchDescriptor watchDescriptor, dd ddVar) {
        String.format("isPromptBottomSheet=%b", this.a.x());
        if (this.a.x().booleanValue()) {
            ixe ixeVar = new ixe();
            Bundle bundle = new Bundle();
            bundle.putParcelable("watch", watchDescriptor);
            ixeVar.af(bundle);
            ixeVar.qh(ddVar, null);
            return;
        }
        ixj ixjVar = new ixj();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("watch", watchDescriptor);
        ixjVar.af(bundle2);
        ixjVar.qh(ddVar, null);
    }
}
