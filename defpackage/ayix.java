package defpackage;

import io.grpc.Status;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayix extends ayfh {
    private static final aybd A;
    public static final ayca m;
    public Status n;
    public aycd o;
    public Charset p;
    public boolean q;
    public final Object r;
    public final Collection s;
    public boolean t;
    public boolean u;
    public int v;
    public Status w;
    public boolean x;
    public boolean y;
    public final /* synthetic */ ayex z;

    static {
        ayiw ayiwVar = new ayiw(0);
        A = ayiwVar;
        m = aybe.b(":status", ayiwVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayix(ayex ayexVar, int i, ayoa ayoaVar, Object obj, ayoj ayojVar) {
        super(i, ayoaVar, ayojVar);
        this.z = ayexVar;
        this.p = amme.c;
        this.s = new ArrayList();
        this.u = false;
        this.r = obj;
    }

    public static Charset g(aycd aycdVar) {
        String str = (String) aycdVar.b(ayiu.g);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return amme.c;
    }

    public static void h(aycd aycdVar) {
        aycdVar.d(m);
        aycdVar.d(aybf.b);
        aycdVar.d(aybf.a);
    }

    public static final Status i(aycd aycdVar) {
        Integer num = (Integer) aycdVar.b(m);
        if (num == null) {
            return Status.n.withDescription("Missing HTTP status code");
        }
        String str = (String) aycdVar.b(ayiu.g);
        if (ayiu.g(str)) {
            return null;
        }
        Status a = ayiu.a(num.intValue());
        String valueOf = String.valueOf(str);
        return a.a(valueOf.length() != 0 ? "invalid content-type: ".concat(valueOf) : new String("invalid content-type: "));
    }

    @Override // defpackage.aylj
    public final void j(int i) {
        BidirectionalStream bidirectionalStream = this.z.k;
        bidirectionalStream.getClass();
        int i2 = this.v - i;
        this.v = i2;
        if (i2 != 0 || this.x) {
            return;
        }
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // defpackage.aylj
    public final void k(Throwable th) {
        l(Status.b(th), true, new aycd());
    }

    public final void l(Status status, boolean z, aycd aycdVar) {
        BidirectionalStream bidirectionalStream = this.z.k;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        f(status, z, aycdVar);
    }

    public final void m() {
        amkq.N(this.i != null);
        synchronized (this.b) {
            amkq.O(!this.f, "Already allocated");
            this.f = true;
        }
        super.b();
    }
}
