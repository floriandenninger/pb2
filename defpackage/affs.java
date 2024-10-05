package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class affs implements affu {
    private final Context a;
    private roe b;
    private qmy c;
    private final AtomicBoolean d = new AtomicBoolean();

    public affs(Context context) {
        this.a = context;
    }

    @Override // defpackage.affu
    public final afft a(final byte[] bArr, final int i, auic auicVar) {
        qpy qpyVar;
        b();
        qog qogVar = this.b;
        afki.a(this.c);
        afki.a(qogVar);
        int i2 = auicVar.g;
        qip.az(qogVar, "Requested API must not be null.");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(qogVar);
        arrayList.addAll(Arrays.asList(new qog[0]));
        synchronized (qpy.c) {
            qip.az(qpy.d, "Must guarantee manager is non-null before using getInstance");
            qpyVar = qpy.d;
        }
        qoy qoyVar = new qoy(arrayList);
        Handler handler = qpyVar.o;
        handler.sendMessage(handler.obtainMessage(2, qoyVar));
        rqr.e(qoyVar.b.a.d(qmw.a), i2, TimeUnit.MILLISECONDS);
        int i3 = auicVar.f;
        qrd b = qre.b();
        b.b = new Feature[]{rod.a};
        b.a = new qqu() { // from class: rog
            @Override // defpackage.qqu
            public final void a(Object obj, Object obj2) {
                int i4 = i;
                byte[] bArr2 = bArr;
                qdm qdmVar = new qdm((rpv) obj2, 7, (byte[][]) null);
                rof rofVar = (rof) ((roj) obj).D();
                Parcel pn = rofVar.pn();
                ecr.i(pn, qdmVar);
                pn.writeInt(i4);
                pn.writeByteArray(bArr2);
                rofVar.pp(3, pn);
            }
        };
        return (afft) anfq.h(rwh.Y(((qob) qogVar).t(b.a())), adpv.n, angq.a).get(i3, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.affu
    public final void b() {
        if (this.d.getAndSet(true)) {
            return;
        }
        this.b = new roi(this.a);
        this.c = qmy.a;
    }
}
