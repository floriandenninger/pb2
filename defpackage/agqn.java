package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agqn implements aihk, aihd {
    public final aijc a;
    public final aihs b;
    public final aijg c;
    private final zgj d;
    private final aihc e;
    private final aiir f;
    private final agqv g;
    private final agrd h;
    private final aaea i;
    private final anic j;
    private final agmu k;
    private final agzz l;
    private final agsg m;
    private final aifk n;

    public agqn(zgj zgjVar, aihs aihsVar, aijg aijgVar, aijc aijcVar, aihc aihcVar, aiir aiirVar, agqv agqvVar, aaea aaeaVar, agmu agmuVar, agzz agzzVar, agsg agsgVar, aifk aifkVar, agrd agrdVar, anic anicVar) {
        this.d = zgjVar;
        this.a = aijcVar;
        this.e = aihcVar;
        this.b = aihsVar;
        this.c = aijgVar;
        this.f = aiirVar;
        this.g = agqvVar;
        this.h = agrdVar;
        this.i = aaeaVar;
        this.j = anicVar;
        this.k = agmuVar;
        this.l = agzzVar;
        this.m = agsgVar;
        this.n = aifkVar;
    }

    private final long h() {
        atys atysVar = this.i.a().j;
        if (atysVar == null) {
            atysVar = atys.a;
        }
        if ((atysVar.b & 524288) != 0) {
            return atysVar.j;
        }
        return 1000L;
    }

    private final aiiq i(final PlaybackStartDescriptor playbackStartDescriptor, final aigd aigdVar, String str, boolean z) {
        return aiir.a(playbackStartDescriptor, aigdVar, this.i, str, new agql(this, aigdVar, 3), new amml() { // from class: agqk
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                agqn agqnVar = agqn.this;
                return agqnVar.c.b(playbackStartDescriptor, aigdVar);
            }
        }, z, this.j);
    }

    private static anhy j(anhy anhyVar, int i) {
        return anfq.h(anhyVar, new fnz(i, 9), angq.a);
    }

    private final anhy k(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aigd aigdVar) {
        this.b.d(playbackStartDescriptor, i);
        return this.b.b(playbackStartDescriptor, str, i, null, true, aigdVar);
    }

    private final boolean l(PlaybackStartDescriptor playbackStartDescriptor) {
        if (!this.l.c()) {
            return false;
        }
        atys atysVar = this.i.a().j;
        if (atysVar == null) {
            atysVar = atys.a;
        }
        return atysVar.i && this.m.b().a(playbackStartDescriptor);
    }

    @Override // defpackage.aihk
    public final Pair a(PlaybackStartDescriptor playbackStartDescriptor, String str, aigd aigdVar, boolean z) {
        final aigd aigdVar2;
        final PlaybackStartDescriptor playbackStartDescriptor2;
        aiiq a;
        aypy a2;
        if (!playbackStartDescriptor.t() || !playbackStartDescriptor.t()) {
            if (!this.n.n(playbackStartDescriptor) || this.b.f(playbackStartDescriptor)) {
                aigdVar2 = aigdVar;
                playbackStartDescriptor2 = playbackStartDescriptor;
                a = aiir.a(playbackStartDescriptor, aigdVar, this.i, str, new agqm(this, z, 0), new agql(this, aigdVar2, 0), z, this.j);
            } else {
                aarn b = this.a.b(playbackStartDescriptor, str, aigdVar);
                aiir aiirVar = this.f;
                if (this.n.o()) {
                    a2 = (aypy) this.e.a(b.l(), new agqi(this, b, playbackStartDescriptor, str, aigdVar, 0));
                } else {
                    a2 = this.a.a(b, playbackStartDescriptor, str, aigdVar);
                }
                aigdVar2 = aigdVar;
                playbackStartDescriptor2 = playbackStartDescriptor;
                a = aiirVar.b(playbackStartDescriptor, aigdVar, str, a2, new agql(this, aigdVar, 2), new agql(this, aigdVar, 1), z);
            }
            return Pair.create(a.b(), (anhy) a.a().d(new amnv() { // from class: agqh
                @Override // defpackage.amnv
                public final Object get() {
                    return agqn.this.f(playbackStartDescriptor2, aigdVar2);
                }
            }));
        }
        return new Pair(this.g.a(playbackStartDescriptor), this.h.b(playbackStartDescriptor, true));
    }

    @Override // defpackage.aihk
    public final anhy b(String str, String str2, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, boolean z) {
        return aiir.a(playbackStartDescriptor, aigdVar, this.i, str2, new agqm(this, z, 1), new amml() { // from class: agqj
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return agqn.this.d((PlaybackStartDescriptor) obj);
            }
        }, z, this.j).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
    
        if (r2 != 3) goto L16;
     */
    @Override // defpackage.aihk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy c(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r15, java.lang.String r16, int r17, defpackage.aigd r18) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            int r2 = r15.A()
            boolean r3 = r15.t()
            if (r3 != 0) goto L66
            r3 = 5
            if (r2 != r3) goto L10
            goto L66
        L10:
            r3 = 4
            if (r2 != r3) goto L23
            agzz r2 = r0.l
            boolean r2 = r2.c()
            if (r2 != 0) goto L1c
            goto L26
        L1c:
            agqv r2 = r0.g
            anhy r1 = r2.a(r15)
            return r1
        L23:
            r3 = 3
            if (r2 == r3) goto L32
        L26:
            boolean r2 = r14.l(r15)
            if (r2 == 0) goto L2d
            goto L32
        L2d:
            anhy r1 = r14.k(r15, r16, r17, r18)
            return r1
        L32:
            agqv r2 = r0.g
            anhy r2 = r2.b(r15)
            r3 = 2
            anhy r6 = j(r2, r3)
            anhy r1 = r14.k(r15, r16, r17, r18)
            r2 = 1
            anhy r5 = j(r1, r2)
            long r7 = r14.h()
            java.lang.Class<cnq> r1 = defpackage.cnq.class
            java.lang.Class<java.lang.NullPointerException> r2 = java.lang.NullPointerException.class
            java.lang.Class<aglr> r3 = defpackage.aglr.class
            java.lang.Class<aglu> r4 = defpackage.aglu.class
            java.lang.Class<android.database.sqlite.SQLiteException> r9 = android.database.sqlite.SQLiteException.class
            amsx r9 = defpackage.amsx.v(r1, r2, r3, r4, r9)
            anic r10 = r0.j
            agmu r11 = r0.k
            wgw r12 = defpackage.wgw.n
            r13 = 2
            r4 = r16
            anhy r1 = defpackage.aedn.H(r4, r5, r6, r7, r9, r10, r11, r12, r13)
            return r1
        L66:
            agqv r2 = r0.g
            anhy r1 = r2.b(r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqn.c(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, java.lang.String, int, aigd):anhy");
    }

    @Override // defpackage.aihk
    public final anhy d(PlaybackStartDescriptor playbackStartDescriptor) {
        return f(playbackStartDescriptor, aigd.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (r2 != 3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy e(defpackage.aiip r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = r11.c
            com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r1 = r11.a
            aigd r11 = r11.b
            int r2 = r1.A()
            boolean r3 = r1.t()
            if (r3 != 0) goto L70
            r3 = 5
            if (r2 != r3) goto L14
            goto L70
        L14:
            r3 = 4
            if (r2 != r3) goto L27
            agzz r2 = r10.l
            boolean r2 = r2.c()
            if (r2 != 0) goto L20
            goto L2a
        L20:
            agqv r11 = r10.g
            anhy r11 = r11.a(r1)
            return r11
        L27:
            r3 = 3
            if (r2 == r3) goto L3a
        L2a:
            boolean r2 = r10.l(r1)
            if (r2 == 0) goto L31
            goto L3a
        L31:
            aiiq r11 = r10.i(r1, r11, r0, r12)
            anhy r11 = r11.b()
            return r11
        L3a:
            agqv r2 = r10.g
            anhy r2 = r2.a(r1)
            r3 = 2
            anhy r2 = j(r2, r3)
            aiiq r11 = r10.i(r1, r11, r0, r12)
            anhy r11 = r11.b()
            r12 = 1
            anhy r1 = j(r11, r12)
            long r3 = r10.h()
            java.lang.Class<cnq> r11 = defpackage.cnq.class
            java.lang.Class<java.lang.NullPointerException> r12 = java.lang.NullPointerException.class
            java.lang.Class<aglr> r5 = defpackage.aglr.class
            java.lang.Class<aglu> r6 = defpackage.aglu.class
            java.lang.Class<android.database.sqlite.SQLiteException> r7 = android.database.sqlite.SQLiteException.class
            amsx r5 = defpackage.amsx.v(r11, r12, r5, r6, r7)
            anic r6 = r10.j
            agmu r7 = r10.k
            wgw r8 = defpackage.wgw.n
            r9 = 2
            anhy r11 = defpackage.aedn.H(r0, r1, r2, r3, r5, r6, r7, r8, r9)
            return r11
        L70:
            agqv r11 = r10.g
            anhy r11 = r11.a(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqn.e(aiip, boolean):anhy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r11.m.c().a(r12) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy f(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r12, defpackage.aigd r13) {
        /*
            r11 = this;
            boolean r0 = r12.t()
            if (r0 != 0) goto L76
            boolean r0 = r12.t()
            if (r0 != 0) goto L38
            agzz r0 = r11.l
            boolean r0 = r0.c()
            if (r0 == 0) goto L31
            aaea r0 = r11.i
            arfd r0 = r0.a()
            atph r0 = r0.g
            if (r0 != 0) goto L20
            atph r0 = defpackage.atph.a
        L20:
            boolean r0 = r0.k
            if (r0 == 0) goto L31
            agsg r0 = r11.m
            ammy r0 = r0.c()
            boolean r0 = r0.a(r12)
            if (r0 == 0) goto L31
            goto L38
        L31:
            aijg r0 = r11.c
            anhy r12 = r0.b(r12, r13)
            return r12
        L38:
            agrd r13 = r11.h
            r0 = 0
            anhy r3 = r13.b(r12, r0)
            aijg r13 = r11.c
            anhy r2 = r13.a(r12)
            aaea r12 = r11.i
            arfd r12 = r12.a()
            atph r12 = r12.g
            if (r12 != 0) goto L51
            atph r12 = defpackage.atph.a
        L51:
            int r13 = r12.b
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r13 = r13 & r0
            if (r13 == 0) goto L5c
            int r12 = r12.l
            long r12 = (long) r12
            goto L5e
        L5c:
            r12 = 1000(0x3e8, double:4.94E-321)
        L5e:
            r4 = r12
            r1 = 0
            java.lang.Class<cnq> r12 = defpackage.cnq.class
            java.lang.Class<java.lang.NullPointerException> r13 = java.lang.NullPointerException.class
            java.lang.Class<android.database.sqlite.SQLiteException> r0 = android.database.sqlite.SQLiteException.class
            amsx r6 = defpackage.amsx.t(r12, r13, r0)
            anic r7 = r11.j
            agmu r8 = r11.k
            wgw r9 = defpackage.wgw.o
            r10 = 3
            anhy r12 = defpackage.aedn.H(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r12
        L76:
            agrd r13 = r11.h
            r0 = 1
            anhy r12 = r13.b(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqn.f(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, aigd):anhy");
    }

    @Override // defpackage.aihd
    public final void g(PlaybackStartDescriptor playbackStartDescriptor, String str, Executor executor, aigd aigdVar) {
        if (this.n.n(playbackStartDescriptor)) {
            if (this.n.o()) {
                String h = playbackStartDescriptor.h(this.d);
                aarn b = this.a.b(playbackStartDescriptor, h, aigdVar);
                this.e.b(b.l(), new agqi(this, b, playbackStartDescriptor, h, aigdVar, 1), executor);
                return;
            }
            return;
        }
        this.b.e(playbackStartDescriptor, str, executor, aigdVar);
    }
}
