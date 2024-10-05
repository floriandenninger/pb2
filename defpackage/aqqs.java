package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqqs extends aonm implements aooz {
    public static final aqqs a;
    private static volatile aopf h;
    public int b;
    public String c = "";
    public aqqr d;
    public aqqr e;
    public int f;
    public int g;

    static {
        aqqs aqqsVar = new aqqs();
        a = aqqsVar;
        aonm.registerDefaultInstance(aqqs.class, aqqsVar);
    }

    private aqqs() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", awag.a(), "g", awah.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aqqs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqqs.class) {
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
