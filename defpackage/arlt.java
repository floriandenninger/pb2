package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arlt extends aonm implements aooz {
    public static final arlt a;
    private static volatile aopf e;
    public arnd b;
    private int f;
    private aqzg g;
    private byte h = 2;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();

    static {
        arlt arltVar = new arlt();
        a = arltVar;
        aonm.registerDefaultInstance(arlt.class, arltVar);
    }

    private arlt() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001̉\u0004\u0000\u0002\u0004\u0001ᐉ\u0000\u0002Л\u0005Л̉ᐉ\u0001", new Object[]{"f", "b", "c", arlj.class, "d", apxf.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arlt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (arlt.class) {
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
