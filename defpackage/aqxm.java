package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqxm extends aonm implements aooz {
    public static final aqxm a;
    private static volatile aopf b;

    static {
        aqxm aqxmVar = new aqxm();
        a = aqxmVar;
        aonm.registerDefaultInstance(aqxm.class, aqxmVar);
    }

    private aqxm() {
        aonm.emptyProtobufList();
        aonm.emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyLongList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new aqxm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqxm.class) {
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
