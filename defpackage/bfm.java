package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfm implements bfs {
    @Override // defpackage.bfs
    public final int a(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // defpackage.bfs
    public final long b(bfr bfrVar) {
        IOException iOException = bfrVar.b;
        if ((iOException instanceof pnr) || (iOException instanceof FileNotFoundException) || (iOException instanceof atl) || (iOException instanceof bfy) || atf.ro(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((bfrVar.c - 1) * 1000, 5000);
    }

    @Override // defpackage.bfs
    public final /* synthetic */ void c(long j) {
    }

    @Override // defpackage.bfs
    public final affp d(bfq bfqVar, bfr bfrVar) {
        throw null;
    }
}
