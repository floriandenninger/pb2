package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbf extends aonm implements aooz {
    public static final apbf a;
    private static volatile aopf e;
    public int b;
    public aonu c = emptyIntList();
    public boolean d;

    static {
        apbf apbfVar = new apbf();
        a = apbfVar;
        aonm.registerDefaultInstance(apbf.class, apbfVar);
    }

    private apbf() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002ဇ\u0000", new Object[]{"b", "c", apad.a(), "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apbf();
            case NEW_BUILDER:
                return new aone((int[][][]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apbf.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
