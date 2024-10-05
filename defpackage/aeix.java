package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeix extends afiz {
    private static final Pattern b = Pattern.compile("[0-9a-zA-Z_-]{11}\\.[\\d]+\\~[\\d]+");
    public final AtomicReference a;
    private final aejn c;
    private final afhi d;
    private final String e;
    private boolean f;
    private volatile aejc g;
    private boolean h;
    private ath i;
    private int j;
    private long k;
    private long l;
    private boolean m;
    private String n;
    private long o;
    private long p;
    private final axzg q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeix(axzg axzgVar, aejn aejnVar, ate ateVar, afhi afhiVar, aelf aelfVar, String str, byte[] bArr, byte[] bArr2) {
        super(ateVar);
        afki.a(ateVar);
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        afki.a(afhiVar);
        this.d = afhiVar;
        atomicReference.set(aelfVar);
        this.l = -1L;
        this.c = aejnVar;
        this.e = str;
        this.q = axzgVar;
    }

    private final long c(ath athVar) {
        if (this.f) {
            aelz.g("Upstream DataSource already opened.");
        }
        this.h = false;
        this.f = true;
        return super.h(athVar);
    }

    private final ath d(ath athVar, long j, long j2) {
        Uri uri = athVar.a;
        if (this.h && this.m) {
            zhy b2 = zhy.b(uri);
            b2.j("headm");
            b2.g("sq", Long.toString(this.l));
            uri = b2.a();
            j2 = -1;
        }
        String str = athVar.i;
        if ("oda".equals(athVar.a.getAuthority())) {
            String queryParameter = athVar.a.getQueryParameter("itag");
            if (queryParameter == null) {
                return athVar;
            }
            try {
                String b3 = ozv.b(Integer.parseInt(queryParameter), athVar.a.getQueryParameter("xtags"));
                aelf aelfVar = (aelf) this.a.get();
                if (aelfVar == null) {
                    aelz.g("Dummy authority received with null Representation cache (upstream).");
                    throw new IOException(new aele("Dummy authority received with null Representation cache (upstream)."));
                }
                axl a = aelfVar.a(b3);
                if (!aelfVar.i() || a == null) {
                    throw new IOException("Null_onesie_representation");
                }
                Uri parse = Uri.parse(((axi) a.b.get(0)).a);
                str = a.f;
                uri = parse;
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(athVar.a.getQueryParameter("itag"));
                aelz.g(valueOf.length() != 0 ? "Unexpected NumberFormatException: ".concat(valueOf) : new String("Unexpected NumberFormatException: "));
                return athVar;
            }
        }
        if (athVar.a == uri && athVar.g == j && athVar.f == j && athVar.h == j2) {
            return athVar;
        }
        atg a2 = athVar.a();
        a2.a = uri;
        a2.f = j;
        a2.g = j2;
        a2.h = str;
        return a2.a();
    }

    @Override // defpackage.afiz, defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3;
        if (this.h && this.g != null && this.i != null) {
            long j = this.p;
            if (j >= 0 || j == -1) {
                if (j == 0) {
                    return -1;
                }
                i3 = j != -1 ? (int) Math.min(i2, j) : i2;
                try {
                    int a = this.g.a(bArr, i, i3, this.e, this.j, this.k, this.l, this.n, this.o);
                    if (a == -1) {
                        return -1;
                    }
                    if (a != 0) {
                        long j2 = a;
                        this.o += j2;
                        long j3 = this.p;
                        if (j3 != -1) {
                            this.p = j3 - j2;
                        }
                        return a;
                    }
                    if ("onesievideobufferonly".equals(this.i.a.getAuthority())) {
                        throw new IOException("Giving up on OnesieVideoBuffer-only request");
                    }
                    this.g.g();
                    c(d(this.i, this.o, this.p));
                    bArr2 = bArr;
                    return super.g(bArr2, i, i3);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IOException(e);
                }
            }
        }
        bArr2 = bArr;
        i3 = i2;
        return super.g(bArr2, i, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0197, code lost:
    
        if (r14.get() != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024f A[Catch: NumberFormatException -> 0x025a, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x025a, blocks: (B:40:0x0246, B:43:0x024f), top: B:39:0x0246 }] */
    @Override // defpackage.afiz, defpackage.ate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.ath r17) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeix.h(ath):long");
    }

    @Override // defpackage.afiz, defpackage.ate
    public final Uri i() {
        return this.h ? this.i.a : super.i();
    }

    @Override // defpackage.afiz, defpackage.ate
    public final void j() {
        if (this.f) {
            this.f = false;
            super.j();
        }
    }
}
