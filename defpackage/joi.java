package defpackage;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ao;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.bn;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import com.google.android.apps.youtube.embeddedplayer.service.util.a;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class joi implements ayrs {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ joi(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                zga.d(this.a, (Throwable) obj);
                return;
            case 1:
                zga.d(this.a, (Throwable) obj);
                return;
            case 2:
                Throwable th = (Throwable) obj;
                String valueOf = String.valueOf(this.a);
                zga.d(valueOf.length() != 0 ? "Error observing on entity key: ".concat(valueOf) : new String("Error observing on entity key: "), th);
                return;
            case 3:
                afsi.c(2, 1, this.a, (Throwable) obj);
                return;
            case 4:
                String str = this.a;
                av avVar = (av) obj;
                if (avVar.n()) {
                    return;
                }
                avVar.g.r(str);
                return;
            case 5:
                String str2 = this.a;
                av avVar2 = (av) obj;
                if (avVar2.n()) {
                    return;
                }
                bn bnVar = avVar2.g.a;
                if (!bnVar.f()) {
                    oba.C();
                    return;
                }
                try {
                    bnVar.c.l(str2);
                    return;
                } catch (RemoteException e) {
                    oba.B(e);
                    return;
                }
            case 6:
                a.a(this.a).ifPresent(new ao((av) obj));
                return;
            case 7:
                a.a(this.a).ifPresent(new ao((av) obj));
                return;
            case 8:
                String str3 = this.a;
                av avVar3 = (av) obj;
                try {
                    d dVar = com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded.a.b;
                    dVar.i(System.currentTimeMillis());
                    dVar.f(Tick.REMOTE_RECEIVES_PREVIEW_REQUEST, System.currentTimeMillis());
                } catch (RemoteException e2) {
                    oba.B(e2);
                }
                avVar3.l(SimplePlaybackDescriptor.c(str3, 0));
                return;
            default:
                String str4 = this.a;
                aone aoneVar = (aone) obj;
                Charset charset = alcn.a;
                aoneVar.copyOnWrite();
                akzs akzsVar = (akzs) aoneVar.instance;
                akzs akzsVar2 = akzs.a;
                str4.getClass();
                akzsVar.c |= 32;
                akzsVar.H = str4;
                return;
        }
    }
}
