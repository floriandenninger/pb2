package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auuy extends aonm implements aooz {
    public static final auuy a;
    private static volatile aopf e;
    public int d;
    private int f;
    private aota g;
    private byte h = 2;
    public aony b = emptyProtobufList();
    public aomf c = aomf.b;

    static {
        auuy auuyVar = new auuy();
        a = auuyVar;
        aonm.registerDefaultInstance(auuy.class, auuyVar);
    }

    private auuy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ည\u0001\u0004ဌ\u0002", new Object[]{"f", "b", aqyg.class, "g", "c", "d", auqy.l});
            case NEW_MUTABLE_INSTANCE:
                return new auuy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (auuy.class) {
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
