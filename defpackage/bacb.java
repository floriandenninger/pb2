package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bacb extends aonm implements aooz {
    public static final bacb a;
    private static volatile aopf w;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public babz t;
    public babz u;
    public aoot v = aoot.a;

    static {
        bacb bacbVar = new bacb();
        a = bacbVar;
        aonm.registerDefaultInstance(bacb.class, bacbVar);
    }

    private bacb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0012\rဉ\u0013\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016ဌ\u0011\u0017ဂ\r\u0018ဂ\u000e", new Object[]{"b", "c", "f", "i", "k", "l", "q", "r", "t", "u", "d", "e", "v", baca.a, "g", "j", "h", "m", "n", "s", babw.c, "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new bacb();
            case NEW_BUILDER:
                return new aone((char[]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = w;
                if (aopfVar == null) {
                    synchronized (bacb.class) {
                        aopfVar = w;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            w = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
