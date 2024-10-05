package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ppb extends ple implements Handler.Callback {
    private final poz a;
    private final ppa b;
    private final Handler c;
    private pox d;
    private boolean e;
    private boolean f;
    private long g;
    private long h;
    private Metadata i;
    private final ppz j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppb(ppa ppaVar, Looper looper) {
        super(5);
        poz pozVar = poz.a;
        pse.c(ppaVar);
        this.b = ppaVar;
        this.c = looper == null ? null : pts.w(looper, this);
        this.a = pozVar;
        this.j = new ppz(null);
        this.h = -9223372036854775807L;
    }

    private final void b(Metadata metadata, List list) {
        for (int i = 0; i < metadata.a(); i++) {
            pms a = metadata.b(i).a();
            if (a == null || !this.a.b(a)) {
                list.add(metadata.b(i));
            } else {
                pox a2 = this.a.a(a);
                byte[] bArr = (byte[]) pse.c(metadata.b(i).c());
                this.j.clear();
                this.j.b(bArr.length);
                ByteBuffer byteBuffer = this.j.b;
                int i2 = pts.a;
                byteBuffer.put(bArr);
                this.j.c();
                Metadata a3 = a2.a(this.j);
                if (a3 != null) {
                    b(a3, list);
                }
            }
        }
    }

    private final void c(Metadata metadata) {
        pok pokVar = (pok) this.b;
        pokVar.a.e.ak();
        pme pmeVar = pokVar.a.c;
        pne a = pmeVar.t.a();
        for (int i = 0; i < metadata.a(); i++) {
            metadata.b(i).b(a);
        }
        pnf a2 = a.a();
        if (!a2.equals(pmeVar.t)) {
            pmeVar.t = a2;
            pmeVar.f.f(14, new pma(pmeVar, 1));
        }
        Iterator it = pokVar.a.d.iterator();
        while (it.hasNext()) {
            ((pny) it.next()).ak();
        }
    }

    @Override // defpackage.ple
    protected final void K(pms[] pmsVarArr, long j, long j2) {
        this.d = this.a.a(pmsVarArr[0]);
    }

    @Override // defpackage.pof
    public final int a(pms pmsVar) {
        if (this.a.b(pmsVar)) {
            return pmsVar.G == 0 ? 4 : 2;
        }
        return 0;
    }

    @Override // defpackage.poe, defpackage.pof
    public final String d() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            c((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ple
    protected final void k() {
        this.i = null;
        this.h = -9223372036854775807L;
        this.d = null;
    }

    @Override // defpackage.ple
    protected final void m(long j, boolean z) {
        this.i = null;
        this.h = -9223372036854775807L;
        this.e = false;
        this.f = false;
    }

    @Override // defpackage.poe
    public final void p(long j, long j2) {
        boolean z;
        do {
            z = false;
            if (!this.e && this.i == null) {
                this.j.clear();
                pmt al = al();
                int af = af(al, this.j, 0);
                if (af == -4) {
                    if (this.j.isEndOfStream()) {
                        this.e = true;
                    } else {
                        ppz ppzVar = this.j;
                        ppzVar.f = this.g;
                        ppzVar.c();
                        pox poxVar = this.d;
                        int i = pts.a;
                        Metadata a = poxVar.a(this.j);
                        if (a != null) {
                            ArrayList arrayList = new ArrayList(a.a());
                            b(a, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.i = new Metadata(arrayList);
                                this.h = this.j.d;
                            }
                        }
                    }
                } else if (af == -5) {
                    pms pmsVar = al.b;
                    pse.c(pmsVar);
                    this.g = pmsVar.r;
                }
            }
            Metadata metadata = this.i;
            if (metadata != null && this.h <= j) {
                Handler handler = this.c;
                if (handler != null) {
                    handler.obtainMessage(0, metadata).sendToTarget();
                } else {
                    c(metadata);
                }
                this.i = null;
                this.h = -9223372036854775807L;
                z = true;
            }
            if (this.e && this.i == null) {
                this.f = true;
            }
        } while (z);
    }

    @Override // defpackage.poe
    public final boolean r() {
        return this.f;
    }

    @Override // defpackage.poe
    public final boolean s() {
        return true;
    }
}
