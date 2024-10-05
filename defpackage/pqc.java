package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pqc extends ple implements Handler.Callback {
    public long a;
    private final Handler b;
    private final pqb c;
    private final pmt d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private pms i;
    private ppx j;
    private ppz k;
    private pqa l;
    private pqa m;
    private int n;

    public pqc(pqb pqbVar, Looper looper) {
        super(3);
        pse.c(pqbVar);
        this.c = pqbVar;
        this.b = looper == null ? null : pts.w(looper, this);
        this.d = new pmt();
        this.a = -9223372036854775807L;
    }

    private final long b() {
        if (this.n == -1) {
            return Long.MAX_VALUE;
        }
        pse.c(this.l);
        if (this.n >= this.l.a()) {
            return Long.MAX_VALUE;
        }
        return this.l.c(this.n);
    }

    private final void c() {
        t(Collections.emptyList());
    }

    private final void e(ppy ppyVar) {
        String valueOf = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        prh.j("TextRenderer", sb.toString(), ppyVar);
        c();
        q();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r2.equals("text/x-ssa") != false) goto L44;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0093. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqc.f():void");
    }

    private final void g() {
        this.k = null;
        this.n = -1;
        pqa pqaVar = this.l;
        if (pqaVar != null) {
            pqaVar.release();
            this.l = null;
        }
        pqa pqaVar2 = this.m;
        if (pqaVar2 != null) {
            pqaVar2.release();
            this.m = null;
        }
    }

    private final void h() {
        g();
        ppx ppxVar = this.j;
        pse.c(ppxVar);
        ppxVar.f();
        this.j = null;
        this.h = 0;
    }

    private final void q() {
        h();
        f();
    }

    private final void t(List list) {
        Handler handler = this.b;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            u();
        }
    }

    private final void u() {
        Iterator it = ((pok) this.c).a.d.iterator();
        while (it.hasNext()) {
            ((pny) it.next()).W();
        }
    }

    @Override // defpackage.ple
    protected final void K(pms[] pmsVarArr, long j, long j2) {
        this.i = pmsVarArr[0];
        if (this.j != null) {
            this.h = 1;
        } else {
            f();
        }
    }

    @Override // defpackage.pof
    public final int a(pms pmsVar) {
        String str = pmsVar.n;
        return ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) ? pmsVar.G == 0 ? 4 : 2 : psz.k(pmsVar.n) ? 1 : 0;
    }

    @Override // defpackage.poe, defpackage.pof
    public final String d() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            u();
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ple
    protected final void k() {
        this.i = null;
        this.a = -9223372036854775807L;
        c();
        h();
    }

    @Override // defpackage.ple
    protected final void m(long j, boolean z) {
        c();
        this.e = false;
        this.f = false;
        this.a = -9223372036854775807L;
        if (this.h != 0) {
            q();
            return;
        }
        g();
        ppx ppxVar = this.j;
        pse.c(ppxVar);
        ppxVar.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x009d, code lost:
    
        if (r10 != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[EXC_TOP_SPLITTER, LOOP:1: B:44:0x00b1->B:64:0x00b1, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.poe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqc.p(long, long):void");
    }

    @Override // defpackage.poe
    public final boolean r() {
        return this.f;
    }

    @Override // defpackage.poe
    public final boolean s() {
        return true;
    }
}
