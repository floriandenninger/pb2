package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axdv extends aonm implements aooz {
    public static final axdv a;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public aony d = aonm.emptyProtobufList();

    static {
        axdv axdvVar = new axdv();
        a = axdvVar;
        aonm.registerDefaultInstance(axdv.class, axdvVar);
    }

    private axdv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new axdv();
            case NEW_BUILDER:
                return new aone((char[][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (axdv.class) {
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
