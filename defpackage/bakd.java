package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bakd implements bajz {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long d = d();
        long d2 = ((bajz) obj).d();
        if (d < d2) {
            return -1;
        }
        return d > d2 ? 1 : 0;
    }

    public final bajx e() {
        return new bajx(d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bajz) && d() == ((bajz) obj).d();
    }

    public final int hashCode() {
        long d = d();
        return (int) (d ^ (d >>> 32));
    }

    public final String toString() {
        long d = d();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        bamx.f(stringBuffer, d);
        while (true) {
            if (stringBuffer.length() >= (d < 0 ? 7 : 6)) {
                break;
            }
            stringBuffer.insert(d < 0 ? 3 : 2, "0");
        }
        if ((d / 1000) * 1000 == d) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append('S');
        return stringBuffer.toString();
    }
}
