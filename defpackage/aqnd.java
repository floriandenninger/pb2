package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnd extends aonm implements aooz {
    public static final aqnd a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        aqnd aqndVar = new aqnd();
        a = aqndVar;
        aonm.registerDefaultInstance(aqnd.class, aqndVar);
    }

    private aqnd() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"c", "b", aqmw.class, aqmz.class, aqna.class, aqnc.class, aqmx.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqnd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqnd.class) {
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
