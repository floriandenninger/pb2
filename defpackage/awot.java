package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awot extends aonm implements aooz {
    public static final awot a;
    private static volatile aopf j;
    public int b;
    public float c;
    public float d;
    public awoo e;
    public awpx f;
    public int g;
    public int h;
    public boolean i;

    static {
        awot awotVar = new awot();
        a = awotVar;
        aonm.registerDefaultInstance(awot.class, awotVar);
    }

    private awot() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", awnx.f, "h", awnx.e, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new awot();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (awot.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
