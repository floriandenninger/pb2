package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeia extends atb implements atr {
    private final atr b;
    private final boolean c;
    private volatile boolean d;
    private ByteBuffer e;
    private aehz f;
    private final afhs g;

    public aeia(atr atrVar, afhs afhsVar) {
        super(true);
        this.b = atrVar;
        this.g = afhsVar;
        this.c = atrVar instanceof aty;
    }

    @Override // defpackage.atb, defpackage.ate
    public final Map a() {
        return this.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        throw new defpackage.aehy(r3, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        if (r0.i == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0096, code lost:
    
        if (r0.e.b() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        throw new defpackage.aehy(4, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
    
        r0.f = true;
     */
    @Override // defpackage.atc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeia.g(byte[], int, int):int");
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        if (!this.c) {
            e(athVar);
            long h = this.b.h(athVar);
            f(athVar);
            this.d = true;
            return h;
        }
        Uri uri = athVar.a;
        if (uri == null || !TextUtils.equals(uri.getPath(), "/videoplayback")) {
            return this.b.h(athVar);
        }
        zhy b = zhy.b(athVar.a);
        b.g("ump", "1");
        if (athVar.g != 0 || athVar.h != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(athVar.g);
            sb.append("-");
            if (athVar.h != -1) {
                sb.append((athVar.g + r8) - 1);
            }
            b.g("range", sb.toString());
        }
        atg a = athVar.a();
        a.a = b.a();
        a.f = 0L;
        a.b = athVar.b + athVar.g;
        a.g = -1L;
        ath a2 = a.a();
        e(athVar);
        long h2 = this.b.h(a2);
        try {
            if (aefw.c(a())) {
                ByteBuffer byteBuffer = this.e;
                if (byteBuffer != null) {
                } else {
                    this.e = ByteBuffer.allocateDirect(32768);
                }
                this.f = new aehz((aty) this.b, a2, this.e, this.g);
            }
        } catch (aefs unused) {
        }
        f(athVar);
        this.d = true;
        return h2;
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.b.i();
    }

    @Override // defpackage.ate
    public final void j() {
        this.f = null;
        this.b.j();
        if (this.d) {
            d();
            this.d = false;
        }
    }

    @Override // defpackage.atr
    public final int k() {
        return this.b.k();
    }

    @Override // defpackage.atr
    public final void l() {
        this.b.l();
    }

    @Override // defpackage.atr
    public final void m(String str, String str2) {
        this.b.m(str, str2);
    }
}
