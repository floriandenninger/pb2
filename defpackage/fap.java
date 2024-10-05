package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fap implements fjt {
    static final String[] a = {".loadingWhatToWatchBrowse", ".offlineAccountBrowse", ".loadingAccountBrowse"};
    public final afsy b;
    public final shf c;
    public final Executor d;
    public final fae e;
    public final aarr f;
    fan g;
    fan h;
    fan i;
    fan j;
    fan k;
    fan l;
    private final File m;

    public fap(Context context, afsy afsyVar, shf shfVar, Executor executor, fae faeVar, faa faaVar, aadr aadrVar, aarr aarrVar) {
        this.b = afsyVar;
        this.c = shfVar;
        this.d = executor;
        this.m = new File(context.getFilesDir(), "offline");
        this.e = faeVar;
        this.f = aarrVar;
        if (faaVar.a()) {
            try {
                if (((Boolean) aadrVar.b().get()).booleanValue()) {
                    String[] strArr = a;
                    for (int i = 0; i < 3; i++) {
                        f(strArr[i]).a();
                    }
                    e().d();
                    d().d();
                    m().d();
                    c().d();
                    b().d();
                    a().d();
                }
            } catch (InterruptedException | ExecutionException e) {
                afsi.c(2, 18, "Failed to get the fail safe status", e);
            }
        }
    }

    private final synchronized fan m() {
        if (this.i == null) {
            this.i = new faj(this, f(".generatedSingleTabAccountBrowseResponse"));
        }
        return this.i;
    }

    public final synchronized fan a() {
        if (this.l == null) {
            this.l = new fah(this, f(".guide"));
        }
        return this.l;
    }

    public final synchronized fan b() {
        if (this.k == null) {
            this.k = new fal(this, f(".loadingLibraryBrowse"));
        }
        return this.k;
    }

    public final synchronized fan c() {
        if (this.j == null) {
            this.j = new fak(this, f(".offlineCloudSingleTabBrowse"));
        }
        return this.j;
    }

    public final synchronized fan d() {
        if (this.h == null) {
            this.h = new fai(this, f(".offlineLibraryBrowse"));
        }
        return this.h;
    }

    public final synchronized fan e() {
        if (this.g == null) {
            this.g = new fag(this, f(".settings"));
        }
        return this.g;
    }

    final fao f(String str) {
        return new fao(new File(this.m, str));
    }

    public final BrowseResponseModel g() {
        BrowseResponseModel browseResponseModel = (BrowseResponseModel) d().c();
        return browseResponseModel == null ? new BrowseResponseModel(this.e.a()) : browseResponseModel;
    }

    @Override // defpackage.fjt
    public final anhy h() {
        try {
            arjv i = i();
            return anaf.O(Boolean.valueOf(i != null && i.s));
        } catch (IOException e) {
            zga.d("Failed to fetch offline browse", e);
            return anaf.O(false);
        }
    }

    public final arjv i() {
        return (arjv) c().c();
    }

    public final void j(abci abciVar) {
        abciVar.getClass();
        e().e(abciVar);
    }

    @Override // defpackage.fjt
    public final boolean k() {
        try {
            return ((Boolean) h().get(500L, TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e) {
            zga.d("Failed to set access to offline", e);
            return false;
        } catch (TimeoutException e2) {
            zga.d("Timed out getting access to offline", e2);
            return false;
        }
    }

    public final void l(arjv arjvVar) {
        b().e(arjvVar);
    }
}
