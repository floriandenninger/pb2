package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avvl extends aonm implements aooz {
    public static final avvl a;
    private static volatile aopf h;
    public int b;
    public long f;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        avvl avvlVar = new avvl();
        a = avvlVar;
        aonm.registerDefaultInstance(avvl.class, avvlVar);
    }

    private avvl() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0003\u0004ဈ\u0004\u0005ဈ\u0002", new Object[]{"b", "c", "d", "f", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avvl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (avvl.class) {
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
