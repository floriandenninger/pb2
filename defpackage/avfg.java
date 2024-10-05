package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avfg extends aonm implements aooz {
    private static final avfg a;
    private static volatile aopf b;
    private int c;
    private avfe d;

    static {
        avfg avfgVar = new avfg();
        a = avfgVar;
        aonm.registerDefaultInstance(avfg.class, avfgVar);
    }

    private avfg() {
    }

    public static avff a() {
        return (avff) a.createBuilder();
    }

    public static /* synthetic */ avfg b() {
        return a;
    }

    public void d(avfe avfeVar) {
        avfeVar.getClass();
        this.d = avfeVar;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new avfg();
            case NEW_BUILDER:
                return new avff();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avfg.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
