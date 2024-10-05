package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aofa extends aonm implements aooz {
    public static final aofa a;
    private static volatile aopf h;
    public int b;
    public int c = 1;
    public aofi d;
    public aofh e;
    public aofb f;
    public aofc g;

    static {
        aofa aofaVar = new aofa();
        a = aofaVar;
        aonm.registerDefaultInstance(aofa.class, aofaVar);
    }

    private aofa() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0001", new Object[]{"b", "c", aogu.b, "e", "f", "g", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aofa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aofa.class) {
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
