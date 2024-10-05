package defpackage;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrq {
    public static final hrp a = new hrp();
    public final akwd b;
    public final akyb c;
    public final akvf d;
    public String e;
    public boolean f;
    private final Executor g;

    public hrq(akwd akwdVar, akyb akybVar, akvf akvfVar, hrv hrvVar, Executor executor) {
        this.b = akwdVar;
        this.c = akybVar;
        this.d = akvfVar;
        this.g = executor;
        autm autmVar = hrvVar.a.a().z;
        this.f = (autmVar == null ? autm.a : autmVar).s;
    }

    public final ammv a(anhy anhyVar) {
        try {
            return (ammv) anhyVar.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            amlr amlrVar = amlr.a;
            afsi.c(2, 6, "[ShortsCreation][Android][Upload]Failure while retrieving upload.", e);
            return amlrVar;
        }
    }

    public final void b() {
        if (this.f) {
            c("Failure while clearing files to delete after upload.", this.d.f(this.e));
        }
    }

    public final void c(String str, anhy anhyVar) {
        ynm.j(anhyVar, this.g, new hro(str, 0));
    }

    public final void d(Uri uri) {
        if (this.f) {
            c("Failure while setting source URI.", this.d.n(this.e, uri));
        }
    }

    public final void e(boolean z) {
        if (this.f) {
            c("Failure while setting upload flow flavor.", this.d.M(this.e, true != z ? 2 : 7));
        }
    }
}
