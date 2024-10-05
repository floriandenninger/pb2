package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apge extends aonm implements aooz {
    public static final apge a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        apge apgeVar = new apge();
        a = apgeVar;
        aonm.registerDefaultInstance(apge.class, apgeVar);
    }

    private apge() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000\u0003ျ\u0000\u0004ျ\u0000\u0005ျ\u0000\u0006ျ\u0000\u0007ျ\u0000", new Object[]{"c", "b", apgd.class});
            case NEW_MUTABLE_INSTANCE:
                return new apge();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (apge.class) {
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
