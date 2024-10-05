package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aotd extends aonm implements aooz {
    public static final aotd a;
    private static volatile aopf h;
    public int b;
    public int f;
    public String c = "";
    public String d = "";
    public String e = "";
    public aomf g = aomf.b;

    static {
        aotd aotdVar = new aotd();
        a = aotdVar;
        aonm.registerDefaultInstance(aotd.class, aotdVar);
    }

    private aotd() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ည\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aotd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aotd.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
