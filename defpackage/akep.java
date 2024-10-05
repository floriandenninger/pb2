package defpackage;

import android.text.TextUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akep implements akdg, akdm {
    public final akey a;
    public final Semaphore b;
    public aksl c;
    public acsy d;
    private final ysl e;
    private final shf f;

    public akep(ysl yslVar, akey akeyVar, shf shfVar) {
        yslVar.getClass();
        this.e = yslVar;
        this.a = akeyVar;
        this.f = shfVar;
        this.b = new Semaphore(4, true);
    }

    @Override // defpackage.akdg
    public final void a(aksl akslVar) {
        throw null;
    }

    public final akdy b(akel akelVar) {
        if (!akelVar.b()) {
            if (!TextUtils.isEmpty(null)) {
                return new akdk().d();
            }
            try {
                this.b.acquire();
                akex a = akelVar.a();
                a.c = this.d;
                shf shfVar = this.f;
                int d = shfVar != null ? (int) shfVar.d() : 0;
                anhy b = this.e.b(a);
                b.d(new Runnable() { // from class: akeo
                    @Override // java.lang.Runnable
                    public final void run() {
                        akep.this.b.release();
                    }
                }, angq.a);
                try {
                    akeb akebVar = (akeb) ((cnm) b.get()).a;
                    akebVar.j(akmq.c(akelVar));
                    if (akebVar == null) {
                        String valueOf = String.valueOf(akelVar.d);
                        akmq.d(valueOf.length() != 0 ? "Suggest returned a null response for query: ".concat(valueOf) : new String("Suggest returned a null response for query: "));
                        return null;
                    }
                    shf shfVar2 = this.f;
                    int d2 = shfVar2 != null ? (int) shfVar2.d() : 0;
                    akebVar.a(this.c);
                    akdy d3 = akebVar.d();
                    if (d3 != null) {
                        d3.f = akebVar.ob();
                        akmq.g(d3);
                        d3.d = d2 - d;
                    }
                    if (this.a != null && akelVar.d.isEmpty()) {
                        this.a.e(akebVar);
                    }
                    return d3;
                } catch (InterruptedException unused) {
                    b.cancel(true);
                }
            } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            }
        }
        return null;
    }

    @Override // defpackage.akdm
    public final acsy c() {
        return this.d;
    }

    public final boolean d(akel akelVar) {
        if (!akelVar.b()) {
            return false;
        }
        akex a = akelVar.a();
        a.c = this.d;
        a.b = true;
        try {
            if (((akeb) ((cnm) this.e.b(a).get()).a) == null) {
                return false;
            }
            akey akeyVar = this.a;
            if (akeyVar != null) {
                akeyVar.d();
            }
            return true;
        } catch (InterruptedException | CancellationException unused) {
            return false;
        } catch (ExecutionException e) {
            akmq.e("Suggest deletion task threw an exception", e);
            return false;
        }
    }
}
