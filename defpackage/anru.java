package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anru extends aonm implements aooz {
    public static final anru a;
    private static volatile aopf b;
    private byte c = 2;

    static {
        anru anruVar = new anru();
        a = anruVar;
        aonm.registerDefaultInstance(anru.class, anruVar);
    }

    private anru() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aonm.emptyProtobufList();
        aonm.emptyProtobufList();
        aonm.emptyProtobufList();
        aonm.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new anru();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (anru.class) {
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
