package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.widget.EditText;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zrx {
    public final zsa a;
    public final zqc b;
    private final zqi c;

    public zrx(zqc zqcVar, zqi zqiVar) {
        zsa zsaVar = new zsa(zqcVar);
        this.b = zqcVar;
        this.c = zqiVar;
        this.a = zsaVar;
    }

    public static final Rect i(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getHitRect(rect);
        return rect;
    }

    public static final Rect j(EditText editText) {
        Rect rect = new Rect();
        editText.getHitRect(rect);
        return rect;
    }

    public final void a(axdk axdkVar) {
        this.b.b(axdkVar);
    }

    public final void b(axdj axdjVar) {
        this.b.b((axdk) axdjVar.build());
    }

    public final void c(zqj zqjVar) {
        zqi zqiVar = this.c;
        synchronized (zqiVar.d) {
            zqiVar.b.add(zqjVar);
        }
    }

    public final void d(zqj zqjVar) {
        zqi zqiVar = this.c;
        synchronized (zqiVar.d) {
            zqiVar.b.remove(zqjVar);
        }
    }

    public final void e(boolean z, zrz zrzVar) {
        f(z, amlr.a, zrzVar);
    }

    public final void f(boolean z, ammv ammvVar, zrz zrzVar) {
        zqi zqiVar = this.c;
        synchronized (zqiVar.d) {
            zqiVar.a.add(zrzVar);
        }
        if (ammvVar.h()) {
            zqi zqiVar2 = this.c;
            String str = (String) ammvVar.c();
            synchronized (zqiVar2.d) {
                zqiVar2.c = ammv.j(str);
            }
        }
        zqc zqcVar = this.b;
        axcm a = axcn.a();
        a.copyOnWrite();
        ((axcn) a.instance).d(z);
        axcn axcnVar = (axcn) a.build();
        axcl a2 = axcq.a();
        a2.copyOnWrite();
        ((axcq) a2.instance).u(axcnVar);
        zqcVar.a.add((axcq) a2.build());
        zqb zqbVar = zqcVar.c;
        if (zqbVar != null) {
            zqbVar.b();
        }
    }

    public final void g(String str) {
        new zrw(this, str).execute(new Void[0]);
    }

    public final void h(String str) {
        File file = new File(str);
        byte[] bArr = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            aekb aekbVar = new aekb(null, null);
            anbt.g(fileInputStream, aekbVar);
            bArr = aekbVar.toByteArray();
        } catch (IOException e) {
            zga.d("Error reading video effects state file", e);
        }
        if (bArr != null) {
            try {
                axdu d = axdu.d(bArr, aomw.b());
                zqc zqcVar = this.b;
                axcl a = axcq.a();
                a.copyOnWrite();
                ((axcq) a.instance).A(d);
                zqcVar.a.add((axcq) a.build());
            } catch (aoob e2) {
                zga.d("Unable to parse video effect state event", e2);
            }
        }
    }

    public final zqm k(ammv ammvVar) {
        final zqm[] zqmVarArr = new zqm[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        f(false, ammvVar, new zrz() { // from class: zrv
            @Override // defpackage.zrz
            public final void a(File file, axdu axduVar) {
                zqm[] zqmVarArr2 = zqmVarArr;
                CountDownLatch countDownLatch2 = countDownLatch;
                zqmVarArr2[0] = zqm.c(ammv.i(axduVar), ammv.i(file));
                countDownLatch2.countDown();
            }
        });
        try {
            countDownLatch.await(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            afsi.c(2, 9, "Failure to block on getting video effects state", e);
        }
        zqm zqmVar = zqmVarArr[0];
        return zqmVar == null ? zqm.d() : zqmVar;
    }

    public final void l(aone aoneVar) {
        zqc zqcVar = this.b;
        axcg axcgVar = (axcg) aoneVar.build();
        axcl a = axcq.a();
        a.copyOnWrite();
        ((axcq) a.instance).t(axcgVar);
        a.toString();
        zqcVar.a.add((axcq) a.build());
    }
}
