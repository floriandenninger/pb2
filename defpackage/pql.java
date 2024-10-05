package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pql extends ppz implements Comparable {
    public long g;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        pql pqlVar = (pql) obj;
        if (isEndOfStream() != pqlVar.isEndOfStream()) {
            return !isEndOfStream() ? -1 : 1;
        }
        long j = this.d - pqlVar.d;
        if (j == 0) {
            j = this.g - pqlVar.g;
            if (j == 0) {
                return 0;
            }
        }
        return j <= 0 ? -1 : 1;
    }
}
