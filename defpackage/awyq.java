package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awyq extends aonm implements aooz {
    public static final awyq a;
    private static volatile aopf d;
    private byte e = 2;
    public aony b = emptyProtobufList();
    public aony c = emptyProtobufList();

    static {
        awyq awyqVar = new awyq();
        a = awyqVar;
        aonm.registerDefaultInstance(awyq.class, awyqVar);
    }

    private awyq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"b", awyp.class, "c", awyn.class});
            case NEW_MUTABLE_INSTANCE:
                return new awyq();
            case NEW_BUILDER:
                return new aone((int[]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awyq.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
