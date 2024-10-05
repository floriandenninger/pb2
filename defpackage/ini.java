package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelSequenceNavigator$ReelSequenceNavigatorState;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ini implements aimt, imv {
    arsd a;
    private final Set b = new HashSet();
    private final aoae c;

    public ini(aoae aoaeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = aoaeVar;
        aoaeVar.K(this);
    }

    private final synchronized void m() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aime) it.next()).a();
        }
    }

    @Override // defpackage.aimt
    public final PlaybackStartDescriptor a(aims aimsVar) {
        aimr aimrVar = aimr.NEXT;
        int ordinal = aimsVar.e.ordinal();
        if (ordinal == 0) {
            arsd arsdVar = this.a;
            if (arsdVar == null || (arsdVar.b & 8) == 0) {
                return null;
            }
            aifz d = PlaybackStartDescriptor.d();
            apxf apxfVar = this.a.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            d.a = apxfVar;
            return d.a();
        }
        if (ordinal == 1) {
            arsd arsdVar2 = this.a;
            if (arsdVar2 == null || (arsdVar2.b & 16) == 0) {
                return null;
            }
            aifz d2 = PlaybackStartDescriptor.d();
            apxf apxfVar2 = this.a.g;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            d2.a = apxfVar2;
            return d2.a();
        }
        if (ordinal == 2) {
            String valueOf = String.valueOf(aimsVar.e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Unsupported Autoplay navigation type: ");
            sb.append(valueOf);
            throw new UnsupportedOperationException(sb.toString());
        }
        if (ordinal == 4) {
            return aimsVar.f;
        }
        String valueOf2 = String.valueOf(aimsVar.e);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
        sb2.append("Unsupported navigation type: ");
        sb2.append(valueOf2);
        throw new UnsupportedOperationException(sb2.toString());
    }

    @Override // defpackage.imv
    public final void aS() {
    }

    @Override // defpackage.imv
    public final void aU(long j, arsd arsdVar, boolean z) {
        this.a = arsdVar;
        m();
    }

    @Override // defpackage.imv
    public final void aW(long j, apxf apxfVar, arsd arsdVar, int i) {
    }

    @Override // defpackage.imv
    public final void aX(apxf apxfVar) {
    }

    @Override // defpackage.aimt
    public final aigd b(aims aimsVar) {
        return aigd.a;
    }

    @Override // defpackage.imv
    public final void bn(String str) {
    }

    @Override // defpackage.aimt
    public final aims c(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        return new aims(aimr.JUMP, playbackStartDescriptor, aigdVar);
    }

    @Override // defpackage.aimt
    public final SequenceNavigatorState d() {
        return new ReelSequenceNavigator$ReelSequenceNavigatorState(this.a);
    }

    @Override // defpackage.aimt
    public final void e(boolean z) {
    }

    @Override // defpackage.aimt
    public final void f(aims aimsVar, PlaybackStartDescriptor playbackStartDescriptor) {
    }

    @Override // defpackage.aimt
    public final void g() {
        this.c.L(this);
    }

    @Override // defpackage.aimt
    public final void h(WatchNextResponseModel watchNextResponseModel) {
    }

    @Override // defpackage.aimt
    public final boolean i() {
        return false;
    }

    @Override // defpackage.aimt
    public final int j(aims aimsVar) {
        aimr aimrVar = aimr.NEXT;
        int ordinal = aimsVar.e.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            arsd arsdVar = this.a;
            if (arsdVar != null && (arsdVar.b & 8) != 0) {
                z = true;
            }
            return aims.a(z);
        }
        if (ordinal != 1) {
            return ordinal != 4 ? 1 : 2;
        }
        arsd arsdVar2 = this.a;
        if (arsdVar2 != null && (arsdVar2.b & 16) != 0) {
            z = true;
        }
        return aims.a(z);
    }

    @Override // defpackage.aimt
    public final void k(aime aimeVar) {
        this.b.add(aimeVar);
    }

    @Override // defpackage.aimt
    public final void l(aime aimeVar) {
        this.b.remove(aimeVar);
    }
}
