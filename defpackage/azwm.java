package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azwm extends azsl implements azss {
    public static final azwk b = new azwk();
    public final long a;

    public azwm(long j) {
        super(b);
        this.a = j;
    }

    public static final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        str.getClass();
        Thread.currentThread().setName(str);
    }

    public final /* bridge */ /* synthetic */ Object a(azsv azsvVar) {
        if (((azwn) azsvVar.get(azwn.a)) != null) {
            throw null;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int h = azul.h(name);
        name.getClass();
        int lastIndexOf = name.lastIndexOf(" @", h);
        if (lastIndexOf < 0) {
            lastIndexOf = name.length();
        }
        StringBuilder sb = new StringBuilder(lastIndexOf + 19);
        if (name != null) {
            String substring = name.substring(0, lastIndexOf);
            substring.getClass();
            sb.append(substring);
            sb.append(" @coroutine#");
            sb.append(this.a);
            String sb2 = sb.toString();
            sb2.getClass();
            currentThread.setName(sb2);
            return name;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azwm) && this.a == ((azwm) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ')';
    }
}
