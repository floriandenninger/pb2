package defpackage;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aitv implements Callable {
    private final ate a;
    private final aitq b;
    private final Uri c;

    public aitv(ate ateVar, Uri uri, aitq aitqVar) {
        this.b = aitqVar;
        this.a = ateVar;
        this.c = uri;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        char c;
        deu deuVar;
        ath athVar = new ath(this.c, 0L, -1L, null);
        bez bezVar = new bez();
        bgi bgiVar = new bgi(this.a, bezVar);
        bgiVar.h(athVar);
        do {
        } while (bgiVar.g(new byte[8192], 0, 8192) > 0);
        bgiVar.j();
        ByteArrayOutputStream byteArrayOutputStream = bezVar.a;
        byte[] byteArray = byteArrayOutputStream == null ? null : byteArrayOutputStream.toByteArray();
        if (byteArray == null || byteArray.length == 0) {
            throw new IOException("Received empty segment");
        }
        pth pthVar = new pth(byteArray);
        aitt aittVar = new aitt();
        axkw axkwVar = new axkw(pthVar.a);
        axku axkuVar = new axku();
        axkuVar.t(axkwVar, axkwVar.c(), aitw.b);
        long j = 1;
        long j2 = 0;
        while (axkuVar.hasNext()) {
            deb next = axkuVar.next();
            String d = next.d();
            switch (d.hashCode()) {
                case 3117308:
                    if (d.equals("emsg")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3346442:
                    if (d.equals("mdat")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3357433:
                    if (d.equals("moof")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3357449:
                    if (d.equals("moov")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            c = 65535;
            if (c == 0) {
                Iterator it = ((det) next).i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        deb debVar = (deb) it.next();
                        if (debVar instanceof deu) {
                            deuVar = (deu) debVar;
                        }
                    } else {
                        deuVar = null;
                    }
                }
                if (deuVar != null) {
                    long j3 = deuVar.c;
                    if (j3 > 0) {
                        j = j3;
                    }
                }
            } else if (c == 1) {
                List x = ((dfs) next).x(dfw.class);
                if (!x.isEmpty()) {
                    List x2 = ((dfw) x.get(0)).x(dfv.class);
                    if (!x2.isEmpty()) {
                        j2 = ((dfv) x2.get(0)).a;
                    }
                }
            } else if (c == 2) {
                pthVar.G(((int) next.a()) + 8);
                pthVar.p();
                String t = pthVar.t();
                pthVar.t();
                pthVar.p();
                pthVar.p();
                pthVar.p();
                pthVar.p();
                aesh aeshVar = new aesh(zhq.h(t), aesh.e(pthVar));
                if (aeshVar.a.equals("http://youtube.com/streaming/metadata/segment/102015")) {
                    aittVar.c = aeshVar;
                } else if (aeshVar.a.equals("http://youtube.com/streaming/metadata/streamer/092019")) {
                    aittVar.d = aeshVar;
                }
            } else if (c == 3 && this.b != null) {
                pthVar.G(((int) next.a()) + 8);
                this.b.a(aittVar, pthVar, TimeUnit.SECONDS.toMillis(j2 / j), ((int) next.b()) - 8);
            }
        }
        axkuVar.close();
        if (aittVar.c != null) {
            if (aittVar.b == null) {
                throw pnr.a("Missing segment time", null);
            }
            return new aitu(aittVar);
        }
        throw pnr.a("Missing emsg", null);
    }
}
