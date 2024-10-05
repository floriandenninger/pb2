package defpackage;

import android.os.Process;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agwi implements aguf {
    protected final ague a;
    protected final agnz b;
    protected final String c;
    protected final String d;
    protected final String e;
    protected final byte[] f;
    protected final agww g;
    protected final agsn h;
    protected final agsm i;
    private final agwk j;
    private aeek k;
    private final agwu l;
    private final agwy m = new agwy();
    private final int n;
    private volatile boolean o;
    private final int p;

    public agwi(ague agueVar, shf shfVar, zgj zgjVar, agnz agnzVar, agwk agwkVar, agww agwwVar, agsn agsnVar, agsm agsmVar) {
        this.a = agueVar;
        this.b = agnzVar;
        this.j = agwkVar;
        this.g = agwwVar;
        this.h = agsnVar;
        this.i = agsmVar;
        this.n = agtw.d(agnzVar.f);
        this.p = agtw.am(agnzVar.f);
        this.c = agnzVar.a;
        this.d = zgjVar.a();
        this.e = agtw.t(agnzVar.f);
        this.f = agtw.aj(agnzVar.f);
        this.l = new agwu(shfVar, agsnVar.d(), new agwt() { // from class: agwh
            @Override // defpackage.agwt
            public final void a(long j, double d) {
                agwi.this.c(j, d, true);
            }
        });
    }

    private final agmx d() {
        agmx agmxVar = this.b.g;
        agtw.y(agmxVar, this.m.a());
        agtw.Q(agmxVar, this.m.b());
        return agmxVar;
    }

    private static final boolean e(agnm agnmVar, boolean z) {
        return z || !(agnmVar == null || agnmVar.i());
    }

    @Override // defpackage.aguf
    public final void a(int i) {
        String.valueOf(this.c).length();
        this.o = true;
        boolean z = (i & 384) == 0;
        aeek aeekVar = this.k;
        if (aeekVar != null) {
            aeekVar.a(z);
        }
    }

    protected final void b(agug agugVar, agmx agmxVar) {
        if (!agugVar.a) {
            String str = this.c;
            String message = agugVar.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(message).length());
            sb.append("[Offline] offline ad task[");
            sb.append(str);
            sb.append("]: ");
            sb.append(message);
            zga.l(sb.toString());
        } else {
            Throwable cause = agugVar.getCause();
            if (cause != null) {
                String str2 = this.c;
                String message2 = agugVar.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 36 + String.valueOf(message2).length());
                sb2.append("[Offline] offline ad task[");
                sb2.append(str2);
                sb2.append("] failed: ");
                sb2.append(message2);
                zga.d(sb2.toString(), cause);
            } else {
                String str3 = this.c;
                String message3 = agugVar.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 51 + String.valueOf(message3).length());
                sb3.append("[Offline] offline ad task[");
                sb3.append(str3);
                sb3.append("] failed, unknown cause: ");
                sb3.append(message3);
                zga.d(sb3.toString(), new IllegalArgumentException());
            }
            agil A = this.h.A();
            if (A != null) {
                A.A(this.e, agugVar.b);
            }
        }
        this.a.d(this.c, agugVar, agmxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(long j, double d, boolean z) {
        agil A = this.h.A();
        if (A != null) {
            String.valueOf(this.c).length();
            A.A(this.e, agnf.ACTIVE);
            this.a.b(this.c, j, d, z);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        agna a;
        Process.setThreadPriority(10);
        try {
            String.valueOf(this.c).length();
            try {
                agww agwwVar = this.g;
                String str = this.e;
                byte[] bArr = this.f;
                agnz agnzVar = this.b;
                PlayerResponseModel i = agwwVar.i(str, bArr, agnzVar, true != agtw.af(agnzVar.f) ? 2 : 3);
                agww.j(this.c, i);
                agnn h = this.g.h(this.n, this.p, null, this.e, i.c, i.c(), this.h.d());
                long j = h.c;
                long j2 = h.d;
                boolean z = j2 > j;
                this.l.c = j2;
                this.a.c(this.c, j2);
                c(j, 0.0d, z);
                agwu agwuVar = this.l;
                agwuVar.a = this.e;
                agwuVar.b = 0L;
                agej b = this.h.b();
                String str2 = null;
                if (b != null && (a = b.a()) != null) {
                    str2 = a.a;
                }
                aeek aeekVar = this.k;
                if (aeekVar == null) {
                    aeekVar = this.j.a();
                    aeekVar.b = this.l;
                    this.k = aeekVar;
                }
                agnm agnmVar = h.b;
                boolean e = e(agnmVar, z);
                if (agnmVar != null) {
                    String str3 = this.e;
                    String str4 = this.c;
                    String str5 = this.d;
                    long b2 = agnmVar.b();
                    agjd d = this.h.d();
                    agwy agwyVar = this.m;
                    agww.e(str3, str4, str5, aeekVar, agnmVar, b2, d, str2, agwyVar.d, agwyVar.b, this.i);
                    this.l.b = agnmVar.b();
                }
                if (this.o) {
                    return;
                }
                agnm agnmVar2 = h.a;
                boolean e2 = e(agnmVar2, e);
                if (agnmVar2 != null) {
                    String str6 = this.e;
                    String str7 = this.c;
                    String str8 = this.d;
                    long b3 = agnmVar2.b();
                    agjd d2 = this.h.d();
                    agwy agwyVar2 = this.m;
                    agww.e(str6, str7, str8, aeekVar, agnmVar2, b3, d2, str2, agwyVar2.c, agwyVar2.a, this.i);
                }
                if (this.o) {
                    return;
                }
                c(j2, 0.0d, e2);
                agmx d3 = d();
                agil A = this.h.A();
                if (A != null) {
                    String.valueOf(this.c).length();
                    A.A(this.e, agnf.COMPLETE);
                    this.a.a(this.c, d3);
                    return;
                }
                b(agug.a("Null dbHelper", new NullPointerException(), agnf.FAILED_UNKNOWN, atqs.UNKNOWN_FAILURE_REASON), d3);
            } catch (agug e3) {
                b(e3, d());
            } catch (IOException e4) {
                b(this.g.a(e4), d());
            } catch (InterruptedException e5) {
                String str9 = this.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str9).length() + 51);
                sb.append("[Offline] pudl task[");
                sb.append(str9);
                sb.append("] error while downloading video");
                zga.d(sb.toString(), e5);
                b(agug.b("Error encountered while downloading the video", e5, agnf.FAILED_UNKNOWN, atqs.OFFLINE_TRANSFER_INTERRUPTED), d());
            }
        } catch (Exception e6) {
            String str10 = this.c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str10).length() + 47);
            sb2.append("[Offline] pudl task[");
            sb2.append(str10);
            sb2.append("] error while pinning video");
            zga.d(sb2.toString(), e6);
            String valueOf = String.valueOf(e6.getMessage());
            afsi.c(2, 28, valueOf.length() != 0 ? "Abstract pin exception: ".concat(valueOf) : new String("Abstract pin exception: "), e6);
            b(agug.b("Error encountered while pinning the video", e6, agnf.FAILED_UNKNOWN, atqs.UNKNOWN_FAILURE_REASON), d());
        }
    }
}
