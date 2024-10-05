package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aujx extends aonm implements aooz {
    public static final aujx a;
    private static volatile aopf h;
    public int b;
    public int e;
    public int g;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        aujx aujxVar = new aujx();
        a = aujxVar;
        aonm.registerDefaultInstance(aujx.class, aujxVar);
    }

    private aujx() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", aujj.m});
            case NEW_MUTABLE_INSTANCE:
                return new aujx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aujx.class) {
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
