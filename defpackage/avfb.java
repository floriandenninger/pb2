package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avfb extends aonm implements aooz {
    public static final avfb a;
    private static volatile aopf e;
    public int b;
    public aoot d = aoot.a;
    public String c = "";

    static {
        avfb avfbVar = new avfb();
        a = avfbVar;
        aonm.registerDefaultInstance(avfb.class, avfbVar);
    }

    private avfb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003ဈ\u0001", new Object[]{"b", "d", avfa.a, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avfb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (avfb.class) {
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
