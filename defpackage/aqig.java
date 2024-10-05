package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqig extends aonm implements aooz {
    public static final aqig a;
    private static volatile aopf e;
    public int b;
    public aqii c;
    private byte f = 2;
    public aony d = emptyProtobufList();

    static {
        aqig aqigVar = new aqig();
        a = aqigVar;
        aonm.registerDefaultInstance(aqig.class, aqigVar);
    }

    private aqig() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"b", "d", aqim.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqig();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqig.class) {
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
