package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aibp implements aimt, aimq, aimu {
    private static final String b = zga.a("PQSN");
    public final aibc a;
    private final aibt c;
    private final Set d;
    private final aibo e;
    private int f;

    public aibp(aibc aibcVar, aibt aibtVar) {
        aibcVar.getClass();
        this.a = aibcVar;
        this.c = aibtVar;
        this.d = new HashSet();
        aibo aiboVar = new aibo(this);
        this.e = aiboVar;
        aiboVar.e();
        aibtVar.b = new WeakReference(this);
    }

    private final Object n() {
        this.e.f();
        return this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z) {
        int j = j(aims.b);
        int j2 = j(aims.a);
        int B = B();
        int i = (j == 2 ? 1 : 0) | (j2 == 2 ? 2 : 0) | (B == 1 ? 4 : 0) | (B == 2 ? 8 : 0) | (true == rS() ? 16 : 0);
        if (this.f != i || z) {
            this.f = i;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((aime) it.next()).a();
            }
        }
    }

    private final void p(Object obj, boolean z) {
        this.e.e();
        this.c.c(obj);
        o(z);
    }

    @Override // defpackage.aimq
    public final int B() {
        aibc aibcVar = this.a;
        if (aibcVar instanceof aimq) {
            return ((aimq) aibcVar).B();
        }
        return 0;
    }

    @Override // defpackage.aimq
    public final void C(int i) {
        if (u(i)) {
            aibc aibcVar = this.a;
            if (aibcVar instanceof aimq) {
                ((aimq) aibcVar).C(i);
                o(false);
            }
        }
    }

    @Override // defpackage.aimt
    public final PlaybackStartDescriptor a(aims aimsVar) {
        Object n = n();
        PlaybackStartDescriptor c = this.a.c(aimsVar);
        p(n, false);
        if (c == null) {
            String str = b;
            String name = aimsVar.e.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 41);
            sb.append("getNavigationDescriptor for ");
            sb.append(name);
            sb.append("returned NULL");
            zga.m(str, sb.toString());
            return null;
        }
        boolean z = aimsVar.e == aimr.AUTOPLAY || aimsVar.e == aimr.AUTONAV;
        aifz e = c.e();
        e.f = z;
        e.e = z;
        return e.a();
    }

    @Override // defpackage.aimt
    public final aigd b(aims aimsVar) {
        return this.a.A();
    }

    @Override // defpackage.aimt
    public final aims c(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        return this.a.d(playbackStartDescriptor, aigdVar);
    }

    @Override // defpackage.aimt
    public final SequenceNavigatorState d() {
        return null;
    }

    @Override // defpackage.aimt
    public final void e(boolean z) {
        o(false);
    }

    @Override // defpackage.aimt
    public final void f(aims aimsVar, PlaybackStartDescriptor playbackStartDescriptor) {
        Object n = n();
        this.a.o(aimsVar, playbackStartDescriptor);
        p(n, false);
    }

    @Override // defpackage.aimt
    public final void g() {
        this.e.f();
        aibt aibtVar = this.c;
        WeakReference weakReference = aibtVar.b;
        if (weakReference == null || amkq.b(this, weakReference.get())) {
            aibtVar.b = null;
        }
        aibc aibcVar = this.a;
        if (aibcVar instanceof aibv) {
            ((aibv) aibcVar).e();
        }
    }

    @Override // defpackage.aimt
    public final void h(WatchNextResponseModel watchNextResponseModel) {
        Object n = n();
        this.a.p(watchNextResponseModel);
        p(n, true);
    }

    @Override // defpackage.aimt
    public final boolean i() {
        return false;
    }

    @Override // defpackage.aimt
    public final int j(aims aimsVar) {
        return this.a.v(aimsVar);
    }

    @Override // defpackage.aimt
    public final void k(aime aimeVar) {
        this.d.add(aimeVar);
    }

    @Override // defpackage.aimt
    public final void l(aime aimeVar) {
        this.d.remove(aimeVar);
    }

    @Override // defpackage.aimu
    public final void rR(boolean z) {
        if (rT()) {
            aibc aibcVar = this.a;
            if (aibcVar instanceof aimu) {
                ((aimu) aibcVar).rR(z);
                o(false);
            }
        }
    }

    @Override // defpackage.aimu
    public final boolean rS() {
        if (!rT()) {
            return false;
        }
        aibc aibcVar = this.a;
        return (aibcVar instanceof aimu) && ((aimu) aibcVar).rS();
    }

    @Override // defpackage.aimu
    public final boolean rT() {
        aibc aibcVar = this.a;
        return (aibcVar instanceof aimu) && ((aimu) aibcVar).rT();
    }

    @Override // defpackage.aimq
    public final boolean u(int i) {
        aibc aibcVar = this.a;
        return (aibcVar instanceof aimq) && ((aimq) aibcVar).u(i);
    }
}
