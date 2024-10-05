package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alqp implements Runnable {
    final /* synthetic */ alqv a;
    final /* synthetic */ alqq b;

    public alqp(alqq alqqVar, alqv alqvVar) {
        this.b = alqqVar;
        this.a = alqvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        alqn alqnVar = this.b.a;
        alqv alqvVar = this.a;
        List list = alqvVar.a;
        List c = alqq.c(alqvVar.b);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(list));
        }
        if (!c.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(c));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        alqnVar.f(alqz.b(bundle));
    }
}
