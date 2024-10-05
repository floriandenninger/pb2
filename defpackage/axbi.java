package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axbi extends aonm implements aooz {
    public static final axbi a;
    private static volatile aopf c;
    private byte d = 2;
    public aony b = emptyProtobufList();

    static {
        axbi axbiVar = new axbi();
        a = axbiVar;
        aonm.registerDefaultInstance(axbi.class, axbiVar);
    }

    private axbi() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", axbh.class});
            case NEW_MUTABLE_INSTANCE:
                return new axbi();
            case NEW_BUILDER:
                return new aone((short[]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (axbi.class) {
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
