package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aufd extends aonm implements aooz {
    public static final aufd a;
    private static volatile aopf e;
    public aulq b;
    private int f;
    private aota g;
    private byte h = 2;
    public aony c = emptyProtobufList();
    public aomf d = aomf.b;

    static {
        aufd aufdVar = new aufd();
        a = aufdVar;
        aonm.registerDefaultInstance(aufd.class, aufdVar);
    }

    private aufd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0004ည\u0001\u0005ᐉ\u0002", new Object[]{"f", "b", "c", aulq.class, "d", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aufd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aufd.class) {
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
