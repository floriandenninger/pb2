package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aror extends aonm implements aooz {
    public static final aror a;
    private static volatile aopf f;
    public int b;
    public arnd c;
    public aqig d;
    private byte g = 2;
    public aony e = emptyProtobufList();

    static {
        aror arorVar = new aror();
        a = arorVar;
        aonm.registerDefaultInstance(aror.class, arorVar);
    }

    private aror() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004\u001b", new Object[]{"b", "c", "d", "e", arop.class});
            case NEW_MUTABLE_INSTANCE:
                return new aror();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aror.class) {
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
