package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awrx extends aonm implements aooz {
    public static final awrx a;
    private static volatile aopf f;
    public int b;
    private byte g = 2;
    public aony c = emptyProtobufList();
    public String d = "";
    public aony e = emptyProtobufList();

    static {
        awrx awrxVar = new awrx();
        a = awrxVar;
        aonm.registerDefaultInstance(awrx.class, awrxVar);
    }

    private awrx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001Л\u0002ဈ\u0000\u0003\u001b", new Object[]{"b", "c", awrt.class, "d", "e", awrw.class});
            case NEW_MUTABLE_INSTANCE:
                return new awrx();
            case NEW_BUILDER:
                return new aone((char[]) null, (short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awrx.class) {
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
