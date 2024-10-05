package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdj extends aonm implements aooz {
    public static final aqdj a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public long d;
    public String e = "";
    public boolean f;
    public boolean g;

    static {
        aqdj aqdjVar = new aqdj();
        a = aqdjVar;
        aonm.registerDefaultInstance(aqdj.class, aqdjVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, aqdjVar, aqdjVar, null, 343298030, aoqn.MESSAGE, aqdj.class);
    }

    private aqdj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqdj.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
