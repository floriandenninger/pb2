package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aimp implements aimt, aimq, aimu {
    private final ammy a;
    private final boolean b;
    private final Set c;
    private final String d;
    private int e;
    private boolean f;
    private boolean g;
    private aalx h;
    private WatchNextResponseModel i;

    public aimp(AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState, ammy ammyVar) {
        this.e = 0;
        autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.getClass();
        ammyVar.getClass();
        this.a = ammyVar;
        this.d = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.a;
        this.i = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.b;
        this.f = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.c;
        this.e = autoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState.d;
        this.b = false;
        this.c = new HashSet();
        p();
    }

    private final apxf m() {
        aalx aalxVar = this.h;
        if (aalxVar == null || !r(aalxVar.a())) {
            return null;
        }
        return aalxVar.a();
    }

    private final apxf n() {
        aalx aalxVar = this.h;
        if (aalxVar == null || !r(aalxVar.b())) {
            return null;
        }
        return aalxVar.b();
    }

    private final apxf o() {
        aalx aalxVar = this.h;
        if (aalxVar == null || !r(aalxVar.c())) {
            return null;
        }
        return aalxVar.c();
    }

    private final synchronized void p() {
        WatchNextResponseModel watchNextResponseModel = this.i;
        aalx aalxVar = null;
        if (watchNextResponseModel != null && watchNextResponseModel.h != null) {
            this.e = u(this.e) ? this.e : 0;
            boolean z = this.f && rT();
            this.f = z;
            aama aamaVar = watchNextResponseModel.h;
            int i = this.e;
            aalxVar = aamaVar.a(i == 1, i == 2, z, this.g);
        }
        if (this.h == aalxVar) {
            return;
        }
        this.h = aalxVar;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aime) it.next()).a();
        }
    }

    private final boolean q(PlaybackStartDescriptor playbackStartDescriptor) {
        return (playbackStartDescriptor == null || TextUtils.isEmpty(this.d) || !TextUtils.equals(playbackStartDescriptor.k(), this.d)) ? false : true;
    }

    private final boolean r(apxf apxfVar) {
        return apxfVar != null && this.a.a(apxfVar);
    }

    @Override // defpackage.aimq
    public final synchronized int B() {
        return this.e;
    }

    @Override // defpackage.aimq
    public final synchronized void C(int i) {
        this.e = i;
        p();
    }

    @Override // defpackage.aimt
    public final PlaybackStartDescriptor a(aims aimsVar) {
        apxf d;
        aimr aimrVar = aimr.NEXT;
        int ordinal = aimsVar.e.ordinal();
        if (ordinal == 0) {
            aifz d2 = PlaybackStartDescriptor.d();
            d2.a = o();
            return d2.a();
        }
        if (ordinal == 1) {
            aalx aalxVar = this.h;
            aifz d3 = PlaybackStartDescriptor.d();
            if (aalxVar != null && (d = aalxVar.d()) != null) {
                d3.a = d;
            }
            return d3.a();
        }
        if (ordinal == 2) {
            aifz d4 = PlaybackStartDescriptor.d();
            d4.a = n();
            d4.f = true;
            d4.e = true;
            return d4.a();
        }
        if (ordinal == 3) {
            aifz d5 = PlaybackStartDescriptor.d();
            d5.a = m();
            d5.f = true;
            d5.e = true;
            return d5.a();
        }
        if (ordinal == 4) {
            return aimsVar.f;
        }
        String valueOf = String.valueOf(aimsVar.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("Unsupported navigation type: ");
        sb.append(valueOf);
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // defpackage.aimt
    public final aigd b(aims aimsVar) {
        aigd aigdVar = aimsVar.g;
        return aigdVar == null ? aigd.a : aigdVar;
    }

    @Override // defpackage.aimt
    public final aims c(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        if (q(playbackStartDescriptor)) {
            return new aims(aimr.JUMP, playbackStartDescriptor, aigdVar);
        }
        return null;
    }

    @Override // defpackage.aimt
    public final synchronized SequenceNavigatorState d() {
        return new AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState(this.d, this.i, this.f, this.e);
    }

    @Override // defpackage.aimt
    public final synchronized void e(boolean z) {
        this.g = z;
        p();
    }

    @Override // defpackage.aimt
    public final void f(aims aimsVar, PlaybackStartDescriptor playbackStartDescriptor) {
    }

    @Override // defpackage.aimt
    public final void g() {
    }

    @Override // defpackage.aimt
    public final void h(WatchNextResponseModel watchNextResponseModel) {
        this.i = watchNextResponseModel;
        p();
    }

    @Override // defpackage.aimt
    public final boolean i() {
        return true;
    }

    @Override // defpackage.aimt
    public final int j(aims aimsVar) {
        aimr aimrVar = aimr.NEXT;
        int ordinal = aimsVar.e.ordinal();
        if (ordinal == 0) {
            return aims.a(o() != null);
        }
        if (ordinal == 1) {
            aalx aalxVar = this.h;
            apxf apxfVar = null;
            if (aalxVar != null && r(aalxVar.d())) {
                apxfVar = aalxVar.d();
            }
            return aims.a(apxfVar != null);
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                return (ordinal == 4 && q(aimsVar.f)) ? 2 : 1;
            }
            return aims.a(m() != null);
        }
        if (n() == null || !this.b) {
            return this.i != null ? 1 : 3;
        }
        return 2;
    }

    @Override // defpackage.aimt
    public final synchronized void k(aime aimeVar) {
        this.c.add(aimeVar);
    }

    @Override // defpackage.aimt
    public final synchronized void l(aime aimeVar) {
        this.c.remove(aimeVar);
    }

    @Override // defpackage.aimu
    public final synchronized void rR(boolean z) {
        this.f = z;
        p();
    }

    @Override // defpackage.aimu
    public final synchronized boolean rS() {
        return this.f;
    }

    @Override // defpackage.aimu
    public final boolean rT() {
        aama aamaVar;
        WatchNextResponseModel watchNextResponseModel = this.i;
        return (watchNextResponseModel == null || (aamaVar = watchNextResponseModel.h) == null || !aamaVar.d()) ? false : true;
    }

    @Override // defpackage.aimq
    public final boolean u(int i) {
        aama aamaVar;
        WatchNextResponseModel watchNextResponseModel;
        aama aamaVar2;
        if (i != 1) {
            return i == 2 && (watchNextResponseModel = this.i) != null && (aamaVar2 = watchNextResponseModel.h) != null && aamaVar2.b();
        }
        WatchNextResponseModel watchNextResponseModel2 = this.i;
        return (watchNextResponseModel2 == null || (aamaVar = watchNextResponseModel2.h) == null || !aamaVar.c()) ? false : true;
    }

    public aimp(String str, boolean z, ammy ammyVar) {
        this.e = 0;
        ammyVar.getClass();
        this.a = ammyVar;
        this.d = str;
        this.b = z;
        this.c = new HashSet();
    }
}
