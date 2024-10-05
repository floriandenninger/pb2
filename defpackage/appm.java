package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class appm extends aonm implements aooz {
    public static final appm a;
    private static volatile aopf f;
    public int b;
    public aqyg c;
    public appl d;
    private byte g = 2;
    public aony e = emptyProtobufList();

    static {
        appm appmVar = new appm();
        a = appmVar;
        aonm.registerDefaultInstance(appm.class, appmVar);
    }

    private appm() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л", new Object[]{"b", "c", "d", "e", apmh.class});
            case NEW_MUTABLE_INSTANCE:
                return new appm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (appm.class) {
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
