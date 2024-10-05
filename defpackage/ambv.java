package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ambv extends anfm {
    private ambx a;
    private final int b;

    public ambv(ambx ambxVar, int i) {
        this.a = ambxVar;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final String b() {
        anfy anfyVar;
        ambx ambxVar = this.a;
        if (ambxVar == null || (anfyVar = ambxVar.a.a) == null) {
            return null;
        }
        String valueOf = String.valueOf(anfyVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("callable=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        ambw ambwVar = (ambw) this.a.c.get();
        if (ambwVar == null) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        String valueOf3 = String.valueOf(ambwVar);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(valueOf3).length());
        sb3.append(valueOf2);
        sb3.append(", trial=[");
        sb3.append(valueOf3);
        sb3.append("]");
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final boolean qK(anhy anhyVar) {
        return super.qK(anhyVar);
    }

    @Override // defpackage.anfm
    protected final void qf() {
        long j;
        int i;
        int a;
        ambw ambwVar;
        ambx ambxVar = this.a;
        this.a = null;
        if (ambxVar == null) {
            return;
        }
        do {
            j = ambxVar.b.get();
            i = (int) j;
            a = ambx.a(j);
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            if (i == -2147483647) {
                a++;
            }
        } while (!ambxVar.b.compareAndSet(j, ambx.b(a, i - 1)));
        if (i != -2147483647) {
            return;
        }
        do {
            ambwVar = (ambw) ambxVar.c.get();
            if (ambwVar == null || ambwVar.a > this.b) {
                return;
            } else {
                ambwVar.cancel(true);
            }
        } while (!ambxVar.c.compareAndSet(ambwVar, null));
    }
}
