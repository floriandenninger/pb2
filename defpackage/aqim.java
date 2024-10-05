package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqim extends aonm implements aooz {
    public static final aqim a;
    private static volatile aopf e;
    private byte f = 2;
    public aony b = aonm.emptyProtobufList();
    public aony c = emptyProtobufList();
    public aony d = aonm.emptyProtobufList();

    static {
        aqim aqimVar = new aqim();
        a = aqimVar;
        aonm.registerDefaultInstance(aqim.class, aqimVar);
    }

    private aqim() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0001\u0001\u001a\u0002Л\u0003\u001a", new Object[]{"b", "c", aqik.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqim();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqim.class) {
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
