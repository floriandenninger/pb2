package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aohs extends aonm implements aooz {
    public static final aohs a;
    private static volatile aopf r;
    public int b;
    public float c;
    public int d;
    public int j;
    public int n;
    public aohr p;
    public int q;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String k = "";
    public aony l = emptyProtobufList();
    public aony m = emptyProtobufList();
    public String o = "";

    static {
        aohs aohsVar = new aohs();
        a = aohsVar;
        aonm.registerDefaultInstance(aohs.class, aohsVar);
    }

    private aohs() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0011\u000f\u0000\u0002\u0000\u0002ခ\u0000\u0003ဌ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tင\u0007\nဈ\b\f\u001b\r\u001b\u000eဌ\n\u000fဈ\u000b\u0010ဉ\f\u0011ဌ\r", new Object[]{"b", "c", "d", aogu.e, "e", "f", "g", "h", "i", "j", "k", "l", aogz.class, "m", aogy.class, "n", aogu.p, "o", "p", "q", aogu.r});
            case NEW_MUTABLE_INSTANCE:
                return new aohs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (aohs.class) {
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
