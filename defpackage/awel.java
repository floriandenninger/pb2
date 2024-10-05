package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awel extends aonm implements aooz {
    public static final awel a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        awel awelVar = new awel();
        a = awelVar;
        aonm.registerDefaultInstance(awel.class, awelVar);
    }

    private awel() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\u0001\u0010\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\tြ\u0000\fြ\u0000\rြ\u0000\u0010ြ\u0000", new Object[]{"c", "b", awev.class, awew.class, aweq.class, awen.class, awem.class, aweo.class});
            case NEW_MUTABLE_INSTANCE:
                return new awel();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awel.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
