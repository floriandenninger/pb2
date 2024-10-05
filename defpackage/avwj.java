package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avwj extends aonm implements aooz {
    public static final avwj a;
    private static volatile aopf g;
    public int b;
    public avwm c;
    public avwk d;
    public boolean e;
    public int f;

    static {
        avwj avwjVar = new avwj();
        a = avwjVar;
        aonm.registerDefaultInstance(avwj.class, avwjVar);
    }

    private avwj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0007ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", avya.g});
            case NEW_MUTABLE_INSTANCE:
                return new avwj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avwj.class) {
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
