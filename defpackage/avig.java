package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avig extends aonm implements aooz {
    public static final avig a;
    private static volatile aopf e;
    public boolean c;
    private int f;
    private byte g = 2;
    public String b = "";
    public aony d = emptyProtobufList();

    static {
        avig avigVar = new avig();
        a = avigVar;
        aonm.registerDefaultInstance(avig.class, avigVar);
    }

    private avig() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003Л", new Object[]{"f", "b", "c", "d", avif.class});
            case NEW_MUTABLE_INSTANCE:
                return new avig();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (avig.class) {
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
