package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqlq extends aonm implements aooz {
    public static final aqlq a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public aqlp d;
    public aqlv e;
    private awnl h;
    private byte i = 2;
    public String f = "";

    static {
        aqlq aqlqVar = new aqlq();
        a = aqlqVar;
        aonm.registerDefaultInstance(aqlq.class, aqlqVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqlqVar, aqlqVar, null, 372095937, aoqn.MESSAGE, aqlq.class);
    }

    private aqlq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ဉ\u0004\u0007ဈ\u0006", new Object[]{"c", "d", "e", "h", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqlq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqlq.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
