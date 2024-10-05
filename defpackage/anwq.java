package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anwq implements anwx {
    final FirebaseInstanceId a;

    public anwq(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.anwx
    public final rpt a() {
        String e = this.a.e();
        if (e != null) {
            return rqr.c(e);
        }
        FirebaseInstanceId firebaseInstanceId = this.a;
        FirebaseInstanceId.g(firebaseInstanceId.d);
        return firebaseInstanceId.a(anwp.e(firebaseInstanceId.d), "*").a(qxc.d);
    }

    @Override // defpackage.anwx
    public final void b(anyn anynVar) {
        this.a.h.add(anynVar);
    }

    @Override // defpackage.anwx
    public final void c() {
        this.a.e();
    }
}
