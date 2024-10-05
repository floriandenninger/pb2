package defpackage;

import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aihs {
    public static final byte[] a = aaef.b;
    public static final long b = TimeUnit.SECONDS.toMillis(15);
    public final ypa c;
    public final aiij d;
    public final aijp e;
    protected final Executor f;
    public final Set g;
    public final shf h;
    public final aaea i;
    public final aifk j;
    public final LruCache k;
    public final zgj l;
    private final Executor m;
    private final aelm n;
    private final ConditionVariable o;

    public aihs(ypa ypaVar, aiij aiijVar, aijp aijpVar, Executor executor, Executor executor2, List list, zgj zgjVar) {
        this.o = new ConditionVariable();
        this.l = zgjVar;
        this.c = ypaVar;
        this.d = aiijVar;
        this.e = aijpVar;
        this.f = executor;
        this.m = executor2;
        this.g = new HashSet(list);
        this.h = new zhr(0);
        this.k = null;
        this.i = null;
        this.n = null;
        this.j = null;
    }

    private final void j(String str) {
        LruCache lruCache = this.k;
        if (lruCache != null) {
            lruCache.remove(str);
        }
    }

    private final void k() {
        if (aifk.e(this.i).s) {
            this.o.block(Math.max(aifk.e(this.i).t, 1L));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PlayerResponseModel a(String str, PlayerResponseModel playerResponseModel) {
        return playerResponseModel;
    }

    public final anhy b(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aaox aaoxVar, boolean z, aigd aigdVar) {
        zhq.m(playbackStartDescriptor.l());
        return c(playbackStartDescriptor.l(), str, this.e.c(playbackStartDescriptor, i, this.g, aigdVar.b, str), aaoxVar, z, true, aigdVar.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        if (r0.booleanValue() != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy c(java.lang.String r17, java.lang.String r18, defpackage.aijr r19, final defpackage.aaox r20, boolean r21, boolean r22, defpackage.acsx r23) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aihs.c(java.lang.String, java.lang.String, aijr, aaox, boolean, boolean, acsx):anhy");
    }

    public final void d(PlaybackStartDescriptor playbackStartDescriptor, int i) {
        if (this.k == null || TextUtils.isEmpty(playbackStartDescriptor.l()) || playbackStartDescriptor.y() == null) {
            return;
        }
        j(this.e.b(playbackStartDescriptor.l(), playbackStartDescriptor.y(), playbackStartDescriptor.j(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), i, this.g, null, null, false).b());
    }

    public final void e(final PlaybackStartDescriptor playbackStartDescriptor, final String str, Executor executor, final aigd aigdVar) {
        final String h;
        final aaox h2;
        if (aifk.B(this.i)) {
            aifk aifkVar = this.j;
            if (aifkVar == null || !aifkVar.n(playbackStartDescriptor)) {
                if (!aifk.e(this.i).n) {
                    if (playbackStartDescriptor.t()) {
                        return;
                    }
                    final String h3 = playbackStartDescriptor.h(this.l);
                    executor.execute(new Runnable() { // from class: aihp
                        @Override // java.lang.Runnable
                        public final void run() {
                            aihs aihsVar = aihs.this;
                            PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                            String str2 = h3;
                            aigd aigdVar2 = aigdVar;
                            String str3 = str;
                            aaox h4 = aaox.h(aihsVar.i, playbackStartDescriptor2.f(), str2, playbackStartDescriptor2.c(), aigdVar2.h, playbackStartDescriptor2.z());
                            if (h4 == null || TextUtils.isEmpty(str3)) {
                                return;
                            }
                            h4.f(str3);
                            h4.i();
                            aihsVar.c(str3, str2, aihsVar.e.c(playbackStartDescriptor2, -1, aihsVar.g, aigdVar2.b, str2), h4, true, false, aigdVar2.b);
                        }
                    });
                    k();
                    return;
                }
                if (playbackStartDescriptor.t() || TextUtils.isEmpty(str) || (h2 = aaox.h(this.i, playbackStartDescriptor.f(), (h = playbackStartDescriptor.h(this.l)), playbackStartDescriptor.c(), aigdVar.h, playbackStartDescriptor.z())) == null || TextUtils.isEmpty(str)) {
                    return;
                }
                executor.execute(new Runnable() { // from class: aiho
                    @Override // java.lang.Runnable
                    public final void run() {
                        aihs aihsVar = aihs.this;
                        aaox aaoxVar = h2;
                        String str2 = str;
                        PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                        String str3 = h;
                        aigd aigdVar2 = aigdVar;
                        aaoxVar.f(str2);
                        aaoxVar.i();
                        aihsVar.b(playbackStartDescriptor2, str3, -1, aaoxVar, true, aigdVar2);
                    }
                });
                k();
            }
        }
    }

    @Deprecated
    public final boolean f(PlaybackStartDescriptor playbackStartDescriptor) {
        if (this.k != null && !TextUtils.isEmpty(playbackStartDescriptor.l()) && playbackStartDescriptor.y() != null) {
            if (this.k.get(this.e.b(playbackStartDescriptor.l(), playbackStartDescriptor.y(), playbackStartDescriptor.j(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), -1, this.g, null, null, false).b()) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str, String str2, byte[] bArr, int i, final ykl yklVar) {
        final PlayerResponseModel playerResponseModel;
        try {
            aifz d = PlaybackStartDescriptor.d();
            aong m = aigp.m(str, "", -1, 0.0f, str2, null);
            aomf x = aomf.x(bArr);
            m.copyOnWrite();
            apxf apxfVar = (apxf) m.instance;
            apxf apxfVar2 = apxf.a;
            apxfVar.b |= 1;
            apxfVar.c = x;
            d.a = (apxf) m.build();
            anhy b2 = b(d.a(), null, i, null, false, aigd.a);
            long j = b;
            if (this.i != null) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(aifk.a(r3)));
            }
            if (j > 0) {
                playerResponseModel = (PlayerResponseModel) b2.get(j, TimeUnit.MILLISECONDS);
            } else {
                playerResponseModel = (PlayerResponseModel) b2.get();
            }
            this.m.execute(new Runnable() { // from class: aihm
                @Override // java.lang.Runnable
                public final void run() {
                    ykl yklVar2 = ykl.this;
                    PlayerResponseModel playerResponseModel2 = playerResponseModel;
                    byte[] bArr2 = aihs.a;
                    yklVar2.b(null, playerResponseModel2);
                }
            });
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.m.execute(new Runnable() { // from class: aihn
                @Override // java.lang.Runnable
                public final void run() {
                    ykl yklVar2 = ykl.this;
                    Exception exc = e;
                    byte[] bArr2 = aihs.a;
                    yklVar2.a(null, exc);
                }
            });
        }
    }

    public final void h(final String str, final byte[] bArr, final String str2, final int i, final ykl yklVar) {
        yklVar.getClass();
        this.f.execute(new Runnable() { // from class: aihq
            @Override // java.lang.Runnable
            public final void run() {
                aihs.this.g(str, str2, bArr, i, yklVar);
            }
        });
    }

    public final anhy i(PlaybackStartDescriptor playbackStartDescriptor, String str, boolean z, aigd aigdVar) {
        zhq.m(playbackStartDescriptor.l());
        aaox h = aaox.h(this.i, playbackStartDescriptor.f(), str, playbackStartDescriptor.c(), aigdVar.h, playbackStartDescriptor.z());
        if (h != null && !TextUtils.isEmpty(playbackStartDescriptor.l())) {
            h.f(playbackStartDescriptor.l());
        }
        return b(playbackStartDescriptor, str, -1, h, z, aigdVar);
    }

    public aihs(ypa ypaVar, aiij aiijVar, aijp aijpVar, Executor executor, Executor executor2, Set set, aelm aelmVar, shf shfVar, aaea aaeaVar, aifk aifkVar, zgj zgjVar) {
        this.o = new ConditionVariable();
        ypaVar.getClass();
        this.c = ypaVar;
        aiijVar.getClass();
        this.d = aiijVar;
        aijpVar.getClass();
        this.e = aijpVar;
        executor.getClass();
        this.f = executor;
        executor2.getClass();
        this.m = executor2;
        set.getClass();
        this.g = set;
        this.n = aelmVar;
        this.h = shfVar;
        this.j = aifkVar;
        this.k = new LruCache(16);
        aaeaVar.getClass();
        this.i = aaeaVar;
        this.l = zgjVar;
    }
}
