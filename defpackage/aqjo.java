package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqjo extends aonm implements aooz {
    public static final aqjo a;
    public static final aonk b;
    private static volatile aopf e;
    private int f;
    private byte g = 2;
    public String c = "";
    public aony d = emptyProtobufList();

    static {
        aqjo aqjoVar = new aqjo();
        a = aqjoVar;
        aonm.registerDefaultInstance(aqjo.class, aqjoVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, aqjoVar, aqjoVar, null, 89668214, aoqn.MESSAGE, aqjo.class);
    }

    private aqjo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"f", "c", "d", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqjo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqjo.class) {
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
