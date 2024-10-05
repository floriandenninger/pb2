package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dvm extends aonm implements aooz {
    public static final dvm a;
    private static volatile aopf v;
    public int b;
    public long r;
    public long s;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public int i = 1000;
    public long j = -1;
    public long k = -1;
    public long l = -1;
    public int m = 1000;
    public long n = -1;
    public long o = -1;
    public long p = -1;
    public long q = -1;
    public long t = -1;
    public long u = -1;

    static {
        dvm dvmVar = new dvm();
        a = dvmVar;
        aonm.registerDefaultInstance(dvm.class, dvmVar);
    }

    private dvm() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", dvg.f, "j", "k", "l", "m", dvg.f, "n", "o", "p", "q", "r", "s", "t", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new dvm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (dvm.class) {
                        aopfVar = v;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            v = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
