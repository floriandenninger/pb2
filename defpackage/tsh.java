package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsh implements tsp {
    public final Context a;
    public final trh b;
    public final vcw c;
    public final tme d;
    public final tkt e;
    public final tmj f;
    public final tkw g;
    public final tss h;
    public final tld i;
    public final int j;
    public final long k;
    public final String l;
    public final ammv m;
    public final Executor n;
    public final int o;

    public tsh(Context context, trh trhVar, vcw vcwVar, tme tmeVar, tkt tktVar, int i, tmj tmjVar, tkw tkwVar, tss tssVar, tld tldVar, int i2, long j, String str, ammv ammvVar, Executor executor) {
        this.a = context;
        this.b = trhVar;
        this.c = vcwVar;
        this.d = tmeVar;
        this.e = tktVar;
        this.o = i;
        this.f = tmjVar;
        this.g = tkwVar;
        this.h = tssVar;
        this.i = tldVar;
        this.j = i2;
        this.k = j;
        this.l = str;
        this.m = ammvVar;
        this.n = executor;
    }

    @Override // defpackage.tsp
    public final anhy a(final Uri uri) {
        int i = tsx.a;
        if (!tsk.c(this.c, uri, this.g.e)) {
            tsx.e("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, this.g.e);
            tkj a = tkl.a();
            a.a = tkk.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            return anaf.N(a.a());
        }
        final Uri bc = rwh.bc(uri);
        aone createBuilder = tlg.a.createBuilder();
        tks tksVar = this.g.g;
        if (tksVar == null) {
            tksVar = tks.a;
        }
        String str = tksVar.b;
        createBuilder.copyOnWrite();
        tlg tlgVar = (tlg) createBuilder.instance;
        str.getClass();
        tlgVar.b |= 4;
        tlgVar.e = str;
        int i2 = this.o;
        createBuilder.copyOnWrite();
        tlg tlgVar2 = (tlg) createBuilder.instance;
        tlgVar2.f = i2 - 1;
        tlgVar2.b |= 8;
        final tlg tlgVar3 = (tlg) createBuilder.build();
        return anfq.i(anfq.i(this.b.e(tlgVar3), new anfz() { // from class: tsg
            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
            @Override // defpackage.anfz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final defpackage.anhy a(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 326
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tsg.a(java.lang.Object):anhy");
            }
        }, this.n), new anfz() { // from class: tsf
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                tsh tshVar = tsh.this;
                Uri uri2 = bc;
                if (!tsk.c(tshVar.c, uri2, tshVar.e.g)) {
                    tsx.d("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", uri2);
                    tkj a2 = tkl.a();
                    a2.a = tkk.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                    return anaf.N(a2.a());
                }
                return tsj.c(tlc.DOWNLOAD_COMPLETE, tshVar.e, tshVar.o, tshVar.b, tshVar.n);
            }
        }, this.n);
    }

    @Override // defpackage.tsp
    public final anhy b() {
        String str = this.e.g;
        int i = tsx.a;
        return tsj.c(tlc.DOWNLOAD_FAILED, this.e, this.o, this.b, this.n);
    }
}
