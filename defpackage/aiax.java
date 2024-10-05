package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aiax implements aibc, aimq {
    private final aibi a;
    private boolean c;
    private final fnv d;

    public aiax(aibi aibiVar, fnv fnvVar) {
        aibiVar.getClass();
        this.a = aibiVar;
        fnvVar.getClass();
        this.d = fnvVar;
    }

    @Override // defpackage.aibc
    public final /* synthetic */ aigd A() {
        return aigd.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a() {
        int i = i(0);
        int j = j() + 1;
        return (B() != 1 || i <= 0) ? j : j % i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        int i = i(0);
        int max = Math.max(j(), 0) - 1;
        return (B() != 1 || i <= 0) ? max : (max + i) % i;
    }

    @Override // defpackage.aibc
    public PlaybackStartDescriptor c(aims aimsVar) {
        fnt z = z(aimsVar);
        if (z == null) {
            return null;
        }
        return z.a();
    }

    @Override // defpackage.aibi
    public final int i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.aibi
    public final int j() {
        return this.a.j();
    }

    @Override // defpackage.aibi
    public final void k(aibf aibfVar) {
        this.a.k(aibfVar);
    }

    @Override // defpackage.aibi
    public final void l(aibg aibgVar) {
        this.a.l(aibgVar);
    }

    @Override // defpackage.aibi
    public final void m(aibh aibhVar) {
        this.a.m(aibhVar);
    }

    @Override // defpackage.aibi
    public final void n() {
        this.a.n();
    }

    @Override // defpackage.aibc
    public final void o(aims aimsVar, PlaybackStartDescriptor playbackStartDescriptor) {
        fnt z = z(aimsVar);
        if (z == null || !aigb.c(z.a(), playbackStartDescriptor)) {
            throw new IllegalStateException("Navigation committed to a video that is not expected bythe navigable queue");
        }
        x(z);
    }

    @Override // defpackage.aibc
    public final void p(WatchNextResponseModel watchNextResponseModel) {
        aubs aubsVar;
        this.c = watchNextResponseModel != null;
        aibi aibiVar = this.a;
        if (aibiVar instanceof kvf) {
            kvf kvfVar = (kvf) aibiVar;
            if (watchNextResponseModel == null || (aubsVar = watchNextResponseModel.g) == null) {
                return;
            }
            amrp f = amru.f();
            int i = -1;
            int i2 = 0;
            for (aubr aubrVar : aubsVar.i) {
                if ((aubrVar.b & 1) != 0) {
                    aubw aubwVar = aubrVar.c;
                    if (aubwVar == null) {
                        aubwVar = aubw.a;
                    }
                    boolean z = aubwVar.k;
                    if (true == z) {
                        i = i2;
                    }
                    if (z || (aubwVar.b & 2048) == 0) {
                        fnv fnvVar = kvfVar.a;
                        apxf apxfVar = aubwVar.m;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        f.h(fnvVar.c(apxfVar));
                        i2++;
                    }
                }
            }
            kve kveVar = new kve(f.g(), i);
            amru amruVar = kveVar.a;
            if (amruVar.isEmpty()) {
                return;
            }
            int max = Math.max(0, kveVar.b);
            int i3 = kvfVar.i(0);
            kvfVar.b(i3, amruVar);
            kvfVar.c(0, i3);
            kvfVar.a(max);
        }
    }

    @Override // defpackage.aibi
    public final void q(aibf aibfVar) {
        this.a.q(aibfVar);
    }

    @Override // defpackage.aibi
    public final void r(aibg aibgVar) {
        this.a.r(aibgVar);
    }

    @Override // defpackage.aibi
    public final void s(aibh aibhVar) {
        this.a.s(aibhVar);
    }

    @Override // defpackage.aibi
    public final boolean t(PlaybackStartDescriptor playbackStartDescriptor) {
        return this.a.t(playbackStartDescriptor);
    }

    @Override // defpackage.aimq
    public /* synthetic */ boolean u(int i) {
        throw null;
    }

    @Override // defpackage.aibc
    public final int v(aims aimsVar) {
        fnt z = z(aimsVar);
        if (aimsVar.e == aimr.AUTOPLAY && z == null && !this.c) {
            return 3;
        }
        return aims.a(z != null);
    }

    @Override // defpackage.aibi
    public final int w(int i, fnt fntVar) {
        return this.a.w(i, fntVar);
    }

    @Override // defpackage.aibi
    public final int x(fnt fntVar) {
        return this.a.x(fntVar);
    }

    @Override // defpackage.aibi
    public final fnt y(int i, int i2) {
        return this.a.y(i, i2);
    }

    protected final fnt z(aims aimsVar) {
        int B = B();
        int a = a();
        int b = b();
        aimr aimrVar = aimsVar.e;
        fnv fnvVar = this.d;
        PlaybackStartDescriptor playbackStartDescriptor = aimsVar.f;
        fnt b2 = playbackStartDescriptor != null ? fnvVar.b(playbackStartDescriptor) : null;
        int i = this.a.i(0);
        int i2 = this.a.i(1);
        aimr aimrVar2 = aimr.NEXT;
        int ordinal = aimrVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (yjk.A(b, 0, i)) {
                    return this.a.y(0, b);
                }
                return null;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    if (B != 1 && this.a.j() == i - 1 && i2 > 0) {
                        return this.a.y(1, 0);
                    }
                    return null;
                }
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        return null;
                    }
                    return b2;
                }
                if (b2 != null) {
                    int[] iArr = aibi.b;
                    for (int i3 = 0; i3 < 2; i3++) {
                        int i4 = iArr[i3];
                        int w = this.a.w(i4, b2);
                        if (w != -1) {
                            return this.a.y(i4, w);
                        }
                    }
                }
                return null;
            }
            if (this.a.j() == -1) {
                return null;
            }
            if (B == 2 && yjk.A(this.a.j(), 0, i)) {
                aibi aibiVar = this.a;
                fnt y = aibiVar.y(0, aibiVar.j());
                PlaybackStartDescriptor a2 = y.a();
                aone builder = a2.a.toBuilder();
                builder.copyOnWrite();
                owi owiVar = (owi) builder.instance;
                owiVar.b |= 128;
                owiVar.k = true;
                a2.a = (owi) builder.build();
                return y;
            }
        }
        if (yjk.A(a, 0, i)) {
            return this.a.y(0, a);
        }
        if (aimrVar != aimr.NEXT || i2 <= 0) {
            return null;
        }
        return this.a.y(1, 0);
    }
}
