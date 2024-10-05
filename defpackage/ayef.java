package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ayef implements ayoc {
    private InputStream a;
    protected final aydz b;
    protected final axzj c;
    final int d;
    protected ayek e;
    protected ayoa f;
    protected ayod g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private ayed n = ayed.UNINITIALIZED;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public ayef(aydz aydzVar, axzj axzjVar, int i) {
        this.b = aydzVar;
        this.c = axzjVar;
        this.d = i;
    }

    private final void p(Status status, Status status2, boolean z) {
        if (o()) {
            return;
        }
        ayed ayedVar = this.n;
        ayed ayedVar2 = ayed.UNINITIALIZED;
        l(ayed.CLOSED);
        if (ayedVar != ayedVar2) {
            this.f.l(status2);
        }
        if (!z) {
            aydz aydzVar = this.b;
            int i = this.d;
            Parcel obtain = Parcel.obtain();
            obtain.writeInt(0);
            int value = status.getCode().value() << 16;
            String description = status.getDescription();
            if (description != null && description.length() > 1000) {
                description = description.substring(0, 1000);
            }
            if (description != null) {
                value |= 32;
                obtain.writeString(description);
            }
            ayep.b(obtain, value | 8);
            try {
                aydzVar.o(i, obtain);
            } catch (StatusException e) {
                aydz.e.logp(Level.WARNING, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
            }
            obtain.recycle();
        }
        if (ayedVar != ayedVar2) {
            a(status2);
        }
        n();
    }

    private final void q() {
        ayee ayeeVar;
        if (this.i == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.j.size() && (ayeeVar = (ayee) this.j.get(i2)) != null; i2++) {
                i += ayeeVar.c;
                if (ayeeVar.d) {
                    this.i = i2 + 1;
                    r(i);
                    return;
                }
            }
        }
    }

    private final void r(int i) {
        ayoa ayoaVar = this.f;
        ayoaVar.getClass();
        ayoaVar.d(this.o);
        long j = i;
        this.f.e(this.o, j, j);
        this.o++;
    }

    private final boolean s() {
        return this.a != null || this.i > 0;
    }

    private final boolean t() {
        return this.k && this.h >= this.l;
    }

    protected abstract void a(Status status);

    protected abstract void b();

    public abstract void c(int i, Parcel parcel);

    public boolean d() {
        throw null;
    }

    public abstract void e(Parcel parcel);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(Status status) {
        p(status, status, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(Status status) {
        p(Status.c, status, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void i() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            ayed r1 = defpackage.ayed.UNINITIALIZED
            ayed r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L20
            if (r1 == r2) goto L17
            goto L72
        L17:
            ayod r1 = r4.g
            if (r1 == 0) goto L72
            boolean r1 = r4.k
            if (r1 == 0) goto L72
            goto L39
        L20:
            ayod r1 = r4.g
            if (r1 == 0) goto L72
            boolean r1 = r4.r
            if (r1 != 0) goto L72
            boolean r1 = r4.s()
            if (r1 == 0) goto L33
            int r1 = r4.p
            if (r1 == 0) goto L72
            goto L39
        L33:
            boolean r1 = r4.t()
            if (r1 == 0) goto L72
        L39:
            ayed r1 = r4.n
            int r1 = r1.ordinal()
            if (r1 == r3) goto L4a
            if (r1 != r2) goto L44
            goto L65
        L44:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L4a:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.s()
            if (r1 == 0) goto L5c
            r4.r = r0
            ayod r1 = r4.g
            r1.d(r4)
            goto L8
        L5c:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            ayed r1 = defpackage.ayed.ALL_MESSAGES_DELIVERED
            r4.l(r1)
        L65:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            ayed r1 = defpackage.ayed.SUFFIX_DELIVERED
            r4.l(r1)
            r4.b()
            goto L8
        L72:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayef.i():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void j(Parcel parcel) {
        if (o()) {
            return;
        }
        try {
            int readInt = parcel.readInt();
            if (ayep.c(readInt, 8)) {
                Status a = ayep.a(readInt, parcel);
                p(a, a, true);
                return;
            }
            int readInt2 = parcel.readInt();
            boolean c = ayep.c(readInt, 1);
            boolean c2 = ayep.c(readInt, 2);
            boolean c3 = ayep.c(readInt, 4);
            if (c) {
                e(parcel);
                l(ayed.PREFIX_DELIVERED);
            }
            if (c2) {
                if ((readInt & 64) != 0) {
                    throw Status.h.withDescription("Parcelable messages not allowed").asException();
                }
                int readInt3 = parcel.readInt();
                byte[] c4 = ayeb.c(readInt3);
                if (readInt3 > 0) {
                    parcel.readByteArray(c4);
                }
                int i = readInt & 128;
                boolean z = i == 0;
                if (this.j == null) {
                    if (this.o != 0 || i != 0 || readInt2 != this.h) {
                        this.j = new ArrayList(16);
                    } else {
                        amkq.N(this.a == null);
                        this.a = new ayea(c4);
                        r(readInt3);
                    }
                }
                ayee ayeeVar = new ayee(c4, readInt3, z);
                int i2 = readInt2 - this.h;
                if (i2 < this.j.size()) {
                    this.j.set(i2, ayeeVar);
                    q();
                } else {
                    if (i2 <= this.j.size()) {
                        this.j.add(ayeeVar);
                        q();
                    }
                    do {
                        this.j.add(null);
                    } while (i2 > this.j.size());
                    this.j.add(ayeeVar);
                }
            }
            if (c3) {
                c(readInt, parcel);
                this.l = readInt2;
                this.k = true;
            }
            int i3 = this.h;
            if (readInt2 == i3) {
                ArrayList arrayList = this.j;
                if (arrayList == null) {
                    this.h = i3 + 1;
                } else if (!c2 && !c3) {
                    arrayList.remove(0);
                    this.h++;
                }
            }
            int dataSize = this.m + parcel.dataSize();
            this.m = dataSize;
            ayoa ayoaVar = this.f;
            if (ayoaVar != null && dataSize != 0) {
                ayoaVar.g(dataSize);
                this.f.f(this.m);
                this.m = 0;
            }
            i();
        } catch (StatusException e) {
            g(e.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(ayek ayekVar, ayod ayodVar) {
        this.e = ayekVar;
        this.f = ayekVar.a;
        this.g = ayodVar;
        if (o()) {
            return;
        }
        l(ayed.INITIALIZED);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(ayed ayedVar) {
        ayed ayedVar2 = this.n;
        ayed ayedVar3 = ayed.UNINITIALIZED;
        int ordinal = ayedVar.ordinal();
        if (ordinal == 1) {
            amkq.T(ayedVar2 == ayed.UNINITIALIZED, "%s -> %s", ayedVar2, ayedVar);
        } else if (ordinal == 2) {
            amkq.T(ayedVar2 == ayed.INITIALIZED || ayedVar2 == ayed.UNINITIALIZED, "%s -> %s", ayedVar2, ayedVar);
        } else if (ordinal == 3) {
            amkq.T(ayedVar2 == ayed.PREFIX_DELIVERED, "%s -> %s", ayedVar2, ayedVar);
        } else if (ordinal == 4) {
            amkq.T(ayedVar2 == ayed.ALL_MESSAGES_DELIVERED, "%s -> %s", ayedVar2, ayedVar);
        } else if (ordinal != 5) {
            throw new AssertionError();
        }
        this.n = ayedVar;
    }

    public final void m(int i) {
        this.p += i;
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        final aydz aydzVar = this.b;
        if (d()) {
            aydy aydyVar = (aydy) aydzVar;
            if (aydyVar.c.decrementAndGet() == 0) {
                aydyVar.d.a(false);
            }
        }
        if (aydzVar.j.remove(Integer.valueOf(this.d)) == null || !aydzVar.j.isEmpty()) {
            return;
        }
        aydzVar.h.execute(new Runnable() { // from class: aydu
            @Override // java.lang.Runnable
            public final void run() {
                aydz aydzVar2 = aydz.this;
                synchronized (aydzVar2) {
                    if (aydzVar2.t(4)) {
                        aydzVar2.p(aydzVar2.l, true);
                    }
                }
            }
        });
    }

    protected final boolean o() {
        return this.n == ayed.CLOSED;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.k;
        String valueOf = String.valueOf(this.n);
        boolean s = s();
        boolean z2 = this.g != null;
        sb = new StringBuilder(String.valueOf(simpleName).length() + 36 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(valueOf);
        sb.append("/Msg=");
        sb.append(s);
        sb.append("/Lis=");
        sb.append(z2);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.ayoc
    public final synchronized InputStream f() {
        ayea ayeaVar;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            this.a = null;
        } else if (s()) {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                ayee ayeeVar = (ayee) this.j.remove(0);
                int i2 = ayeeVar.c;
                InputStream inputStream2 = ayeeVar.a;
                ayeaVar = new ayea(ayeeVar.b);
            } else {
                byte[][] bArr = new byte[i];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte[] bArr2 = ((ayee) this.j.remove(0)).b;
                    bArr[i4] = bArr2;
                    i3 += bArr2.length;
                }
                ayeaVar = new ayea(bArr, i3);
            }
            this.h += i;
            q();
            inputStream = ayeaVar;
        } else {
            inputStream = null;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (t() && !o()) {
                l(ayed.ALL_MESSAGES_DELIVERED);
                i();
                return null;
            }
        }
        return inputStream;
    }
}
