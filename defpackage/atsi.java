package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsi extends aonm implements aooz {
    public static final atsi a;
    private static volatile aopf d;
    public boolean b;
    public aomf c = aomf.b;
    private int e;

    static {
        atsi atsiVar = new atsi();
        a = atsiVar;
        aonm.registerDefaultInstance(atsi.class, atsiVar);
    }

    private atsi() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0004ည\u0003", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new atsi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atsi.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
