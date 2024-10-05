package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class awdf extends aonm implements aooz {
    public static final awdf a;
    private static volatile aopf c;
    private int d;
    private aqyg e;
    private apxf f;
    private aqyg g;
    private aota h;
    private byte i = 2;
    public aony b = emptyProtobufList();

    static {
        awdf awdfVar = new awdf();
        a = awdfVar;
        aonm.registerDefaultInstance(awdf.class, awdfVar);
    }

    private awdf() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0003\u0006ᐉ\u0002", new Object[]{"d", "e", "b", awdd.class, "f", "h", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awdf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (awdf.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
