package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apks extends aonm implements aooz {
    public static final apks a;
    private static volatile aopf f;
    public int b;
    public audr c;
    public audr d;
    public apkt e;

    static {
        apks apksVar = new apks();
        a = apksVar;
        aonm.registerDefaultInstance(apks.class, apksVar);
    }

    private apks() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0005ဉ\u0004\u0006ဉ\u0001", new Object[]{"b", "c", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apks();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apks.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
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
