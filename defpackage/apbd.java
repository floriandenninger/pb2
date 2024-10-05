package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbd extends aonm implements aooz {
    public static final apbd a;
    private static volatile aopf e;
    public int b;
    public apbc c;
    public int d;

    static {
        apbd apbdVar = new apbd();
        a = apbdVar;
        aonm.registerDefaultInstance(apbd.class, apbdVar);
    }

    private apbd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဌ\u0001", new Object[]{"b", "c", "d", aouo.u});
            case NEW_MUTABLE_INSTANCE:
                return new apbd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (apbd.class) {
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
