package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqju extends aonm implements aooz {
    public static final aqju a;
    private static volatile aopf b;
    private int c;
    private aota d;
    private byte e = 2;

    static {
        aqju aqjuVar = new aqju();
        a = aqjuVar;
        aonm.registerDefaultInstance(aqju.class, aqjuVar);
    }

    private aqju() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqju();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqju.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
