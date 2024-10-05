package defpackage;

import android.os.Handler;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class que {
    public final qtw a;
    public final Handler b;
    public final Map c;
    public final DroidGuardResultsRequest d;
    public final quq e;
    public final qum f;
    public final qtx g;
    private boolean h = false;

    public que(qtw qtwVar, Handler handler, Map map, DroidGuardResultsRequest droidGuardResultsRequest, quq quqVar, qum qumVar, qtx qtxVar) {
        this.a = qtwVar;
        this.b = handler;
        this.c = map;
        this.d = droidGuardResultsRequest;
        this.e = quqVar;
        this.f = qumVar;
        this.g = qtxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final String str) {
        synchronized (this) {
            if (this.h) {
                return;
            }
            this.h = true;
            try {
                this.b.post(new Runnable() { // from class: qud
                    @Override // java.lang.Runnable
                    public final void run() {
                        que queVar = que.this;
                        queVar.g.a(str);
                    }
                });
            } catch (RuntimeException unused) {
            }
        }
    }
}
