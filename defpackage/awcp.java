package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class awcp extends aonm implements aooz {
    public static final awcp a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public apxf d;
    public awct f;
    private aqyg i;
    private aota j;
    private byte k = 2;
    public aony e = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        awcp awcpVar = new awcp();
        a = awcpVar;
        aonm.registerDefaultInstance(awcp.class, awcpVar);
    }

    private awcp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tည\u0007", new Object[]{"b", "c", "d", "e", awco.class, "f", "i", "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awcp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awcp.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
