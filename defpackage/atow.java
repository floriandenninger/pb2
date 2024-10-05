package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atow extends aonm implements aooz {
    public static final atow a;
    private static volatile aopf r;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long j;
    public long k;
    public long l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public auyh q;

    static {
        atow atowVar = new atow();
        a = atowVar;
        aonm.registerDefaultInstance(atow.class, atowVar);
    }

    private atow() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဋ\u0002\u0004ဂ\u0004\u0005ဌ\u0005\u0006ဌ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\u000bဇ\u000b\u0010ဂ\u000f\u0012ဇ\u0010\u0013ဇ\u0011\u0014ဉ\u0012\u0015ဂ\u0003", new Object[]{"b", "c", "d", atnn.g, "e", "g", "h", atrx.a(), "i", atnn.k, "j", "k", "l", "m", "n", "o", "p", "q", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atow();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (atow.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
