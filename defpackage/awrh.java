package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awrh extends aonm implements aooz {
    public static final awrh a;
    private static volatile aopf c;
    public awre b;
    private int d;
    private awnw e;
    private awnw f;
    private awnw g;
    private awqt h;
    private awnw i;
    private aovx j;
    private byte k = 2;

    static {
        awrh awrhVar = new awrh();
        a = awrhVar;
        aonm.registerDefaultInstance(awrh.class, awrhVar);
    }

    private awrh() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\bᐉ\b\tᐉ\t\rᐉ\u0005", new Object[]{"d", "b", "e", "f", "h", "i", "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awrh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (awrh.class) {
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
