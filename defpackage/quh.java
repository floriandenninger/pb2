package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class quh {
    final String d;
    public final quq f;
    boolean g = false;
    public final DroidGuardResultsRequest e = new DroidGuardResultsRequest();

    public quh(String str) {
        qur qurVar;
        int i = 0;
        this.d = str;
        if (axtc.b()) {
            String[] split = axtc.a.get().a().split(",");
            int length = split.length;
            while (true) {
                if (i >= length) {
                    qurVar = qur.COARSE;
                    break;
                } else {
                    if (str.equals(split[i])) {
                        qurVar = qur.FINE;
                        break;
                    }
                    i++;
                }
            }
            this.f = new qus(qurVar);
            return;
        }
        this.f = new qun();
    }

    private final synchronized void c(qtw qtwVar) {
        if (this.g) {
            qtwVar.b();
            return;
        }
        this.g = true;
        try {
            a(qtwVar);
        } catch (Exception unused) {
        }
    }

    protected void a(qtw qtwVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(qtw qtwVar) {
        if (!axsz.b()) {
            c(qtwVar);
            return;
        }
        synchronized (this) {
            if (this.g) {
                qtwVar.b();
                return;
            }
            this.g = true;
            try {
                a(qtwVar);
            } catch (Exception unused) {
            }
        }
    }
}
