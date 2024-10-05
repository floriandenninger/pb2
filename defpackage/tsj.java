package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsj implements tsp {
    private final trh a;
    private final vcw b;
    private final tkt c;
    private final String d;
    private final tss e;
    private final tld f;
    private final int g;
    private final long h;
    private final String i;
    private final Executor j;
    private final int k;

    public tsj(trh trhVar, vcw vcwVar, tkt tktVar, int i, tss tssVar, tld tldVar, int i2, long j, String str, Executor executor) {
        this.a = trhVar;
        this.b = vcwVar;
        this.c = tktVar;
        this.k = i;
        this.d = rwh.aP(tktVar);
        this.e = tssVar;
        this.f = tldVar;
        this.g = i2;
        this.h = j;
        this.i = str;
        this.j = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anhy c(final tlc tlcVar, tkt tktVar, int i, final trh trhVar, final Executor executor) {
        final tlg be = rwh.be(tktVar, i);
        return anfq.i(trhVar.e(be), new anfz() { // from class: tsi
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tlg tlgVar = tlg.this;
                tlc tlcVar2 = tlcVar;
                trh trhVar2 = trhVar;
                Executor executor2 = executor;
                tlh tlhVar = (tlh) obj;
                if (tlhVar == null) {
                    tsx.d("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", tlgVar);
                    tkj a = tkl.a();
                    a.a = tkk.SHARED_FILE_NOT_FOUND_ERROR;
                    return anaf.N(a.a());
                }
                aone builder = tlhVar.toBuilder();
                builder.copyOnWrite();
                tlh tlhVar2 = (tlh) builder.instance;
                tlhVar2.d = tlcVar2.h;
                tlhVar2.b |= 2;
                return anfq.i(trhVar2.g(tlgVar, (tlh) builder.build()), new trb(tlgVar, 3), executor2);
            }
        }, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0150, code lost:
    
        r20 = r5.a(r0);
        r22 = r5.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015a, code lost:
    
        if (r20 <= r22) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015c, code lost:
    
        r4 = defpackage.andw.a.createBuilder();
        r14 = r8.c;
        r4.copyOnWrite();
        r15 = (defpackage.andw) r4.instance;
        r14.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016e, code lost:
    
        r26 = "DownloaderCallbackImpl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0170, code lost:
    
        r15.b |= 1;
        r15.c = r14;
        r4.copyOnWrite();
        r6 = (defpackage.andw) r4.instance;
        r6.b |= 2;
        r6.d = r9;
        r4.copyOnWrite();
        r6 = (defpackage.andw) r4.instance;
        r6.b |= 32;
        r6.h = r10;
        r4.copyOnWrite();
        r6 = (defpackage.andw) r4.instance;
        r12.getClass();
        r6.b |= 64;
        r6.i = r12;
        r6 = r8.d;
        r4.copyOnWrite();
        r7 = (defpackage.andw) r4.instance;
        r6.getClass();
        r7.b |= 4;
        r7.e = r6;
        r3.k((defpackage.andw) r4.build(), 3, r20, r22, r13.c, 0);
     */
    @Override // defpackage.tsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy a(android.net.Uri r28) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsj.a(android.net.Uri):anhy");
    }

    @Override // defpackage.tsp
    public final anhy b() {
        int i = tsx.a;
        return c(tlc.DOWNLOAD_FAILED, this.c, this.k, this.a, this.j);
    }
}
