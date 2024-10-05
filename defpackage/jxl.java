package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jxl implements fjp {
    public final jxi a;
    private final Executor b;
    private final Executor c;
    private final /* synthetic */ int d;

    public jxl(jxi jxiVar, Executor executor, Executor executor2, int i) {
        this.d = i;
        this.a = jxiVar;
        this.b = executor;
        this.c = executor2;
    }

    public static /* synthetic */ void a(Throwable th) {
        zga.d("Failed to get the PlaybackDataEntity and OfflineVideoPolicy from YtMainDownloadedVideoEntity.", th);
    }

    public static /* synthetic */ void c(Throwable th) {
        zga.d("Failed to get the PlaybackDataEntity and OfflineVideoPolicy from MainVideoEntity.", th);
    }

    @Override // defpackage.fjp
    public final void b(final String str, final jmt jmtVar, final Optional optional) {
        if (this.d == 0) {
            ynm.k(anaf.S(new jnb(jmtVar, 9), this.c), this.b, jun.i, new ynl() { // from class: jxk
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    jxl jxlVar = jxl.this;
                    ammw ammwVar = (ammw) obj;
                    jxlVar.a.d(str, jmtVar, (Optional) ammwVar.a, (Optional) ammwVar.b, optional);
                }
            });
        } else {
            ynm.k(anaf.S(new jnb(jmtVar, 8), this.c), this.b, jun.h, new ynl(str, jmtVar, optional, null) { // from class: jxj
                public final /* synthetic */ String a;
                public final /* synthetic */ jmt b;
                public final /* synthetic */ Optional c;

                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    jxl jxlVar = jxl.this;
                    ammw ammwVar = (ammw) obj;
                    jxlVar.a.d(this.a, this.b, (Optional) ammwVar.a, (Optional) ammwVar.b, this.c);
                }
            });
        }
    }
}
