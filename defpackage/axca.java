package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axca extends aonm implements aooz {
    public static final aonv a = new atpn(11);
    public static final axca b;
    private static volatile aopf f;
    public int c;
    public int d;
    public aonu e = emptyIntList();

    static {
        axca axcaVar = new axca();
        b = axcaVar;
        aonm.registerDefaultInstance(axca.class, axcaVar);
    }

    private axca() {
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"c", "d", axcb.a(), "e", axcb.a()});
            case NEW_MUTABLE_INSTANCE:
                return new axca();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (axca.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
