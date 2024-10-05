package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqph extends aonm implements aooz {
    public static final aqph a;
    private static volatile aopf e;
    public int b;
    private byte f = 2;
    public aony c = emptyProtobufList();
    public String d = "";

    static {
        aqph aqphVar = new aqph();
        a = aqphVar;
        aonm.registerDefaultInstance(aqph.class, aqphVar);
    }

    private aqph() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000", new Object[]{"b", "c", aqpe.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqph();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqph.class) {
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
