package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aofq extends aonm implements aooz {
    public static final aofq a;
    private static volatile aopf d;
    public int b;
    public aofs c;

    static {
        aofq aofqVar = new aofq();
        a = aofqVar;
        aonm.registerDefaultInstance(aofq.class, aofqVar);
    }

    private aofq() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\t", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aofq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aofq.class) {
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
